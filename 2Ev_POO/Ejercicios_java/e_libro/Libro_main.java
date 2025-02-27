package e_libro;
import java.util.Arrays;
import java.util.Scanner;

import segunda_Evaluacion_POO.Fecha;
import segunda_Evaluacion_POO.Persona;

public class Libro_main {

	public static void main(String[] args) {
		Libro[] lib=new Libro[2];
		boolean fin=false;
		int contador= lib.length;
		while (fin==false){
			System.out.println("Esta es la libreria");
			System.out.println("Introduce lo que te gustaría hacer ");
			System.out.println("1 ..............Introducir libro");
			System.out.println("2................Eliminar libro");
			System.out.println("3...Listar todos los libros de la libreria");
			System.out.println("4.................Salir");
			Scanner teclado=new Scanner(System.in);
			char r=teclado.next().charAt(0);
			switch(r) {
				case 1:
					if (contador>=0) {
					System.out.println( "Hay " + contador +   "espacios en la libreria");
					System.out.println(crearLibro(lib[lib.length-contador]));
					contador --;
					break;
					}
				case 2:
					System.out.println("introduce id del libro que quieres elliminar");
					int id=teclado.nextInt();
					for (int i=0; i<lib.length;i++) {
					 continue;
					}
				case 3:
					lib.toString();
				case 4:
					fin=true;
					

			}
		}

	}
	
		public static String crearLibro(Libro lib){
					Scanner sc= new Scanner(System.in);
					System.out.println("Por favor introduce el titulo del libro ");
					String n=(sc.nextLine());
					System.out.println("introduce la edicion");
					String ed= (sc.nextLine());
					
					//guardamos el nombre y el apellido del autor en una variable y los usamos en el constructor de la persona
					System.out.println("introduce el nombre del autor");
					String nombreAutor=sc.nextLine();
					System.out.println("introduce el apellido del autor");
					String apellidoAutor=sc.nextLine();
					Persona autor=new Persona(nombreAutor,apellidoAutor);
					System.out.println("introduce el ISBN");
					String isbn= sc.nextLine();
					System.out.println("pls introduce la ciudad y el país");
					String lugar=sc.nextLine();
					
					// conseguimos las variables de la fecha para utilizarlo dentro de la clase libro.
					System.out.println("pls introduce primero el dia de creacion en formato dd");
					int d=sc.nextInt();
					System.out.println("pls introduce primero el mes de creacion en formato mm");
					int m= sc.nextInt();
					System.out.println("pls introduce primero el año de creacion en formato aaaa");
					int a=sc.nextInt();
					Fecha fecha=new Fecha(d,m,a);
					System.out.println("introduce el numero de páginas");
					int pags=sc.nextInt();
					lib= (new Libro(n,ed,autor,isbn,lugar,fecha,pags));
			return "Libro creado ";
		}
	}



