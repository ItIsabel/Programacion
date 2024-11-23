package Comparable;

import java.util.Comparator;

public class ComparadoraEdad implements Comparator<Alumno>{

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return ((int)((Integer)a1.edad).compareTo((Integer)a2.edad));
	}
}
