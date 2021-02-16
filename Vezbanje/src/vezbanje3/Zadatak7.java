package vezbanje3;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		        //Napisati program koji na osnovu vaseg unosa stringa opisuje godisnje doba
				//Primer: uneli ste Zima a program je ispisao Zima je hladna i 
				//tada uglavnom pada sneg
		

		String godisnjeDoba;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite godisnje doba ");
		godisnjeDoba = sken.next();
		
		switch (godisnjeDoba) {
		case "Zima":
			System.out.println(godisnjeDoba +" je hladna");
			break;
			
		case "Prolece":
			System.out.println(godisnjeDoba + " je zeleno");
			break;

			
		case "Leto":
			System.out.println(godisnjeDoba + " je toplo");
			break;

			
		case "Jesen":
			System.out.println(godisnjeDoba + " je zuta");
			break;


		default:System.out.println("Niste uneli validno godisnje doba");
			break;
		}
		

	}

}
