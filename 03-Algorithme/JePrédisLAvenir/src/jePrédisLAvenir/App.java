package jePrédisLAvenir;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		
		int h;
		int min;
		int hmin;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir heures");
		h = sc.nextInt();
	if(h > 12) {
		System.out.println("Les données saisies sont invalide");
	}
		
		System.out.println("Saisir minutes");
		min = sc.nextInt();
	if(min > 59) {
			System.out.println("Les données saisies sont invalide");
		}
		
		hmin = min + 3;
		
		
		
			System.out.println("Dans 3 minutes, il sera " + h + "h " + hmin + "min");
		
	
		
		
		sc.close();
		
	}

}
