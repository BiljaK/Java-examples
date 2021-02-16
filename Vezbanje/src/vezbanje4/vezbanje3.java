package vezbanje4;

import java.util.Scanner;

public class vezbanje3 {

	public static void main(String[] args) {
		// uneti 5 brojeva sa tastature - koristeci petlju
		// od tih 5 ispisati najveci koji je deljiv sa 3
		// ako ni jeden nije deljiv sa 3 ispisati tu poruku

		int broj = 0;
		int najveciBroj = 0;

		Scanner sken = new Scanner(System.in);

		for (int i = 1; i < 5; i++) {
			System.out.println("Unesi broj");
			broj = sken.nextInt();

			if (broj % 3 == 0 && broj > najveciBroj) {
				najveciBroj = broj;

			}
		}
		if (najveciBroj != 0) {
			System.out.println("Najveci broj deljiv sa tri " + najveciBroj);

		} else {
			System.out.println("Nije deljiv sa tri ");
		}
	}
}
