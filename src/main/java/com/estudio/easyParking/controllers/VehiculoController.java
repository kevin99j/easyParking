package com.estudio.easyParking.controllers;

import com.estudio.easyParking.entities.Vehiculo;
import com.estudio.easyParking.implementations.VehiculoServiceImpl;
import com.estudio.easyParking.pojos.VehiculoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl service;




    @GetMapping("/listarVehiculos")
    public ResponseEntity<List<VehiculoVO>> listarVehiculos(){
        return  ResponseEntity.ok(this.service.findAll());
    }




    @PostMapping("/crearVehiculo")
    public void crearVehiculo(List<VehiculoVO> vehiculo){
        try {
            for (VehiculoVO vehiculoVO : vehiculo) {
            Vehiculo veh = new Vehiculo();
            veh.setColor(vehiculoVO.getColor()); 
            veh.setPlaca(vehiculoVO.getPlaca());
            veh.setTipo(vehiculoVO.getTipo()); 
            service.create(veh);
        }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}