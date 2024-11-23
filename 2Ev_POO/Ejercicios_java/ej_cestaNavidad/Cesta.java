package ej_cestaNavidad;
import java.util.ArrayList;

public class Cesta {

	ArrayList<Producto> listaProductos;
	Cliente cliente;
		/**
	 * @author isabel
	 * El metodo Cesta es el constructor
	 * @param cliente que solicita la cesta
	 */
	public Cesta(Cliente cliente){
		this.cliente=cliente;
		this.listaProductos= new ArrayList<Producto>();
	};
	
	/**
	 * Metodo para calcular el precio total
	 * @return el cálculo del sumatorio total del precio de todos los productos
	 */
	public int PVP() {
		int r=0;
		for (int i=0;i<listaProductos.size();i++) {
			r= r+ (listaProductos.get(i).getPrecio());
		}
		return r;
	}
	/**
	 * Metodo para agregar productos a un array
	 * @param prod producto a agregar a la lista
	 * @return retorna un String indicando si se ha agregado
	 * @throws Exception retorna una excepción cuando el precio excede los 100eur
	 */
	public String addProd(Producto prod) throws Exception{
		String r;
		if (PVP()+prod.getPrecio()<100) {
			listaProductos.add(prod);
			r="Producto agregado: " + prod.getNombre();
		}
		else {
			throw new Exception("Error, el valor no puede superar los 100€. El valor de la cesta es "+ PVP() + " y el importe que se quiere introducir " + prod.getPrecio());
		}
		return r;
	}
	/**
	 * Metodo para indicar si la cesta es apta para celiacos
	 * @return retorna true en caso de ser positivo y false en caso de ser negativo
	 */
	public boolean glutenFree() {
		boolean r=true;
		for (int i=0;i<listaProductos.size();i++) {
			if( listaProductos.get(i).glutenFree()) {
				r=true;
			}
			else 
				r=false;
		}
		return r;
	}
	
	/**
	 *Metodo para devolver por String el estado del objeto.
	 *Hereda del toString de las clases cliente y producto. 
	 */
	public String toString() {
		String r="\n";
		r+="Cesta de: " + this.cliente +"\n";
		r+="Lista de productos: "+ this.listaProductos+"\n";
		
		return r;
		
	}

}
