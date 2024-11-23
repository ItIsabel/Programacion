package segunda_Evaluacion_POO;

public class Tiempo {
	private int dia=0;
	private int hora=0;
	private int minuto=0;
	private int segundo=0;
	
	public Tiempo(int hora,int minuto, int segundo) {
		if(verificarTiempo(hora,minuto,segundo)) {
			this.hora=hora;
			this.minuto=minuto;
			this.segundo=segundo;
		}
	}
	public Tiempo(int hora, int minuto) {
		if (minuto<=60 && hora<=24) {
			this.hora=hora;
			this.minuto=minuto;
		}
	}
	public Tiempo(int hora) {
		if (hora<=24) {		
			this.hora=hora;
		}
	}
	
	public void setMinuto(int minuto) {
		if(minuto<=60)
			this.minuto=minuto;
		incrementar();
	}
	public void setSegundo(int segundo) {
		if (segundo<=60)
			this.segundo=segundo;
		incrementar();
	}
	public void setHora(int hora) {
		this.hora=hora;
		incrementar();
	}	
	private boolean verificarTiempo(int hora,int minuto, int segundo){
		boolean esCorrecto= false;
		if (segundo<=60 && minuto<=60 && hora<=24){
			this.segundo=segundo;			
			this.minuto=minuto;		
			this.hora=hora;
		}
		else {
			this.segundo=0;
			this.minuto=0;
			this.hora=0;
		}
		return esCorrecto;
	}
	
	private void incrementar() {
		if (segundo>=60) {
			segundo=0;
			minuto++;
			
		}
		if (minuto>=60) {
			minuto=0;
			hora++;
		}
		if (hora==24) {
			hora=0;
			dia++;
		}
	}
	public String toString() {
		String r= "El tiempo introducido es de " + dia +" dias, "+ hora + " horas, " + minuto + " minutos y " + segundo +" segundos.";
		return r;
	}
	

}
