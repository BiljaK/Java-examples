package zadatak3Kartica;

public class Kupac {
	private String imeIPrezime;
	private ClanskaKarta clanskaKarta;
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public ClanskaKarta getClanskaKarta() {
		return clanskaKarta;
	}
	public void setClanskaKarta(ClanskaKarta clanskaKarta) {
		this.clanskaKarta = clanskaKarta;
	}
	public Kupac(String imeIPrezime, ClanskaKarta clanskaKarta) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.clanskaKarta = clanskaKarta;
	}
	public void stampaj() {
		System.out.println("Kupac " + imeIPrezime + " sa clanskom karticom broj  - " + clanskaKarta.getBrojKartice());
	}
	

}

//Kreirati klasu Kupac koja ima:
//●	ime i prezime
//●	clansku kartu
//●	gettere i settere, clanska karta ne moze da se menja
//●	konstruktore
//●	metodu stampaj koja stampa u formatu
//ime i prezime - broj kartice
