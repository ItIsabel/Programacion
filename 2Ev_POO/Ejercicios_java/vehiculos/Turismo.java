package vehiculos;

public class Turismo extends Coche {
motor motor;

/*
 * Constructor de turismo, que es nieta de Vehiculo e hija de coche
 */
public Turismo(String marca, int matricula, int id, int capacidadDeposito, int km, int nPuertas, int nAsientos,
		motor motor) {
	super(marca, matricula, id, capacidadDeposito, km, nPuertas, nAsientos);
	this.motor = motor;
}

/*
 * Metodo para arrancar que sobreescribe al del padre. Turismo gasta 4 de combustible para arrancar 
 */

public void arrancar() throws Exception {
	super.arrancar(4);
}
/*
 * Metodo para acelerar que sobreescribe al del padre. Turismo gasta 5 de combustible para acelerar
 */
public void acelerar() throws Exception {
	super.acelerar(5);
}

@Override
public String toString() {
	return  super.toString() + "Turismo -motor=" + this.motor + "\n";
}


}




