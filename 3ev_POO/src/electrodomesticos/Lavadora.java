package electrodomesticos;

public class Lavadora extends Electrodomestico implements LibroCaracteristicas{
	int carga=5;

	public Lavadora() {
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
	}

	public Lavadora(int precioBase, String color, char consumo, int peso,int carga) {
		super(precioBase, color, consumo, peso);
		this.carga=carga;
	}

	public int getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		double pFinal= super.precioFinal();
		if (this.carga>30) {
			pFinal+=50;
		}
		return pFinal;
	}

	@Override
	public void imprimeLibroCaracteristicasElectrodomestico() {
		System.out.println("Lavadora :carga=" + carga + "\n");
		System.out.println(super.toString());

	}
	
	


	
	

}
