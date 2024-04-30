package categorieFoot;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int age;
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Saisir l'age souhaité");
		age = sc.nextInt();
		
		if(age < 5) {
			System.out.println("Il appartient à la catégorie 'trop jeune'");
		}
		else if(age <= 6) {
			System.out.println("Il appartient à la catégorie 'débutant'");
		}
		else if(age <= 8) {
			System.out.println("Il appartient à la catégorie 'poussins'");
		}
		else if(age <= 10) {
			System.out.println("Il appartient à la catégorie 'benjamin'");
		}
		else if(age <= 12) {
			System.out.println("Il appartient à la catégorie 'pupille'");
		}
		else if(age <= 14) {
			System.out.println("Il appartient à la catégorie 'minime'");
		}
		else if(age <= 16) {
			System.out.println("Il appartient à la catégorie 'cadet'");
		}
		else if(age <= 18) {
			System.out.println("Il appartient à la catégorie 'sénior'");
		}
		else{
				System.out.println("Il appartient à la catégorie 'vétéran'");
			}

		
		
		
		
		sc.close();
		
	}

}
