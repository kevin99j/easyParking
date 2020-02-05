package com.estudio.easyParking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * Precio
 */
@Entity
public class Precio {

    @Id()
    @Column(name = "id_precio")
    @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy = "uuid2")
    private Integer idPrecio;
    @Column(name = "unidad_tiempo")
    private String unidadTiempo;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "vehiculo")
    private String  vehiculo;

    public Integer getIdPrecio() {
        return idPrecio;
    }

    public void setIdPrecio(Integer idPrecio) {
        this.idPrecio = idPrecio;
    }

    public String getUnidadTiempo() {
        return unidadTiempo;
    }

    public void setUnidadTiempo(String unidadTiempo) {
        this.unidadTiempo = unidadTiempo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    

}