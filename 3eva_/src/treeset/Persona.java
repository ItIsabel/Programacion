package treeset;

/**
 * Clase que representa a una persona.
 * 
 * @author [Su nombre]
 * @version 1.0
 * @since 2024-04-28
 */
public class Persona {

    /**
     * Nombre de la persona.
     */
    private String nombre;

    /**
     * Apellidos de la persona.
     */
    private String apellidos;

    /**
     * Número de teléfono de la persona.
     */
    private int tlf;

    /**
     * Constructor de la clase `Persona`.
     * 
     * @param nombre Nombre de la persona.
     * @param apellidos Apellidos de la persona.
     * @param tlf Número de teléfono de la persona.
     */
    public Persona(String nombre, String apellidos, int tlf) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tlf = tlf;
    }

    /**
     * Devuelve una cadena de texto con el nombre y apellidos de la persona.
     * 
     * @return Cadena de texto con el nombre y apellidos de la persona.
     */
    @Override
    public String toString() {
        return this.nombre + " " + this.apellidos;
    }

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre Nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos de la persona.
     * 
     * @return Apellidos de la persona.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos de la persona.
     * 
     * @param apellidos Nuevos apellidos de la persona.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene el número de teléfono de la persona.
     * 
     * @return Número de teléfono de la persona.
     */
    public int getTlf() {
        return tlf;
    }

    /**
     * Establece el número de teléfono de la persona.
     * 
     * @param tlf Nuevo número de teléfono de la persona.
     */
    public void setTlf(int tlf) {
        this.tlf = tlf;
    }
}
	
