package mamifero;

public class Ornitorrinco extends Mamifero implements Oviparo{
	

	public Ornitorrinco() {
	}

	@Override
	public String ponerHuevos() {
		return "el ornitorrinco pone huevos";
		
	}

	@Override
	public String amamantarCrias() {
		return "el ornitorrinco amamanta a su hija";
	}

}
