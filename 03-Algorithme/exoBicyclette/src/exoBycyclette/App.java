package exoBycyclette;



public class App {

	public static void main(String[] args) {
		
		Boolean beauTemps = true;
		Boolean veloOk = true;
		Boolean reparationsImmediates = true;
		Boolean livrePossede = false;
		Boolean livreDispoBibliotheque = true;
		
		if(beauTemps == true) { 
			System.out.println("Je vais me balader");
			
           if(veloOk == true) {
        	   System.out.println("J'irai me balader à bicyclette");
           }
           else {
        	   System.out.println("Je vais chez le garagiste");
           }
           
           		if(reparationsImmediates == true) {
           			System.out.println("J'irai me balader à bicyclette");
           		}
           		else {
           			System.out.println("J'irai cueillir des joncs");
           		} 
		}
		else {
			System.out.println("Je vais lire un livre");
		}
		
		livrePossede = false;
		if(livrePossede = false) {
			System.out.println("Je vais à la bibilothèque");
			livreDispoBibliotheque = true;
			if(livreDispoBibliotheque = true) {
				System.out.println("J'empreinte GoT");
			}
			else {
				System.out.println("J'empreinte un roman policier");
			}
			System.out.println("Je lis GoT");
		}
		System.out.println("Lescture de mon livre dansle fauteil");

	
	}

}
