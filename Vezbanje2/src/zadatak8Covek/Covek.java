package zadatak8Covek;

public class Covek {
	private String imeIPrezime;

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public Covek(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}
	
	public void stampaj() {
		System.out.println("Covek po imenu " + imeIPrezime);
	}

}

//Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. 
//Svi podaci mogu da se dohvate, ali ne i postave.