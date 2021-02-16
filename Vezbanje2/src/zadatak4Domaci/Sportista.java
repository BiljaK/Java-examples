package zadatak4Domaci;

public class Sportista {
	private String imeIPrezime;
	private int godinaRodjenja;
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}
	public Sportista(String imeIPrezime, int godinaRodjenja) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.godinaRodjenja = godinaRodjenja;
	}
	public void stampaj() {
		System.out.println(imeIPrezime + " : " + godinaRodjenja);
	}
	

}

//Sportista poseduje ime, prezime i godinu rodjenja. 
//Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene.
//Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja