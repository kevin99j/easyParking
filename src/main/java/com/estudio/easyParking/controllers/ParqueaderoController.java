package com.estudio.easyParking.controllers;

import com.estudio.easyParking.entities.Parqueadero;
import com.estudio.easyParking.implementations.ParqueaderoServiceImpl;
import com.estudio.easyParking.pojos.ParqueaderoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ParqueaderoController
 */

 @RestController
 @RequestMapping("/api/parqueadero")
public class ParqueaderoController {
     @Autowired
  private ParqueaderoServiceImpl parqueaderoServiceImpl;


@PostMapping("/guardarParqueadero")
public ResponseEntity<Parqueadero> createParqueadero(@RequestBody ParqueaderoVO parqueaderoVO) {
    
    try{
        Parqueadero parqueadero = new Parqueadero();

        parqueadero.setCupoDisponible(parqueaderoVO.getCupoDisponible());
        parqueadero.setCupoMaximo(parqueaderoVO.getCupoMaximo());
        parqueadero.setDireccion(parqueaderoVO.getDireccion());
        parqueadero.setNombre(parqueaderoVO.getNombre());
        this.parqueaderoServiceImpl.create(parqueadero);
    } catch (Exception e) {
        //TODO: handle exception
        e.printStackTrace();
    }
  
return new ResponseEntity<>(HttpStatus.CREATED);

}


@GetMapping("/listarParqueaderos")
    public ResponseEntity<List<Parqueadero>> listarParqueaderos(){

        return  ResponseEntity.ok(this.parqueaderoServiceImpl.findAll());
}




    
}