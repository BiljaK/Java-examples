package zadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		// /napisati program koji vam kaze da li je osoba
				//punoletna ili maloletna na osnovu broja
				//godina koje ste uneli kroz tastaturu
		
		int brojGodina;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj godina ");
		brojGodina = sken.nextInt();
		
		if (brojGodina > 18) {
			System.out.println("Osoba je punoletna");
		}
		else {
			System.out.println("Osoba je maloletna ");
		}
		System.out.println("Kraj programa");
	}

}
