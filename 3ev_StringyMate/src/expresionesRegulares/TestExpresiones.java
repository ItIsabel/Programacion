package expresionesRegulares;

import java.util.regex.Pattern;

public class TestExpresiones {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("A.C", "ABC"));
		System.out.println(Pattern.matches("A.C", "A2C"));
		String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
		System.out.println(Pattern.matches(dniRegexp, "01234567C"));
		
		String emailRegexp = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";
		System.out.println(Pattern.matches(emailRegexp, "a@b.com"));
	}

}
