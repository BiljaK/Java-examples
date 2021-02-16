package zadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati program koji ucitava vrednosti a i b
//		sa tastature i pronalazi njihovu srednju vrednosti
//		I na kraju ispistuje njihov proizvod.
		
		int a;
		int b;
		
		Scanner sken = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj");
		a = sken.nextInt();
		System.out.println("Unesite drugi broj ");
		b = sken.nextInt();
		
		float srednjaVrednost = (a + b)/3f;
		int proizvod = a * b;
		
		System.out.println("Srednja vrednos je " + srednjaVrednost);
		System.out.println("Proizvod je " + proizvod);

	}

}
