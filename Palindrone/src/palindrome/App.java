package palindrome;

public class App {

	public static void main(String[] args) {
		
		String[] mot = new String[] { "L", "A", "V", "A", "L" };

		boolean resultat = estUnPalindrome("LAVAL");
		if(resultat == true){
			for(int i = 0; i < mot.length ; i++) {
			System.out.println(resultat + " est un palindrome");
			}
			for(int j = 0; j < mot.length - 1; j++);
	  }
				
	   {
			boolean resultat2 = estUnPalindrome("COUCOU");
			
			
		System.out.println(resultat2 + " n'est pas un palindrome");
			
		}
	}

	public static boolean estUnPalindrome(String mot) {
		boolean ok = true;
		int i = 0;
		int j = mot.length() - 1 - i;
		while (!ok == false && i < mot.length() / 2) {
			if (mot.charAt(i) != mot.charAt(j)) {
				ok = false;
			}
			i++;
			j = mot.length() - 1 - i;
		}

		return ok;

	}
}
