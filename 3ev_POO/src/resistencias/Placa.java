package resistencias;
import java.util.ArrayList;

public class Placa {
	ArrayList <Circuito> Circuitos;

	public Placa() {
		Circuitos = new ArrayList <Circuito>();
	}
	public void addCircuito(Circuito c) {
		Circuitos.add(c);
	}
	public double calculaIntensidad () {
		double r=0;
		for (Circuito c : this.Circuitos) {
			if (c instanceof  CircuitoParalelo){
				r+= ((CircuitoParalelo)c).calculaIntensidad();
			}
			if (c instanceof CircuitoSerie){
				r+=((CircuitoSerie)c).calculaIntensidad();
			}
		}
		return r;
	}
	

	
}
