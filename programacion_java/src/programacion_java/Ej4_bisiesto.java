package programacion_java;
import java.util.Scanner;

public class Ej4_bisiesto {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		System.out.println("Teclea un año y visualiza si es bisiesto");
		int yr= Teclado.nextInt();
		if ((yr%4==0) && (yr%100!=0)||(yr%400==0))
		    System.out.println(yr + " es un año bisiesto");
		else 
		    System.out.println(yr + " no es un año bisiesto");
		}

	}

