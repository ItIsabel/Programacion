package animal_sonido;

public abstract class Animal implements Sonido{
	private int kg;

	public Animal(int kg) {
		this.kg = kg;
	}

	@Override
	public abstract String suena();
	
	}
	


