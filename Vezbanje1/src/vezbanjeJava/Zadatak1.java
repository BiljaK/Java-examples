package vezbanjeJava;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// Napisati program koji Celzijusove stepene pretvara u Farenhajtove po formuli
		// 𝑓 = 9𝑐/5 + 32
		
		double celzijus;
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite Celzijusove stepen");
		celzijus = sken.nextDouble();
		
		System.out.println("Temperatura u Farenhajtovima je " + (celzijus / 5 +32) );
	
		

	}

}
