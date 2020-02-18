package com.estudio.easyParking.pojos;

import com.estudio.easyParking.entities.Suscripcion;
import java.util.ArrayList;
import java.util.List;

public class UsuarioVO {

    private Integer idUsuario;
    private String nombre;
    private String documento;
    private  String tipo;
    private List<Suscripcion> suscripciones;


    public UsuarioVO() {
        this.suscripciones = new ArrayList<>();
    }


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Suscripcion> getSuscripciones() {
        return suscripciones;
    }

    public void setSuscripciones(List<Suscripcion> suscripciones) {
        this.suscripciones = suscripciones;
    }
}
