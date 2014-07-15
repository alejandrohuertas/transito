import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import model.Vehiculo;


public class Ordenador {

	
	
	public static void sortVehiculos (Collection<Vehiculo> vehiculos){
		
		Collections.sort((ArrayList<Vehiculo>)vehiculos, new Comparator<Vehiculo>() {

			@Override
			public int compare(Vehiculo o1, Vehiculo o2) {
				
				int dateCmp = o1.getFechaPatentamiento().compareTo(o2.getFechaPatentamiento());
					
				
				return dateCmp;
			}
			
		});
		
		
	}
}
