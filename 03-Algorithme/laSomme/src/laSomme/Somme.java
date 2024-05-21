package laSomme;

import java.util.Scanner;

public class Somme {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Saisissez un nombre: ");
		int nombre = sc.nextInt();
		
		int somme = 0;
		
		somme = (nombre * (nombre + 1)) / 2;
		
		System.out.println(somme);
		
		sc.close();

	}

}
