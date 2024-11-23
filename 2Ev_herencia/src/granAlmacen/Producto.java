package granAlmacen;

public class Producto {
	private String nombre;
	private double precio;
	private int codigoBarras;
	
	
	public Producto(String nombre,double precio,int codigoBarras) {
		this.nombre=nombre;
		this.precio=precio;
		this.codigoBarras=codigoBarras;
	}
	public Producto(String nombre,int precio,int codigoBarras) {
		this.nombre=nombre;
		this.precio=precio;
		this.codigoBarras=codigoBarras;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}



}
