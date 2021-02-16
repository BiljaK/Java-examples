package vezbanje1;

import java.util.Scanner;


public class zad8 {

	public static void main(String[] args) {
		// Napisati program koji pomocu metode omogucava unos brzine za bicikl,
		// ispisuje gresku ako je brzina veca od 5.
		// ako je brzina 1, ispise da je bicikl ponika, a ne brzinac.
		// ispisuje gresku "Bicikl ne moze da ima vise od 5 brzina."
		
		
		int rezultat = brzina();
		System.out.println("Kraj programa ");

	}

	public static int brzina() {
		int brz;
		Scanner sk = new Scanner(System.in);
			
			System.out.println("Unesite brzinu");
			brz = sk.nextInt();
			
			if (brz > 5) {
			
			System.out.println("Greska, Bicikl ne moze da ima vise od 5 brzine" );
			return brz;
			}
			else if (brz == 1) {
				System.out.println("bicikl je ponika");
				return brz;

			} else {
				System.out.println("Bicikl ima broj brzina " + brz);
				return brz;
			} 
			
		
	}
}
