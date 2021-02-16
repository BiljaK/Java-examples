package vezbanjeJava;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// Napisati Java program koji za uneti niz n celih brojeva pronalazi i ispisuje
		// one
		// koji su parni

		int broj;

		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		broj = sken.nextInt();

		int niz[] = new int[broj];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite vrednosti " + (i + 1));
			niz[i] = sken.nextInt();
		}

		for (int i = 0; i < broj; i++) {
			if (niz[i] % 2 == 0) {
				System.out.println("Parni brojevi niza su " + niz[i]);
			}

		}

	}

}
