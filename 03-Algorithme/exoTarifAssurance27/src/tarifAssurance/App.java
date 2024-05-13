package tarifAssurance;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ansPermis = 2;
		int age;
		int bleu;
		int vert;
		int orange;
		int rouge;
		int accident;
		
		System.out.println("Entrez votre age");
		age = sc.nextInt();
		if(age < 25 || ansPermis < 2) {		
			System.out.println("Nous vous attibuons le tarif rouge");
		}
		if(age > 25 || ansPermis > 2) {
			
		}
		
		
		
		
		sc.close();
		
		
	}

}
