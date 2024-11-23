package pilasColas;

import java.util.ArrayList;

public class ListaApilada implements Pila {
	protected ArrayList<Integer> listanum;
	public ListaApilada(){
		listanum =new ArrayList<Integer>();
	}
	
	public void apilar(int i) {
		listanum.add((Integer)i);
	}

	public int desapilar() throws Exception {
		int r=0;
		if (!estaVacia()) {
			r=listanum.get(listanum.size()-1);
			listanum.remove(listanum.size()-1);
		}
		else
			throw new Exception("la lista esta vacia");
		return r;

	}
	public boolean estaVacia() {
		return listanum.isEmpty();
	}
	
	public String toString() {
		return "ListaApilada =" + listanum + "\n";
	}


		
}
	
	


