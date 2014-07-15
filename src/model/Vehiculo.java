package model;

import java.util.Date;


public abstract class Vehiculo {

	
	protected Integer numPasajeros;
	protected Integer numRuedas;
	protected Date fechaPatentamiento;
	protected String tipoTransporte;
	
	
	public void setNumPasajeros(Integer numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	public Integer getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumRuedas(Integer numRuedas) {
		this.numRuedas = numRuedas;
	}
	public Integer getNumRuedas() {
		return numRuedas;
	}
	public void setFechaPatentamiento(Date fechaPatentamiento) {
		this.fechaPatentamiento = fechaPatentamiento;
	}
	public Date getFechaPatentamiento() {
		return fechaPatentamiento;
	}
	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	public String getTipoTransporte() {
		return tipoTransporte;
	}
}
