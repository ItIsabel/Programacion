package treeset;

public class Cliente extends Persona implements Comparable<Cliente>{
	String id;

	public Cliente(String id,String nombre, String apellidos) {
		super(nombre, apellidos);
		this.id=id;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Cliente o) {
		return this.id.compareTo(o.id);
	}

	@Override
	public String toString() {
		return super.toString()+"Cliente -id=" + id + "\n";
	}


}
