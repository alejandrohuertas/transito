package model;
import java.util.Date;


public class Camion extends Vehiculo {

	
	private Double largo;
	private Double capacidadCarga;
	
	
	public Camion (Double largo, Double capacidadCarga, Integer numPasajeros, Integer numRuedas,
			Date fechaPatentamiento, String tipoTransporte ){

		this.largo = largo;
		this.capacidadCarga = capacidadCarga;
		this.numPasajeros = numPasajeros;
		this.fechaPatentamiento = fechaPatentamiento;
		this.tipoTransporte= tipoTransporte;
		this.numRuedas = numRuedas;
	}
	
	
	public void setLargo(Double largo) {
		this.largo = largo;
	}
	public Double getLargo() {
		return largo;
	}
	public void setCapacidadCarga(Double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public Double getCapacidadCarga() {
		return capacidadCarga;
	}

	public String toString(){
		return "Num. pasajeros: "+numPasajeros + 
		",  num.de ruedas:  "+ numRuedas 
			+ ", fecha de Patentamiento : "+fechaPatentamiento
			+", tipo de transporte: "+ tipoTransporte
			+", largo en mts: "+ largo+
			", carga Maxima en kgs: "+capacidadCarga+"\n";
		
		
	}
	
}
