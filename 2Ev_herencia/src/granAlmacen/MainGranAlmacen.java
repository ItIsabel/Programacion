package granAlmacen;
import segunda_Evaluacion_POO.Fecha;


public class MainGranAlmacen {

	public static void main(String[] args) {
		Venta venta1=new Venta();
		venta1.addProducto(new ProductoAlimentacion("pizza",3.5,76543, new Fecha(10,12,2024)));
		venta1.addProducto(new ProductoRopa("pijama",30,6543,"lana"));
		venta1.addProducto(new ProductoElectronico("mp3",80,7654));
		
		/*Se desea que la clase venta tenga un método que realice la suma de 3 productos: 
		una pizza de 3,5 euros, un pijama de 30 euros y un reproductor de mp3 de 80 euros
		con un plus de 8,5.
		*/
		System.out.println("suma de productos"+venta1.sumaProductos());
		

	}

}
