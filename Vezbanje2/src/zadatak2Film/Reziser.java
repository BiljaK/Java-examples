package zadatak2Film;

public class Reziser {
	private String imeIPrezime;
	private int starost;
	
	public Reziser(String imeIPrezime, int starost) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.starost = starost;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}
	public void stampaj() {
		System.out.println(imeIPrezime + ", " + starost + ".god");
	}
	

}

//Kreirati klasu Reziser koja ima:
//●	ime i prezime rezisera
//●	startost
//●	konstruktore, gettere i settere koji su potrebni
//●	metodu print koja stampa podatke u formatu
//●	ime prezime, starost.god
