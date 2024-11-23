package segunda_Evaluacion_POO;

public class Rectangulo {
	private int base=0;
	private int altura=0;
	
	public Rectangulo (int base, int altura) {
		this.base=base;
		this.altura=altura;
	}
	public int calculaArea() {
		return this.base* this.altura;
	}
	public int calculaPerimetro() {
		return (this.base*2)+(this.altura*2);
	}
	public String toString() {
		String retorno= "El rectángulo tiene una base" + this.base + ". Y una altura de " + this.altura;
		return retorno;
	}
}

