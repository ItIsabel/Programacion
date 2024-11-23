package proyectoFinal;

/**
 * Clase pino modela un pino que hereda de arbol y es decorativo
 */
public class Pino extends Arbol implements Decorativo{
	int altura=10;
	
	/**
	 * Constructor de Pino
	 * @param ta define el tipo de la hoja del arbol
	 */
	public Pino(TipoArbol ta) {
		super(ta);

	}

	/**
	 * Metodo que devuelve el numero correspondiente al precio de venta del pino en función de su altura
	 */
	@Override
	public int vender() throws Exception{
		int r=0;
		if (Tiempo.getMes()==11|| Tiempo.getMes()==12) {
			if (this.altura==10) {
				r= 20;
			}
			if(this.altura>10 & this.altura<16)
				r=30;
			
			if(this.altura >=16){
				r= 50;
			}
		}
		else throw new Exception ("No es epoca de vender pinos. Estos son noviembre y diciembre");		
		return r;	
	}


    /**
     * Simula el riego del Pino, aumentando su altura en determinados meses.
     * si el mes actual está en la temporada alta de crecimiento (almacenada en meses).
     */
	@Override
	public void regar() {
		int[] meses= {2,3,4,5};
		for(int i=0; i<meses.length;i++) {
			if (Tiempo.getMes()==meses[i]) {
				this.altura+=2;
			}
		}
	}
/**
 * Devuelve una cadena con la información del pino
 */
	@Override
	public String toString() {
		return "Pino altura " + altura + "cm" +"\n"+ super.toString();
	}
	

}
