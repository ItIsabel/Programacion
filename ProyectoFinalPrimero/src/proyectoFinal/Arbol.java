package proyectoFinal;
/**
 * Clase que representa abstracta que determina el tipo arbol.
 * 
 * @author Isabel Alvarez
 * @version 1.0
 * @since 2024-04-28
 */
public abstract class Arbol extends Vegetal{
	TipoArbol ta;
	int coste=20;

	public Arbol(TipoArbol ta) {
		this.ta = ta;
		
	}
	
	public int getCoste() {
		return coste;
	}

	@Override
	public abstract void regar();

	@Override
	public String toString() {
		return  "Tipo de Arbol" + ta + "\n";
	} 

}
