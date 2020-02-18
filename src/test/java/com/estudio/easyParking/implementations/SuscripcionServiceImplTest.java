package com.estudio.easyParking.implementations;

import com.estudio.easyParking.entities.Suscripcion;
import com.estudio.easyParking.pojos.SuscripcionVO;
import com.estudio.easyParking.repositories.SuscripcionRepository;
import com.estudio.easyParking.services.ISuscripcionService;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class SuscripcionServiceImplTest {


    @Autowired
    ISuscripcionService service;

    @MockBean
    SuscripcionRepository repository;

    @Before
    public void setUp() {
        Mockito.when(repository.findAll()).thenReturn(Arrays.asList(
                new Suscripcion("Moto"),
                new Suscripcion("Carro"),
                new Suscripcion("Bicicleta"),
                new Suscripcion("Camion")
                ));


    }

    @Test
    public void findAll() {
        Collection<SuscripcionVO> suscripcions = service.findAll();
        List<String> tipos = suscripcions.stream().map(SuscripcionVO::getTipo).collect(Collectors.toList());

        assertThat(tipos, CoreMatchers.is(Arrays.asList("Moto","Carro","Bicicleta","Camion")));

    }
}