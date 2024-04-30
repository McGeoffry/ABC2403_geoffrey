package positifEtNegatifBisBis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double nb1;
		double nb2;
		double nb3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir votre premier nombre");
		
		nb1 = sc.nextDouble();
		
		System.out.println("Saisir votre second nombre");
		
		nb2 = sc.nextDouble();
		
		
			nb3 = nb1 * nb2;
	
		System.out.println(nb3);
	
	if(nb3 >= 0 ) {
		
		System.out.println("Votre résultat est positif");
	}
	else
		
		System.out.print("votre résultat est négatif");
		
		
		
	
		sc.close();
	}

}
