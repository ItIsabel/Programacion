package inmobiliaria;
/**
 * Clase Inmueble es el padre de todas las demás clases, salvo AgInmobiliaria que es una agregacion de inmuebles
 * @author: Isabel
 * @version: 11/04/2023
 */
public abstract class Inmueble {
	String ubicacion;
	int m2;
	int pvp;
	static int id=1;
	int idInmueble;
	/**
	 * Constructor de inmueble, como es abstracta solo lo implementan las hijas;
	 * @param ubicacion
	 * @param m2
	 * @param pvp
	 */
	public Inmueble(String ubicacion, int m2, int pvp) {
		this.ubicacion = ubicacion;
		this.m2 = m2;
		this.pvp = pvp;
		this.idInmueble = id;
		id++;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getPvp() {
		return pvp;
	}
	public void setPvp(int pvp) {
		this.pvp = pvp;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Inmueble.id = id;
	}
	public int getIdInmueble() {
		return idInmueble;
	}
	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}
	@Override
	public String toString() {
		return "Ubicacion=" + ubicacion + ", m2=" + m2 + ", pvp=" + pvp + ", idInmueble=" + idInmueble + "\n";
	}
	
	
	

}
