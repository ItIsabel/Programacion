package banco;
import segunda_Evaluacion_POO.Persona;

public class MainCuenta {

	public static void main(String[] args) {
		CuentaAhorro c1=new CuentaAhorro(new Persona("Isabel","Alvarez"));
		CuentaCorriente c2= new CuentaCorriente(new Persona("Rebeca","Martin"));
		
		for (int i=0;i<=9;i++) {
			System.out.println("mes: " + (i+1));
			System.out.println("Estado inicial:");
			System.out.println(c1.toString());
			System.out.println(c2.toString());
			c1.ingresarDinero(100);
			c2.ingresarDinero(100);
			c1.cargarCuota();
			c2.cargarCuota();
			c1.pagarInteresMensual();
			c2.pagarInteresMensual();
			System.out.println("Estado final:");
			System.out.println(c1.toString());
			System.out.println(c2.toString());
			System.out.println("");
		}

	}

}
