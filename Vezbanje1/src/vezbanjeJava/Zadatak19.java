package vezbanjeJava;

import java.util.Scanner;

public class Zadatak19 {

	public static void main(String[] args) {
		// Napisati program koji ispisuje poruku o oceni na osnovu unetih bodova (za
		// 51-60 je 6, za 61-70 je
		// 7…) U program koristiti metodu: void stampajOcenu(double bodovi).

		System.out.println("Unestite broj bodova: ");
		Scanner sken = new Scanner(System.in);
		double broj = sken.nextDouble();

		stampajOcenu(broj);

	}

	public static void stampajOcenu(double bodovi) {

		if (bodovi > 90.0) {
			System.out.println("Ocena je 10 ");
		} else if (bodovi > 80.0) {
			System.out.println("Ocena je 9 ");
		} else if (bodovi > 70.0) {
			System.out.println("Ocena je 8 ");
		} else if (bodovi > 60.0) {
			System.out.println("Ocena je 7 ");
		} else if (bodovi > 50.0) {
			System.out.println("Ocena je 6 ");
		} else {
			System.out.println("Ocena je 5 ");
		}
	}

}
