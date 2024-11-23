package biblioteca;
/*
 * Libro implementa la interfaz Prestable y hereda de Publicacion
 */
public class Libro extends Publicacion implements Prestable {
	boolean prestado=false;

	public Libro(int codigo, String titulo, int yr) {
		super(codigo, titulo, yr);
	}
/**
 * Prestar lanza excepción si el libro no está disponible
 */
	@Override
	public String prestar() throws Exception {
		if (this.prestado==false) {
			this.prestado=true;
			return "Tienes 30 dias para devolverlo";
		}
		else throw new Exception("El libro no está disponible");
		
	}

	@Override
	public void devolver() {
		this.prestado=false;
		
	}

	@Override
	public boolean prestado() {
		return this.prestado;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ "prestado=" + this.prestado;
	}
	
	

}
