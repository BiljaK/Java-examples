package vezbanjeJava;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		// Napisati program koji izraèunava prosek unetih brojeva. Korisnik sam zadaje koliko brojeva želi da
		// unese.

		int broj;
		double prosek;
		double suma = 0;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite koliko zelite brojeva da unesete ");
		broj = sken.nextInt();
		
		for (int i = 1; i <= broj; i++) {
			System.out.println("Unesite broj " + i);
			int privremena = sken.nextInt();
			suma = suma + privremena;
		}
		prosek = suma / broj;
		System.out.println("Prosek unetih brojeva je " + prosek);
		
	}

}
