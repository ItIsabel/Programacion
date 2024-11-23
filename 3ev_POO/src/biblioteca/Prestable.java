package biblioteca;
/**
 * Interface Prestable que obliga a implementar los metodos
 */
public interface Prestable {
	public String prestar() throws Exception;
	public void devolver();
	public boolean prestado();

}
