package persona_trabajador;
import segunda_Evaluacion_POO.Persona;
/**
 * Clase trabajador hereda de Persona
 */
public class Trabajador extends Persona{
	int salario;
	int horasTrabajo;
	int sueldoHora=salario/horasTrabajo;
	int IRPF;
	int descuentoIRPF=salario*IRPF;
	/**
	 * Constructor de trabajador
	 * @param nombre para crear persona
	 * @param apellido para crear persona
	 * @param sueldo agregar sueldo
	 * @param IRPF retencion de IRPF
	 */
	public Trabajador(String nombre, String apellido, int sueldo,int IRPF ) {
		super (nombre,apellido);
		this.salario=sueldo;
		this.IRPF=IRPF;
	}
	/**
	 * Devuelve el salario que percibe el trabajador
	 * @return salario que percibe el trabajador
	 */
	public int getSalario() {
		return salario;
	}
	/**
	 *Modifica el salario que cobra el trabajador
	 * @param salario salario nuevo
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	/**
	 * 
	 * @return
	 */
	public int getHorasTrabajo() {
		return horasTrabajo;
	}


	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}


	public int getIRPF() {
		return IRPF;
	}


	public void setIRPF(int iRPF) {
		IRPF = iRPF;
	}

}


