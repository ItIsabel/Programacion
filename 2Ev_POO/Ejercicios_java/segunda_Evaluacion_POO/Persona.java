package segunda_Evaluacion_POO;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private String apellidos;
	
	public Persona(String nombre,String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	public String toString() {
		return this.nombre+ " " + this.apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);
	}
	
}
