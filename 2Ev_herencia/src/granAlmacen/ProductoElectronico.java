package granAlmacen;

public class ProductoElectronico extends Producto{
	private final int GARANTIA;
	
	public ProductoElectronico(String nombre,int precio,int codigoBarras) {
		super(nombre,precio+8.5,codigoBarras);
		this.GARANTIA=3;
	}
	

}
