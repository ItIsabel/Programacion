package programacion_java;
import java.util.Scanner;

public class Ej7_diaSemana {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int Dia= teclado.nextInt();
		switch (Dia) {
		case 1:
			System.out.println("Hoy es lunes");
			break;
		case 2:
			System.out.println("Hoy es martes");
			break;
		case 3:
			System.out.println("Hoy es miércoles");
			break;
		case 4:
			System.out.println("Hoy es jueves");
			break;
		case 5:
			System.out.println("Hoy es viernes");
			break;
		case 6:
			System.out.println("Hoy es sábado");
			break;
		case 7:
			System.out.println("Hoy es domingo");
			break;
		default:
			System.out.println("El numero introducido no corresponde con un día de la semana");
		}
		
		
	}

}
