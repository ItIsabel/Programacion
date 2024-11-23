package herencia_Polimorfismo;

/*
 * Clase Triangulo, hereda de Figura
 */
public class Triangulo extends Figura {
		private int base;
		private int lado;

		/*
		 * Constructor de Triangulo
		 * @param base introduce el lado de abajo del triangulo
		 * @param lado introduce uno de los lados del triangulo
		 */
		public Triangulo(Color color ,int base, int lado) {
			super(color);
			this.base=base;
			this.lado=lado;
		}

		public int getBase() {
			return base;
		}
		
		/*
		 * Cambia la medida del lado de abajo del triangulo
		 */
		public void setBase(int base) {
			this.base = base;
		}

		public int getLado() {
			return lado;
		}
		
		/*
		 * Cambia las medidas de los lados del triangulo
		 */
		public void setLado(int lado) {
			this.lado = lado;
		}


		public double calculaArea() {
			double area=(this.base*this.calculaAltura()/2);
			return area;
		}
		public double calculaPerimetro() {
			double perimetro=base+(lado*2);
			return perimetro;
		}
		private double calculaAltura() {
			double r= Math.sqrt(Math.pow(lado,2)-Math.pow(base,2));
			return r;
		}

		@Override
		public String toString() {
			return "Triangulo ["+super.toString()+"base=" + base + 
					", lado=" + lado + ", altura=" + calculaAltura() + 
					", area=" + calculaArea()
					+ ", perimetro=" + calculaPerimetro() +  "]";
		}

		

}
