package proyectoFinal;

/**
 * La clase Peral modela un peral que hereda de la clase Arbol e implementa la interfaz Comestible.
 */
public class Peral extends Arbol implements Comestible {
	int nPeras=0;

    /**
     * Constructor del peral que recibe el tipo de árbol (un enum).
     * 
     * @param ta Tipo de Arbol del peral.
     */
	public Peral(TipoArbol ta) {
		super(ta);
		// TODO Auto-generated constructor stub
	}

    /**
     * Simula la recolección de peras del árbol.
     *
     * @return El número de peras recolectadas.
     * @throws Exception Si no hay peras en el árbol.
     */
	@Override
	public int recolectar() throws Exception {
		int r=nPeras;
		nPeras=0;
        if (r == 0) {
            throw new Exception("No hay peras en el árbol");
        }
		return r;
	}
    /**
     * Simula el riego del Peral, aumentando el número de limones. Si es septiembre u octubre da 2 peras.
     */
	@Override
	public void regar() {
		nPeras+=1;
		if (Tiempo.getMes()==9||Tiempo.getMes()==10) {
			nPeras+=1;
		}
		
	}
    /**
     * Representación en cadena del Peral, incluyendo el número de peras y la información heredada de Arbol.
     * 
     * @return Cadena que describe el Peral.
     */
	@Override
	public String toString() {
		return "PERAL\n Peras=" + nPeras + "\n"+ super.toString();
	}
	
	

}
