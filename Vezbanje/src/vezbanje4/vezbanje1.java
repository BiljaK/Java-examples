package vezbanje4;

import java.util.Scanner;

public class vezbanje1 {

	public static void main(String[] args) {
		        //uneti 5 brojeva koristeci petlju
				//ispisati koji je najveci od unetih
				// Primer ispisa: najveci broj od unetih je 23
		
		int broj = 0;
		int najveci = 0;
		
		Scanner sken = new Scanner(System.in);
		
		for (int i = 1; i < 5; i++) {
			
			System.out.println("Uneti broj");
			broj = sken.nextInt();
		
			
			if (broj > najveci) {
				najveci = broj;
			}
		}
		System.out.println("Najveci broj od unetih je " + najveci);

	}

}
