package com.estudio.easyParking.implementations;

import com.estudio.easyParking.entities.Parqueadero;
import com.estudio.easyParking.repositories.ParqueaderoRepository;
import com.estudio.easyParking.services.IParqueaderoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParqueaderoServiceImpl implements IParqueaderoService {

    @Autowired
    private ParqueaderoRepository repository;

    @Override
    public Parqueadero create(Parqueadero parqueadero) {
        return this.repository.save(parqueadero);
    }

    @Override
    public List<Parqueadero> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Parqueadero findParqueadero(String nombre, String direccion) {
        // TODO Auto-generated method stub
        return this.repository.findByNombreAndDireccion(nombre, direccion);
    }

     
}
