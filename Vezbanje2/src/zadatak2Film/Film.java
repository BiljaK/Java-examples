package zadatak2Film;

public class Film {
	private String nazivFilma;
	private int godinaFilma;
	private Reziser reziser;
	
	public Film(String nazivFilma, int godinaFilma, Reziser reziser) {
		super();
		this.nazivFilma = nazivFilma;
		this.godinaFilma = godinaFilma;
		this.reziser = reziser;
	}

	public String getNazivFilma() {
		return nazivFilma;
	}

	public void setNazivFilma(String nazivFilma) {
		this.nazivFilma = nazivFilma;
	}

	public int getGodinaFilma() {
		return godinaFilma;
	}

	public void setGodinaFilma(int godinaFilma) {
		this.godinaFilma = godinaFilma;
	}

	public Reziser getReziser() {
		return reziser;
	}

	public void setReziser(Reziser reziser) {
		this.reziser = reziser;
	}
	public void stampaj() {
		System.out.println("Film " + nazivFilma + ", godina izdavanja " + godinaFilma);
		System.out.println("rezirao je " + reziser.getImeIPrezime());
	}
	
	

}

//Kreirati klasu Film koja ima:
//●	naziv filma
//●	iz koje godine je film 
//●	reziser

//●	konstruktore, gettere i settere koji su potrebni
//●	metodu print koja stampa podatke u formatu
//naziv filma, godina
//Reziser: ime prezime, starost.god
