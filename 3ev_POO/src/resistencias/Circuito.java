package resistencias;
import java.util.ArrayList;

public abstract class Circuito {
	int voltaje;
	ArrayList <Integer> resistencias;
	
	public Circuito(int voltaje) {
		this.voltaje = voltaje;
		resistencias=new ArrayList<Integer>();
	}
	
	public void addResistencia(int i) {
		resistencias.add((Integer)i);
	}
	
	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public ArrayList<Integer> getResistencias() {
		return resistencias;
	}


	public abstract double calculaIntensidad();

}
