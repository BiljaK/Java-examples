package zadatak3Kartica;

public class MainKartica {
	
	public static void main(String[] args) {
		ClanskaKarta clanskaKarta01 = new ClanskaKarta(8, 12345);
		
		Kupac kupac01 = new Kupac("Petar Petrovic", clanskaKarta01);
		kupac01.stampaj();
		
		Proizvod proizvod01 = new Proizvod("Cokolada", kupac01, 500);
		proizvod01.stampaj();
		
	}

}
