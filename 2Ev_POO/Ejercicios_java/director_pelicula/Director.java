package director_pelicula;

public class Director {
	private String nombre;
	private String pais;
	private int yrNac;
	
	public Director( String jojo, String pais, int anyoNac) {
		this.nombre=jojo;
		this.pais=pais;
		this.yrNac=anyoNac;
	}
	public String toString() {
		String r="nombre:" + this.nombre+"\n";
		r+="pais nacimiento: "+ this.pais+"\n";
		r+="Año nacimiento: " + this.yrNac +"\n";
		return r;
	}
	public void setPais(String pais) {
		this.pais=pais;
	}
	

}

