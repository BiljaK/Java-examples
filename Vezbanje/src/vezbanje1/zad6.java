package vezbanje1;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
//		Napisati Java program koji pomoæu metode omoguæava unos celog broja n, tako da
//		se pri pozivu metode zadaje poruka namenjena korisniku, na primer:
//		 int n = unosBroja(“Unesite broj”);

		
		
		int a = unosBroja("Unesite broj");
		System.out.println("vas broj je " + a);

	}

	public static int unosBroja(String text ) {
		//text = " aaaa";
		Scanner sken = new Scanner(System.in);
		System.out.println(text);
		int broj = sken.nextInt();
		
		return broj;
	}
}
