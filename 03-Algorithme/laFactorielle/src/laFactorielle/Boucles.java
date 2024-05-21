package laFactorielle;

import java.util.Scanner;

public class Boucles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Saisissez un nombre ");
		int nombre = sc.nextInt();
		
		int factorielle = 1;
		
		for (int saisie = 1; saisie <= nombre; saisie++) {
			factorielle *= saisie;
		}
		
		System.out.println("La factorielle de " + nombre + "est " + factorielle);
		
		
		sc.close();
	
	}

}
