package futbol;
import segunda_Evaluacion_POO.Persona;
import segunda_Evaluacion_POO.Fecha;

public class PersonaFutbol  extends Persona{
	int edad;
	String DNI;
	Fecha fNacimiento;
	public PersonaFutbol(String nombre, String apellidos, int edad, String dNI, Fecha fNacimiento) {
		super(nombre, apellidos);
		this.edad = edad;
		this.DNI = dNI;
		this.fNacimiento = fNacimiento;
	}
	@Override
	public String toString() {
		return "Persona - edad=" + edad + ", DNI=" + DNI + ", fNacimiento=" + fNacimiento + "\n";
	}
	
	

}
