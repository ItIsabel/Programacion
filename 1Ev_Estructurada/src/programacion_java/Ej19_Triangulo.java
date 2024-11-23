package programacion_java;
import java.util.Scanner;
public class Ej19_Triangulo {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pls introduce un numero");
        int num = teclado.nextInt();
        for (int alto = 1; alto <= num; alto++) {
            for (int espacios = 1; espacios <= num - alto; espacios++) {
                System.out.print(" ");
            }
            for (int lado = 1; lado <= alto; lado++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
