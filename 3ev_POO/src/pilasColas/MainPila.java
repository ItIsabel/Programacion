package pilasColas;

import java.util.Scanner;

public class MainPila {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		ListaApilada le1= new ListaApilada();
		boolean exit=false;
		while (exit == false) {
			System.out.println("Qué quieres hacer?");
			System.out.println("1 - apilar");
			System.out.println("2 - desapilar");
			System.out.println("3 - salir");
			int respuesta=sc.nextInt();
			switch(respuesta) {
			case 1:
				introducirNumeros(le1);
				break;
			case 2:
				try {
					System.out.println("has desapilado: " + le1.desapilar());
				}
				catch (Exception e){
					System.out.println(e.getMessage()); 
				}
				break;
			case 3:
				exit=true;
				break;
			}
		}
		System.out.println("fin programa");
	}
	
			
	public static void introducirNumeros(ListaApilada l) {
		Scanner sc=new Scanner(System.in);
		boolean fin=false;
				while (fin==false) {
					System.out.println("Introduce numeros a la lista");
					int i= sc.nextInt();
					if (i>=0) {
						l.apilar(i);
					}
					else {
						fin=true;
						System.out.println("Has introducido un numero negativo. Ya no puedes añadir más numeros");
					}			
				}
		System.out.println(l);

	}
}


