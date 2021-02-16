package zadatak10VideoPlayer;

public class AudioControl extends Control{
	private boolean pojacaj;
	

	public boolean isPojacaj() {
		return pojacaj;
	}


	public void setPojacaj(boolean pojacaj) {
		this.pojacaj = pojacaj;
	}
	

	public AudioControl(boolean pojacaj) {
		super();
		this.pojacaj = pojacaj;
	}


	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		int zvuk;
		if (pojacaj) {
			zvuk = player.getJacinaZvuka() + 1;
		}else {
			zvuk = player.getJacinaZvuka() - 1;
		}
		if (zvuk < 0) {
			zvuk = 0;
		}else {
			zvuk = 100;
		}
		
		player.setJacinaZvuka(zvuk);
	}
	
}

//Kreirati klasu AudioControl koja nasledjuje klasu Control i 
//•	gettere, settere i konstruktore
//•	ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//•	implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
