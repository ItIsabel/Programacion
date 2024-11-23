package Ejercicios_java;
import java.util.Scanner;
import java.lang.String;
import java.util.Random;
public class Ej1_Ahorcado {
	public static void main(String[] args) {
//		Definir un array con posibles palabras
		String[] palabrasPosibles= {"comodo","peine","elefante","amapola"};
		//Elegir con random una de las palabras posibles
		Random random=new Random();
		int n= random.nextInt(palabrasPosibles.length);
		//Pasar una cadena STR a un array de CHAR. Palabra Oculta es la variable a descubrir
		char[] palabraOculta=palabrasPosibles[n].toCharArray();
		//Crear un array descubrePalabra donde se pondrán las letras que se descubran.
		char[] descubrePalabra=new char[palabraOculta.length];
		int intentos=10;
		
		while ((palabraOculta!= descubrePalabra) && intentos>0){
			System.out.println("Pls introduce letras para averiguar palabra");
			Scanner teclado=new Scanner(System.in);
			char letra= teclado.next().charAt(0);
			boolean estaLetra=false;
			for (int i=0; i<palabraOculta.length; i++) {
				if (letra==palabraOculta[i]) {
					descubrePalabra[i]=letra;
					estaLetra=true;

					}
			}
			if (estaLetra==true){
				System.out.println("Felicidades has acertado la letra..."+ letra);
				
				for (int x=0; x<descubrePalabra.length; x++) {
					System.out.print(descubrePalabra[x]);	
				}
			}if (estaLetra==false) {
				intentos--;
				System.out.println(" - Lo siento, tu letra no esta en la palabra");
				}
		
		if (descubrePalabra.equals(palabraOculta)){
			System.out.println("Has ganado");
		}

		if(intentos==0)
		System.out.println("Lo lamento, has perdido. La palabra correcta era...");
			System.out.print(palabraOculta.toString());
		}}