package com.estudio.easyParking.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Descuento
 */

 @Entity()
 public class Descuento{
    @Id
    @Column(name = "id_descuento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDescuento;
    
    @Column(name ="nombre")
    private String nombre;

    @Column(name="fecha")
    private Date fecha;

    @Column(name ="valor")
    private Double valor;

    public Integer getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(Integer idDescuento) {
        this.idDescuento = idDescuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
   
}