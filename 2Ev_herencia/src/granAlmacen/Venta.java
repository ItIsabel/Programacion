package granAlmacen;
import java.util.ArrayList;

public class Venta {
	static int totalventas;
	int codigoVenta;
	ArrayList<Producto> listaProductos;
	
	
	public Venta() {
		listaProductos= new ArrayList<Producto>();
		codigoVenta=totalventas;
		totalventas++;
	}
	
	public void addProducto(Producto prod) {
		listaProductos.add(prod);
	}

	public static int getTotalventas() {
		return totalventas;
	}

	public int getCodigoVenta() {
		return codigoVenta;
	}
	public double sumaProductos() {
		double r=0.0;
		for (Producto producto : listaProductos) {
			r+=producto.getPrecio();
		}
		return r;
	}

	
	

}
