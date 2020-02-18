package com.estudio.easyParking.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Bitacora
 */

@Entity
public class Bitacora {

	@Id()
	@Column(name = "id_bitacora")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBitacora;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "id_parqueadero")
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Parqueadero> parqueaderos;
	@Column(name = "hora_entrada")
	private Date horaEntrada;
	@Column(name = "hora_salida")
	private Date horaSalida;
	@Column(name = "unidad_tiempo")
	private String unidadTiempo;
	@Column(name = "valor")
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

	public List<Parqueadero> getParqueaderos() {
		return parqueaderos;
	}

	public void setParqueaderos(List<Parqueadero> parqueaderos) {
		this.parqueaderos = parqueaderos;
	}

}