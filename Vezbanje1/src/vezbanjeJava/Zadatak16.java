package vezbanjeJava;

import java.util.Scanner;

public class Zadatak16 {

	public static void main(String[] args) {
		// Napisati program koji u�itava visinu i osnovu trougla i zatim izra�unava
		// povr�inu trougla uz pomo�
		// odgovaraju�e metode

		double osnova, visina, povrsina;

		Scanner sken = new Scanner(System.in);
		System.out.print("Unesite duzinu osnove trougla: ");
		osnova = sken.nextDouble();
		System.out.print("Unesite visinu trougla: ");
		visina = sken.nextDouble();

		povrsina = povrsinaTrougla(osnova, visina);
		System.out.println("Povrsina trougla iznosi: " + povrsina);
	}

	static double povrsinaTrougla(double a, double h) {
		return a * h / 2;

	}

}
