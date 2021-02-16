package vezbanjeJava;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		// Program koji uz pomoæ do while petlje ispisuje prvih n brojeva
		
		int broj;
		int broj2 = 0;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj ");
		broj = sken.nextInt();
		
		do {
			System.out.println("Unesite do kog broja da ispisuje " + broj2);
			broj2++;
		} while (broj2 <= broj);

	}

}
