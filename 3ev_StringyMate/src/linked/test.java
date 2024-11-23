package linked;

import java.util.LinkedList;
import java.util.ListIterator;

public class test {

	public static void main(String[] args) {
		LinkedList<Alumno> lk1= new LinkedList<Alumno>();
		
		lk1.add(new Alumno(1,"Alberto","Veronica"));
		lk1.add(new Alumno(2,"Alejandro","Javier"));
		lk1.add(new Alumno(3,"Arancha","Felipe"));
		lk1.add(new Alumno(4,"Arturo","Enrique"));
		lk1.add(new Alumno(5,"Amalia","Rafael"));
		ListIterator <Alumno> iterador= lk1.listIterator();
		System.out.println("forma 1:");
		for(;iterador.hasNext();System.out.println(iterador.next().toString()));

		System.out.println("forma 2:");
		for (Alumno alumno : lk1) {
			System.out.println(alumno.toString());
		}

		System.out.println("forma 3:");
		iterador= lk1.listIterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());		}
	}

}
