package com.estudio.easyParking.services;

import com.estudio.easyParking.entities.Parqueadero;


import java.util.List;

/**
 * ParqueaderoService
 */
public interface IParqueaderoService  {
    
  
    public Parqueadero create(Parqueadero parqueadero);


    public List<Parqueadero> findAll();

    public Parqueadero findParqueadero(String nombre, String direccion);
}