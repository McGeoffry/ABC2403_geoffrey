
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	// VARIABLE
		
		String prenom; // déclaration d'une variable "prenom" de type "chaine de caractères"
		
		Scanner scanner; // déclaration d'une variable de type "Scanner" (penser à ajouter la ligne d'"import" (cf ligne 3) )
		
		scanner = new Scanner(System.in); // Initialisation d'un nouveau Scanner
		
		
		System.out.println("Bonjour,veuillez saisir votre prénom: ");
		
		prenom = scanner.nextLine(); // Demande à l'utilisateur une saisie. 
		// Lorsque l'utilisateur valide avec "Enter", la saisie est récupéré dans la variable à gauche de signe
		
		System.out.println("Bonjour " + prenom); // Affichage
		
		
		scanner.close(); // Fermeture du "Scanner" (OBLIGATOIRE)

	}

}
