package programacion_java;
import java.util.Scanner;

public class Ej3_parImpar {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		System.out.println("Teclea un numero y visualiza por pantalla estas 3 situaciones. Si el numero es par, si es impar o si es 0");
		int a= Teclado.nextInt();
		int b= (a%2);
		if (a==0)
			System.out.println("el numero es 0");
		else
			if (b==0)
				System.out.print(a+" es un numero par");
			else
				System.out.println(a + " es un numero impar");

	}

}
