package com.estudio.easyParking.controllers;


import com.estudio.easyParking.implementations.SuscripcionServiceImpl;
import com.estudio.easyParking.implementations.UsuarioServiceImpl;
import com.estudio.easyParking.pojos.SuscripcionVO;
import com.estudio.easyParking.pojos.UsuarioVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl service;

    @Autowired
    private SuscripcionServiceImpl serviceSub;



    @GetMapping("/listarUsuarios")
    public ResponseEntity<List<UsuarioVO>> listarUsuarios(){
        return ResponseEntity.ok(this.service.findAll());
    }


    @GetMapping("/listarSuscripcion")
    public  ResponseEntity<List<SuscripcionVO>> listarSuscripcion(){

        return ResponseEntity.ok(this.serviceSub.findAll());
    }

}
