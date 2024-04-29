package calculSurface;


import java.util.Scanner;
import java.lang.Math;

public class App {

	public static void main(String[] args) {
		
		
		
		double nombre;
		double corner;
		double surface;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre rayon: ");
		
		nombre = sc.nextDouble();
		
		System.out.println("Veuillez saisir l'angle: " + "degrès");
		
	
		corner = sc.nextDouble();
		
		surface = (Math.PI * Math.pow(nombre, 2) * corner ) / 360;
		
		System.out.println("");
		
		System.out.println("L'aire du secteure circulaire est de: " + surface);
		
		System.out.println("");
		
		
		sc.close();
		
		
		
		
		
		
		
	}
		

			
}
