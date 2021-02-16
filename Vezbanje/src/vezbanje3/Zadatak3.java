package vezbanje3;

public class Zadatak3 {

	public static void main(String[] args) {
		//napisati program koji ispisuje svaki peti broj izmedju 10 i 50
				//(takodje ispisuje koji put ste usli u petlju)
				// primer resenja je:
				//vrednost promenljive je 10 usao sam u petlju 1.put
				// vrednost promenljive je 15 usao sam u petlju 2.put
				//...sve tako do 50 (ukljucujuci i 50
		
		int a = 10;
		int brojacUPetlji = 1;
		
		do {
			System.out.println("Vrednost promenljive je: " + a + " Usla sam u petlju " + brojacUPetlji + " . put ");
			a = a + 5;
			brojacUPetlji++;
		} while (a <= 50);
		
		System.out.println("Kraj programa ");

	}

}
