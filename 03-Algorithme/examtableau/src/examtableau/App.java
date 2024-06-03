package examtableau;

public class App {

	public static void main(String[] args) {

		System.out.println("Bienvenue dans le programme de calcul du tableau d'entier");
		System.out.println("");
		int somme;
		float moyenne;
		int carre;
		int[] tableau = new int[] { 2, 4, 1, 8, 6, 14, 23, 25, 7, 42 };

		somme = 0;
		for (int i = 0; i < tableau.length; i++) {
			somme += tableau[i];
		}
		moyenne = (int) somme / (int) tableau.length;

		System.out.println("Moyenne des valeurs du tableau: " + moyenne);
		System.out.println("");
		carre = 42 * 42;
		System.out.println("Valeur la plus grande élevée au carré : " + carre);

	}

}
