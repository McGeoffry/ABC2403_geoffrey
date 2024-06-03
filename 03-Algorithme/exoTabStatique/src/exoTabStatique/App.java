package exoTabStatique;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String saisieUtilisateur;
		
		String[] legumePrix = new String[1];
		
		String[] legumePrix2;
		
		do {
			System.out.println("Saisissez un légume et son prix");
			
			saisieUtilisateur= sc.nextLine();
			
			if(!saisieUtilisateur.equals("go")) {
			
			legumePrix[legumePrix.length - 1] = saisieUtilisateur; 
			
			legumePrix2 = new String[legumePrix.length + 1];
			
			System.arraycopy(legumePrix, 0, legumePrix2, 0, legumePrix.length );
			
			legumePrix = legumePrix2;
			}
			
		}while (!saisieUtilisateur.equals("go"));
		
			/* lire le tableau à l'envers */
			for(int i = legumePrix.length - 1; i >= 0; i--){
				System.out.println(legumePrix[i]);
		}
		
			for(int i = 0; i < legumePrix.length; i++){
			
		}
		
		
		
		
		sc.close();
	}

}
