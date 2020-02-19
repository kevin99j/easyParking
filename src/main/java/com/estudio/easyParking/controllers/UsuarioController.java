package com.estudio.easyParking.controllers;

import com.estudio.easyParking.entities.Usuario;
import com.estudio.easyParking.entities.Vehiculo;
import com.estudio.easyParking.implementations.SuscripcionServiceImpl;
import com.estudio.easyParking.implementations.UsuarioServiceImpl;
import com.estudio.easyParking.pojos.SuscripcionVO;
import com.estudio.easyParking.pojos.UsuarioVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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


    @PostMapping("/crearUsuario")
    public ResponseEntity<String> crearUsuario(@RequestBody UsuarioVO usuario) {
        try {
            Usuario user = new Usuario(); 
            user.setDocumento(usuario.getDocumento()); 
            user.setTipo(usuario.getTipo()); 
            user.setNombre(usuario.getNombre());
            service.create(user);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(
                "Internal server error: " + e.getMessage(), 
                HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(
                "Exitoso", 
                HttpStatus.OK);
    }
}