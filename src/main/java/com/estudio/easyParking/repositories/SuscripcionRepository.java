package com.estudio.easyParking.repositories;

import com.estudio.easyParking.entities.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuscripcionRepository extends JpaRepository<Suscripcion, Integer> {


    List<Suscripcion> findAll();


}
