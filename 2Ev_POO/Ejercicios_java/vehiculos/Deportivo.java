package vehiculos;

/*
 *  Clase Deportivo
 */
public class Deportivo extends Coche{
	int caballos;
	boolean turbo;
	
	/*
	 * Constructor Clase Deportivo
	 */
	public Deportivo(String marca, int matricula, int id, int capacidadDeposito, int km, int nPuertas, int nAsientos,
			int caballos, boolean turbo) {
		super(marca, matricula, id, capacidadDeposito, km, nPuertas, nAsientos);
		this.caballos = caballos;
		this.turbo = turbo;
	}
	
	/*
	 * Metodo para arrancar que sobreescribe al del padre. Deportivo gasta 5 de combustible para arrancar 
	 */

	public void arrancar() throws Exception {
		super.arrancar(5);
	}
	/*
	 * Metodo para acelerar que sobreescribe al del padre. Deportivo gasta 5 de combustible para acelerar si no tiene turbo y 10 si lo tiene
	 */
	public void acelerar() throws Exception {
			if (this.turbo) {
				super.acelerar(10);
			}
			else {
				super.acelerar(5);
			}
		}

	@Override
	public String toString() {
		return super.toString()+"Deportivo -Caballos=" + caballos + ", Turbo=" + turbo + "\n";
	}
}