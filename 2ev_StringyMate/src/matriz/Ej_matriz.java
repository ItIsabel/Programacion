package matriz;
import java.util.Scanner;
public class Ej_matriz {

	public static void main(String[] args) {
		int[][] matriz=new int[3][5];
		
		//rellenar matriz//
		for( int i =0; i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				System.out.println("pls introduce un numero");
				Scanner teclado= new Scanner(System.in);
				matriz[i][j]=teclado.nextInt();
			}
		}
		//imprimir matriz//
		for( int i =0; i<matriz.length;i++) {
			for (int j=0; j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] +"\t");
			}
			System.out.println("");
		}
		
		//sumar matriz//
		for( int i =0; i<matriz.length;i++) {
			
		}
	}
}
