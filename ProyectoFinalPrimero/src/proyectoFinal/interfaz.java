package proyectoFinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import proyectoFinal.interfaz.Juego;
import proyectoFinal.interfaz.Menu;

public class interfaz {
	
	public static class Menu{
		public static String muestraMenu(){
			Scanner sc=new Scanner(System.in);
			System.out.println("\nMenu de gestion de plantas y arboles");
			System.out.println("--- Sembrar ---");
			System.out.println("\t1.1 plantar limonero - 20eur");
			System.out.println("\t1.2 plantar peral - 20eur");
			System.out.println("\t1.3 plantar pino -20eur");
			System.out.println("\t1.4 plantar cebolla -5eur");
			System.out.println("\t1.5 plantar albahaca - 5eur");
			System.out.println("\t1.6 plantar hortensia (solo en septiembre-octubre)-5eur");
			System.out.println("--- Cosechar ---");
			System.out.println("\t2.1 Cosechar limones + 5eur cada limon");
			System.out.println("\t2.2 Cosechar peras + 5eur cada pera" );
			System.out.println("\t2.3 Cosechar cebollas (si tienen al menos 3 meses. Solo en agosto y septiembre) + 20eur ");
			System.out.println("\t2.4 Cosechar albahaca +20 eur" );
			System.out.println("--- Vender ---");
			System.out.println("\t3.1 Vender pinos (en invierno - noviembre, diciembre) ");
			System.out.println("\t \tAltura 10cm =20eur // Altura <16cm =30eur //Altura >=16cm 50eur ");
			System.out.println("\t3.2 Vender hortensias (en epoca de floracion: mayo a julio) + +30eur cada hortensia");
			System.out.println("--- Imprimir informacion ---");
			System.out.println("\t4.1 Informacion de plantas");
			System.out.println("\t4.2 Informacion de arboles");
			System.out.println("\t4.3 Informacion de vegetales decorativos");
			System.out.println("\t4.4 Informacion de vegetales comestibles");
			System.out.println("\t4.5 Informacion del huerto");
			System.out.println("\t4.6 Ranking de Huertos ordenados por capital");
			System.out.println("\t4.7 Ranking de Huertos ordenados por orden");		
			System.out.println("5. Regar y pasar de mes");
			return sc.nextLine();
		}
		
