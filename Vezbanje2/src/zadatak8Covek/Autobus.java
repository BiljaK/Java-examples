package zadatak8Covek;

public class Autobus {
	private String nazivAutobusa;
	private Vozac vozac;
	private int cenaKarte;
	private Putnik putnik;
	
	public Autobus(String nazivAutobusa, Vozac vozac, int cenaKarte, Putnik putnik) {
		super();
		this.nazivAutobusa = nazivAutobusa;
		this.vozac = vozac;
		this.cenaKarte = cenaKarte;
		this.putnik = putnik;
	}

	public Autobus(String nazivAutobusa, String imeIPrezime, String zanimanje, int cenaKarte, String imeIPrezime2, int novac) {
		super();
		this.nazivAutobusa = nazivAutobusa;
		this.vozac = new Vozac(imeIPrezime, zanimanje);
		this.cenaKarte = cenaKarte;
		this.putnik = new Putnik(imeIPrezime2, novac);
	}

	public String getNazivAutobusa() {
		return nazivAutobusa;
	}

	public void setNazivAutobusa(String nazivAutobusa) {
		this.nazivAutobusa = nazivAutobusa;
	}

	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}

	public int getCenaKarte() {
		return cenaKarte;
	}

	public void setCenaKarte(int cenaKarte) {
		this.cenaKarte = cenaKarte;
	}

	public Putnik getPutnik() {
		return putnik;
	}

	public void setPutnik(Putnik putnik) {
		this.putnik = putnik;
	}
	public void removePutnik() {
		putnik = new Putnik("", 0);
	}
	public void removeVozac() {
		vozac = new Vozac("", "");
	}
	public void stampajAutobus() {
		System.out.println("Autobus koji se zove " + nazivAutobusa + " za vozaca ima " + getVozac().getImeIPrezime() 
				+ " i cena karte je " + cenaKarte + " koju placa putnik " + getPutnik().getImeIPrezime());
	}

}

//Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. 
//Naziv i cena karte i zadaju se prilikom kreiranja. 
//Moguce je dodati/ukloniti putnika kao i vozaca.