package zadatak5Osoba;

public class Osoba {
	private String imeIPrezime;
	private String jmbg;
	
	public Osoba(String imeIPrezime, String jmbg) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public void stampaj() {
		System.out.print("Osoba sa imenom i prezimenom " + imeIPrezime + " i jmbg-om " + jmbg) ;
	}
	
	

}

//Kreirati klasu Osoba koja od atributa ima:
//•	 ime i prezime
//•	 jmbg
//•	konstuktor sa parametrima
//•	metodu stampaj koja stampa podatke u formatu
//			ime prezime, jmbg
