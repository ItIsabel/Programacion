package programacion_java;
import java.util.Scanner;
import java.lang.Math;

public class Ej5_ecuacion {

	public static void main(String[] args) {
		double op1 = 0,op2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce 3 numeros");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		if (a !=0) {
			op1 = (-b+(Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
			op2 = (-b-(Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
			System.out.println("El resultado de las raices de la ecuación es:"+ op1+" y "+ op2);
		}else
			System.out.println("El valor de a debe ser diferente a 0 para tener una solución");
			
	}

}
