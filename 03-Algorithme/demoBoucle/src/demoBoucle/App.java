package demoBoucle;

public class App {

	public static void main(String[] args) {

			// while --> faire une boucle   
  
		int i = 0;
		// while permet de lancer l'application en boucle tant que "i < 10'
		while(i < 10) {
			
			System.out.println("i vaut " + i); // Permet d'afficher "i vaut "
			
			//  i = i + 1;
			i++;
			}
		
		int b = 0;
		// à utiliser qd on ne connait pas le nb de boucles
		 do {
			 System.out.println("b vaut " + b);
			 b++;
		 }while(b < 10);
	
	
		 int j = 0;
		 // à utliser qd on connait le nombre de boucles à executer	
		 for(j = 0; j <= 10; j++) {
		 	System.out.println("j vaut" + j);
		 }
	}
}
