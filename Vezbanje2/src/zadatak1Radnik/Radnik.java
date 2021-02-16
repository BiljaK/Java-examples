package zadatak1Radnik;

public class Radnik {
	private String jmbg;
	private String imeIPrezime;
	private int brojDece;
	private int stepenStrucneSpreme;
	private int godineRadnogStaza;
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public int getBrojDece() {
		return brojDece;
	}
	public void setBrojDece(int brojDece) {
		this.brojDece = brojDece;
	}
	public int getStepenStrucneSpreme() {
		return stepenStrucneSpreme;
	}
	public void setStepenStrucneSpreme(int stepenStrucneSpreme) {
		this.stepenStrucneSpreme = stepenStrucneSpreme;
	}
	public int getGodineRadnogStaza() {
		return godineRadnogStaza;
	}
	public void setGodineRadnogStaza(int godineRadnogStaza) {
		this.godineRadnogStaza = godineRadnogStaza;
	}
	public String getJmbg() {
		return jmbg;
	}
	public Radnik(String jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpreme, int godineRadnogStaza) {
		super();
		this.jmbg = jmbg;
		this.imeIPrezime = imeIPrezime;
		this.brojDece = brojDece;
		this.stepenStrucneSpreme = stepenStrucneSpreme;
		this.godineRadnogStaza = godineRadnogStaza;
	}
	
	public double koeficientSlozenosti() {
		int stepen = 0;
		if (stepen == 1) {
			return 1.03;
		}else if (stepen == 2) {
			return 1.65;
		}else if (stepen == 3) {
			return 2.00;
		}else if (stepen == 4) {
			return 2.27;
		}else if (stepen == 5) {
			return 2.88;
		}else if (stepen ==6) {
			return 3.09;
		}else if (stepen == 7) {
			return 3.40;
		}else {
			return 4.12;
		}
	}
	public double minuliRad() {
		if (godineRadnogStaza < 10) {
			return 0.05;
		}else if (godineRadnogStaza >= 10 && godineRadnogStaza <= 20) {
			return 0.75;
		}else {
			return 0.1;
		}
	}
	public double plataRadnika() {
		double rez;
		rez = 25000 + (koeficientSlozenosti() + minuliRad()) * 10000;
		return rez;
		
	}
	public boolean kreditnoSposoban() {
		if (plataRadnika() > 50000) {
			return true;
		}else {
			return false;
		}
	}
	public int slobodniDani() {
		return 22 + brojDece * 2;
		
	}

}

//Kreirati klasu Radnik koja ima:
//●	jmbg radnika (razmisliti kog tipa ce biti promenljiva)
//●	ime i prezime
//●	broj dece (1,2,3,... ili 0 ako nema dece)
//●	stepen strucne spreme (od 1 do 8)
//●	godine radnog staza

//●	gettere i settere za sve atribute (jmbg-a ne sme da se menja)
//●	konstruktore koje smatrate da su logicni da postoje

//●	metodu koja vraca koeficijent slozenosti
//●	metodu koja racuna i vraca minuli rad
//●	metodu koja racuna platu radnika, plata se racuna po formuli:
//25000 + (koeficijent slozenosti + minuli rad) * 10000
//●	metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//●	metodu koja racuna i vraca koliko slobodnih dana radnik ima za tekucu godinu.
//Svaki radnik godisnje ima 22 radna dana, i za svako dete plus po 2 dana

//Koeficijent slozenosti
//- (I stepen) Nekvalifikan radnik, koeficijent: 1,03;
//- (II stepen) Osnovno obrazovanje, koeficijent: 1,65;
//- (III stepen) Srednje obrazovanje u trajanju od dvije do tri god., koeficijent: 2,00;
//- (IV stepen) Kvalifikacija srednjeg opšteg i stručnog obrazovanja, koeficijent: 2,27;
//- (V stepen) Kvalifikacija višeg stručnog obrazovanja, koeficijent: 2,88;
//- (VI stepen) Visoko obrazovanje, koeficijent: 3,09;
//- (VII stepen) Fakultetsko, odnosno visoko obrazovanje - Bechelor, koeficijent: 3,40;
//- (VIII stepen) Doktorat nauka, koeficijent: 4,12.

//Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//- do 10 godina 0.05
//od 10-20 godina 0.75
//- preko 20 godina 0.1

