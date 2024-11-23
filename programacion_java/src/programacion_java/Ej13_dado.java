package programacion_java;
import java.util.Random;
public class Ej13_dado {

	public static void main(String[] args) {
		int contador=100;
		int uno=0;
		int dos=0;
		int tres=0;
		int cuatro=0;
		int cinco=0;
		int seis=0;
		while (contador>=1){
			Random azar= new Random();
			int dado= azar.nextInt(6)+1;
			switch (dado) {
				case 1:
					uno++;
					break;
				case 2:
					dos++;
					break;
				case 3:
					tres++;
					break;
				case 4:
					cuatro++;
					break;
				case 5:
					cinco++;
					break;
				case 6:
					seis++;
					break;
			}
			contador++;
		}
		System.out.println("Han salido "+uno+" unos, "+dos+" dos,"+tres+" tres,"+cuatro+" cuatros,"+cinco+" cincos y "+seis+" seises.");
		
	}

}
