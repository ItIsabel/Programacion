package banco;

import segunda_Evaluacion_POO.Persona;

public class CuentaCorriente extends Cuenta {
	private String nCuenta="2";
	private static int contador=0000;

	public CuentaCorriente(Persona cliente) {
		super(cliente);
		nCuenta+=Integer.toString(contador);
		contador++;
	}
	
	
	public boolean ispagarInteres() {
		boolean r=false;
		if (super.getSaldo()>500)
			r=true;
		return r;
	}
	public void cargarCuota() {
		super.setSaldo(super.getSaldo()-5);

	}
	@Override
	public String toString() {
		return super.toString()+"CuentaCorriente nCuenta=" + nCuenta;
	}

	@Override
	public void pagarInteresMensual() {
		if (ispagarInteres()) {
			super.setSaldo(super.getSaldo()+(0.08/12)*super.getSaldo());
		}		
	}
	
	
}
