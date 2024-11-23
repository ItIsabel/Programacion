package contador;

public class Alarma {
    private boolean alarmaActivada;
    private int alarmaHora;
    private int alarmaMinutos;

    public Alarma(int hora, int minutos){
    	this.alarmaHora=hora;
    	this.alarmaMinutos=minutos;
    	this.alarmaActivada= true;
    }

    public boolean isAlarmaActivada() {
		return alarmaActivada;
	}

	public void setAlarmaActivada(boolean alarmaActivada) {
		this.alarmaActivada = alarmaActivada;
	}

	public int getAlarmaHora() {
		return alarmaHora;
	}

	public void setAlarmaHora(int alarmaHora) {
		this.alarmaHora = alarmaHora;
	}

	public int getAlarmaMinutos() {
		return alarmaMinutos;
	}

	public void setAlarmaMinutos(int alarmaMinutos) {
		this.alarmaMinutos = alarmaMinutos;
	}
}
