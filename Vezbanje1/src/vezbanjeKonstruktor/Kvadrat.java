package vezbanjeKonstruktor;

import java.util.Scanner;

public class Kvadrat {

	public static void main(String[] args) {
		// Implementirati Java klasu Kvadrat s jednim atributom a koji predstavlja
		// du�inu stranice
		// i metodama koje vra�aju obim i povr�inu kvadrata

		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite stranicu kvadrata");
		int unos = sken.nextInt();
		Kvadrat kvadrat = new Kvadrat();
		System.out.println("obim: " + kvadrat.obim());
		System.out.println("povrsina: " + kvadrat.povrsina());
	}

//	public class Kvadrat {
		
//	}
	private int a;

	public void Kvadrat(int stranica) {
		a = stranica;
	}

	public int obim() {
		return 4 * a;
	}

	public int povrsina() {
		return a * a;
	}
}
