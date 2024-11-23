package myString;

public class main {

	public static void main(String[] args) {
		MyString uno=new MyString("Hola");
		try {			
			System.out.println(uno.myToString());
			MyString r=uno.mySubstring(1, 3);
			System.out.println(r.myToString());
			MyString upper=uno.myToUpperCase();
			System.out.println(upper.myToString());
			upper.myToLowerCase();
			System.out.println(upper.myToString());

		}
		catch (Exception e) {
			e.getMessage();
		};

}
}
