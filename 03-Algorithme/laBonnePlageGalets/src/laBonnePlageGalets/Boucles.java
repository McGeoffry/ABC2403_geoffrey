package laBonnePlageGalets;

import java.util.Scanner;

public class Boucles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int saisie;

		do {

			System.out.println("Saisissez un chiffre entre 10 et 20");
			saisie = sc.nextInt();
			if (saisie > 20) {
				System.out.println("Plus petit");

			}
			if (saisie < 10) {
				System.out.println("Plus grand");

			}
		} while (saisie > 20 || saisie < 10);

		System.out.println("Bravo, vous avez réussi ! " + saisie);

		sc.close();

	}

}
