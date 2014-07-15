import java.util.Collection;

import model.Vehiculo;




public class Main {

	
	public static void main (String []args){
		
		LectorArchivo lectorArchivo = new LectorArchivo();
		
		Collection<Vehiculo> vehiculos = lectorArchivo.readFile("bin/vehiculos2.txt");
		
		System.out.println("Antes de ordenar");
		System.out.println(vehiculos);
		
		Ordenador.sortVehiculos(vehiculos);
		
		System.out.println("ordenados");
		System.out.println(vehiculos);
		
		
	}
	
}
