package vezbanje3;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//uneti dva broja s tastature (prvi je manji, drugi je veci) 
		//i napraviti while petlju koja ispisuje
		//sve brojeve izmedju ukljucujuci i granicne vrednosti
		// ako se unesu 4 i 8 ispisace se 4 5 6 7 8
		
		int x;
		int y;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Uneste prvi broj");
		x = sken.nextInt();
		
		System.out.println("Unesite drugi broj");
		y = sken.nextInt();
		
		while (x <= y) {
			System.out.println(x + ", ");
			x++;
			
		}
		
		System.out.println("Brojevi izmedju 4 i 8 su: ");
	}

}
