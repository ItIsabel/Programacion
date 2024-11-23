package vehiculos;

public class Moto extends Vehiculo {
	/*
	 * Constructor de moto
	 */
	public Moto(String marca, int matricula, int id,int capacidadDeposito,int km){
	 super(marca, matricula, id, capacidadDeposito, km);
	}
	
	/*
	 * Metodo arrancar.Moto gasta 2 de combustible.
	 */
	public void arrancar() throws Exception {
		super.arrancar(2);
	}
	/*
	 * Metodo para acelerar. Moto gasta 2 de combustible.
	 */
	
	public void acelerar() throws Exception {
		super.acelerar(2);
	}
	
	


}
