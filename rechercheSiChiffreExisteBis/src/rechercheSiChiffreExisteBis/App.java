package rechercheSiChiffreExisteBis;

public class App {

	public static void main(String[] args) {
		int leChiffre = 8;
		int[] tab = new int[] { 2, 4, 6, 8, 10, 12 };
		boolean resultat = App.rechercheSiChiffreExiste(tab, leChiffre);
		if (resultat == true) {
			System.out.println("trouve");
		}
	}

	public static boolean rechercheSiChiffreExiste(int[] tab, int chiffreRecherche){
		
		boolean trouve = true;
		int i = 0;
		while (i < tab.length && !trouve) {
			if (tab[i] == chiffreRecherche) {
				trouve = true;
			}
	
			i++;
		}

		return trouve;
	}

}
