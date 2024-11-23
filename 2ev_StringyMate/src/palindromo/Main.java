package palindromo;

public class Main {

	public static void main(String[] args) {
		String palindromo="dabale arroz a la zorra el abad";
		String palindromo1="reconocer";
		String noPalindromo="loco";
		
		System.out.println(esPalindromo(palindromo1));
		System.out.println(esPalindromo(noPalindromo));
		System.out.println(esPalindromo(palindromo));

	}
	
	public static boolean esPalindromo(String string) {
		string = string.replaceAll("\\s+", "");
		boolean r=false;
		for (int i=0; i<string.length();i++) {
			if (string.charAt(i)==string.charAt(string.length()-1-i)) {
				r=true;
			}
		}
		return r;
		}

}

