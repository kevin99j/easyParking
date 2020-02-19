package com.estudio.easyParking.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RestResponse {

	private int codigoRespuesta;
	private String mensaje;
	private BigInteger idRest;
	private Object objectRest;
	private List<Object> list;
	
	
	public RestResponse() { 
	}
	public RestResponse(int codigoRespuesta, String mensaje) {
		super();
		this.codigoRespuesta = codigoRespuesta;
		this.mensaje = mensaje;
	}
	
	public RestResponse(int codigoRespuesta, String mensaje, BigInteger idRest) {
		super();
		this.codigoRespuesta = codigoRespuesta;
		this.mensaje = mensaje;
		this.idRest= idRest;
	}
	
	public RestResponse(int codigoRespuesta, String mensaje, Object objectRest) {
		super();
		this.codigoRespuesta = codigoRespuesta;
		this.mensaje = mensaje;
		this.objectRest = objectRest;
	}
	
	

	public RestResponse(int codigoRespuesta, String mensaje , List<Object> list) {
	
		this.codigoRespuesta = codigoRespuesta;
		this.mensaje = mensaje;
	    this.list = list;
	}

	public int getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(int codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public BigInteger getIdRest() {
		return idRest;
	}
	public void setIdRest(BigInteger idRest) {
		this.idRest = idRest;
	}

	public Object getObjectRest() {
		return objectRest;
	}

	public void setObjectRest(Object objectRest) {
		this.objectRest = objectRest;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	
	
	
}