package com.estudio.easyParking.pojos;

import com.estudio.easyParking.entities.Usuario;
import com.estudio.easyParking.entities.Vehiculo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SuscripcionVO {
    private Integer idSuscripcion;
    private String tipo;
    private Date fechaInicio;
    private Date fechaFin;
    private Double precio;
    private boolean activo;
    private List<Usuario> usuarios;
    private VehiculoVO vehiculo;

    public SuscripcionVO() {
        this.usuarios = new ArrayList<>();
    }

    public Integer getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(Integer idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public VehiculoVO getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoVO vehiculo) {
        this.vehiculo = vehiculo;
    }



}
