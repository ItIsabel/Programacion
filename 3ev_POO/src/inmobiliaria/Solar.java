package inmobiliaria;

public class Solar extends Superficie implements Vendible{
	tipoSolar tipo;
	boolean disponible=true;

	public Solar(String ubicacion, int m2, int pvp, tipoSolar tipo) {
		super(ubicacion, m2, pvp);
		this.tipo = tipo;
	}
	
	

	public boolean isDisponible() {
		return disponible;
	}



	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}



	public tipoSolar getTipo() {
		return tipo;
	}


	public void setTipo(tipoSolar tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return super.toString()+"Solar [tipo=" + tipo + "\n";
	}


	@Override
	public void vender() {
		this.disponible=false;
	}
	
	

}
