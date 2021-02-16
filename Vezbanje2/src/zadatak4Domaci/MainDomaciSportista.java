package zadatak4Domaci;

public class MainDomaciSportista {

	public static void main(String[] args) {
		Sportista sportista01 = new Sportista("Sasa Djordjevic", 1970);
		sportista01.stampaj();
		
		Klub klub01 = new Klub("Partizan", "Beograd", 1948, sportista01);
		klub01.stampaj();

	}

}

//Napisati glavni program, gde cete testirati kako ove klase funkcionisu.