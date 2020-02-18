package com.estudio.easyParking.services;


import com.estudio.easyParking.entities.Suscripcion;
import com.estudio.easyParking.pojos.SuscripcionVO;

import java.util.List;

public interface ISuscripcionService {


    List<SuscripcionVO> findAll();


}
