package exoFonctions;

public class App {

	public static void main(String[] args) {
		

		
		// Ecrire une procedure qui calcule et affiche le périmètre d'un triangle.
		
		
		int a = 20;
		int b = 30;
		int c = 40;
		
	App.calculerPerimetreTriangle(a, b, c);
		
		// Le programme doit afficher : 90.
	}
	public static void calculerPerimetreTriangle(int a1, int b1, int c1)
	{
		int resultat = a1 + b1 + c1;

		System.out.println("Le périmètre du triangle est de " + resultat);
	
	}
}
