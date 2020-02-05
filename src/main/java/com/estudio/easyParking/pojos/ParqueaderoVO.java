package com.estudio.easyParking.pojos;

/**
 * ParqueaderoVO
 */
public class ParqueaderoVO {

  
    private Integer idParqueadero;
    private String nombre;
    private String direccion;
    private Integer cupoMaximo;
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