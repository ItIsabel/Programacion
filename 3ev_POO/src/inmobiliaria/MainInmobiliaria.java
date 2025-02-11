package inmobiliaria;
/**
 * 
 */
public class MainInmobiliaria {

	public static void main(String[] args) {
		LocalComercial l1=new LocalComercial("Madrid",50,100,tipoConstruccion.segundaMano);
		PlazaGaraje p1=new PlazaGaraje("Madrid", 2, 100,tipoGaraje.privado);
		Solar s1=new Solar("Salamanca",2,50,tipoSolar.rustico);
		Agencia ag1=new Agencia();
		ag1.addInmueble(s1);
		ag1.addInmueble(p1);
		ag1.addInmueble(l1);
		System.out.println(ag1.verTodasAlquilerInmueble());
		System.out.println(ag1.verTodasVentasInmueble());
		/*Creacion de imuebles de agencia 2*/
		LocalComercial l2=new LocalComercial("Barcelona",50,100,tipoConstruccion.nueva);
		PlazaGaraje p2=new PlazaGaraje("Zamora", 2, 100,tipoGaraje.publico);
		Solar s2=new Solar("Avila",2,50,tipoSolar.urbano);
		Agencia ag2=new Agencia();
		ag2.addInmueble(l2);
		ag2.addInmueble(p2);
		ag2.addInmueble(s2);
		Agencia ag3=new Agencia(ag1.fusionarAgencias(ag2));
		System.out.println("Alquiler de la nueva ag "+ ag3.verTodasAlquilerInmueble());

	}

}
