package com.estudio.easyParking.controllers;

import com.estudio.easyParking.entities.Parqueadero;
import com.estudio.easyParking.services.ParqueaderoService;
import com.estudio.easyParking.pojos.ParqueaderoVO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ParqueaderoController
 */

 @RestController
 @RequestMapping("/api/parqueadero")
public class ParqueaderoController {

public final ParqueaderoService parqueaderoService;

    public ParqueaderoController(ParqueaderoService parqueaderoService) {
        this.parqueaderoService = parqueaderoService;
    }


@PostMapping("/guardarParqueadero")
public ResponseEntity<Parqueadero> createParqueadero(@RequestBody ParqueaderoVO parqueaderoVO) {
    
    try{
        Parqueadero parqueadero = new Parqueadero();

        parqueadero.setCupoDisponible(parqueaderoVO.getCupoDisponible());
        parqueadero.setCupoMaximo(parqueaderoVO.getCupoMaximo());
        parqueadero.setDireccion(parqueaderoVO.getDireccion());
        parqueadero.setNombre(parqueaderoVO.getNombre());
        this.parqueaderoService.create(parqueadero);
    } catch (Exception e) {
        //TODO: handle exception
        e.printStackTrace();
    }
  
return new ResponseEntity<>(HttpStatus.CREATED);

}


    
}