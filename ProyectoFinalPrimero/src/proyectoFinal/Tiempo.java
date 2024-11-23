package proyectoFinal;

public class Tiempo {
	 static int mes=1;
	 static int yr=0;
	
	
	public static void PasarTiempo() {
		if (mes<12) {
			mes+=1;
		}else {
			mes=1;
			yr+=1;
		}
	}
	public static int getMes() {
		return mes;
	}
}
