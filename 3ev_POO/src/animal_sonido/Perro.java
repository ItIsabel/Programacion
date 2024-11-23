package animal_sonido;

public class Perro extends Animal{
	boolean presa;
	
	public Perro(int kg) {
		super(kg);
	}

	@Override
	public String suena() {
		return "guau";
	}
	


	
	
	

}
