package herencia_Polimorfismo;
/*
 * Clase figura
 */
public class Figura {
	Color color;
	
	/*
	 * constructor figura
	 */
	public Figura(Color color) {
		this.color=color;
	};
	public Figura() {}
	
	/*
	 *Metodo para obtener color 
	 */
	public double calculaArea() {
		return 0.0;
	};
	public double calculaPerimetro () {
		return 0.0;
	};
	public Color getColor() {
		return color;
	}
	
	/*
	 * metodo para fijar color
	 */

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "color=" + color + "";
	}

}
