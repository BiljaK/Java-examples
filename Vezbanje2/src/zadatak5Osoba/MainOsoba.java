package zadatak5Osoba;

public class MainOsoba {

	public static void main(String[] args) {
		Student student01 = new Student("Petar Petrovic", "123456", 123);
		Student student02 = new Student("Marko Markovic", "234567", 234);
		student01.stampaj();
		student02.stampaj();
		
		Profesor profesor01 = new Profesor("Jovan Jovanovic", "34567", "Biologija");
		Profesor profesor02 = new Profesor("Nenad Nenadic", "45678", "Biohemija");
		profesor01.stampaj();
		profesor02.stampaj();


	}

}

//U glavnom programu kreirati 2 studenta i 2 profesora.