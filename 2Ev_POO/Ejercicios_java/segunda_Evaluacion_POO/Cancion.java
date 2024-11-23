package segunda_Evaluacion_POO;

public class Cancion {
	private String nombreCancion=new String();
	private String autorCancion=new String();
	
	public Cancion(String nombre, String autor) {
		nombreCancion=nombre;
		autorCancion=autor;
	}
	public Cancion() {
		nombreCancion="";
		autorCancion="";
	}
	public String dameTitulo() {
		return nombreCancion;
	}
	public String dameAutor() {
		return autorCancion;
	}
	public void ponTitulo(String nombreCancion) {
		this.nombreCancion=nombreCancion;
	}
	public void ponAutor(String autorCancion) {
		this.autorCancion=autorCancion;
	}
	public String toString() {
		String r="Nombre cancion: "+nombreCancion +"\n";
		r+="Autor: "+ autorCancion;
		return r;
	}
}
