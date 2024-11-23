package agenda;

import java.util.LinkedHashSet;

public class LinkedhasSetag {
	
    private LinkedHashSet <Persona> contactos;

    public LinkedhasSetag() {
        contactos = new LinkedHashSet<>();
    }

    // Método para dar de alta un contacto
    public void altaContacto(Persona contacto) {
        contactos.add(contacto);
    }

    // Método para dar de baja un contacto
    public void bajaContacto(Persona contacto) {
        contactos.remove(contacto);
    }

    // Método para consultar la agenda completa
    public void consultarAgenda() throws Exception{
        if (contactos.isEmpty()) {
            throw new AgendaVaciaExcepcion("la agenda esta vacia");
        } else {
            for (Persona contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }

    // Método para consultar un contacto por nombre
    public Persona consultarContactoPorNombre(String nombre) {
        for (Persona contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    // Método para consultar un contacto por teléfono
    public Persona consultarContactoPorTelefono(int telefono) throws Exception{
    	Persona r= new Persona();
        for (Persona contacto : contactos) {
            if (contacto.getTlf()==telefono) {
                r=contacto;
            }else{
        	throw new NoExisteExcepcion("La persona no existe"); 
        	}    		
         }
        return r;
 }

	@Override
	public String toString() {
		return "LinkedhasSetag [contactos=" + contactos + "]";
	}
    

}
