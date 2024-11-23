package herencia_Polimorfismo;

import java.util.ArrayList;

public class Main_HerenciayPolimorfismo {

	public static void main(String[] args) {
		Conjunto Array1=new Conjunto();
		Array1.addFigura(new Triangulo(Color.ROJO,2,3));
		Array1.addFigura(new Cuadrado(Color.AZUL,4));
		Array1.addFigura(new Circulo(Color.VERDE, 5));
		
		System.out.println(Array1.toString());
		System.out.println("la suma de las areas:"+Array1.sumaAreas());
		System.out.println("la suma de los perimetros:"+ Array1.sumaPerimetros());
	}

}
