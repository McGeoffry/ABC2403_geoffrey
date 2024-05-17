package exoBycyclette;



public class App {

	public static void main(String[] args) {
		
		Boolean beauTemps;
		Boolean veloOk;
		Boolean reparationsImmediates;
		Boolean livrePossede;
		Boolean livreDispoBibliotheque;
		
		
		if(beauTemps = true) {
			System.out.println("Je vais me balader");
			if(veloOk = true) {
				System.out.println("j'irai me ballader à bicyclette");
			}
			else {
				System.out.println("Je vais chez le garagiste");
			}
			if(reparationsImmediates = true) {
				System.out.println("j'irai me ballader à bicyclette");
			}
			else {
				System.out.println("J'irai cueillir des joncs");
			}
		}
		
		if(livrePossede = false) {
			System.out.println("Je vais à la bibliothèque");
			if(livreDispoBibliotheque = true) {
				System.out.println("J'emprunte GoT");
			}
			else {
				System.out.println("J'emprunte un roman policier");
			}
			System.out.println("je rentre chez moi");
		}
		else {
			System.out.println("Je lis GoT");
		}
		System.out.println("Lecture de mon livre dans le fauteuil");
	}

}
