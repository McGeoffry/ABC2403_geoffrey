package lesNombresSuivants;

import java.util.Scanner;

public class Boucles {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
	    
	    System.out.println("Saisissez un nombre: ");
	    int nombre = sc.nextInt();
	    
	    int saisie = 1;
		while (saisie <= 10) {
			int nbDepart = nombre + saisie;
			System.out.println("Les 10 nombres après "+ nbDepart + " " );
			saisie ++;
		}
		
		
		sc.close();
	}

}
