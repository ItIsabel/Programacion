package futbol;
import java.util.Scanner;

import segunda_Evaluacion_POO.Fecha;

public class MainFutbol {

	public static void main(String[] args) {
		Entrenador Xavi= new Entrenador("Alex","Jota",25,"02",new Fecha(01,01,1989),"Abogado");
		Equipo RMAdrid= new Equipo("RM");
	}
	
	
	public void rellenarJugadores(Jugador[] jug){
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<jug.length;i++) {
			System.out.println("introduce el nombre del jugador " + i+1);
			String n= sc.nextLine();
			System.out.println("introduce el apellido del jugador "+ i+1);
			String a= sc.nextLine();
			System.out.println("introduce la edad del jugador "+ i+1);
			int e=sc.nextInt();
			System.out.println("introduce el DNI del jugador "+ i+1);
			String dni=sc.nextLine();
			System.out.println("introduce el dia de nacimiento del jugador "+ i+1);
			int d=sc.nextInt();
			System.out.println("introduce el mes de nacimiento del jugador "+ i+1);
			int m=sc.nextInt();
			System.out.println("introduce el ano de nacimiento del jugador "+ i+1);
			int y=sc.nextInt();
			
			System.out.println("introduce la posicion del jugador "+ i+1 +"\n"+ 
					"1. delantero" + "\n"+
					"2. centrocampista"+"\n"+
					"3. defensa"+"\n"+
					"4. portero"+"\n");
			int c=sc.nextInt();
			switch(c) {
				case 1:
					jug[i]=new Jugador(n,a,e,dni, new Fecha(d,m,y),posicion.DELANTERO);
					break;
				case 2:
					jug[i]=new Jugador(n,a,e,dni, new Fecha(d,m,y),posicion.CENTROCAMPISTA);
					break;
				case 3:
					jug[i]=new Jugador(n,a,e,dni, new Fecha(d,m,y),posicion.DEFENSA);
					break;
				case 4:
					jug[i]=new Jugador(n,a,e,dni, new Fecha(d,m,y),posicion.PORTERO);
					break;
				}
			}
		}
	}


