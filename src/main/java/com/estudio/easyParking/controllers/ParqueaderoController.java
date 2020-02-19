package com.estudio.easyParking.controllers;

import com.estudio.easyParking.entities.Parqueadero;
import com.estudio.easyParking.implementations.ParqueaderoServiceImpl;
import com.estudio.easyParking.pojos.ParqueaderoVO;
import com.estudio.easyParking.util.RestResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * ParqueaderoController
 */

@RestController
@RequestMapping("/api/parqueadero")
public class ParqueaderoController {
    @Autowired
    private ParqueaderoServiceImpl parqueaderoServiceImpl;

    @Autowired
    private RestResponse response;

    @PostMapping("/guardarParqueadero")
    public RestResponse createParqueadero(@RequestBody ParqueaderoVO parqueaderoVO) {

        try {
            List<Parqueadero> parq = this.parqueaderoServiceImpl.findAll();
            Parqueadero parqueadero = new Parqueadero(); 
            Parqueadero parqueadero2 = parq.stream().filter(p -> parqueaderoVO.getNombre().equals(p.getNombre())
                    || parqueaderoVO.getDireccion().equals(p.getDireccion())).findAny().orElse(null);
            if (parqueadero2 == null) {
                parqueadero.setCupoDisponible(parqueaderoVO.getCupoDisponible());
                parqueadero.setCupoMaximo(parqueaderoVO.getCupoMaximo());
                parqueadero.setDireccion(parqueaderoVO.getDireccion());
                parqueadero.setNombre(parqueaderoVO.getNombre());
                this.parqueaderoServiceImpl.create(parqueadero);
                return new RestResponse(HttpStatus.OK.value(), "Exitoso");
            }else{
                return new RestResponse(HttpStatus.BAD_REQUEST.value(), "Otro parqueadero se ha registrado con esa dirección o nombre");
            }

        } catch (Exception e) {
            // TODO: handle exception
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
            "Internal server error: " + e.getMessage());
        }
 

    }

    @GetMapping("/listarParqueaderos")
    public RestResponse listarParqueaderos() {
        try {
            List<Parqueadero> parq = this.parqueaderoServiceImpl.findAll();
            List<ParqueaderoVO> parqueaderos = new ArrayList<>();
            parq.forEach(parqueadero -> {
                ParqueaderoVO park = new ParqueaderoVO(parqueadero.getNombre(), parqueadero.getCupoMaximo(),
                        parqueadero.getCupoDisponible());
                parqueaderos.add(park);
            });
            return new RestResponse(HttpStatus.OK.value(), "Exitoso", parqueaderos);
        } catch (Exception e) {
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Internal server error: " + e.getMessage());
        }
    }

    @PostMapping("/consultarParqueadero")
    public RestResponse consultarParqueadero(@RequestParam String nombre, @RequestParam String direccion) {
        try {
            Parqueadero parq = this.parqueaderoServiceImpl.findParqueadero(nombre, direccion);
            if (parq != null) {
                ParqueaderoVO parqueadero = new ParqueaderoVO(parq.getNombre(), parq.getCupoMaximo(),
                        parq.getCupoDisponible());
                return new RestResponse(HttpStatus.OK.value(), "Exitoso", parqueadero);
            } else {
                return new RestResponse(HttpStatus.BAD_REQUEST.value(), "No se encontró ningún parqueadero con ese nombre y dirección");
            }
        } catch (Exception e) {
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Internal server error: " + e.getMessage());
        }

    }

}