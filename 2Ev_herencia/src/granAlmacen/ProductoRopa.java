package granAlmacen;

public class ProductoRopa extends Producto {
	String material;
	
	public ProductoRopa(String nombre,int precio,int codigoBarras,String material) {
		super(nombre,precio,codigoBarras);
		this.material=material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	

	
}
