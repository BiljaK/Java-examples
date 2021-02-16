package vezbanjeJava;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Napisati Java program koji za uneti redni broj dana u nedelji ispisuje njegov
		// naziv korišæenjem niza stringova sa nazivima dana

		Scanner sken = new Scanner(System.in);
		System.out.print("Unesite redni broj dana u nedelji ");
		int broj = sken.nextInt();
		
		switch (broj) {
		case 1:
			System.out.println("Ponedeljak");
			break;
		case 2:
			System.out.println("Utorak");
			break;
		case 3:
			System.out.println("Sreda");
			break;
		case 4:
			System.out.println("Cetvrtak");
			break;
		case 5:
			System.out.println("Petak");
			break;
		case 6:
			System.out.println("Subota");
			break;
		case 7:
			System.out.println("Nedelja");
			break;
		}

	}

}
