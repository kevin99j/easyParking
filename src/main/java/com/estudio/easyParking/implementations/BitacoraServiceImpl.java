package com.estudio.easyParking.implementations;

import com.estudio.easyParking.entities.Bitacora;
import com.estudio.easyParking.repositories.BitacoraRepository;
import com.estudio.easyParking.services.IBitacoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BitacoraServiceImpl implements IBitacoraService {

    @Autowired
    private BitacoraRepository repository;


    @Override
    public void create(Bitacora bitacora) {
        this.repository.save(bitacora);
    }

    @Override
    public List<Bitacora> findAll() {
        return this.repository.findAll();
    }







}
