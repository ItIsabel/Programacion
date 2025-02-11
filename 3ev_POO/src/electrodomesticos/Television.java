package electrodomesticos;

public class Television extends Electrodomestico implements LibroCaracteristicas{
	int resolucion=20;
	boolean TDT=false;
	public Television() {
	}
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
	}
	public Television(int precioBase, String color, char consumo, int peso, int resolucion, boolean TDT) {
		super(precioBase, color, consumo, peso);
		this.resolucion=resolucion;
		this.TDT=TDT;
	}
	
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isTDT() {
		return TDT;
	}
	public void setTDT(boolean tDT) {
		TDT = tDT;
	}
	public double precioFinal() {
		double pFinal= super.precioFinal();
		if (this.resolucion>40) {
			pFinal+=pFinal*0.30;
		}
		if (this.TDT) {
			pFinal+=+50;
		}
		return pFinal;
	}
	public void imprimeLibroCaracteristicasElectrodomestico() {
		System.out.println("Television; resolucion=" + resolucion + ", TDT=" + TDT + "\n");
		System.out.println(super.toString());
		
		
	}
	
	

}
