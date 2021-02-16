package zadatak6PlatnaKartica;

public class MainPlatnaKartica {

	public static void main(String[] args) {
		VisaCard visa01 = new VisaCard(400, 1234567890, 2019, 11, "Biljana");
		visa01.dodajSredstva(200);
		visa01.izvrsiTransakcijuVisa(150);
		visa01.stampaj();
		
		MasterCard master01 = new MasterCard(500, 123456789, 2020, 12, "Boris");
		master01.dodajSredstva(300);
		master01.izvrsiTransakcijuMasterCard(150);
		master01.naplataOdrzavanja();
		master01.stampaj();

	}

}
//u main funkciji, napraviti visa i master kartice i testirati funkcije