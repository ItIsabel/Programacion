package proyectoFinal;
/**
 * Clase que representa a una planta de Albahaca.
 * 
 * @author Isabel Alvarez
 * @version 1.0
 * @since 2024-04-28
 */
public class Albahaca extends Planta implements Comestible{
	/**
	 * Constructor de Cebolla
	 */
	public Albahaca() {
	}

    /**
     * Simula el riego del la Albahaca, aumentando la edad de la albahaca 
     */
	@Override
	public void regar() {
		super.edad+=1;	}

	/** Devuelve un 1 si se puede cosechar la albahaca (si tiene mas de 3 meses 
	 * Si no es epoca lanza una excepcion
	 */
	@Override
	public int recolectar() throws Exception{
		int r=0;
		if (super.getEdad()>=3){
			super.setEdad(1);	
			r=1;
		}
		else {throw new Exception("Todavia necesitas "+  (3-super.getEdad()) + "meses para cosechar la albahaca");
	
		}
		return r;
	}

	@Override
	public String toString() {
		return "ALBAHACA \n" + super.toString();
	}
	


}
