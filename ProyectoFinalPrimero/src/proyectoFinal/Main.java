package proyectoFinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import proyectoFinal.interfaz.Juego;
import proyectoFinal.interfaz.Menu;

public class Main {
	
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Tiempo tiempo=new Tiempo();
		System.out.println("Holi, vas a jugar al juego de Isabel Alvarez de 1 de DAM");
		System.out.println("Consiste en un huerto en el que debes comprar plantas y arboles");
		System.out.println("Debes regarlos todos los meses porque si no, no crecen. Hay meses que podras vender fruta/plantas/arboles para ganar dinero");
		System.out.println("Gana el huerto que mas dinero haya obtenido en 1anyo - (el tiempo pasa en meses, por lo que tienes 12 meses)");
		System.out.println("Cuidado! hay excepciones escondidas por todo el juego");
		
		System.out.println("----------------------------------------------------------------------------------------------");
		Huerto h1= Juego.crearHuerto();		
		while (tiempo.yr<1){
			switch (Tiempo.getMes()){
			    case 1:  // Enero
			        System.out.println("ENERO -Comienza la temporada de frio para tus plantas. Asegurate de que estan protegidas del viento y las heladas.");
			        break;
			        
			    case 2:  // Febrero
			        System.out.println("FEBRERO -Los días se alargan un poco mas. Puedes empezar a preparar tus plantas para la primavera.");
			        break;
			        
			    case 3:  // Marzo
			        System.out.println("MARZO - La primavera esta a punto de llegar. Observa atentamente las señales de brotes y flores en tus plantas.");
			        break;
			        
			    case 4:  // Abril
			        System.out.println("ABRIL - La primavera esta en pleno apogeo. Disfruta de la floración de tus plantas y preparate para la temporada de cosecha.");
			        break;
			        
			    case 5:  // Mayo
			        System.out.println("MAYO - Las temperaturas suben y el sol brilla mas fuerte. Tus plantas estan creciendo a buen ritmo.");
			        System.out.println("Este mes puedes plantar...cebollas");
			        break;
			        
			    case 6:  // Junio
			        System.out.println("JUNIO - Es la temporada ideal para disfrutar de tus flores y plantas ornamentales. ¡No olvides regarlas cada mes para que crezcan!");
			        System.out.println("Este mes uedes plantar...cebollas");
			        break;
			        
			    case 7:  // Julio
			        System.out.println("JULIO - Las hortensias terminan su floracion este mes.");
			        break;
			        
			    case 8:  // Agosto
			        System.out.println("AGOSTO - Los limoneros producen 1 limon este mes.");
			        System.out.println("Los perales producen 2 peras este mes.");
			        System.out.println("Las cebollas pueden ser cosechadas si tienen al menos 3 meses.");
			        break;

			    case 9:  // Septiembre
			        System.out.println("SEPTIEMBRE - Los limoneros producen 1 limon este mes.");
			        System.out.println("Los perales producen 2 peras este mes.");
			        System.out.println("Las cebollas pueden ser cosechadas si tienen al menos 3 meses.");
			        System.out.println("Puedes plantar hortensias este mes.");
			        break;
			        
			    case 10: // Octubre
			        System.out.println("OCTUBRE - El otonyo esta aqui. Las temperaturas bajan y las hojas comienzan a cambiar de color.");
			        break;
			        
			    case 11: // Noviembre
			        System.out.println ("NOVIEMBRE - El frio regresa. Prepara tus plantas para el invierno.");
			        break;
			        
			    case 12: // Diciembre
			        System.out.println("Ha llegado diciembre. Vende todos tus activos para terminar el juego con el mayor capital posible.");
					break;
				}
	        Juego.UsrEligeOpcion(h1);
			Tiempo.PasarTiempo();
		}
 	   System.out.println("Fin del juego");
 	   TreeSet<Huerto> listaHuerto = new TreeSet<>(Juego.abrirListaHuerto());
 	   listaHuerto.add(h1);
 	   Juego.guardarListaHuerto(listaHuerto);
	}

}


	
	
				
