package zadatak8Covek;

public class Vozac extends Covek {
	private String zanimanje;

	public Vozac(String imeIPrezime, String zanimanje) {
		super(imeIPrezime);
		this.zanimanje = zanimanje;
	}

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}
	public void stampajVozac() {
		System.out.println(getImeIPrezime() + " je po zanimanju " + zanimanje);
	}
	
	

}

//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).