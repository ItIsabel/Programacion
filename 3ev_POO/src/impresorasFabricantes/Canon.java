package impresorasFabricantes;

public class Canon extends Impresora{
	int numToners;

	public Canon(String marca, String modelo, tipoImpresora tipo, int numToners) {
		super(marca, modelo, tipo);
		this.numToners = numToners;
	}

	public int getNumToners() {
		return numToners;
	}

	public void setNumToners(int numToners) {
		this.numToners = numToners;
	}

	@Override
	public String toString() {
		return super.toString()+"Toners disponibles=" + numToners + "\n";
	}

	@Override
	public int compareTo(Impresora o) {
		return super.getMarca().compareTo(o.getMarca());
	}



	
	

}
