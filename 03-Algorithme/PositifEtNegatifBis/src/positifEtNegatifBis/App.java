package positifEtNegatifBis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombre1;
		int nombre2;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre premier nombre ");
		
		nombre1 = sc.nextInt();
		
		if(nombre1 > 0)
			
			System.out.println(nombre1 + " est un nombre positif");
		
		else if(nombre1 < 0)
			
			System.out.println(nombre1 + " est un nombre négatif");
		
		else
			
			System.out.println(nombre1 + " n'est ni positif, ni négatif");
		
		
			
			System.out.println("Veuillez saisir votre second nombre");
			
		nombre2 = sc.nextInt();
			
		if(nombre2 > 0)
				
			System.out.println(nombre2 + " est un nombre positif" );
		
		else if(nombre2 < 0)
			
			System.out.println(nombre2 + " est un nombre négatif");
		
		else
			System.out.println(nombre2 + " n'est ni positif, ni négatif");

	
			sc.close();


	}

}
