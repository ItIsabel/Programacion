package futbol;

import segunda_Evaluacion_POO.Fecha;

public class Entrenador extends PersonaFutbol{
	String titulación;

	public Entrenador(String nombre, String apellidos, int edad, String dNI, Fecha fNacimiento, String titulación) {
		super(nombre, apellidos, edad, dNI, fNacimiento);
		this.titulación = titulación;
	}

	@Override
	public String toString() {
		return super.toString()+"Entrenador - titulación=" + titulación + "\n";
	}
	
	

}
