package vehiculos;

public class Coche extends Vehiculo {
	int nPuertas;
	int nAsientos;
	public Coche(String marca, int matricula, int id, int capacidadDeposito, int km, int nPuertas, int nAsientos) {
		super(marca, matricula, id, capacidadDeposito, km);
		this.nPuertas = nPuertas;
		this.nAsientos = nAsientos;
	}
	
	public void arrancar() throws Exception {
		super.arrancar(4);
	}
	
	public void acelerar() throws Exception {
		super.acelerar(10);
	}

	@Override
	public String toString() {
		return  super.toString() + "Coche - Puertas=" + nPuertas + ", nAsientos=" + nAsientos +"\n";
	}
	
	

	

}
