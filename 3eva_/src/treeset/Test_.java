package treeset;

import java.util.TreeSet;

public class Test_ {

	public static void main(String[] args) {
		TreeSet<Cliente> ts1=new TreeSet<Cliente>();
		ts1.add(new Cliente("1", "Luis", "Albero"));
		ts1.add(new Cliente("3", "Auis", "Albero"));
		ts1.add(new Cliente("2", "Cuis", "Albero"));
		
		System.out.println(ts1.toString());
		TreeSet<Cliente> ts2=new TreeSet<Cliente>(new comparaApellido());
		ts2.add(new Cliente("1", "Luis", "Albero"));
		ts2.add(new Cliente("3", "Auis", "Glbero"));
		ts2.add(new Cliente("2", "Cuis", "Clbero"));
		System.out.println(ts2.toString());
		
		TreeSet<Cliente> ts3=new TreeSet<Cliente>(new compararNombre());
		ts3.add(new Cliente("1", "Luis", "Albero"));
		ts3.add(new Cliente("3", "Auis", "Glbero"));
		ts3.add(new Cliente("2", "Cuis", "Clbero"));
		System.out.println(ts3.toString());

	}

}
