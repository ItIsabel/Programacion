package Comparable;

public class Alumno implements Comparable<Alumno>{
	String nombre;
	int edad;
	String tutor;
	
	public Alumno(String nombre, int edad, String tutor) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tutor = tutor;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
		
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", tutor=" + tutor + "]";
	}


	@Override
	public int compareTo(Alumno a) {
		return this.nombre.compareTo(a.nombre);
	}

}
