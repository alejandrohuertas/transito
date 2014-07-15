package model;

import java.util.Date;


public class Auto extends Vehiculo {

	
	private Integer numPuertas;
	private String transmision; 

	public Auto (Integer numPuertas, String transmision, Integer numPasajeros, Integer numRuedas,
			Date fechaPatentamiento, String tipoTransporte ){
		
		this.numPuertas = numPuertas;
		this.transmision = transmision;
		this.numPasajeros = numPasajeros;
		this.fechaPatentamiento = fechaPatentamiento;
		this.tipoTransporte= tipoTransporte;
		this.numRuedas = numRuedas;
	}
	
	public void setNumPuertas(Integer numPuertas) {
		this.numPuertas = numPuertas;
	}

	public Integer getNumPuertas() {
		return numPuertas;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	public String getTransmision() {
		return transmision;
	}
	
	public String toString(){
		return "Num. pasajeros: "+numPasajeros + 
		",  num.de ruedas:  "+ numRuedas 
			+ ", fecha de Patentamiento : "+fechaPatentamiento
			+", tipo de transporte: "+ tipoTransporte
			+", numero de puertas: "+ numPuertas+
			", transmision: "+transmision+"\n";
		
		
	}
}
