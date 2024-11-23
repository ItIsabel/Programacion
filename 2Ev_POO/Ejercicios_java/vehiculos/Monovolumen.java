package vehiculos;

public class Monovolumen extends Vehiculo {
	int nPuertas;
	int nPuertasLaterales;
	int asientos;
	motor motor;
	
	public Monovolumen(String marca, int matricula, int id, int capacidadDeposito, int km, int nPuertas,
			int nPuertasLaterales, int asientos, motor motor) {
		super(marca, matricula, id, capacidadDeposito, km);
		this.nPuertas = nPuertas;
		this.nPuertasLaterales = nPuertasLaterales;
		this.asientos = asientos;
		this.motor = motor;
	}
	
	/*
	 * Metodo para arrancar. Monovolumen gasta 5 de combustible para arrancar 
	 */

	public void arrancar() throws Exception {
		super.arrancar(5);
	}
	/*
	 * Metodo para acelerar . Monovolumen gasta 5 de combustible para acelerar
	 */
	public void acelerar() throws Exception {
			super.acelerar(5);
		}

	@Override
	public String toString() {
		return super.toString()+"Monovolumen - numero Puertas=" + nPuertas + ", numero PuertasLaterales=" + nPuertasLaterales + ", asientos="
				+ asientos + ", motor=" + motor + "\n";
	}
	

}
