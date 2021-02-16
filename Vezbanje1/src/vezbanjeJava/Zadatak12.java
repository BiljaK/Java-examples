package vezbanjeJava;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		// Napisati program koji izraèunava (uz pomoæ while ili do while petlje) prosek
		// unetih brojeva. Brojevi
		// se uèitavaju dok korisnik ne unese nulu.

		double broj;
		double suma = 0;
		double prosek;

		Scanner sken = new Scanner(System.in);

		do {
			System.out.println("Unesite broj");
			broj = sken.nextDouble();

			if (broj == 0) {
				break;
			}
			suma += broj;

		} while (broj != 0);
		int sve = 0;
		sve++;
		prosek = suma / sve;
		System.out.println("Prosek brojeva dok se ne unese 0 je " + prosek);
	}

}
