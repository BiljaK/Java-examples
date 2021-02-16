package zadatak5Osoba;

public class Student extends Osoba{
	private int brojIndexa;

	public Student(String imeIPrezime, String jmbg, int brojIndexa) {
		super(imeIPrezime, jmbg);
		this.brojIndexa = brojIndexa;
	}

	public int getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}
	public void stampaj() {
		super.stampaj();
		System.out.println(" je student sa brojem indexa " + brojIndexa);
	}
	

}

//Kreirati klasu Student koja nasledjuje klasu Osoba, 
//koja od dodatnih atributa ima:
//•	broj indeksa
//•	konstuktor sa parametrima
//•	metodu stampaj koja stampa podatke u formatu:
//ime prezime, jmbg, broj indeksa
