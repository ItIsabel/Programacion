package programacion_java;
import java.util.Random;
import java.util.Scanner;


public class Ej12_numeroSecreto {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner teclado=new Scanner(System.in);
		int numSecreto=random.nextInt(10)+1;
		int oportunidades=5;
		System.out.println("introduce el numero que creas del 1 al 10");
		int selec=teclado.nextInt();
		
		while(selec!=numSecreto && oportunidades >0) {
			if (selec<numSecreto) {
				
			}
		}
		
	}

}
