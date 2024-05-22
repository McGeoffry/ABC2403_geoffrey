package etLePlusGrandEstBis;

import java.util.Scanner;

public class Boucles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nombre;
		int nombreMax = Integer.MIN_VALUE; // Initialiser le maximum avec la valeur minimale possible pour un entier
		
		
		// Demander des nombres à l'utilisateur jusqu'à ce qu'il entre 0
		System.out.println("Saisissez un nombre (0 pour arrêter)");
		
		do {
			nombre = sc.nextInt();
			
			// Mettre à jour le maximum si le nombre saisi est supérieur
			if (nombre > nombreMax) {
				nombreMax = nombre;
			}
		}
		while (nombre != 0);
		
		// Afficher le plus grand nombre
		System.out.println("Le plus plus grand nombre est: " + nombreMax);
		
		
		sc.close();
	
	}

}