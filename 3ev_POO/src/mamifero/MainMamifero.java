package mamifero;

public class MainMamifero {
	/*
	 * Hacer un programa que implemente las siguientes clases y métodos relacionados con una jerarquía taxonómica de animales.

Los mamíferos son una clase abstracta con el método abstracto amamantar crías, que no devuelve nada.
Las ballenas son mamíferos e implementan el método abstracto heredado, la pantalla muestra un mensaje indicando que ellas amamantan a sus crías.
Los animales ovíparos son una interfaz con el método poner huevos.
El ornitorrinco es un mamífero que pone huevos. Por lo tanto, es una clase que hereda de mamífero e implementa la interfaz Ovíparo. El método heredado de la clase padre muestra en pantalla que el ornitorrinco amamanta a sus crías, y el método implementado desde la interfaz muestra en pantalla que pone huevos.
	 */
	


	public static void main(String[] args) {
		Ballena b1=new Ballena();
		System.out.println(b1.amamantarCrias());
		Ornitorrinco o1=new Ornitorrinco();
		System.out.println(o1.amamantarCrias());
		System.out.println(o1.ponerHuevos());
	}

}
