package proyectoFinal;
/**
 * Clase que representa a una planta de Cebolla.
 * 
 * @author Isabel Alvarez
 * @version 1.0
 * @since 2024-04-28
 */
public class Cebolla extends Planta implements Comestible{
	static int precioCebolla=20;	
	/**
	 * Constructor de Cebolla
	 */
	public Cebolla() {

	}
    /**
     * Simula el riego del la Cebolla, aumentando la edad de la albahaca 
     */
	@Override
	public void regar() {
		super.edad+=1;
	}
	/** Devuelve un 1 si se puede cosechar la Cebolla (si tiene mas de 3 meses 
	 * Si no es epoca lanza una excepcion
	 */
	@Override
	public int recolectar() throws Exception{
	    int r = 0;
	    if (super.getEdad() >= 3 && (Tiempo.getMes() == 8|| Tiempo.getMes() == 9)) {
	        r = 1;
	    } else {
	        throw new Exception("La cebolla tiene " + super.getEdad() + " mes/es. No se puede cosechar todavía o ya no está en época.");
	    }

	    return r;
	}
	public static int pvp() {
		return precioCebolla;
	}

	@Override
	public String toString() {
		return "CEBOLLA"+ "\n" +super.toString();
	}

}
