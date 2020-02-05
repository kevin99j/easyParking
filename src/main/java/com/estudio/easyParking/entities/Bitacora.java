package com.estudio.easyParking.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * Bitacora
 */

 @Entity
public class Bitacora {

    @Id()
    @Column(name="id_bitacora")
    @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy = "uuid2")
    private Integer idBitacora;
    @Column(name="id_bitacora")
    private Date fecha;
   /*  @Column(name="id_parqueadero")
    private List<Parqueadero> idParqueadero; */
    @Column(name="hora_entrada")
    private Date horaEntrada;
    @Column(name="hora_salida")
    private Date horaSalida;
    @Column(name="unidad_tiempo")
    private String unidadTiempo;
    @Column(name="valor")
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
    /*
	public List<Parqueadero> getIdParqueadero() {
		return idParqueadero;
	}
	public void setIdParqueadero(List<Parqueadero> idParqueadero) {
		this.idParqueadero = idParqueadero;
    }
    */
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