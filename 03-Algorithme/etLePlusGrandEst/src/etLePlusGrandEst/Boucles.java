package etLePlusGrandEst;

import java.util.Scanner;

public class Boucles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int leNombreMax = Integer.MIN_VALUE; // Initialiser le maximum avec la valeur minimale possible pour un entier
		
		System.out.println("Saisissez 20 nombres ");
		
		// Demander 20 nombres à l'utilisateur
		for (int saisie = 1; saisie <= 20; saisie++) {
			System.out.println("Nombre " + saisie + ": ");
			int nombre = sc.nextInt();
			
			// Mettre à jour le maximum si le nombre saisi est supérieur
			if (nombre > leNombreMax) {
				leNombreMax = nombre;
			}
		}
		
		// Afficher le plus grand nombre
		System.out.println("Le plus grands nombre saisie est: " + leNombreMax );
		
		sc.close();


	}

}
