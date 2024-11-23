package impresorasFabricantes;

import java.util.ArrayList;

public class Fabricantes {
	private ArrayList<Impresora> lk1;

	public Fabricantes() {
		lk1= new ArrayList<Impresora>();
	}
	
	public void addFabricante(Impresora i) {
		lk1.add(i);
	}
	public void removeFabricante(int index) {
		lk1.remove(index);
	}

	public ArrayList<Impresora> getArray() {
		return lk1;
	}
	
	

}
