package exotableau45;

public class App {

	public static void main(String[] args) {
		int[] tableau1;
		int[] tableau2;
		int[] tableau3;
		

		tableau1 = new int[] { 4, 8, 7, 9, 1, 5, 4, 6 };

		tableau2 = new int[] { 7, 6, 5, 2, 1, 3, 7, 4 };
		
		tableau3 = new int[8];

		for (int i = 0; i < tableau1.length; i++) {

			
				tableau3[i] = tableau1[i] += tableau2[i];
			}

			

		

	}

}
