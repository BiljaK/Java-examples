package vezbanjeJava;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
		// Napisati program koji u�itava godinu studija studenta u obliku celog broja i zatim �tampa da li je
		// student bruco�, student druge godine, student tre�e godine ili apsolvent u zavisnosti da li je unet broj 1, 2, 3 ili
		// 4. ponuditi re�enje uz pomo� if naredbe kao i uz switch.
		
		int godinaStudija;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite godinu studija ");
		godinaStudija = sken.nextInt();
		
		switch (godinaStudija) {
		case 1:
			System.out.println("Student je brucos ");
			break;
		case 2:
			System.out.println("Student je druga godina ");
			break;
		case 3:
			System.out.println("Student je treca godina ");
			break;
		case 4:
			System.out.println("Student je apsolvent ");
			break;

		default:System.out.println("Uneli ste neispravnu godinu studija ");
			break;
		}
		
		if (godinaStudija == 1) {
			System.out.println("Student je brucos ");
		}else if (godinaStudija == 2) {
			System.out.println("Student je druga godina ");
		}else if (godinaStudija == 3) {
			System.out.println("Student je treca godina ");
		}else if (godinaStudija == 4) {
			System.out.println("Student je apsolvent ");
		}else {
			System.out.println("Uneli ste neispravnu godinu studija ");
		}

	}

}
