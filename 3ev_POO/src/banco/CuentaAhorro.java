package banco;

import segunda_Evaluacion_POO.Persona;

public class CuentaAhorro extends Cuenta{
	private String nCuenta="5";
	private static int contador=0000;

	public CuentaAhorro(Persona cliente) {
		super(cliente);
		nCuenta+=Integer.toString(contador);
		contador++;
	}
	
	
	public void pagarInteresMensual() {
		super.setSaldo(super.getSaldo()+(0.08/12)*super.getSaldo());
		
	}
	
	public void cargarCuota() {
		if (super.getSaldo()<200)
			super.setSaldo(super.getSaldo()-5);
	}

	@Override
	public String toString() {
		return super.toString()+"CuentaAhorro -nCuenta=" + nCuenta;
	}
	
	


	
}
