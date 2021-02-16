package vezbanjeJava;

import java.util.Scanner;

public class Zadatak18 {

	public static void main(String[] args) {
		// Napisati program koji koristeæi metod stepen izracunava stepen unetog broja.
		// Od korisnika tražiti i
		// unos broja i stepena na koji se broj podiže.

		int broj, stepen;

		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj koje ce se stepenovati: ");
		broj = sken.nextInt();
		System.out.println("Unesite stepen: ");
		stepen = sken.nextInt();

		broj = stepenovanje(broj, stepen);
		System.out.println("Stepen broja je: " + broj);

	}

	public static int stepenovanje(int a, int b) {
		int num = 1;

		for (int i = 0; i < b; i++) {
			num = num * a;
		}
		return num;
	}

}
