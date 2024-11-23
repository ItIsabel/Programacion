package proyectoFinal;

/**
 * La clase Limonero modela un limonero que hereda de la clase Arbol e implementa la interfaz Comestible.
 */
public class Limonero extends Arbol implements Comestible {

    /**
     * Número de limones actualmente en el árbol.
     */
    int nLimones = 0;

    /**
     * Precio fijo por limón (static para que sea compartido por todos los Limoneros).
     */
    static int PrecioLimones = 5;

    /**
     * Constructor del Limonero que recibe el tipo de árbol ( un enum).
     * 
     * @param ta Tipo de Arbol del Limonero.
     */
    public Limonero(TipoArbol ta) {
        super(ta);
    }

    /**
     * Simula la recolección de limones del árbol.
     *
     * @return El número de limones recolectados.
     * @throws Exception Si no hay limones en el árbol.
     */
    @Override
    public int recolectar() throws Exception {
        int r = nLimones;
        nLimones = 0;
        if (r == 0) {
            throw new Exception("No hay limones en el árbol");
        }
        return r;
    }

    /**
     * Simula el riego del Limonero, aumentando el número de limones 
     * si el mes actual está en la temporada alta de crecimiento (almacenada en TempAlta).
     */
    @Override
    public void regar() {
        int[] TempAlta = {11, 12, 1, 2, 3};
        for (int i = 0; i < TempAlta.length; i++) {
            if (Tiempo.getMes() == TempAlta[i]) {
                nLimones += 1;
            }
        }
        nLimones += 1;
    }

    /**
     * Devuelve el precio fijo por limón.
     * 
     * @return Precio de cada limón.
     */
    public static int getPrecioLimones() {
        return PrecioLimones;
    }

    /**
     * Representación en cadena del Limonero, incluyendo el número de limones y la información heredada de Arbol.
     * 
     * @return Cadena que describe el Limonero.
     */
    @Override
    public String toString() {
        return "LIMONERO\n Limones=" + nLimones + "\n" + super.toString();
    }
}