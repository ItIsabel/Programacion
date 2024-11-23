package programacion_java;
import java.util.Scanner;
public class Ej11_cuadrado {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Cuantas filas quieres");
		int filas=teclado.nextInt();
		System.out.println("Cuantas columnas quieres");
		int columnas=teclado.nextInt();
		int c=columnas;
		while (filas>=1) {
			columnas=c;
			while (columnas>=1) {
				System.out.print(" * " );
				columnas=columnas-1;
			}
		System.out.println("");
		filas=filas-1;
		}
	}
}
