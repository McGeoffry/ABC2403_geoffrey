package laBandeAPicsou;

public class App {

	public static void main(String[] args) {
		String[] bandeAPicsou = new String[] { "Riri", "Fifi", "Loulou", "et", "Picsou" };
		String resultat = conCatCanard(bandeAPicsou);
		System.out.println(resultat);

	}

	public static String conCatCanard(String[] tab) {
		String retour = "";
		for (int i = 0; i < tab.length; i++) {
			retour = retour + tab[i] + " ";
		}

		return retour;
	}

}
