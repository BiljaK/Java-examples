package zadatak2Film;

public class MainFilm {

	public static void main(String[] args) {
		Reziser reziser01 = new Reziser("Quentin Tarantino", 60);
		Film film01 = new Film("Kill Bill", 2000, reziser01);
		reziser01.stampaj();
		System.out.println();
		film01.stampaj();
		System.out.println();

	}

}

//U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda