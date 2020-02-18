package com.estudio.easyParking.implementations;

import com.estudio.easyParking.entities.Suscripcion;
import com.estudio.easyParking.entities.Vehiculo;
import com.estudio.easyParking.pojos.SuscripcionVO;
import com.estudio.easyParking.pojos.VehiculoVO;
import com.estudio.easyParking.repositories.SuscripcionRepository;
import com.estudio.easyParking.services.ISuscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SuscripcionServiceImpl  implements ISuscripcionService {

    @Autowired
    private SuscripcionRepository repository;

    @Autowired
    private VehiculoServiceImpl vehiculoImpl;



    @Override
    public List<SuscripcionVO> findAll() {
        List<SuscripcionVO> suscripciones = new ArrayList<>();
        try {

            for (Suscripcion suscripcion : repository.findAll()) {
                SuscripcionVO sus = new SuscripcionVO();
                sus.setActivo(suscripcion.isActivo());
                sus.setFechaFin(suscripcion.getFechaFin());
                sus.setFechaInicio(suscripcion.getFechaInicio());
                sus.setIdSuscripcion(suscripcion.getIdSuscripcion());
                sus.setPrecio(suscripcion.getPrecio());
                sus.setVehiculo(vehiculoImpl.findBySuscripcion(suscripcion));
                sus.getUsuarios().addAll(suscripcion.getUsuarios());
                suscripciones.add(sus);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return suscripciones;
    }
}
