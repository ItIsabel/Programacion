package biblioteca;
/**
 * Clase revista
 */
public class Revista extends Publicacion {
	int numero;
	
	public Revista(int codigo, String titulo, int yr, int num) {
		super(codigo, titulo, yr);
		this.numero=num;
	}



	

	@Override
	public String toString() {

		return super.toString()+ "Revista [numero=" + numero + "]";
	}
	
	
	
	

}
