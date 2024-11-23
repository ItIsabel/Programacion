package herencia_Polimorfismo;
/*
 * clase cuadrado hereda de Figura
 */
public class Cuadrado extends Figura {
	private int lado;
	
	/*
	 * Constructor cuadrado
	 */
	public Cuadrado(Color color,int lado) {
		super(color);
		this.lado=lado;
	}


	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	
	public double calculaArea() {
		double area=lado*lado;
		return area;
	}
	public double calculaPerimetro() {
		double perimetro=4*lado;
		return perimetro;
	}


	@Override
	public String toString() {
		return "Cuadrado ["+ super.toString() +" lado=" + lado + ","
				+ " area=" + this.calculaArea() + ", perimetro=" + 
				this.calculaPerimetro()+ "]";
	}
	


}
