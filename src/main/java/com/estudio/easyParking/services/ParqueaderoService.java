package com.estudio.easyParking.services;

import com.estudio.easyParking.entities.Parqueadero;
import com.estudio.easyParking.repositories.ParqueaderoRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ParqueaderoService
 */
@Service
@Transactional(readOnly = true)
public class ParqueaderoService {

    private final ParqueaderoRepository parquederoRepository;

    


    @Transactional
    public Parqueadero create(Parqueadero parqueadero){
        return this.parquederoRepository.save(parqueadero);
    }

    public ParqueaderoService(ParqueaderoRepository parquederoRepository) {
        this.parquederoRepository = parquederoRepository;
    }
    
}