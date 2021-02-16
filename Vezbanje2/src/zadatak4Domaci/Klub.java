package zadatak4Domaci;

public class Klub {
	private String nazivKluba;
	private String sedisteKluba;
	private int godinaOsnivanja;
	private Sportista sportista;
	
	public String getNazivKluba() {
		return nazivKluba;
	}
	public void setNazivKluba(String nazivKluba) {
		this.nazivKluba = nazivKluba;
	}
	public String getSedisteKluba() {
		return sedisteKluba;
	}
	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}
	public Sportista getSportista() {
		return sportista;
	}
	
	public Klub(String nazivKluba, String sedisteKluba, int godinaOsnivanja, Sportista sportista) {
		super();
		this.nazivKluba = nazivKluba;
		this.sedisteKluba = sedisteKluba;
		this.godinaOsnivanja = godinaOsnivanja;
		this.sportista = sportista;
	}
	public void stampaj() {
		System.out.println("Naziv kluba " + nazivKluba + " sa sedistem u " + sedisteKluba 
				+ " i godinom osnovinja " + godinaOsnivanja + ", igra sportista " + sportista.getImeIPrezime());
	}
	

}

//Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. 
//Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.