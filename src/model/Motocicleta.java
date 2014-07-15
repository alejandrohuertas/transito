package model;
import java.util.Date;


public class Motocicleta extends Vehiculo {

	private Integer cilindraje;
	private String tipoMotor;
	
	
	
	public Motocicleta(Integer cilindraje, String tipoMotor, Integer numPasajeros, Integer numRuedas,
			Date fechaPatentamiento, String tipoTransporte ){
		
		this.cilindraje = cilindraje;
		this.tipoMotor= tipoMotor;
		this.numPasajeros = numPasajeros;
		this.fechaPatentamiento = fechaPatentamiento;
		this.tipoTransporte= tipoTransporte;
		this.numRuedas = numRuedas;
	}
	
	
	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}
	public Integer getCilindraje() {
		return cilindraje;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	
	public String toString(){
		return "Num. pasajeros: "+numPasajeros + 
		",  num.de ruedas:  "+ numRuedas 
			+ ", fecha de Patentamiento : "+fechaPatentamiento
			+", tipo de transporte: "+ tipoTransporte
			+", cilindraje: "+ cilindraje+
			", tipo de motor: "+tipoMotor+"\n";
		
		
	}
}
