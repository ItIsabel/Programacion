package resistencias;

public class CircuitoSerie extends Circuito {

	public CircuitoSerie(int voltaje) {
		super(voltaje);
	}

	@Override
	public double calculaIntensidad() {
		int suma=0;
		for (Integer i : resistencias) {
			suma+=i;
		}
		return super.voltaje/suma;
	}
	

}
