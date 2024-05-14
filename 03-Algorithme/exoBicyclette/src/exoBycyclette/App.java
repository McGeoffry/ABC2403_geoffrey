package exoBycyclette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Boolean beauTemps;
		Boolean veloOk;
		Boolean reparationsImmediates;
		Boolean livrePossede;
		Boolean livreDispoBibliotheque;
		Scanner Sc = new Scanner(System.in);
		
		beauTemps = sc.nextBoolean();
		if(beauTemps = TRUE) { 
			System.out.println("Je vais me balader");
           if(veloOk = TRUE) {
        	   System.out.println("J'irai me balader à bicyclette");
           }
           else {
        	   System.out.println("Je vais chez le garagiste");
           }
           		if(reparationsImmediates = TRUE) {
           			System.out.println("J'irai me balader à bicyclette");
           		}
           		else {
           			System.out.println("J'irai cueillir des joncs");
           		}
		}
		
	sc.close();	
	
	}

}
