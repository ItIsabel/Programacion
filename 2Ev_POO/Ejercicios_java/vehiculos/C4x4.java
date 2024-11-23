package vehiculos;

public class C4x4 extends Coche{
	motor motor;

	public C4x4(String marca, int matricula, int id, int capacidadDeposito, int km, int nPuertas, int nAsientos,
			motor motor) {
		super(marca, matricula, id, capacidadDeposito, km, nPuertas, nAsientos);
		this.motor = motor;
	}
	/*
	 * Metodo para arrancar que sobreescribe al del padre. 4x4 gasta 4 de combustible para arrancar 
	 */
	public void arrancar() throws Exception {
		super.arrancar(4);
	}
	/*
	 * Metodo para acelerar que sobreescribe al del padre. 4x4 gasta 8 de combustible para acelerar
	 */
	public void acelerar() throws Exception {
		super.acelerar(8);
	}
	@Override
	public String toString() {
		return super.toString()+"C4x4 -motor=" + motor + "\n";
	}
	
	
	
	

}
