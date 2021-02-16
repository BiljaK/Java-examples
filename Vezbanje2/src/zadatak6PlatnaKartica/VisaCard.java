package zadatak6PlatnaKartica;

public class VisaCard extends PlatnaKartica{
	private String ovlascenoLice;

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}

	public VisaCard(double sumaNaKartici, int brojKartice, int godinaVazenja, int mesecVazenja, String ovlascenoLice) {
		super(sumaNaKartici, brojKartice, godinaVazenja, mesecVazenja);
		this.ovlascenoLice = ovlascenoLice;
	}
	
	public void izvrsiTransakcijuVisa(double unetaVrednost) {
		double provizija = unetaVrednost * 1.8 * 100;
		if (provizija < 4) {
			sumaNaKartici = sumaNaKartici - provizija - 4;
		}else {
			sumaNaKartici = sumaNaKartici - provizija;
		}
	}
	public void stampajVisu() {
		System.out.println("Visa card: " + brojKartice + ", " + mesecVazenja + "/" + godinaVazenja + ", $" + sumaNaKartici);
	}

}

//Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
//•	 ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.

//•	getter i setter za ovlasceno lice
//•	konstruktor sa parametrima

//•	  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. 
//    Najmanja provizija moze biti $4.
//•	  implementira metodu koja stampa podatke o kartici u formatu:
//	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
