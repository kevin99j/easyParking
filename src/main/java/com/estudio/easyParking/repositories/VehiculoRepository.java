package com.estudio.easyParking.repositories;


import java.util.List;
import java.util.Optional;

import com.estudio.easyParking.entities.Suscripcion;
import com.estudio.easyParking.entities.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo,Integer> {


    Optional<Vehiculo> findBySuscripcion(Suscripcion suscripcion);

    List<Vehiculo> findAll();


    public Vehiculo findByIdVehiculo(Integer id);
    public String findByPlaca(String placa);
}