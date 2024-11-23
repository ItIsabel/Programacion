package futbol;

import java.util.ArrayList;

public class juntaDirectiva {
	ArrayList<PersonaFutbol> juntapersonas;

	public juntaDirectiva() {
		juntapersonas=new ArrayList<PersonaFutbol>();

	}
	
	public void addPersona(PersonaFutbol pers) {
		juntapersonas.add(pers);
	}

	@Override
	public String toString() {
		return "Junta Directiva " + juntapersonas + "\n";
	}
	
	


}
