
public class App {

	public static void main(String[] args) {
	
		System.out.println("Bonjour");
		double resu = App.additionner(2, 3);
	
		String resultat = App.prenomNom("Geoffrey", "Crevel");
		String prenom = "Geoffrey";
		String nom = "Crevel";
		System.out.println(resultat);
		
		String resultat1 = App.disBonjour("Bonjour");
		System.out.println("Bonjour" + resultat1);
	}
	
	public static double additionner(double val1, double val2) {
		double resultat = 0;
		resultat = val1 + val2;
		return resultat;
	}
	
	public static String prenomNom(String prenom, String nom) {
		
	
		String retour;
		retour = prenom + nom;
		return retour;
		
		
	}
	
	public static String disBonjour(String prenom1) {
		
		String retour;
		retour = prenom1;
		return retour;
	}
	
}
