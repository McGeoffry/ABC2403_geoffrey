package demoBoucle;

public class App {

	public static void main(String[] args) {

			// while --> faire une boucle   
  
		/**
		 * TANT QUE i <= 10
		 * 	ECRIRE "i vaut ", i
		 *  i++
		 * FIN TANT QUE
		 */
		int i = 0;
		// while permet de lancer l'application en boucle tant que "i < 10'
		while(i < 10) {
			
			System.out.println("i vaut " + i); // Permet d'afficher "i vaut "
			
			//  i = i + 1;
			i++;
			}
		
		int b = 0;
		/**
		 * FAIRE 
		 * 	ECRIRE "i vaut ", i
		 *  i++
		 * TANT QUE <= 10
		 */
		// à utiliser qd on ne connait pas le nb de boucles
		 do {
			 System.out.println("b vaut " + b);
			 b++;
		 }while(b < 10);
	
	
		 int j = 0;
		 // à utliser qd on connait le nombre de boucles à executer	
		 /**
			 * POUR j de 0 à 10, j++
			 * 	ECRIRE "j vaut ", j
			 * FIN POUR
			 */
		 for(j = 0; j <= 10; j++) {
		 	System.out.println("j vaut" + j);
		 }
	}
}
