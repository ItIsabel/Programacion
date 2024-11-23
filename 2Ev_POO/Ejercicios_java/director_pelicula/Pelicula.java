package director_pelicula;

public class Pelicula {
	private String titulo;
	private int yr;
	private Director director;
	
	public Pelicula(String titulo) {
		this.titulo=titulo;
	}
	public Pelicula(Director director) {
		this.director=director;
	}
	public Pelicula() {};
	
	public void setTitulo (String titulo) {
		this.titulo=titulo;
	}
	public void setDirector(Director director) {
		this.director=director;
	}
	
	public void setYR( int yr) {
		this.yr=yr;
	}
	
	public String getTitulo () {
		return this.titulo;
	}
	public Director getDirector() {
		return this.director;
	}
	
	public int getYR() {
		return this.yr;
	}
	public String toString() {
		String r="nombre:" + this.titulo+"\n";
		r+="Director: "+ this.director+"\n";
		r+="Año: " + this.yr +"\n";
		return r;
	}
	
	

}
