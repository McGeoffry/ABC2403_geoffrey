package positifOuNegatif;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombre;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre nombre ");
		
		nombre = sc.nextInt();
		
		if(nombre > 0)
			
			
			System.out.println(nombre + " est un nombre positif");
		
		else if(nombre < 0)
			
			System.out.println(nombre + " est un nombre négatif");
		
		else
			
			System.out.println(nombre + " n'est ni positif, ni négatif");

	
			sc.close();
		
	
	}

}
