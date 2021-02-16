package zadatak10VideoPlayer;

public class TimeControl extends Control {
	private boolean napred;
	

	public TimeControl(boolean napred) {
		super();
		this.napred = napred;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		int vreme;
		if (napred) {
			vreme = player.getTrenutnoVreme() +15;
		}else {
			vreme = player.getTrenutnoVreme() -15;
		}
		if (vreme < 0) {
			vreme = 0;
		}else if (vreme > player.getDuzinaVidea()) {
			vreme = player.getDuzinaVidea();
		}
		player.setTrenutnoVreme(vreme);
	}
	
}

//Kreirati klasu TimeControl koja nasledjuje klasu Control i 
//•	konstruktore
//•	ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//•	implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa.
//Veoma je bitno da se ne izadje van granica videa.

