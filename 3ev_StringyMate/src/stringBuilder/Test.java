package stringBuilder;

public class Test {

	public static void main(String[] args) {
		StringBuilder b1=new StringBuilder();
		StringBuilder b2= new StringBuilder("Hola");
		System.out.println(b2.toString());
		System.out.println(b2.reverse());
		b2.insert(4,"a");
		System.out.println(b2.toString());
	}

}
