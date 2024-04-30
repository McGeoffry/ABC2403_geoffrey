package reprographie;

import java.util.Scanner;

public class App {
	
	final static double P1 = 0.1;
	final static double P2 = 0.09;
	final static double P3 = 0.08;
	


	public static void main(String[] args) {
		
		int nbc;
		double facture;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de photocopies");
		nbc = sc.nextInt();
		
	if (nbc <= 10) {
		facture = nbc * App.P1;
	}
	
	else if (nbc <= 30) {
		facture = 10 * App.P1 + (nbc - 30) * App.P2;
	}
	
	else {
		facture = 10 * App.P1 + 20 * App.P2 + (nbc - 30) * App.P3;		
	}
	
	
	System.out.println("A payer "+ facture + "€");
	
	
	sc.close();
	}

}
