package vezbanje2;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati program koji ucitava x i y
//		sa tastature
//		i ispisuje poruku "Brojevi su veci od nule"
//		ako su i x i y veci od nule.
//		a ako je samo jedan veci od nule ispisati "samo je jedan veci od nule"
//		a ako su oba nula ili manje napisati "oba broja nisu veca od nule"
		
		int x;
		int y;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite prvi broj");
		x = sken.nextInt();
		System.out.println("Unesite drugi broj");
		y = sken.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("Brojevi su veci od nule ");
		}
		else if (x > 0 || y > 0) {
			System.out.println("Samo je jedan veci od nule ");
		}
		else if (x <= 0 && y <= 0) {
			System.out.println("Oba broja nisu veca od nule ");
		}

		System.out.println("Kraj programa ");
	}

}
