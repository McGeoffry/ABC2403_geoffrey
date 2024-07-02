package palindrome;

public class App {

	public static void main(String[] args) {
		boolean resultat = estUnPalindrome("LAVAL");
		String[] mot = new String[] {"L", "A", "V", "A", "L"};
	
	
	boolean resultat2 = estUnPalindrome("COUCOU");
	}

	public static boolean estUnPalindrome(String mot) {
		boolean ok = false;
		int i = 0;
		int j = mot.length() - 1 - i;
		while (!ok == false && i < mot.length() / 2) {
			if (mot.charAt(i) != mot.charAt(j - 1)) {
				ok = true;
			}
			i++;
			j = mot.length() - 1 - i;
		}

		return ok;

	}
}
