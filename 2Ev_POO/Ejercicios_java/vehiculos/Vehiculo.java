package vehiculos;

public class Vehiculo {
	String marca;
	int matricula;
	int id;
	int estadoDeposito;
	int capacidadDeposito;
	int km;
	
	public Vehiculo	(String marca, int matricula, int id, int capacidadDeposito,int km){
		this.marca=marca;
		this.matricula=matricula;
		this.id=id;
		this.capacidadDeposito=capacidadDeposito;
		this.km=km;
		
	}

	private int getEstadoDeposito() {
		return estadoDeposito;
	}

	private void setEstadoDeposito(int estadoDeposito) {
		this.estadoDeposito = estadoDeposito;
	}

	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}
	public void llenarDeposito() {
		this.estadoDeposito=this.capacidadDeposito;
	}
	/*
	 * Cuando el vehiculo arranca, baja la cantidad de combustible que tiene; 
	 * @param n es la variable que indica lo que gasta cada vehiculo en encenderse 
	 */
	
	public void arrancar(int n) throws Exception{
			if (this.getEstadoDeposito()-n>0){
			this.setEstadoDeposito(this.getEstadoDeposito()-n);
			}
			else throw new Exception("No hay gasolina en el deposito para arrancar. Llénalo");
	}
	 /* Cuando el vehiculo acelera, baja la cantidad de combustible que tiene; 
	 * @param n es la variable que indica lo que gasta cada vehiculo en acelerar
	 */
	public void acelerar(int n) throws Exception{
		if (this.getEstadoDeposito()-n>0){
		this.setEstadoDeposito(this.getEstadoDeposito()-n);
		}
		else throw new Exception("No hay gasolina suficiente en el deposito para acelerar. Llénalo");
	};
	
	public void parar() {}

	@Override
	public String toString() {
		return "Vehiculo - marca=" + marca + ", matricula=" + matricula + ", id=" + id + ", estadoDeposito="
				+ estadoDeposito + ", capacidadDeposito=" + capacidadDeposito + ", km=" + km + "\n";
	};
	
	
	

}
