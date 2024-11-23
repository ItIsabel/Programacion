package inmobiliaria;

public class LocalComercial extends Construccion implements Alquilable{
	boolean disponible=true;

	public LocalComercial(String ubicacion, int m2, int pvp, tipoConstruccion tipo) {
		super(ubicacion, m2, pvp, tipo);
		// TODO Auto-generated constructor stub
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public float precioM2() {
		return pvp/m2;
	}
	@Override
	public String toString() {
		return "LocalComercial "+"\n" +"precioM2=" + precioM2() + super.toString()+"\n";
	}

	@Override
	public void Alquilar() {
		this.disponible=false;
	}
	

}
