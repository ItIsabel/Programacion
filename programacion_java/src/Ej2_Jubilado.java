import java.util.Scanner;
import java.lang.Math;

public class Ej2_Jubilado {
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Por favor introduce tu año de nacimiento ");
		int an=teclado.nextInt();
		System.out.println("Por favor introduce tu mes de nacimiento ");
		int mn=teclado.nextInt();
		System.out.println("Por favor introduce tu dia de nacimiento ");
		int dn=teclado.nextInt();
		int aa=2023;
		int ma=10;
		int da=18;
		if ((aa-an==65 && ma==mn && da>=dn) || (aa-an==65 && ma>mn) || (aa-an>=66))
			System.out.println("La persona esta jubilada");
		else
			System.out.println("La persona no esta jubilada");
		teclado.close();
			}
		};
