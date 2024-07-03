package palindrome;

public class App {

	public static void main(String[] args) {

		String mot = "LAVAL";

		boolean resultat = estUnPalindrome(mot);

		if (resultat == true) {
			for (int i = 0; i < mot.length(); i++) {
				System.out.print(mot.charAt(i));
			}
			System.out.println(" est un palindrome");

		}
		else {
			System.out.println(" n'est pas un palindrome");
		}

		String mot2="COUCOU";
		boolean resultat2 = estUnPalindrome(mot2);
		
		for (int i = 0; i < mot2.length(); i++) {
			System.out.print(mot2.charAt(i));
		}

		if (resultat2 == true) {
			System.out.println(" est un palindrome");

		}
		else {
			System.out.println(" n'est pas  un palindrome");	
		}
		
			

	
	}

	public static boolean estUnPalindrome(String mot) {
		boolean ok = true;
		int i = 0;
		int j = mot.length() - 1 - i;
		while ( i < mot.length() / 2 && !ok ) {
			if (mot.charAt(i) != mot.charAt(j)) {
				ok = false;
			}
			i++;
			j = mot.length() - 1 - i;
		}

		return ok;

	}
}
