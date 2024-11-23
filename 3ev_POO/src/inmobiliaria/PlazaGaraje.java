package inmobiliaria;

public class PlazaGaraje extends Superficie implements Alquilable{
	tipoGaraje tipo;
	boolean disponible=true;

	public PlazaGaraje(String ubicacion, int m2, int pvp, tipoGaraje tipo) {
		super(ubicacion, m2, pvp);
		this.tipo = tipo;
	}
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "PlazaGaraje"+"\n" +"tipo=" + tipo + "\n"+super.toString();
	}

	@Override
	public void Alquilar() {
		this.disponible=false;
	}
	
	

}
