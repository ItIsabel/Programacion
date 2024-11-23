package linked;

public class Alumno {
	int id;
	String nombre;
	String tutor;
	public Alumno(int id, String nombre, String tutor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tutor = tutor;
		
		
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", tutor=" + tutor + "]";
	}

	

}
