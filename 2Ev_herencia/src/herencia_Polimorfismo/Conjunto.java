package herencia_Polimorfismo;
import java.util.ArrayList;

/*
 * Clase conjunto para crear Arraylists de figuras
 */
public class Conjunto {
	private ArrayList<Figura> Arrayfiguras;

	/*
	 * Constructor que crea un ArrayList 
	 */
	public Conjunto(){
		Arrayfiguras=new ArrayList<Figura>();
	}
	
	/*
	 * Metodo para agregar figuras
	 */
	public void addFigura(Figura figura) {
		Arrayfiguras.add(figura);
	}
	
	
	public ArrayList<Figura> getArrayfiguras() {
		return Arrayfiguras;
	}
	
	public double sumaAreas() {
		double i=0;
		for (Figura figura : Arrayfiguras) {
			figura.calculaArea();
			i+=figura.calculaArea();
		}
		return i;
	}
	public double sumaPerimetros() {
		double i=0;
		for (Figura figura : Arrayfiguras) {
			figura.calculaPerimetro();
			i+=figura.calculaPerimetro();
		}
		return i;
	}


	/*
	 * devuelve datos del array
	 */
	public String toString () {
		String s="Conjunto de figuras";
		s+="\n";
		for (Figura figura : Arrayfiguras) {
			s+=figura.toString();
			s+="\n";
		}
		return s;
		}
		
	}



