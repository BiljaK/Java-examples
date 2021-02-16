package zadatak5Osoba;

public class Profesor extends Osoba{
	private String nazivPredmeta;

	public Profesor(String imeIPrezime, String jmbg, String nazivPredmeta) {
		super(imeIPrezime, jmbg);
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	
	public void stampaj() {
		super.stampaj();
		System.out.println(" je profesor i predaje predmet " + nazivPredmeta);
	}

}

//Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
//koja od dodatnih atributa ima:
//•	naziv predmeta koji predaje
//•	konstuktor sa parametrima
//•	metodu stampaj koja stampa podatke u formatu:
//ime prezime, jmbg, predmet
