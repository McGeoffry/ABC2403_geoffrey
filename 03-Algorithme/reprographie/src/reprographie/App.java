package reprographie;

import java.util.Scanner;

public class App {
	


	public static void main(String[] args) {
		
		int nbc;
		double facture;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de photocopies");
		nbc = sc.nextInt();
		
	if (nbc <= 10) {
		facture = nbc * 0.09;
	}
	
	else if (nbc <= 30) {
		facture = 10 * 0.10 + (nbc - 30) * 0.08;
	}
	
	else {
		facture = 10 * 0.10 + 20 * 0.09 + (nbc - 30) * 0.08;		
	}
	
	
	System.out.println("A payer "+ facture + "€");
	
	
	sc.close();
	}

}
