package animal_sonido;

public class Pajaro extends Animal {
	private tipoPajaro tipo;
	
	
	public Pajaro(int kg) {
		super(kg);
	}


	public String suena() {
		return "pio,pio";
	}

}
