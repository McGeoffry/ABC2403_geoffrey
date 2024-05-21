package exoBoucles;

import java.util.Scanner;

public class Boucle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int saisie;

		System.out.println("Saisissez un chiffre entre 1 et 3 : " );
		saisie = sc.nextInt();
		
		while (saisie < 1 || saisie > 3) {
			System.out.println("Saisissez un chiffre entre 1 et 3 : " );		
		}
		
		System.out.println("Bravo, vous avez réussi !.");
		
		sc.close();
	}

}
