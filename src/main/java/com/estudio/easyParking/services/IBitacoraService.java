package com.estudio.easyParking.services;


 
import java.util.List;

import com.estudio.easyParking.entities.Bitacora;

/**
 * BitacoraService
 */

public interface IBitacoraService {
 
    
    public void create(Bitacora bitacora);

    public List<Bitacora> findAll();



  
    
    
}