package segunda_Evaluacion_POO;

public class Coche {
	private int velocidad=0;
	private String color="";
	private String marca="";
	private int puertas=0;
	private int precio=0;
	
	public Coche(String colorinchi, String marca, int puertas) {
		color=colorinchi;
		this.marca=marca;
		this.puertas=puertas;
	}
	public Coche(String colorinchi, String marca, int puertas, int costo) {
		color=colorinchi;
		this.marca=marca;
		this.puertas=puertas;
		this.precio=costo;
	}
	public int acelerar(int velocidad) {
		return  this.velocidad+=velocidad;
	}
	public int frenar (int freno) {
		return this.velocidad-=freno;
	}
	public String cambiarColor( String nuevoColor) {
		return this.color=nuevoColor;
	}
	public int apagar() {
		return velocidad=0;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public String toString() {
		String r="Velocidad:"+this.velocidad+"\n";
		r+="Color:"+this.color+"\n";
		r+="Marca:"+this.marca+"\n";
		r+="puerta:"+this.puertas+"\n";
		return r;
	}
}
