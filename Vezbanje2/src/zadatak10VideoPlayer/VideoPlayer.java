package zadatak10VideoPlayer;

public class VideoPlayer {
	private int duzinaVidea;
	private int trenutnoVreme;
	private int jacinaZvuka;
	private int kvalitetVidea;
	
	public int getDuzinaVidea() {
		return duzinaVidea;
	}
	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}
	public int getTrenutnoVreme() {
		return trenutnoVreme;
	}
	public void setTrenutnoVreme(int trenutnoVreme) {
		this.trenutnoVreme = trenutnoVreme;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	public int getKvalitetVidea() {
		return kvalitetVidea;
	}
	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}
	public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVreme = trenutnoVreme;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}
	public void stampaj() {
		System.out.println("Trenutno vreme je:  " + trenutnoVreme + "s");
		System.out.println("Trenutna jacina zvuka je: " + jacinaZvuka);
		System.out.println("Trenutni kvalitet je " + kvalitetVidea);
		System.out.println("***************************************************");
	}

}

//Kreirati klasu VideoPlayer koja ima:
//•	duzinu videa 
//•	trenutno vreme videa
//•	jacinu zvuka
//•	Kvalitet videa (144, 240, 360, 480, 720, 1080)
//•	gettere, settere i konstruktore
//•	metodu stampaj koja stampa podatke u formatu:
//trenutno vreme videa
//jacina zvuka
//kavlitet videa
