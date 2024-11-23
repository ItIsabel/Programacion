package ej_cestaNavidad;

public class Cliente {
	
	public enum tipoCLiente {
		particular,
		empresa
	}
	private String nombre;
	private String apellidos;
	private String DNI;
	tipoCLiente tipo;
	
	/**
	 * Constructor de cliente
	 * @param nombre
	 * @param apellidos
	 * @param id
	 * @param tipo
	 */
	public Cliente (String nombre,String apellidos, String id,tipoCLiente tipo) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.DNI=id;
		this.tipo=tipo;
	}
	/**
	 *Metodo para devolver por String el estado del objeto.
	 *
	 */
	public String toString() {
		return this.nombre+ " " + this.apellidos;
	}
}



