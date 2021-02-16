package zadatak8Covek;

public class MainCovek {

	public static void main(String[] args) {
		Covek covek01 = new Covek("Nikola Nikolic");
		covek01.stampaj();
		
		Vozac zanimanje01 = new Vozac("Nikola Nikolic", "Sofer");
		zanimanje01.stampajVozac();
		
		System.out.println("**************");
		
		Putnik putnik01 = new Putnik("Luka Lukic", 2000);
		putnik01.stampajPutnik();
		
		int novacVrednost = 200;
		
		System.out.println("Novac nakon oduzimanja");
		putnik01.oduzmiNovac(novacVrednost);
		putnik01.stampajPutnik();
		System.out.println("Novac nakon dodavanja");
		putnik01.dodajNovac(novacVrednost);
		putnik01.stampajPutnik();
		
		System.out.println("**********");
		
		Autobus autobus01 = new Autobus("Leteci", "Nikola Nikolic", "Sofer", 200, "Luka Lukic", 2000);
		autobus01.stampajAutobus();
		
		System.out.println("Oduzmi putnika");
		autobus01.removePutnik();
		autobus01.stampajAutobus();
		System.out.println("Oduzmi vozaca");
		autobus01.removeVozac();
		autobus01.stampajAutobus();

	}

}
