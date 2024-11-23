package ej_cestaNavidad;

public class Producto {
	public enum tipo{
		salado,
		dulce,
		bebida
	}
	
	private int idProducto;
	private static int totalProductos;
	private String nombre;
	private int precioUnitario;
	private boolean gluten;
	private tipo tipo;
	
	/**
	 * Constructor de la clase Producto
	 * @param nombre nombre del producto
	 * @param precioUnid precio unitario de cada producto
	 * @param gluten si contiene o no gluten
	 * @param tipo si es dulce, salado o bebida.
	 */
	public Producto(String nombre ,int precioUnid, boolean gluten, tipo tipo) {
		this.nombre=nombre;
		this.precioUnitario=precioUnid;
		this.gluten=gluten;
		this.tipo=tipo;
		this.idProducto=totalProductos+1;
		this.totalProductos++;
	}
	
	/**
	 * Método para conseguir el precio unitario de cada producto
	 * @return retorna el precio unitario de cada producto
	 */
	public int getPrecio() {
		return this.precioUnitario;
	}
	/**
	 *Metodo para devolver por String el estado del objeto.
	 *
	 */
	
	public String toString() {
		String r= "nombre producto: "+ this.nombre +"\n";
		r+="Precio unitario: " + this.precioUnitario +"\n";
		r+="Contiene gluten: "+ this.gluten +"\n";
		r+="Es..."+ this.tipo +"\n";
		r+="Su codigo de producto es: "+ this.idProducto+"\n";
		return r;
	}
	/**
	 * Metodo para obtener el nombre del producto
	 * @return retorna unicamente el nombre del producto
	 */
	public String getNombre() {
		return this.nombre;
	}
	/**
	 * Metodo para obtener si el producto contiene gluten
	 * @return retorna un booleano. Si es true, contiene gluten; si es false, no contiene gluten
	 */
	public boolean glutenFree() {
		return this.gluten;
	}
}
