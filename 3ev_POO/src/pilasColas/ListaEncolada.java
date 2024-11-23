package pilasColas;
import java.util.*;

public class ListaEncolada implements Cola {
		protected ArrayList<Integer> listanum;
	
	public ListaEncolada(){
		listanum= new ArrayList <Integer>();
	}
	

	public void encolar(int i) {
		listanum.add(i);
	}


	public int desencolar() throws Exception{
		
		if(!estaVacia()) {
			int r=listanum.get(0);
			listanum.remove(0);
			return r;
		}
		else
			throw new Exception ("la lista está vacia");
		
	}
	public boolean estaVacia() {
		return listanum.isEmpty();
	}
	
	public String toString() {
		return "ListaEncolada [listanum=" + listanum + "]";
	}
	

}
