package zadatak3Kartica;

public class Proizvod {
	private String nazivProizvoda;
	private Kupac kupac;
	private int cenaIzrade;
	
	public String getNazivProizvoda() {
		return nazivProizvoda;
	}
	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}
	public Kupac getKupac() {
		return kupac;
	}
	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}
	public int getCenaIzrade() {
		return cenaIzrade;
	}
	public void setCenaIzrade(int cenaIzrade) {
		this.cenaIzrade = cenaIzrade;
	}
	public Proizvod(String nazivProizvoda, Kupac kupac, int cenaIzrade) {
		super();
		this.nazivProizvoda = nazivProizvoda;
		this.kupac = kupac;
		this.cenaIzrade = cenaIzrade;
	}
//	public double racunanjeCeneProizvoda() {
	//	return  * 1.9 * (100 - ) / 100;
		
//	}
	public void stampaj() {
		System.out.println("Naziv proizvoda " + nazivProizvoda + " cena proizvoda - " 
	+ cenaIzrade + " dinara. Kupac po imenu i prezimenu " + kupac.getImeIPrezime() + " i brojem clanske karte  - "
				+ kupac.getClanskaKarta().getBrojKartice());
	}

}

//Kreirati klasu Proizvod koja ima
//●	Naziv proizvoda
//●	kupca/musteriju
//●	cenu izrade proizvoda

//●	gettere i settere
//●	konstruktore

//●	Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//●	Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice
