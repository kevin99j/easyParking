package com.estudio.easyParking.repositories;

import com.estudio.easyParking.entities.Parqueadero;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

/**
 * ParqueaderoRepository
 */
@Repository
public interface ParqueaderoRepository extends JpaRepository<Parqueadero,Integer>{

   
    /**
     * creacion de parqueaderos
     * @param parqueadero
     */
    public void saveParqueadero(Parqueadero parqueadero);
  



}