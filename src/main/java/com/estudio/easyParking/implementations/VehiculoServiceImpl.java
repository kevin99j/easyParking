package com.estudio.easyParking.implementations;

import com.estudio.easyParking.entities.Suscripcion;
import com.estudio.easyParking.entities.Vehiculo;
import com.estudio.easyParking.pojos.SuscripcionVO;
import com.estudio.easyParking.pojos.VehiculoVO;
import com.estudio.easyParking.repositories.VehiculoRepository;
import com.estudio.easyParking.services.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

    @Autowired
    private VehiculoRepository repository;

    @Override
    public VehiculoVO findBySuscripcion(Suscripcion suscripcion) {
        VehiculoVO vehiculoVO = null;
        try {
             vehiculoVO = new VehiculoVO();
            Optional<Vehiculo> vehiculoT = this.repository.findBySuscripcion(suscripcion);
            if(vehiculoT.isPresent()){
                vehiculoVO.setColor(vehiculoT.get().getColor());
                vehiculoVO.setIdVehiculo(vehiculoT.get().getIdVehiculo());
                vehiculoVO.setPlaca(vehiculoT.get().getPlaca());
                vehiculoVO.setTipo(vehiculoT.get().getTipo());
               
            }else{
                vehiculoVO = new VehiculoVO();
            }


        }catch (Exception e){
            System.out.println(e);
        }


        return vehiculoVO;
    }

    @Override
    public List<VehiculoVO> findAll() {
        List<VehiculoVO> vehiculos = new ArrayList<>();
        try {
        for(Vehiculo vehiculo: repository.findAll()) {
                VehiculoVO vehiculoVO = new VehiculoVO();
                vehiculoVO.setColor(vehiculo.getColor());
                vehiculoVO.setIdVehiculo(vehiculo.getIdVehiculo());
                vehiculoVO.setPlaca(vehiculo.getPlaca());
                vehiculoVO.setTipo(vehiculo.getTipo());
                SuscripcionVO sus = new SuscripcionVO();
                sus.setPrecio(vehiculo.getSuscripcion().getPrecio());
                sus.setIdSuscripcion(vehiculo.getSuscripcion().getIdSuscripcion());
                vehiculoVO.setSuscripcion(sus);
                vehiculos.add(vehiculoVO);
            };
        }catch (Exception e){
            System.out.println(e);
        }


        return vehiculos;
    }


}
