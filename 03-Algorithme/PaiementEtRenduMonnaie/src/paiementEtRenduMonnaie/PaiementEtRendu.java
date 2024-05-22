package paiementEtRenduMonnaie;

import java.util.Scanner;


public class PaiementEtRendu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int prix;
		int billets5;
		int nbBillets;
		double total;
		double rendu;
		
		System.out.println("Saisissez un prix");
		prix = sc.nextInt();
		if (prix != 0) {
			billets5 = sc.nextInt();
			total = sc.nextDouble();
			total = total + billets5;		
		}
		else {
			System.out.println("Erreur");
		}
		rendu = sc.nextDouble();
		billets5 = sc.nextInt();
		rendu = billets5 * 5;
		total = sc.nextDouble();
		System.out.println("Le total est " + total + "€");
		System.out.println("Le client doit donner " + billets5 + "billets de 5€");
		nbBillets = billets5 * 5;
	
		
		sc.close();
	}

}
