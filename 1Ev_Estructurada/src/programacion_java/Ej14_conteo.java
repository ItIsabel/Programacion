package programacion_java;
import java.util.Scanner;

public class Ej14_conteo {
	public static void main(String[] args) {
		int positivo=0;
		int negativo=0;
		int cero=0;
		int contador=10;
		while (contador>0) {
			System.out.println("Introduce un numero");
			Scanner teclado= new Scanner(System.in);
			int num= teclado.nextInt();
			if (num<0) {
				negativo++;}
			if(num>0) {
				positivo++;}
			if(num==0) {
				cero++;}
			contador--;
			}
		System.out.println("Han salido "+ positivo+" numeros positivos,"+negativo+" numeros negativos y "+cero+ "ceros.");
		}
	}

