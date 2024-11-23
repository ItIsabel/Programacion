package agenda;

public class MainAgenda {

	public static void main(String[] args) {
		Persona p1=new Persona("Manuel","Alvarez",638823);
		Persona p2= new Persona("Silvia","Martin", 69493292);
		Persona p3= new Persona("Luis","Barahona",2949392);
		//CREAR AGENDAS CON DISTINTAS CLASES
		LinkedhasSetag lhs=new LinkedhasSetag();
		TreeSetag ts=new TreeSetag();
		HashSetag hs= new HashSetag();
		LinkedlistAg ll= new LinkedlistAg();
		//añado contactos a las agendas
		lhs.altaContacto(p1);
		lhs.altaContacto(p2);
		lhs.altaContacto(p3);
		ts.altaContacto(p1);
		ts.altaContacto(p2);
		ts.altaContacto(p3);
		hs.altaContacto(p1);
		hs.altaContacto(p2);
		hs.altaContacto(p3);
		ll.altaContacto(p1);
		ll.altaContacto(p2);
		ll.altaContacto(p3);				
		//imprime cada agenda
		System.out.println("linked has set" + lhs.toString());
		System.out.println("tree set" + ts.toString());
		System.out.println("hash set" + hs.toString());
		System.out.println("Linked list" + ll.toString());

	}

}
