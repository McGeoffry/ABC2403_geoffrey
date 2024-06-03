package exoTableau46;

public class App {

	public static void main(String[] args) {
		int[] tableau1;
		int[] tableau2;
		int resultat;
		
		resultat = 0;
		tableau1 = new int[] {
				4, 8, 7, 12 };
		tableau2 = new int[] { 3, 6};

		for(int i = 0; i < tableau1.length; i++) {
			
			for (int j = 0; j < tableau2.length; j++) {
				resultat += tableau1[i] * tableau2[j];	
				System.out.println(resultat);
				}
		}
}
}