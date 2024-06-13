import java.text.SimpleDateFormat;
import java.util.Date;
public class App {

	public static double additionner(double val1,double val2) {
		
		double resultat = 0;
		resultat = val1 + val2;
		return resultat;
	}
	
	public static String prenomNom(String prenom, String nom) {
		
		String retour;
		
		retour = prenom + " " + nom;
		
		return retour;
	}
	
	public static void afficherJourHeureDuMoment() {
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = new Date();
		
		System.out.println(s.format(date));
	}
	
	public static void main(String[] args) {
		
		String prenom = "Allan";
		
		String nom = "Vitu";
		
		String resultat = App.prenomNom(prenom, nom);
		
		System.out.println(resultat);
		
		double resultat2 = App.additionner(2, 3);
		
		App.afficherJourHeureDuMoment();
	}
}
