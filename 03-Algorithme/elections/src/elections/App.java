package elections;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		int candidat1;
		int candidat2;
		int candidat3;
		int candidat4;
		
		System.out.println("Score du candidat N°1");
		candidat1 = sc.nextInt();
		System.out.println("Score du candidat N°2");
		candidat2 = sc.nextInt();
		System.out.println("Score du candidat N°3");
		candidat3 = sc.nextInt();
		System.out.println("Score du candidat N°4");
		candidat4 = sc.nextInt();
		
		if(candidat1 > 50 ) {
			System.out.println("Candidat élu au 1er tour");
		}
		else if(candidat1 < 12.5) {
			System.out.println("Candidat battu");
		}
		
		else if(candidat1 < 50 || candidat1 > candidat2 | candidat1 > candidat3 | candidat1 > candidat4) {
			System.out.println("Candidat élu au second tour mais en ballottage défavorable");
		}
	
		else if(candidat1 > 50 || candidat1 > candidat2 | candidat1 > candidat3 | candidat1 > candidat4) {
			System.out.println("Candidat élu au second tour mais en ballottage favorable");
		}
	
			
		
		sc.close();
	}

}
