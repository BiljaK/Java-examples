package zadatak7Student;

public class Student {
	private String imeIPrezime;
	private int brojIndexa;
	private int godinaStudija;
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public int getBrojIndexa() {
		return brojIndexa;
	}
	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}
	public int getGodinaStudija() {
		return godinaStudija;
	}
	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	public Student(String imeIPrezime, int brojIndexa, int godinaStudija) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.brojIndexa = brojIndexa;
		this.godinaStudija = godinaStudija;
	}
	public void stampaj() {
		System.out.println("Student " + imeIPrezime + " i brojem indexa " + brojIndexa + " je na " 
	+ godinaStudija + " godini studija");
	}
	

}

//Kreirati klasu Student koja ima:
//•	ime i prezime studenta
//•	broj indeksa
//•	godinu studija
//•	gettere, settere i konstruktore
