package vezbanjeJava;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati Java program koji nakon unosa broja n omoguæava unos niza elemenata tipa float i
//		dužine n, a potom odgovarajuæim metodama, utvrðuje i ispisuje:
//		(a) najmanju vrednost niza; (b) najveæu vrednost niza; (c) srednju vrednost elemenata niza

		// int broj = 0;
//		float[] niz = new float[broj];

		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite duzinu niza ");
		int broj = sken.nextInt();
		
		float[] niz = new float[broj];
		
		for (int i = 0; i < broj; i++) {
			System.out.println("Unesite vrednost " + (i + 1));
			niz[i] = sken.nextFloat();

		}
		System.out.println("Najmanja vrednost je " + najmanja(niz));

		System.out.println("Najveca vrednost je " + najveca(niz));

		System.out.println("Srednja vrednost je " + srednja(niz));

	}

	public static float najmanja(float[] niz) {

		float rez = 0;

		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < rez) {
				rez = niz[i];
			}

		}
		return rez;

	}

	public static float najveca(float[] niz) {

		float rez = 0;

		for (int i = 1; i < niz.length; i++) {
			if (niz[i] > rez) {
				rez = niz[i];
			}

		}
		return rez;

	}

	public static float srednja(float[] niz) {
		float suma = 0;

		for (int i = 0; i < niz.length; i++) {
			suma = suma + niz[i];
		}

		return suma / niz.length;
	}

}
