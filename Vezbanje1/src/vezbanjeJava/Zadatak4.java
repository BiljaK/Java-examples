package vezbanjeJava;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// Napisati Java program koji omoguæava korisniku unos niza n celih brojeva i
		// potom ispisuje najmanji od njih, najveæi od njih, njihov zbir i srednju
		// vrednost

		int broj;

		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		broj = sken.nextInt();

		int niz[] = new int[broj];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite vrednosti " + (i + 1));
			niz[i] = sken.nextInt();
		}
		for (int i = 0; i < niz.length; i++) {
			int najmanji = 0;
			if (niz[i] < najmanji) {
				najmanji = niz[i];

			}
			System.out.println("Najmanji broj je " + najmanji);
		}
		for (int i = 1; i < niz.length; i++) {
			int najveci = 0;
			if (niz[i] > najveci) {
				najveci = niz[i];
			}
			System.out.println("Najveci broj je " + najveci);
		}
		for (int i = 0; i < broj; i++) {
			double zbir = 0;
			zbir = zbir + niz[i];

			System.out.println("Zbir brojeva je " + zbir);
		}
		for (int i = 0; i < broj; i++) {
			double suma = 0;
			suma = suma + niz[i];
			double srVrednost = suma / niz[i];
			System.out.println("Srednja vrednost je " + srVrednost);
		}
	}
}
