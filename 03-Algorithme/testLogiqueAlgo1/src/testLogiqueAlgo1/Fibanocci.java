package testLogiqueAlgo1;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Suite de Fibonacci. Combien de nombre de la suite voulez vous afficher ?");
		int n = sc.nextInt();
	
		int position = 2;
		String resultat;
		double nbPrecedent;
		double nbCourant;
		double nbSuivant;
		
		if (n > 2) {
			while (position < n) {
				nbSuivant = sc.nextDouble();
				nbCourant = sc.nextDouble();
				nbPrecedent = sc.nextDouble();
				position = sc.nextInt();
				nbSuivant = nbPrecedent + nbCourant;
				resultat = sc.nextLine();
				resultat = resultat + "" + nbSuivant;
				nbPrecedent = nbSuivant;
				position = position + 1;
				position++;
								}
		}else {
			n = 2;
			  }
		
		resultat = sc.nextLine();
		System.out.println("Les" + n + "premiers nombres de la suites de Fibanocci sont \n " + resultat );
	
		
		
		
		
		sc.close();
	}

}
