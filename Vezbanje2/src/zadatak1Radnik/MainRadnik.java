package zadatak1Radnik;

public class MainRadnik {

	public static void main(String[] args) {
		Radnik radnik01 = new Radnik("123456789", "Petar Petrovic", 3, 4, 22);
		
		System.out.println("Koeficient slozenosti " + radnik01.koeficientSlozenosti());
		System.out.println("Minuli rad " + radnik01.minuliRad());
		System.out.println("Plata " + radnik01.plataRadnika());
		System.out.println("Kreditno sposoban " + radnik01.kreditnoSposoban());
		System.out.println("Slobodni dani " + radnik01.slobodniDani());

	}

}
//U main metodi kreirati objekat radnik i pozvati sve metode