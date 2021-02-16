package vezbanje1;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
//		Napisati Java program koji pomoæu metode omoguæava unos pozitivnog celog
//		broja n, tako da se pri pozivu metode zadaje poruka namenjena korisniku, kao i
//		poruka u sluèaju greške, na primer:
//		int n=unosBroja(“Unesite pozitivan broj ”,“Uneti broj nije pozitivan ”);
		
		
		
		int broj =unosBroja("Unesite pozitivan broj ","Uneti broj nije pozitivan ");
		
		if (broj > 0) {
			System.out.println("Uneti broj je pozitivan " + broj);
		}
		

	}

	public static int unosBroja( String tex1, String text2) {
		int num;
		Scanner sk = new Scanner(System.in);
		System.out.println(tex1);
		num = sk.nextInt();
		
		if (num > 0) {
			return num;
		}else {
			System.out.println(text2);
			return num;

		}
		
		
		
	}
}
