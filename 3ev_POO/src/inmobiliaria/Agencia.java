package inmobiliaria;

import java.util.ArrayList;

public class Agencia {
	ArrayList<Inmueble> ListaInmuebles;
	
	/*
	 * Constructor de agencia
	 */
	public Agencia() {
		ListaInmuebles = new ArrayList<Inmueble>();
	}
	public Agencia(ArrayList<Inmueble> a) {
		ListaInmuebles = new ArrayList<Inmueble>();
		ListaInmuebles.addAll(a);
	}
	
	/**
	 * Agrega inmueble al array de inmuebles
	 * @param i
	 */
	public void addInmueble( Inmueble i) {
		ListaInmuebles.add(i);
	}
	
	/**
	 * Metodo privado que solo lo utiliza el método fusionarAgencia
	 * @return devuelve el array de una agencia para 
	 */
	private ArrayList<Inmueble> CogerArray(){
		return this.ListaInmuebles;
	}

/**
 * 
 * @param a
 */
	public ArrayList<Inmueble> fusionarAgencias(Agencia a) {
		ArrayList<Inmueble> r= new ArrayList<Inmueble> ();
		r.addAll(a.CogerArray());
		r.addAll(this.ListaInmuebles);
		return r;
	}
	public String verTodasVentasInmueble(){
		ArrayList<Inmueble> r=new ArrayList<Inmueble>();
		for (Inmueble inmueble : ListaInmuebles) {
			if (inmueble instanceof Vendible) {
				r.add(inmueble);
			}
		}
		return "inmuebles vendibles: "+"\n"+ r.toString();
	}
	
	public String verTodasAlquilerInmueble(){
		ArrayList<Inmueble> r=new ArrayList<Inmueble>();
		for (Inmueble inmueble : ListaInmuebles) {
			if (inmueble instanceof Alquilable) {
				r.add(inmueble);
			}
		}
		return "inmuebles Alquilables: "+"\n" +r.toString();
	}
	

}
