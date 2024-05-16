package exoBoucles;

import java.util.Scanner;

public class Boucle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int i;

		System.out.println("Saisissez un chiffre entre 1 et 3 : " );
		i = sc.nextInt();
		
		while (i < 1 || i > 3) {
			System.out.println("Saisissez un chiffre entre 1 et 3 : " );
			i = sc.nextInt();
		}
		
		System.out.println("Bravo, vous avez réussi !.");
		
		sc.close();
	}

}
