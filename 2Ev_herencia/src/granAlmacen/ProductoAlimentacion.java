package granAlmacen;
import segunda_Evaluacion_POO.Fecha;

public class ProductoAlimentacion extends Producto{
	Fecha fechaCaducidad;
	
	public ProductoAlimentacion(String nombre,double precio,int codigoBarras, Fecha fecha) {
		super(nombre,precio,codigoBarras);
		this.fechaCaducidad=fecha;
	}

	public Fecha getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Fecha fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	

}
