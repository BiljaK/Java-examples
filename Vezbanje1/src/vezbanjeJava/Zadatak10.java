package vezbanjeJava;

public class Zadatak10 {

	public static void main(String[] args) {
		// Napisati program u koji ispisuje sve parne brojeve od 1 do 30
		
		//int broj;
		
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.println("Parni brojevi od 1 do 30 " + i);
			}
		}

	}

}
