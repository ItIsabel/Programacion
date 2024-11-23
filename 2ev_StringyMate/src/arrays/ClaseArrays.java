package arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import segunda_Evaluacion_POO.*;
import e_libro.*;

public class ClaseArrays {

	public static void main(String[] args) {
		int [] a1=new int [5];
		int [] a2=new int [5];
		Libro[] libreria=new Libro [3];
		//metodo fill
		Arrays.fill(a1, 5);
		System.out.println("imrpimir a1" + Arrays.toString(a1));
		Random random=new Random();
		for (int i=0;i<a2.length;i++) {
			int n= random.nextInt(5)+1;
			a2[i]=n;
		}
		//metodos sort, to String
		System.out.println("imrpimir a2" + Arrays.toString(a2));
		Arrays.sort(a2);
		System.out.println("sort a2" + Arrays.toString(a2));
		System.out.println(crearLibro(libreria));
		System.out.println("imprimir libreria"+Arrays.toString(libreria));
		Arrays.sort(libreria);
		System.out.println("sort libreria"+libreria);
		//metodos binarySearch Arrays.binarySearch(nombreArray,valorBuscado) Si da negativo es que no esta.
		System.out.println("buscar la posición del numero 5 en el a2" + Arrays.binarySearch(a2, 5));
		//metodo copyOf Arrays.copyOf(Arrayoriginal, numero de posiciones a copiar desde 0)
		int[] a3=Arrays.copyOf(a2, 2);
		System.out.println("a3 copia de las primeras dos posiciones de a2" + Arrays.toString(a3));
		
		

	}
	
	public static String crearLibro(Libro [] lib){
		for (int i=0;i<lib.length;i++) {
				Scanner sc= new Scanner(System.in);
				System.out.println("Por favor introduce el titulo del libro " + (i+1));
				String n=(sc.nextLine());
				System.out.println("introduce la edicion");
				String ed= (sc.nextLine());
				
				//guardamos el nombre y el apellido del autor en una variable y los usamos en el constructor de la persona
				System.out.println("introduce el nombre del autor");
				String nombreAutor=sc.nextLine();
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
				lib[i]= (new Libro(n,ed,autor,isbn,lugar,fecha,pags));
				}
		return "ya esta";
		}
	}

	


