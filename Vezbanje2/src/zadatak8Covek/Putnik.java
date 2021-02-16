package zadatak8Covek;

public class Putnik extends Covek {
	private int novac;

	public Putnik(String imeIPrezime, int novac) {
		super(imeIPrezime);
		this.novac = novac;
	}

	public int getNovac() {
		return novac;
	}

	public void setNovac(int novac) {
		this.novac = novac;
	}
	public void oduzmiNovac(int svotaNovca) {
		novac = novac - svotaNovca;
	}
	public void dodajNovac( int svotaNovca) {
		novac = novac + svotaNovca;
	}
	public void stampajPutnik() {
		System.out.println("Putnik " + getImeIPrezime() + " ima novaca " + novac);
	}

}

//Putnik je covek koji poseduje novac. 
//Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
//Odredjena svota novca moze da mu se doda i/ili oduzme.