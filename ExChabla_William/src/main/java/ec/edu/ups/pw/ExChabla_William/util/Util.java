package ec.edu.ups.pw.ExChabla_William.util;

import ec.edu.ups.pw.ExChabla_William.modelo.Carrera;
import ec.edu.ups.pw.ExChabla_William.modelo.Universidad;

public class Util {

	public static void main(String arg[]) {
		
		Universidad universidad = new Universidad();
		
		universidad.setCodigoUni(1);
		universidad.setNombre("UPS");
		universidad.setDireccion("El Vecino");
		universidad.setTelefono("0984389617");

		Carrera carrera = new Carrera();
		carrera.setCodigoCar(1);
		carrera.setNombreCarrera("Computacion");
		carrera.setDirector("P. Herran");

		universidad.setCarrera(carrera);


		System.out.println(universidad.getCarrera().getNombreCarrera());
		
	}
}
