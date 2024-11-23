package Comparable;

import java.util.Arrays;

public class MainComparable {
	public static void main (String[] args) {
		String[] stArray={"Hola","Adios","Buenos dias","Guapa"};
		for (String string : stArray) {
			System.out.println(string);
		}
		Arrays.sort(stArray);
		System.out.println("\n"+"ahora ordenado");
		for (String string : stArray) {
			System.out.println(string);
		}
	/*---------------------------------------------*/
		Alumno a1=new Alumno ("Isa",34,"Veronica");
		Alumno a2=new Alumno ("BK",18,"Veronica");
		Alumno a3=new Alumno ("Manar",18,"Veronica");
		Alumno a4=new Alumno ("Javi",31,"Veronica");
		Alumno a5=new Alumno ("Alberto",34,"Veronica");
		Alumno[] alumnos= {a1,a2,a3,a4,a5};
		
		Arrays.sort(alumnos);
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		System.out.println("--------------------------");
		Arrays.sort(alumnos, new ComparadoraEdad(),new ComparadorTutor());
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}		
		

	}

}
