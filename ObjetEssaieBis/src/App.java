
public class App {

	public static void main(String[] args) {
	
		System.out.println("coucou");
		double resu = App.additionner(2, 3);
		
		
		string prenom = "Geoffrey";
		string nom = "Crevel";
		String resu= App.prenomNom(prenom, nom);
	}
	
	public static double additionner(double val1, double val2) {
		double resultat = 0;
		resultat = val1 + val2;
		return resultat;
	}
	
	public static String prenomNom(String prenom, String Nom) {

		return prenom + Nom;
		
		
	}
	
}
