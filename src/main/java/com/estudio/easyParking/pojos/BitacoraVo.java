package com.estudio.easyParking.pojos;

import java.util.Date;
import java.util.List;

public class BitacoraVo {
    private Integer idBitacora;
	
	private Date fecha;
	private List<ParqueaderoVO> parqueaderos;
	private Date horaEntrada;
	private Date horaSalida;
	private String unidadTiempo;
    private Double valor;

    public Integer getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(Integer idBitacora) {
        this.idBitacora = idBitacora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<ParqueaderoVO> getParqueaderos() {
        return parqueaderos;
    }

    public void setParqueaderos(List<ParqueaderoVO> parqueaderos) {
        this.parqueaderos = parqueaderos;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
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
    

    
}
