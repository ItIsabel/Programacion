package futbol;

import segunda_Evaluacion_POO.Fecha;

public class Jugador extends PersonaFutbol {
	posicion posicion;

	public Jugador(String nombre, String apellidos, int edad, String dNI, Fecha fNacimiento, posicion posicion) {
		super(nombre, apellidos, edad, dNI, fNacimiento);
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return super.toString()+ "Jugador -posicion" + posicion + "\n";
	}
	
	

}
