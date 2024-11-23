package proyectoFinal;
/**
 * Clase que representa a una planta de Hortensia que es decorativa.
 * 
 * @author Isabel Alvarez
 * @version 1.0
 * @since 2024-04-28
 */
public class Hortensia extends Planta implements Decorativo{
	static int pvp=30;
	
	/** Constructor de Hortensia
	 * 
	 */
	public Hortensia() {}

	/** Simula el riego de la Hortensia, aumentando su edad.
	 * 
	 */
	@Override
	public void regar() {
		super.edad+=1;
	}

     /** Devuelve el precio fijo por planta de hortensia.
     * 
     * @return Precio de la hortensia
     */
	public static int getPvp() {
		return pvp;
	}
	/** Devuelve un 1 si se puede vender la hortensia (si tiene mas de 7 meses ó si es la epoca.
	 * Si no es epoca lanza una excepcion
	 */
	@Override
	public int vender() throws Exception{
		int r=0;
		if((Tiempo.getMes()==5||Tiempo.getMes()==6||Tiempo.getMes()==7)&(super.getEdad()>=7)){
			r=1;
		}else {
			throw new Exception ("No es epoca de vender hortensias o tus hortensia no tiene 7 meses. Estos son mayo, junio y julio");
		}
		return r;
	}
/** Devuelve una cadena indicando que es una Hortensia
 *
 */
	@Override
	public String toString() {
		return "HORTENSIA"+"\n" +super.toString();
	}



}
