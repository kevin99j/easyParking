package com.estudio.easyParking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * Parqueadero
 */
@Entity()
public class Parqueadero {

    @Id
    @Column(name = "id_parqueadero")
    @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy = "uuid2")
    private Integer idParqueadero;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;
    @Column(name = "cupo_maximo")
    private Integer cupoMaximo;
    @Column(name = "cupo_disponible")
    private Integer cupoDisponible;

    public Integer getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public Integer getCupoDisponible() {
        return cupoDisponible;
    }

    public void setCupoDisponible(Integer cupoDisponible) {
        this.cupoDisponible = cupoDisponible;
    }


    
}