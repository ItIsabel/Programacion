package biblioteca;

public abstract class Publicacion {
	int codigo;
	String titulo;
	int yr;
	public Publicacion(int codigo, String titulo, int yr) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.yr = yr;
	}
	
	
	public int getCodigo() {
		return codigo;
	}


	public int getYr() {
		return yr;
	}


	public String toString() {
		String r=" Anyo publicacion: " + this.yr + "\n";
		r+= "titulo:  "+ this.titulo + "\n";
		r+= "codigo: " + this.codigo + "\n";
		return r;
	}
	
	

}
