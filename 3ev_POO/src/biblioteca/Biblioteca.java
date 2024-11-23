package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Publicacion> arrPub;

	public Biblioteca() {
		arrPub=new ArrayList<Publicacion>();

	}
	
	public void addPublicacion(Publicacion p) {
		arrPub.add(p);
	}
	
	public int cuentaPrestados(){
		int contador=0;
		for (Publicacion p : arrPub) {
			if (p instanceof Prestable) {
				if (((Libro)p).prestado) {
					contador++;
				}
			}
		}
		return contador;
	}
	public int publicacionesAnterioresA(int yr) {
		int contador=0;
		for (Publicacion p : arrPub) {
			if (yr>p.getYr()) {
				contador++;
			}
			
		}
		return contador;
	}
	
	
	

}
