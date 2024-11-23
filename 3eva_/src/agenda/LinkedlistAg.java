package agenda;

import java.util.LinkedList;

public class LinkedlistAg {

	    private LinkedList<Persona> contactos;

	    public LinkedlistAg() {
	        contactos = new LinkedList<>();
	    }

	    // Método para dar de alta un contacto
	    public void altaContacto(Persona contacto) {
	        contactos.add(contacto);
	    }

	    // Método para dar de baja un contacto
	    public void bajaContacto(Persona contacto) {
	        contactos.remove(contacto);
	    }

	    // Método para modificar un contacto
	    public void modificarContacto(Persona contacto) throws NoExisteExcepcion {
	        int index = contactos.indexOf(contacto);
	        if (index != -1) {
	            contactos.set(index, contacto);
            }else throw new NoExisteExcepcion("La persona no existe"); 
        }    		
   
	   

	    // Método para consultar la agenda completa
	    public void consultarAgenda() throws AgendaVaciaExcepcion {
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
			return "LinkedlistAg [contactos=" + contactos + "]";
		}
	    
	    
}