		public static void ejecutaMenu(String r, Huerto h1, int t) throws Exception{
			//Metodo para instanciar los vegetales que se quieren crear
			if (r.equals("1.1")){
				try {
					h1.addArbol(new Limonero(TipoArbol.perenne));
					System.out.println("limonero sembrado =)");
					System.out.println("Te quedan " + h1.getCapital() + " euros");
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
			}
				}
			if (r.equals("1.2")){
				try {
					h1.addArbol(new Peral(TipoArbol.caduco));
					System.out.println("peral sembrado =)");
					System.out.println("Te quedan " + h1.getCapital() + " euros");

				}
				catch (Exception e) {
					System.out.println(e.getMessage());
			}
				}
			if (r.equals("1.3")){
				try {
					h1.addArbol(new Pino(TipoArbol.perenne));
					System.out.println("pino sembrado =)");
					System.out.println("Te quedan " + h1.getCapital() + " euros");

				}
				catch (Exception e) {
					System.out.println(e.getMessage());
			}
				}
			if (r.equals("1.4")){
				try {
					h1.addPlanta(new Cebolla());
					System.out.println("cebolla sembrada =)");
					System.out.println("Te quedan " + h1.getCapital() + " euros");

				}
				catch (Exception e) {
					System.out.println(e.getMessage());
			}
				}
			if (r.equals("1.5")){
				try {
					h1.addPlanta(new Albahaca());
					System.out.println("albahaca sembrada =)");
					System.out.println("Te quedan " + h1.getCapital() + " euros");

				}
				catch (Exception e) {
					System.out.println(e.getMessage());
			}
				}
			if ((r.equals("1.6"))&(t==9 || t==10)){
				try {
					h1.addPlanta(new Hortensia());
					System.out.println("hortensia sembrada =)");
					System.out.println("Te quedan " + h1.getCapital() + " euros");

				}
				catch (Exception e) {
					System.out.println(e.getMessage());
			}
				}
			if ((r.equals("1.6"))&(t!=9 || t!=10)){
				throw new EpocaIncorrectaExcepcion ("No es epoca de plantar hortensias");
			}
			//Metodos para cosechar los comestibles.
			if (r.equals("2.1")){
				try {
					ArrayList<Limonero> limon= new ArrayList<>(h1.getArrayLimonero());
					int contadorLimones=0;
					for (Limonero limonero : limon) {
						contadorLimones+=limonero.recolectar();
					}
					if(contadorLimones!=0)
						h1.setCapital(h1.getCapital()+(contadorLimones*Limonero.getPrecioLimones()));
						System.out.println("vendidos" + contadorLimones +"limones\n" + "has ganado:" +(contadorLimones*Limonero.getPrecioLimones()));
					
				}catch (Exception e) {
					System.out.println(e.getMessage());
					}
				}

			if (r.equals("2.2")){
				int v=h1.venderPeras();
				System.out.println("has vendido "+ v+" peras.\n Has ganado: "+(v*5));			
				h1.setCapital(h1.getCapital()+(v*5));

			}


			if (r.equals("2.3")){
				try {
					int v=h1.venderCebollas();
					System.out.println("has vendido "+ v+" cebollas.\n Has ganado: "+(v*Cebolla.pvp()));			
					h1.setCapital(h1.getCapital()+(v* Cebolla.pvp()));
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
			}		
			if (r.equals("2.4")){
				try {
					ArrayList <Planta> p = new ArrayList<>(h1.getArrayPlanta());
					int contador=0;
					for (Planta planta : p) {
						if (planta instanceof Albahaca){
							contador+=((Albahaca) planta).recolectar();
							System.out.println("Albahacas vendidas");
						}
					h1.setCapital(h1.getCapital()+(contador*20));

					}
					if (contador==0) {
						throw new Exception ("No tienes plantas de albahaca o no estan listas para ser cosechadas");
						}
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}

			}
			if (r.equals("3.1")){
				try {
					int ganancias=0;
					ArrayList <Pino> p = new ArrayList<>(h1.getArrayPino());
					for (Pino pino : p) {
						try {
							ganancias+=pino.vender();
							p.remove(pino);
							System.out.println("pino vendido");
						}catch(Exception e) {
							System.out.println(e.getMessage());
						}
					}
					h1.setCapital(h1.getCapital()+ganancias);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		
			if (r.equals("3.2")){
				try {
				h1.setCapital(h1.getCapital()+h1.venderHortensias()*Hortensia.getPvp());
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
			//opciones para imprimir las plantas y los arboles del huerto
			if (r.equals("4.1")){
				System.out.println(h1.getArrayPlanta().toString());
				}
			if (r.equals("4.2")){
				System.out.println(h1.getArrayArbol().toString());
				}
			
			if (r.equals("4.3")){
				try {
				System.out.println(h1.getArrayDecorativo().toString());
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			if (r.equals("4.4")){
				System.out.println(h1.getArrayComestible().toString());
				}
			if (r.equals("4.5")){
				System.out.println(h1.toString());
				}
			if (r.equals("4.6")) {
				Juego.abrirListaHuerto().toString();
			}
			if (r.equals("4.7")) {
				Juego.abrirListaHuerto().toString();
			}

		}
		
		
	}
	public static class Juego{
		public static Huerto crearHuerto() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce el nombre de tu huerto");
			String n= sc.nextLine();
			System.out.println("Huerto creado! Comienzas con 100eur");
			
			return new Huerto(n);
		}
		public static void UsrEligeOpcion(Huerto h) {
	    	String r="";
	        while (!r.equals("5")){
	        	r=Menu.muestraMenu();
	        	try {
	        	Menu.ejecutaMenu(r,h,Tiempo.getMes());
	        	}catch (Exception e){ e.getMessage();
	        	};
	        }
			
		}
		public static void guardarListaHuerto (TreeSet<Huerto> h1)throws Exception{
		    try (FileOutputStream fis = new FileOutputStream("TreemapHuerto.obj");
		             ObjectOutputStream obj = new ObjectOutputStream(fis)) {
		        obj.writeObject(h1);
		    } catch (IOException e) {
		        System.out.println("Error guardando el archivo de huertos: " + e.getMessage());
		    }
		}
		public static TreeSet<Huerto> abrirListaHuerto() throws Exception {
	   		TreeSet<Huerto> listaHuerto = new TreeSet<>(new ComparadorNombre());
			try (FileInputStream fileIn = new FileInputStream("TreemapHuerto.obj");
			     ObjectInputStream in = new ObjectInputStream(fileIn)) {
			    listaHuerto = (TreeSet<Huerto>) in.readObject();
			    System.out.println("El ranking de los huertos ganadores es...");
			    System.out.println(listaHuerto.toString());
			} catch (FileNotFoundException e) {
			    System.out.println("no hemos encontrado huerto");

			} catch (IOException e) {
			    System.out.println("Error leyendo el archivo de huertos: " + e.getMessage());
			}
			return listaHuerto;
		}

		
	}

}
