package exoFonctions;

public class App {

	public static void main(String[] args) {
		

		
		// Ecrire une procedure qui calcule et affiche le périmètre d'un triangle.
		
		
		int a = 20;
		int b = 30;
		int c = 40;
		
	App.calculerPerimetreTriangle(a, b, c);
		
		// Le programme doit afficher : 90.
	
	int[] valeurs = new int[] {1, 3, 5, 7, 3, 4, 2, 4, 22};
	App.calculerMoyenne(valeurs);
	}
	public static void calculerPerimetreTriangle(int a1, int b1, int c1)
	{
		int resultat = a1 + b1 + c1;

		System.out.println("Le périmètre du triangle est de : " + resultat);
	
	}
	// calcule et affiche la moyenne des valeurs d'un tableau
			// @param tableau le tableau de valeurs
	
	public static void calculerMoyenne(int[] tableau) {
		int somme;
		float moyenne;
		
		for(int i = 0; i < tableau.length; i++) {
			//somme = somme + tableau[i];
			somme += tableau[i];
		}
		moyenne = (float)somme / (float)tableau.length;
		
		System.out.println(moyenne);
	}
}
