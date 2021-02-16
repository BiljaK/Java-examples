package vezbanje2;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		//uneti dva broja s tastature (prvi je manji, drugi je veci) 
		//i napraviti while petlju koja ispisuje
		//sve brojeve izmedju ukljucujuci i granicne vrednosti
		// ako se unesu 4 i 8 ispisace se 4 5 6 7 8
		
		int a;
		int b;
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite manji broj ");
		a = sken.nextInt();
		System.out.println("Unesite veci broj ");
		b = sken.nextInt();
		
		while ( a <= b) {
			System.out.println(a );
			a++;
			
		}
		System.out.println("Kraj programa ");

	}

}
