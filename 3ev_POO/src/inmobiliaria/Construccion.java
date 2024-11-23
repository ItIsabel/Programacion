package inmobiliaria;

public abstract class Construccion extends Inmueble{
	tipoConstruccion tipo;

	public Construccion(String ubicacion, int m2, int pvp, tipoConstruccion tipo) {
		super(ubicacion, m2, pvp);
		this.tipo = tipo;
	}
	
	
	

}
