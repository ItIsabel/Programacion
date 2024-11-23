package proyectoFinal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Esta clase representa un huerto virtual. Un huerto tiene un nombre, un capital inicial y dos listas, una para almacenar los árboles y otra para las plantas.
 */
public class Huerto implements Comparable<Huerto> ,Serializable{
transient ArrayList<Arbol>  aArbol;
transient ArrayList<Planta> aPlanta;
String nombre;
int capital=100;

/**
 * Crea un nuevo huerto con el nombre especificado y un capital inicial de 100.
 * @param nombre del huerto
 */
public Huerto(String nombre) {
	this.nombre = nombre;
	aArbol=new ArrayList<>();
	aPlanta=new ArrayList<>();
}
/**
 * Añade un árbol al huerto. Si el costo del árbol es menor o igual que el capital disponible, se agrega el árbol a la lista y se descuenta su costo del capital. En caso contrario, se lanza una excepción
 * @param a arbol a añadir al huerto
 * @throws SinCapitalExcepcion
 */
public void addArbol(Arbol a) throws SinCapitalExcepcion {
	if (this.capital- a.getCoste()>=0){
		this.capital-=a.getCoste();
		aArbol.add(a);
	}
	else throw new SinCapitalExcepcion ("No tienes dinero suficiente"); 
}
/**
 *  Añade una planta al huerto. Si el costo de la planta es menor o igual que el capital disponible, se agrega la planta a la lista y se descuenta su costo del capital. En caso contrario, se lanza una excepción
 * @param p planta a añadir al huerto
 * @throws SinCapitalExcepcion
 */
public void addPlanta(Planta p)  throws SinCapitalExcepcion {
	if (this.capital- p.getCoste()>=0){
		this.capital-=p.getCoste();
		aPlanta.add(p);
	}
	else throw new SinCapitalExcepcion ("No tienes dinero suficiente"); 

}
/**
 * Devuelve la lista de árboles del huerto. Si la lista está vacía, se lanza una excepción.
 * @return Devuelve la lista de árboles del huerto
 * @throws Exception
 */
public ArrayList<Arbol> getArrayArbol() throws Exception{
	if (aArbol.isEmpty()) {
		throw new Exception("No hay arboles en tu huerto");	
	}
	return aArbol;
}
/**
 * Devuelve la lista de plantas del huerto. Si la lista está vacía, se lanza una excepción.
 * @return Devuelve la lista de plantas del huerto
 * @throws Exception
 */
public ArrayList<Planta> getArrayPlanta() throws Exception {
	if (aPlanta.isEmpty()) {
		throw new Exception("No hay plantas en tu huerto");
	}
	return aPlanta;
}
/**
 * Devuelve una lista con todos los limoneros del huerto. Si no hay limoneros, se lanza una excepción
 * @return Devuelve una lista con todos los limoneros del huerto.
 * @throws NoHayTipoArbolExcepcion
 */
public ArrayList<Limonero> getArrayLimonero() throws NoHayTipoArbolExcepcion {
	ArrayList<Limonero> limoneros =new ArrayList<>();
	for (Arbol arbol:aArbol) {
		if (arbol instanceof Limonero) {
			limoneros.add((Limonero)arbol);
		}
	}
	if (limoneros.isEmpty()) {
		throw new NoHayTipoArbolExcepcion("No tienes arboles de este tipo");
	}
	else return limoneros;
}
/**
 * Devuelve una lista con todos los perales del huerto. Si no hay perales, se lanza una excepción
 * @return
 * @throws NoHayTipoArbolExcepcion
 */
public ArrayList<Peral> getArrayPeral() throws NoHayTipoArbolExcepcion {
	ArrayList<Peral> peral =new ArrayList<>();
	for (Arbol arbol:aArbol) {
		if (arbol instanceof Peral) {
			peral.add((Peral)arbol);
		}
	}
	if (peral.isEmpty()) {
		throw new NoHayTipoArbolExcepcion("No tienes arboles de este tipo");
	}
	else return peral;
}
/**
 *  Devuelve una lista con todos los pinos del huerto. Si no hay pinos, se lanza una excepción
 * @return Devuelve una lista con todos los pinos del huerto
 * @throws NoHayTipoArbolExcepcion
 */
public ArrayList<Pino> getArrayPino() throws NoHayTipoArbolExcepcion {
	ArrayList<Pino> pino =new ArrayList<>();
	for (Arbol arbol:aArbol) {
		if (arbol instanceof Pino) {
			pino.add((Pino)arbol);
		}
	}
	if (pino.isEmpty()) {
		throw new NoHayTipoArbolExcepcion("No tienes arboles de este tipo");
	}
	else return pino;
}
/**
 * Devuelve una lista con todas las plantas y árboles decorativos del huerto. Si no hay elementos decorativos, se lanza una excepción.
 * @return Devuelve una lista con todas las plantas y árboles decorativos
 * @throws Exception
 */

public ArrayList<Decorativo> getArrayDecorativo() throws Exception{
	ArrayList<Decorativo> d1= new ArrayList<>();
	for (Planta p : aPlanta) {
		if (p instanceof Decorativo) {
			d1.add((Decorativo)p);
		}
	}
	for (Arbol a : aArbol) {
		if (a instanceof Decorativo) {
			d1.add((Decorativo)a);
		}
	}
	if (d1.isEmpty()) {
		throw new Exception("No tienes plantas ni arboles decorativos en tu huerto");
	}
	return d1;
}

/**
 * Devuelve una lista con todas las plantas y árboles comestibles del huerto. Si no hay elementos comestibles, se lanza una excepción.
 * @return Devuelve una lista con todas las plantas y árboles comestibles del huerto.
 * @throws Exception
 */
public ArrayList<Comestible> getArrayComestible() throws Exception {
	ArrayList<Comestible> c1=new ArrayList<>();
	for (Planta p : aPlanta) {
		if (p instanceof Comestible) {
			c1.add((Comestible)p);
		}
	}
	for (Arbol a : aArbol) {
		if (a instanceof Comestible) {
			c1.add((Comestible)a);
		}
	}
	if (c1.isEmpty()) {
		throw new Exception("No tienes plantas ni arboles comestibles en tu huerto");
	}
	return c1;
}

/**
 * Intenta vender todas las hortensias del huerto. Si no hay hortensias, se lanza una excepción
 * @return numero de hortensias vendidas
 * @throws Exception
 */
public int venderHortensias() throws Exception{
	int contador=0;
	for (Planta planta : aPlanta) {
		if (planta instanceof Hortensia) {
			try {
				contador+=((Hortensia) planta).vender();
				aPlanta.remove(planta);
			}
			catch(Exception e) {
				e.getMessage();
			}
		}
	}
	if (contador==0) {
		throw new NoHayTipoPlantaExcepcion ("No tienes hortensias");
	}
	return contador;
}

/**
 * Intenta recolectar todas las cebollas maduras del huerto. Si no hay cebollas o no están listas para ser cosechadas, se lanza una excepción.
 * @return  Devuelve la cantidad total de cebollas recolectadas.
 * @throws Exception
 */
public int venderCebollas() throws Exception{
	int contador=0;
	for (Planta planta : aPlanta) {
		if (planta instanceof Cebolla) {
			try {
			contador+=((Cebolla) planta).recolectar();
			aPlanta.remove(planta);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	}	
	if (contador==0) {
		throw new Exception ("No tienes cebollas o no estan listas para ser cosechadas");
	}
	return contador;
}

/**
 * Intenta recolectar las peras de todos los perales del huerto. Devuelve la cantidad total de peras recolectadas. En caso de ocurrir una excepción, se imprime el mensaje de error.
 * @return devuelve el numero de peras recolectadas
 */
public int venderPeras(){
	int contadorPeras=0;
	try {
		for (Peral peral : getArrayPeral()) {
			contadorPeras+=peral.recolectar();
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return contadorPeras;

}
/**
 *  Establece el capital del huerto.
 * @param capital
 */
public void setCapital(int capital) {
	this.capital = capital;
}

/**
 * Devuelve el capital del huerto.
 * @return capital 
 */
public int getCapital() {
	return capital;
}


/**
 * Implementa la interfaz Comparable. Permite comparar dos huertas en función de su capital.
 */
@Override
public int compareTo(Huerto o) {
	return ((Integer)o.getCapital()).compareTo((Integer)this.getCapital());
}

/**
 *  Riega todas las plantas y árboles del huerto.
 */
public void regarHuerto() {
	for (Planta v :aPlanta) {
		v.regar();
	}
	for (Vegetal v : aArbol) {
		v.regar();
	}
}
/**
 * Devuelve una cadena con la información del huerto, incluyendo su nombre, las listas de árboles y plantas, y el capital disponible.
 */
@Override
public String toString() {
	return "-- Huerto " + this.nombre + "--"+"\nArboles= " + aArbol + "\n Plantas=" + aPlanta + " \n capital=" + capital + "\n";
}

}