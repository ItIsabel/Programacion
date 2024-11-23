package resistencias;

public class MainCircuito {

	public static void main(String[] args) {
		CircuitoSerie circuitoS=new CircuitoSerie(34);
		circuitoS.addResistencia(200);
		circuitoS.addResistencia(400);
		circuitoS.addResistencia(500);
		CircuitoSerie circuitoS1=new CircuitoSerie(45);
		circuitoS1.addResistencia(50);
		circuitoS1.addResistencia(700);
		CircuitoParalelo circuitoP=new CircuitoParalelo(100);
		circuitoP.addResistencia(100);
		Placa placa=new Placa();
		placa.addCircuito(circuitoS);
		placa.addCircuito(circuitoS1);
		placa.addCircuito(circuitoP);
		System.out.println("la intensidad total de la placa es: " +placa.calculaIntensidad());
	}

}
