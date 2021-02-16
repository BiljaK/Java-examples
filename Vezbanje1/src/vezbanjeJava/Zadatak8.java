package vezbanjeJava;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		// Napisati Java program koji za uneti niz n celih brojeva, pomoæu
		// metode utvrðuje podniz parnih brojeva, a potom ga ispisuje

		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj ");
		int broj = sken.nextInt();

		int[] niz = new int[broj];

		for (int i = 0; i < broj; i++) {
			System.out.println("Unesite vrednost " + (i + 1));
			niz[i] = sken.nextInt();

			int[] parniBroj = podnizParnih(niz);
			for (int j = 0; j < parniBroj.length; j++) {
				System.out.println("Podniz parnih brojeva je: " + parniBroj + ", ");
			}
		}

	}

	private static int[] podnizParnih(int[] niz) {
		int parniBr = 0;

		for (int j = 0; j < niz.length; j++) {
			int i = 0;
			if (niz[i] % 2 == 0) {
				parniBr++;
			}
		}
		int[] rez = new int[parniBr];
		int temp = 0;
		for (int i = 0; i < rez.length; i++) {
			if (niz[i] % 2 == 0) {
				rez[temp] = niz[i];
				temp++;
			}

		}
		return rez;

	}
}
