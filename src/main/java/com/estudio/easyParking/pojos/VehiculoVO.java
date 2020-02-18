package com.estudio.easyParking.pojos;

import com.estudio.easyParking.entities.Suscripcion;



public class VehiculoVO {

    private Integer idVehiculo;
    private  String tipo;
    private String placa;
    private String color;
    private SuscripcionVO suscripcion;

    public VehiculoVO() {
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SuscripcionVO getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(SuscripcionVO suscripcion) {
        this.suscripcion = suscripcion;
    }
}
