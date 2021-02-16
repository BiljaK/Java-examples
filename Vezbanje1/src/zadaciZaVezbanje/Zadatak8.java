package zadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		//Napisati program koji kada unesete neki broj kaze
				//da li je broj pozitivan ili negativan
		
		int broj = 0;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj ");
		broj = sken.nextInt();
		
		if (broj > 0) {
			System.out.println("Broj je pozitivan");
		}
		else {
			System.out.println("Broj je negativan");
		}
		System.out.println("Kraj programa");

	}

}
