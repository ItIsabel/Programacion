package proyectoFinal;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Huerto>{

	
	public ComparadorNombre() {
	}

	@Override
	public int compare(Huerto o1, Huerto o2) {
		return o1.nombre.compareTo(o2.nombre);
	}

}
