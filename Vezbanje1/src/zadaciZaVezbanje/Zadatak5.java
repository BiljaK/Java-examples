package zadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
//		Napisati program koji sa tastature ucitava podatke
//		studenta. Podaci od interesa su ime, prezime,
//		broj indeksa i prosek na studijama.
//		Nakon ucitavanja ispisati podatke u formatu
//		Ime: Pera
//		Prezime: Peric
//		Br. ind: 15150
//		prosek: 9.7
		
		String ime;
		String prezime;
		int brojIndexa;
		double prosek;
		
		Scanner sken = new Scanner(System.in);
		
		System.out.println("Unesite ime ");
		ime = sken.next();
		
		System.out.println("Unesite prezime ");
		prezime = sken.next();
		
		System.out.println("Unesite broj indexa ");
		brojIndexa = sken.nextInt();
		
		System.out.println("Unesite prosek ");
		prosek = sken.nextDouble();
		
		System.out.println("Ime studenta je " + ime + " prezime je " + prezime 
				+ " Broj indexa " + brojIndexa + " i prosek je " + prosek);
		

	}

}
