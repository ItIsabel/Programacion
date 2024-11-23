package programacion_java;

public class Ej17_tablasMultiplicar {

	public static void main(String[] args) {
		   int primerN = 0;
		   int segunN=0;
	        while (primerN < 10) {
	            primerN++;
	            System.out.println("*****************");
	            System.out.println("");
	            System.out.println("Tabla del " + primerN);
	            segunN = 0;
	            while (segunN < 10) {
	                segunN++;
	                System.out.println(primerN + "x" + segunN + "=" + primerN * segunN);
	            }
	        }
	}

}
