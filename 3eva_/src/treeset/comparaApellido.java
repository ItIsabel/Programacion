package treeset;

import java.util.Comparator;

public class comparaApellido implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.getApellidos().compareTo(o2.getApellidos());
	}

}
