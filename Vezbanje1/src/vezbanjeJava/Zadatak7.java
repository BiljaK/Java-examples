package vezbanjeJava;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		// Napisati Java program koji za uneti redni broj meseca ispisuje koliko taj
		// mesec
		// ukupno ima dana (za februar uzeti 28)

		Scanner sken = new Scanner(System.in);
		System.out.print("Unesite redni broj meseca: ");
		int broj = sken.nextInt();
		
		if (broj == 4 || broj == 6 || broj == 9 || broj == 11) {
			System.out.println("Mesec ima 30 dana");
		} else if (broj == 2) {
			System.out.println("Mesec ima 28 ili 29 dana");
		} else {
			System.out.println("Mesec ima 31 dan");
		}
	}

}
