package vezbanjeJava;

import java.util.Scanner;

public class Zadaratk17 {

	public static void main(String[] args) {
		// Napisati program koji u�itava du�ine stranica pravougaonika i zatim
		// izra�unava povr�inu i obim
		// pravougaonika uz pomo� metoda:
		// static double izracunajPovrsinu(double a, double b)
		// static double izracunajObim(double a, double b)

		double a, b;

		Scanner sken = new Scanner(System.in);
		System.out.print("Unesite stranicu a: ");
		a = sken.nextDouble();
		System.out.print("Unesite stranicu b: ");
		b = sken.nextDouble();

		System.out.println("Povrsina iznosi: " + izracunajPovrsinu(a, b));
		System.out.println("Obim iznosi: " + izracunajObim(a, b));
	}

	static double izracunajPovrsinu(double a, double b) {
		double p = a * b;
		return p;

	}

	static double izracunajObim(double a, double b) {
		return 2 * a + 2 * b;

	}
}
