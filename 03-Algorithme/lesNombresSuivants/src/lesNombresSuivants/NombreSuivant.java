package lesNombresSuivants;

import java.util.Scanner;

public class NombreSuivant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Saisissez un nombre");
		int nombre = sc.nextInt();

		for (int saisie = 1; saisie <= 10; saisie++) {
			int nbSuivant = nombre + saisie;
			System.out.println(nbSuivant + " ");
		}

		sc.close();
	}

}
