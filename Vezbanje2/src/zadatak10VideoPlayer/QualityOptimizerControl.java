package zadatak10VideoPlayer;

public class QualityOptimizerControl extends Control {
	private double brzinaInterneta;
	

	public double getBrzinaInterneta() {
		return brzinaInterneta;
	}


	public void setBrzinaInterneta(double brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}
	

	public QualityOptimizerControl(double brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}
	private int racunajKvalitet() {
		double a = brzinaInterneta * 10.1;
		if (a <= 144) {
			return 144;
		}else if (a <= 240) {
			return 240;
		}else if (a <= 360) {
			return 360;
		}else if (a <= 480) {
			return 480;
		}else if (a <= 720) {
			return 720;
		}else {
			return 180;
		}
	}


	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		int kvalitet = racunajKvalitet();
		player.setKvalitetVidea(kvalitet);
		
	}
	

}

//Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i 
//•	ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//•	gettere, settere i konstruktore
//•	implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta. 
//Kvalitet se racuna na osnovu formule:
//brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
