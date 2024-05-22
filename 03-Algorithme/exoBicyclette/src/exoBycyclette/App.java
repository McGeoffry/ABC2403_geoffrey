package exoBycyclette;



public class App {

	public static void main(String[] args) {
		
		Boolean beauTemps = true;
		Boolean veloOk = true;
		Boolean reparationsImmediates = true;
		Boolean livrePossede = false;
		Boolean livreDispoBibliotheque = true;
		
		
		if (beauTemps) {
			
			if (veloOk) {
				System.out.println("J'irai me balader à bicyclette");
			}
			
			else {
				System.out.println("Je vais chez le garagiste");
				if (reparationsImmediates) {
					System.out.println("J'irai me ballader à bicyclette");
				}
				else {
					System.out.println("J'irai cueillir des joncs");
				}
			}
		
			}
		else {
			System.out.println("Je vais lire un livre");
			if (livrePossede) {
				System.out.println("Je vais à la bibliothèque");
				if (livreDispoBibliotheque) {
					System.out.println("J'emprunte un roman GoT");
				}
				else {
					System.out.println("J'emprunte un roman policier");
				}
			}
			else {
				System.out.println("Je rentre chez moi");
			}
		}
		
	System.out.println("Lecture de mon livre dans le fauteuil");
	}

}
