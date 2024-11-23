package herencia_Polimorfismo;
import java.lang.Math;

/*
 * Clase circulo hereda de Figura
 */
public class Circulo extends Figura {
	private int radio;
	
	/*
	 * Constructor de Circulo
	 */
	public Circulo(Color color, int radio) {
		super(color);
		this.radio=radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double calculaArea() {
		double area=Math.PI*Math.pow(radio,2);
		return area;
	}
	public double calculaPerimetro() {
		double perimetr=Math.PI*radio;
		return perimetr;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", area=" +
	this.calculaArea() + ", perimetr=" + this.calculaPerimetro()
	+ super.toString()+"]";
	}

}
