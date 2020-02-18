package com.estudio.easyParking.controllers;

import java.util.List;

import com.estudio.easyParking.entities.Bitacora;
import com.estudio.easyParking.implementations.BitacoraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BitacoraController
 */
@RestController
@RequestMapping("/api/bitacora")
public class BitacoraController {

    @Autowired
    private BitacoraServiceImpl bitacoraServiceImpl;


    @GetMapping("/getBitacoras")
    public ResponseEntity<List<Bitacora>> getBitacoras() {
        return ResponseEntity.ok(this.bitacoraServiceImpl.findAll());
        
    }





    

    
}