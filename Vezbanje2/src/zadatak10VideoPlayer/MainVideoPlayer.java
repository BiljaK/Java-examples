package zadatak10VideoPlayer;

public class MainVideoPlayer {

	public static void main(String[] args) {
		VideoPlayer player = new VideoPlayer(60, 40, 3, 80);
		
		Control control01 = new AudioControl(true);
		Control control02 = new AudioControl(false);
		Control control03 = new QualityOptimizerControl(50);
		Control control04 = new TimeControl(true);
		Control control05 = new TimeControl(false);
		
		Control[] nizKontrola = new Control[5];
		nizKontrola[0] = control01;
		nizKontrola[1] = control02;
		nizKontrola[2] = control03;
		nizKontrola[3] = control04;
		nizKontrola[4] = control05; 
		
		for (int i = 0; i < nizKontrola.length; i++) {
			nizKontrola[i].izvrsiAkciju(player);
			player.stampaj();
		}




		
		

	}

}

//U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
//
//U glavnom programu kreirati niz akcija i izvrsiti ih nad istim plejerom.
