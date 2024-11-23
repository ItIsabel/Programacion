package impresorasFabricantes;

public class Epson extends Impresora {
	boolean laser;
	public boolean isLaser() {
		return laser;
	}

	public void setLaser(boolean laser) {
		this.laser = laser;
	}

	public Epson(String marca, String modelo, tipoImpresora tipo, boolean laser) {
		super(marca, modelo, tipo);
		this.laser = laser;
	}

	@Override
	public String toString() {
		return super.toString()+"laser=" + laser + "\n";
	}

	@Override
	public int compareTo(Impresora o) {
		return super.getMarca().compareTo(o.getMarca());
	}



}
