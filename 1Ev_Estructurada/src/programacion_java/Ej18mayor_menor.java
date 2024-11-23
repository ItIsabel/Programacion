package programacion_java;
import java.util.Scanner;
public class Ej18mayor_menor {

	public static void main(String[] args) {
        int a, b, c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduce 3 numeros");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        if (a < b && a < c) {
            System.out.println("el numero más pequeño es " + a);
        } else {
            if (b < a && b < c) {
                System.out.println("el numero más pequeño es " + b);
            } else {
                System.out.println("el numero más pequeño es " + c);
            }
        }
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println("El numero del medio es " + a);
        } else {
            if ((b > a && b < c) || (b < a && b > c)) {
                System.out.println("El numero del medio es " + b);
            } else {
                System.out.println("El numero del medio es " + c);
            }
        }
        if (a > b && a > c) {
            System.out.println("el numero más grande es " + a);
        } else {
            if (b > a && b > c) {
                System.out.println("el numero más grande es " + b);
            } else {
                System.out.println("el numero más grande es " + c);
            }
        }
	}

}
