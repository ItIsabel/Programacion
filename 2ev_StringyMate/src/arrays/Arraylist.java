package arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> lista1= new ArrayList<String>();
		lista1.add("frijoles");
		lista1.add("lechuga");
		lista1.add("sopa");
		lista1.add("huevos");
		System.out.println(lista1.toString());
		ArrayList<String> lista2= new ArrayList<String>();
		lista2.addAll(lista1);
		lista1.clear();
		System.out.println("lista 1:"+ lista1.toString());
		System.out.println("lista 2:"+ lista2.toString());
		lista1.addAll(0,lista2);
		System.out.println("lista 1:"+ lista1.toString());
		System.out.println("lista 2:"+ lista2.toString());
		System.out.println("lista1 contains frijoles" + lista1.contains("frijoles"));
		System.out.println("lista1 contains leche" + lista1.contains("leche"));
		int r=lista1.indexOf("huevos");
		System.out.println("posicion de huevos" +lista1.indexOf("huevos"));
		System.out.println("cual es el obj de la posicon 3" + lista1.get(r));
		lista1.remove("lechuga");
		lista1.sort(Comparator.naturalOrder());
		System.out.println("lista 1 ordenada:"+ lista1.toString());
		
			
		}
		
		

		
		

	}


