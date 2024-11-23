package futbol;
import java.util.ArrayList;
import java.util.Arrays;


public class Equipo {
	String nombre;
	ArrayList<PersonaFutbol> juntaDirectiva;
	EquipoTecnico tecnico;
	Jugador[] jugadores;
	
	public Equipo(String nombre, Entrenador entrenador, Fisioterapeuta fisio) {
		this.nombre = nombre;
		tecnico=new EquipoTecnico(entrenador,fisio);
		jugadores=new Jugador[4];
		juntaDirectiva=new ArrayList <PersonaFutbol>();
	}
	
	public String sociosHonor() {
		return"los miembros son" + this.juntaDirectiva;

		}
	public Jugador[] addJugadores() {
		return jugadores;
	}

	@Override
	public String toString() {
		return "Equipo - nombre=" + nombre + "\n" + juntaDirectiva.toString() + tecnico.toString()
				+ "jugadores=" + Arrays.toString(jugadores) + "\n";
	}
		
	}


	


