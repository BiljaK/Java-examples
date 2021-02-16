package zadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		//Napisati program koji proverava da li su unete
//		//vrednosti X, Y i Z u opadajucem ili rastucem redosledu ili nijedno od toga
//		//Ispisati odgovarajuce poruke.
//		//Primer izvrsenje:
//		//unesite x: 10
//		//unesite y: 23
//		//unesite z: 99
//		//Vrednosti su u rastucem redosledu.
		
		int x;
		int y;
		int z;
		
		Scanner sken = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj");
		x = sken.nextInt();
		System.out.println("Unesite drugi broj");
		y = sken.nextInt();
		System.out.println("Unesite treci broj");
		z = sken.nextInt();
		
		if (x < y && y < z) {
			System.out.println("Brojevi su u rastucem redosledu ");
		}
		else if (x > y && y > z) {
			System.out.println("Brojevi su u opadajucem redosledu ");
		}
		else {
			System.out.println("Brojevi nisu ni u rastucem ni u opadajucem redosledu ");
		}
 
		System.out.println("Kraj programa");
	}

}
