package programacion_java;
import java.util.Scanner;

public class Ej9_asteriscos {
	public static void main(String[] args) {
		int a=1;
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce el numero de asteriscos que quieres");
		int contador= teclado.nextInt();
		while (a<=contador) {
			System.out.print("*");
			a=a+1;
		}
	
	}
}
