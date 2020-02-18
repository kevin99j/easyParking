package com.estudio.easyParking.services;

import com.estudio.easyParking.entities.Suscripcion;
import com.estudio.easyParking.entities.Vehiculo;
import com.estudio.easyParking.pojos.VehiculoVO;

import java.util.List;


public interface IVehiculoService {


    VehiculoVO findBySuscripcion(Suscripcion suscripcion);

    List<VehiculoVO> findAll();

}
