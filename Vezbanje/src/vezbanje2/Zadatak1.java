package vezbanje2;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// Napisati prokram gde cete uneti tastaturom
				//broj a program ce ispisati da li je taj broj jednocifren,
				//dvocifren, trocifren ili veci od trocifrenih
				// gledamo samo pozitivne brojeve
		
		int broj;
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj ");
		broj = sken.nextInt();
		
		if (broj < 10) {
			System.out.println("Broj je jednocifren ");
		}
		else if (broj < 100) {
			System.out.println("Broj je dvocifren");
		}
		else if (broj < 1000) {
			System.out.println("Broj je trocifren ");
		}
		else {
			System.out.println("Broj je veci od trocifrenog ");
		}
		
		System.out.println("Kraj programa");
		
		

	}

}
