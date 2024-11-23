package impresorasFabricantes;

import java.util.ArrayList;
import java.util.Arrays;

public class mainImpresoras {

	public static void main(String[] args) {
		Canon c1=new Canon("Canon","RJ45",tipoImpresora.blanco,4 );
		Epson e1=new Epson("Epson","WE42",tipoImpresora.negro, true);
		HP h1=new HP("HP","HP46",tipoImpresora.color,true);
		Fabricantes f1=new Fabricantes();
		f1.addFabricante(h1);
		f1.addFabricante(e1);
		f1.addFabricante(c1);
		
		for (Impresora impr : f1.getArray()) {
			System.out.println(impr.copiar("Hola"));
			System.out.println(impr.escanear("Hey"));
			System.out.println(impr.toString());	
		}
		System.out.println("Ahora ordenado por marca");
		System.out.println(Ordenada(f1.getArray()));
		
		
	}
	public static String Ordenada(ArrayList<Impresora> l) {
		Impresora[] n1=new Impresora[l.size()];
		for (int i=0;i<l.size();i++) {
			n1[i]=l.get(i);
		}
		Arrays.sort(n1);
		return Arrays.toString(n1);
		}
	}


