package calculAireEtSphere;

import java.util.Scanner;
import java.lang.Math;

public class App {

	public static void main(String[] args) {
		
		
		double nombre;
		double aire;
		double volume;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre rayon: ");

		nombre = sc.nextDouble();
		
		
		aire = 4.0 * Math.PI * Math.pow(nombre, 2);
		
		volume = 4.0 * Math.PI * Math.pow(nombre, 3) / 3;
		
		System.out.println("");
		
		System.out.println("L'aire de votre spère est d'un rayon est de " + aire);
		
		System.out.println("");
		
		System.out.println("Le volume de votre sphère est de " + volume);
				
				
		sc.close();
		
		
	}

}
