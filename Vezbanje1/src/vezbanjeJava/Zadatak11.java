package vezbanjeJava;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
		// Napisati program koji izra�unava (uz pomo� do while) sumu unetih brojeva. Brojevi se u�itavaju
		// dok korisnik ne unese nulu.
		
		double broj;
		double suma = 0;
		
		Scanner sken = new Scanner(System.in);
		
		do {
			System.out.println("Unesite broj");
			broj = sken.nextDouble();
			
			if (broj == 0) {
				break;
			}
			suma += broj;
		} while (broj != 0);
		System.out.println("Suma brojeva dok se ne unese 0 je " + suma);
		

	}

}
