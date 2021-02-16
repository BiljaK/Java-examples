package zadaciZaVezbanje;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati program koji racuna povrsinu kvadrata stranice a,
//		i povrsinu kruga poluprecnika r.
//		Povrsina kvadrata se racuna kao P = a x a
//		Povrsina kruga se racuna kao P = r x r x 3.14
		
		int a = 5;
		int r = 10;
		int povrsinaKvadrata = a * a;
		double povrsinaKruga = r * r * 3.14;
		
		System.out.println("Povrsina kvadrata je " + povrsinaKvadrata);
		System.out.println("Povrsina kruga je " + povrsinaKruga);
		
		

	}

}
