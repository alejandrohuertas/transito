import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import model.Auto;
import model.Camion;
import model.Motocicleta;
import model.Vehiculo;


public class LectorArchivo {

	
	
	public Collection<Vehiculo> readFile(String file){
		Collection<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		FileReader fileReader;
		try {
			fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line;
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				
				vehiculos.add(processLine(line));
			}
			br.close();
			return vehiculos;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public Vehiculo processLine (String line){
		
		System.out.println(" procesando linea ---> "+ line);
		Vehiculo vehiculo = null;
		
		String vehiculoArray[] = line.split(",");

		String tipo = vehiculoArray[0];
		Integer numPasajeros = Integer.decode(vehiculoArray[1].trim());
		Integer numRuedas = Integer.decode(vehiculoArray[2].trim());
		String fechaPatentamientoString = vehiculoArray[3];
		String tipoTransporte = vehiculoArray[4];
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date fechaPatentamiento;
		try {
			fechaPatentamiento = sdf.parse(fechaPatentamientoString);
			if (tipo .equals("moto")){
				String cilindraje = vehiculoArray[5].trim();
				String tipoMotor = vehiculoArray[6].trim();
				vehiculo = new Motocicleta (Integer.decode(cilindraje), tipoMotor , numPasajeros, 
						numRuedas, fechaPatentamiento, tipoTransporte);
			} else if (tipo .equals("auto")){
				String numPuertas = vehiculoArray[5].trim();
				String transmision = vehiculoArray[6].trim();
				vehiculo = new Auto(Integer.decode(numPuertas), transmision, numPasajeros, numRuedas, fechaPatentamiento, tipoTransporte); 
			}
			else if (tipo .equals("camion")){
				String largo = vehiculoArray[5].trim();
				String capacidadCarga = vehiculoArray[6].trim();
				vehiculo = new Camion(Double.valueOf(largo), Double.valueOf(capacidadCarga), numPasajeros, numRuedas, fechaPatentamiento, tipoTransporte);
			}
			return vehiculo;
		} catch (ParseException e) {
			System.out.println("Error al formatear la fecha");
			e.printStackTrace();
			
		}
		
		return null;
		
	}
}
