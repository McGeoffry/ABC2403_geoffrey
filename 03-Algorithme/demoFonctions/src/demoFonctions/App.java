package demoFonctions;

public class App {

	public static void main(String[] args) {

		System.out.println("Démo sur les fonctions");

		App.helloWorld();
		App.hello("Mike");
		App.hello("Paul");

		int somme = calculerSomme(7, 3);
		System.out.println(somme);

	}

	public static void helloWorld() {
		System.out.println("Hello World !");
	}

	public static void hello(String prenom) {

		System.out.println("Hello " + prenom);
	}

	public static int calculerSomme(int a, int b) {
		int resultat = a + b;
		return resultat;
	}

}
