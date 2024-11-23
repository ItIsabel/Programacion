package inmobiliaria;

public class Vivienda extends Construccion implements Vendible,Alquilable{
	int pvpAlquiler;
	int nHabitaciones;
	int piso;
	boolean disponible=true;

	public Vivienda(String ubicacion, int m2, int pvp, tipoConstruccion tipo, int pvpAlquiler, int nHabitaciones,
			int piso) {
		super(ubicacion, m2, pvp, tipo);
		this.pvpAlquiler = pvpAlquiler;
		this.nHabitaciones = nHabitaciones;
		this.piso = piso;
	}


	public int getPvpAlquiler() {
		return pvpAlquiler;
	}

	public void setPvpAlquiler(int pvpAlquiler) {
		this.pvpAlquiler = pvpAlquiler;
	}

	public int getnHabitaciones() {
		return nHabitaciones;
	}

	public void setnHabitaciones(int nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
	}
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "Vivienda "+"\n" +"pvpAlquiler=" + pvpAlquiler + "," + ", nHabitaciones=" + nHabitaciones
				+ ", piso=" + piso + "\n" +super.toString();
	}


	@Override
	public void Alquilar() {
		this.disponible=false;
		
	}


	@Override
	public void vender() {
		this.disponible=false;
		
	}
	
	
	

}
