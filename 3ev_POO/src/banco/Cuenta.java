package banco;
import segunda_Evaluacion_POO.Persona;

public abstract class Cuenta {
	private Persona cliente;
	private double saldo;
	
	public Cuenta(Persona cliente){
		this.cliente=cliente;

	
	}
	public Cuenta(Persona cliente, int saldo){
		this.cliente=cliente;
		this.saldo=saldo;
	}
	public abstract void pagarInteresMensual();
	
	public boolean ispagarInteres() {
		return false;
	}
	public abstract void cargarCuota();

	public Persona getCliente() {
		return cliente;
	}
	public void ingresarDinero(int i) {
		this.setSaldo(this.getSaldo()+i);
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Cuenta -cliente=" + cliente + ", saldo=" + String.format("%.2f", saldo)+ "\n";
	}
	
	
	
	

}
