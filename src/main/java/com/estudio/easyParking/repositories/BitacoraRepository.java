package com.estudio.easyParking.repositories;

import java.util.List;

import com.estudio.easyParking.entities.Bitacora;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BitacoraRepository
 */
@Repository
public interface BitacoraRepository extends JpaRepository<Bitacora,Integer> {

    public List<Bitacora> findByIdBitacora(Integer idBitacora);

    
}