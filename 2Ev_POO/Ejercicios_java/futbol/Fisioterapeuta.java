package futbol;

import segunda_Evaluacion_POO.Fecha;

public class Fisioterapeuta extends PersonaFutbol{
	int experiencia;

	public Fisioterapeuta(String nombre, String apellidos, int edad, String dNI, Fecha fNacimiento, int experiencia) {
		super(nombre, apellidos, edad, dNI, fNacimiento);
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return super.toString()+"Fisioterapeuta - experiencia=" + experiencia + "\n";
	}
	
	

	
}
	


