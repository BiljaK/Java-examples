package zadatak6PlatnaKartica;

public class MasterCard extends PlatnaKartica {

	public MasterCard(double sumaNaKartici, int brojKartice, int godinaVazenja, int mesecVazenja, String ovlascenoLice) {
		super(sumaNaKartici, brojKartice, godinaVazenja, mesecVazenja);
		
	}
	public void izvrsiTransakcijuMasterCard(double unetaVrednost) {
		double provizija = unetaVrednost * 1.5 / 100;
		sumaNaKartici = sumaNaKartici - unetaVrednost - provizija;
	}
	public void naplataOdrzavanja() {
		sumaNaKartici = sumaNaKartici - 2;
	}
	public void stampajMasterCard() {
		System.out.println("Master Card: " + mesecVazenja + "/" + godinaVazenja + ", " + brojKartice + ", $" + sumaNaKartici );
	}

}

//Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//•	  konstruktor sa parametrima
//•	  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
//•	  metoda naplatiOdrzavanje, koja sa racuna skida $2.
//•	  implementira metodu koja stampa podatke o kartici u formatu:
//	  Master Card: 12/2019, 4012-1239-1221-3381, $232

