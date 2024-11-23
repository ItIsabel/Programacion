package proyectoFinal;

public abstract class Planta extends Vegetal {
	int edad=0;
	int coste=5;
	
	public Planta() {

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCoste() {
		return coste;
	}

	@Override
	public String toString() {
		return "edad" + edad + "\n";
	}
	
	
	
	
	

}
