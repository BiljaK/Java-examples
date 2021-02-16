package zadatak6PlatnaKartica;

public class PlatnaKartica {
	protected double sumaNaKartici;
	protected int brojKartice;
	protected int godinaVazenja;
	protected int mesecVazenja;
	
	public PlatnaKartica(double sumaNaKartici, int brojKartice, int godinaVazenja, int mesecVazenja) {
		super();
		this.sumaNaKartici = sumaNaKartici;
		this.brojKartice = brojKartice;
		this.godinaVazenja = godinaVazenja;
		this.mesecVazenja = mesecVazenja;
	}
	public double getSumaNaKartici() {
		return sumaNaKartici;
	}
	public int getBrojKartice() {
		return brojKartice;
	}
	public int getGodinaVazenja() {
		return godinaVazenja;
	}
	public int getMesecVazenja() {
		return mesecVazenja;
	}
	
	public void dodajSredstva(double unetaVrednost) {
		sumaNaKartici = sumaNaKartici + unetaVrednost;
	}
	public void izvrsiTransakciju(double unetaVrednost) {
		if (sumaNaKartici >= unetaVrednost) {
			sumaNaKartici = sumaNaKartici - unetaVrednost;
		}else {
			System.out.println("Nema dovoljno sredstava na kartici");
		}
	}
	public void stampaj() {
		System.out.println("Na platnoj kartici sa brojem " + brojKartice + " i mesecom/godinom vazenja " 
	+ mesecVazenja + "/" + godinaVazenja + " je " + sumaNaKartici + "$");
	}

}

//Napraviti klasu PlatnaKartica koja ima
//•	  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//•	  atribut broj kartice  primer: 4012-1239-1221-3381
//•	  atribut godina - godina do kada vazi kartica
//•	  atribut mesec-  mesec do kada vazi kartica

//•	  konstruktor sa parametrima
//•	  gettere za sve atribute, bez settera

//•	   metodu dodajSredstva koja povecava sumu za unetu vrednost
//•	  metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//•	  metodu koja stampa podatke o kartici u formatu:
//	  4012-1239-1221-3381, 11/2019, $212
