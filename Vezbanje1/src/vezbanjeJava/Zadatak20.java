package vezbanjeJava;

import java.util.Scanner;

public class Zadatak20 {

	public static void main(String[] args) {
		// Napisati metod koji æe pitati korisnika da unese vrednost i ispisivati njegov
		// kvadratni koren. Ako je
		// uneti broj negativan, ispisati poruku o greški
		// za kvadratni koren koristiti Math.sqrt(x)
		
		kvadtarniKoren();
	}

	public static void kvadtarniKoren() {

		Scanner sken = new Scanner(System.in);

		System.out.println("Unesite broj ");

		double broj = sken.nextDouble();

		if (broj >= 0) {
			System.out.println("Kvadratni koren je " + Math.sqrt(broj));
		} else {
			System.out.println("Uneli ste negativni broj");
		}

	}

}
