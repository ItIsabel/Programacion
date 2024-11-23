package resistencias;

public class CircuitoParalelo extends Circuito{

	public CircuitoParalelo(int voltaje) {
		super(voltaje);
	}

	@Override
	public double calculaIntensidad() {
		double r=0;
		for (Integer res : resistencias) {
			r+=super.getVoltaje()/res;
		}
		return r;
	}
	

}
