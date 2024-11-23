package vehiculos;

public class VehiculosMain {

	public static void main(String[] args) {
		Furgoneta FurgoCitroen=new Furgoneta("Citroen", 001,001,100,7654,2);
		C4x4 LandRover=new C4x4("LandRover", 002,002,100,3654,4,6,motor.DIESEL);
		Deportivo DConTurbo= new Deportivo("Ferrari",003,003,100,0,5,2,300,true);
		Deportivo DSinTurbo= new Deportivo("Ferrari",004,004,100,0,5,2,300,false);
		Turismo c4Citroen= new Turismo("Citroen",005,005,100,6543,5,5,motor.GASOLINA);
		Moto Ducati= new Moto ("Ducati",006,006,100,0);
		Monovolumen Honda= new Monovolumen("Honda",007,007,100,0,4,0,5,motor.DIESEL);
		
		try {
			FurgoCitroen.arrancar();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("...........................");
		}
		
		FurgoCitroen.llenarDeposito();
		LandRover.llenarDeposito();
		DConTurbo.llenarDeposito();
		DSinTurbo.llenarDeposito();
		c4Citroen.llenarDeposito();
		Ducati.llenarDeposito();
		Honda.llenarDeposito();
		
		try {
			FurgoCitroen.arrancar();
			LandRover.arrancar();
			DConTurbo.arrancar();
			DSinTurbo.arrancar();
			c4Citroen.arrancar();
			Ducati.arrancar();
			Honda.arrancar();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("...........................");
		}
		
		try {
			FurgoCitroen.acelerar();
			LandRover.acelerar();
			DConTurbo.acelerar();
			DSinTurbo.acelerar();
			c4Citroen.acelerar();
			Ducati.acelerar();
			Honda.acelerar();  
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("...........................");
		}
		
		System.out.println(FurgoCitroen.toString());
		System.out.println(LandRover.toString());
		System.out.println(DConTurbo.toString());
		System.out.println(DSinTurbo.toString());
		System.out.println(c4Citroen.toString());
		System.out.println(Ducati.toString());
		System.out.println(Honda.toString());  
		


	}

}
