package impresorasFabricantes;

public class HP extends Impresora{
	boolean multifuncion;

	public HP(String marca, String modelo, tipoImpresora tipo, boolean multifuncion) {
		super(marca, modelo, tipo);
		this.multifuncion = multifuncion;
	}

	public boolean isMultifuncion() {
		return multifuncion;
	}

	public void setMultifuncion(boolean multifuncion) {
		this.multifuncion = multifuncion;
	}

	@Override
	public String toString() {
		return super.toString()+ "multifuncion=" + multifuncion + "\n";
	}

	@Override
	public int compareTo(Impresora o) {
		return super.getMarca().compareTo(o.getMarca());
	}
	
	

}
