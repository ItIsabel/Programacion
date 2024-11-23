package vehiculos;

public class Furgoneta extends Vehiculo{
	int altura;
	/*
	 * Constructor Furgoneta
	 */
	public Furgoneta(String marca, int matricula, int id, int capacidadDeposito, int km, int altura) {
		super(marca, matricula, id, capacidadDeposito, km);
		this.altura = altura;
	}
	/*
	 * Metodo para arrancar. Furgoneta gasta 5 de combustible para arrancar 
	 */

	public void arrancar() throws Exception {
		super.arrancar(5);
	}
	/*
	 * Metodo para acelerar . Furgoneta gasta 5 de combustible para acelerar
	 */
	public void acelerar() throws Exception {
			super.acelerar(5);
		}
	
	@Override
	public String toString() {
		return super.toString()+"Furgoneta: altura=" + altura + "\n";
	}
	
	
	

}
