package com.estudio.easyParking.repositories;

import java.util.List;

import com.estudio.easyParking.entities.Parqueadero;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

/**
 * ParqueaderoRepository
 */
@Repository
public interface ParqueaderoRepository extends JpaRepository<Parqueadero,Integer>{

   
    /**
     * busqueda de parqueaderos
     * @param parqueadero
     */
    public List<Parqueadero> findByCupoDisponible(Integer cupoDisponible);
  



}