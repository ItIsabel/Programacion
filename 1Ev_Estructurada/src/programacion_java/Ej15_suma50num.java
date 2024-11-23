package programacion_java;

public class Ej15_suma50num {

	public static void main(String[] args) {
		int num=0;
		int suma=0;
		while (num<=100) {
			suma=suma+num;
			System.out.println(suma);
			num=num+2;
		}
		System.out.println("la suma de los primeros 50 numeros pares es "+ suma);
	}

}
