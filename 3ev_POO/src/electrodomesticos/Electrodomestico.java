package electrodomesticos;

public class Electrodomestico {
	int precioBase;
	String color;
	char consumo='F';
	int peso;
	
	public Electrodomestico(int precioBase, String color, char consumo, int peso) {
		this.comprobarConsumoEnergetico(consumo);
		this.comprobarColor(color);
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico() {
	}

	public Electrodomestico(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	private void comprobarConsumoEnergetico(char letra) {
		
		if ((letra=='A') ||(letra=='B') ||(letra=='C')||(letra=='D') ||(letra=='E') ||(letra=='F')) {
			this.consumo=letra;
		}
		else {
			this.consumo='F';
		}
		
	}
	private void comprobarColor(String color) {
		if ((color=="blanco") ||(color=="negro") ||(color=="rojo")||(color=="azul") ||(color=="gris")) {
			this.color=color;
		}
		else {
			this.color="blanco";
		}
	}
	public double precioFinal() {
		double precioFinal=0.0;
		switch(this.consumo) {
			case 'A': precioFinal=this.precioBase+100;
			case 'B': precioFinal=this.precioBase+80;
			case 'C': precioFinal=this.precioBase+60;
			case 'D': precioFinal=this.precioBase+50;
			case 'E': precioFinal=this.precioBase+30;
			case 'F': precioFinal=this.precioBase+10;	
		}
		if( this.peso>0 & this.peso<19) {
			precioFinal+=10;
		}
		else if( this.peso>20 & this.peso<49) {
			precioFinal+=50;
		}
		else if( this.peso>50 & this.peso<79) {
			precioFinal+=80;
		}
		else if( this.peso>80) {
			precioFinal+=100;
		}
		
		return precioFinal;
	}

	@Override
	public String toString() {
		return "precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "\n";
	}
	

	
	

}
