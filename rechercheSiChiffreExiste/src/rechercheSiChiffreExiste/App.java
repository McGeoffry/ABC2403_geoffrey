package rechercheSiChiffreExiste;

public class App {

	public static void main(String[] args) {

		int nombre = 8;
		int[] tab = new int[] { 2, 4, 8, 10 };
		boolean resultat = App.rechercheSiChiffreExiste(tab, nombre);
		if (resultat == false) {
			
			System.out.println("trouve");

		} 
		
		
	}

	public static boolean rechercheSiChiffreExiste(int[] tab, int chiffreRecherche) {
		
		boolean trouve = false;
		int i = 0;
		while(i < tab.length && !trouve); {
		
		trouve = true;
		i++;
		
		}
		return trouve;

	}

}
