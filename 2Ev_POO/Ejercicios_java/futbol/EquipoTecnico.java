package futbol;

public class EquipoTecnico {
	Entrenador entrenador;
	Fisioterapeuta fisio;
	public EquipoTecnico(Entrenador entrenador, Fisioterapeuta fisio) {
		this.entrenador = entrenador;
		this.fisio = fisio;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	public Fisioterapeuta getFisio() {
		return fisio;
	}
	public void setFisio(Fisioterapeuta fisio) {
		this.fisio = fisio;
	}
	@Override
	public String toString() {
		return "EquipoTecnico - " + entrenador.toString() + "\n"+
		fisio.toString() + "\n";
	}
	
	
	
	

}


