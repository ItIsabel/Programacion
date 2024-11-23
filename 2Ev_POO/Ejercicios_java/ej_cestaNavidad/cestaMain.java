package ej_cestaNavidad;

import ej_cestaNavidad.Cliente.tipoCLiente;
import ej_cestaNavidad.Producto.tipo;

public class cestaMain {

	public static void main(String[] args) {
		Cliente pepe= new Cliente("Jose Manuel","Magin","007",tipoCLiente.particular);
		Producto jamon=new Producto("Jamon Serrano",40,false,tipo.salado);
		Producto foie=new Producto("Foie Gras",10,true,tipo.salado);
		Producto turron= new Producto("Turron de almendras",5,true,tipo.dulce);
		Producto mazapan= new Producto("Mazapan",8,true,tipo.dulce);
		Producto sidra=new Producto("Botella de sidra",8,false,tipo.bebida);
		Producto cava=new Producto("Cava",15,false,tipo.bebida);

		//CESTA 1: introducimos un jamón, dos latas de foie gras, tres cajas de mazapán y una botella de sidra
		Cesta cestaPepe=new Cesta(pepe);		
		try {
			System.out.println(cestaPepe.addProd(jamon));
			System.out.println(cestaPepe.addProd(foie));
			System.out.println(cestaPepe.addProd(foie));			
			System.out.println(cestaPepe.addProd(mazapan));			
			System.out.println(cestaPepe.addProd(mazapan));
			System.out.println(cestaPepe.addProd(mazapan));			
			System.out.println(cestaPepe.addProd(sidra));			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(cestaPepe.toString());
		System.out.println("El precio de la cesta es: " + cestaPepe.PVP());
		System.out.println("La cesta es apta para celiacos?" + cestaPepe.glutenFree());

		//CESTA 2: un jamón, cinco cajas de turrón y tres botellas de cava
		Cesta cestaPepe1=new Cesta(pepe);	
		try {
			System.out.println(cestaPepe1.addProd(jamon));
			System.out.println(cestaPepe1.addProd(turron));
			System.out.println(cestaPepe1.addProd(turron));
			System.out.println(cestaPepe1.addProd(turron));
			System.out.println(cestaPepe1.addProd(turron));
			System.out.println(cestaPepe1.addProd(turron));
			System.out.println(cestaPepe1.addProd(cava));
			System.out.println(cestaPepe1.addProd(cava));
			System.out.println(cestaPepe1.addProd(cava));

			
		}
		catch (Exception e) {
				System.out.println(e.getMessage());
		}
		System.out.println(cestaPepe1.toString());
		System.out.println("El precio de la cesta es: " + cestaPepe1.PVP());
		System.out.println("La cesta es apta para celiacos?" + cestaPepe1.glutenFree());
	}
}
