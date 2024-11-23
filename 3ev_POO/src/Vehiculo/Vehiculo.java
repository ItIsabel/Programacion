package Vehiculo;

public abstract class Vehiculo {
	int velocidadActual;
	int velocidadMaxima;

	
	public Vehiculo(int velocidadMaxima) {
		this.velocidadActual=0;
		this.velocidadMaxima = velocidadMaxima;
	}

	public abstract void acelerar (int Velocidad);
	
	public abstract void frenar (int velocidad);
	
	public String imprimir() {
		String r= "Velocidad actual: "+this.velocidadActual+"\n";
		r+="Velocidad Máxima alcanzable" + this.velocidadMaxima;
		return r;
	}

}
