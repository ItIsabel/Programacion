package programacion_java;
import java.util.Scanner;

public class Ej6_suedo {

	public static void main(String[] args) {
		System.out.println("Teclear el sueldo bruto de un trabajador y calcular el sueldo final que percibirá, teniendo en cuenta:");
		System.out.println("sueldo inicial =< 100.000, se incrementa un 17%");
		System.out.println("100.000=<sueldo inicial =< 200000, se incrementa un 12%.");
		System.out.println("200.000> sueldo inicial, se aplica un descuento del 17%");
		Scanner Teclado=new Scanner (System.in);
		float salarioNeto= Teclado.nextInt();
		if (salarioNeto<=100000) 
				System.out.println("El trabajador percibira " + salarioMenor(salarioNeto) + "euros");
		
		else if ((salarioNeto>= 100000) && (salarioNeto <= 200000))
				System.out.println("El trabajador percibira "+ salarioIntermedio(salarioNeto) + "euros");
		
		else if (salarioNeto>=200000)
				System.out.println("El trabajador percibira "+ salarioMayor(salarioNeto) +" euros");

	}
	public static float salarioMenor (float salario) {
			float r= (salario + salario*17/100);
			return r;
	}
	public static float salarioIntermedio (float salario) {
			float r= (salario + salario*12/100);
			return r;
	}
	public static float salarioMayor (float salario) {
		 float r =(salario - salario*17/100);
		 return r;
	}
}
