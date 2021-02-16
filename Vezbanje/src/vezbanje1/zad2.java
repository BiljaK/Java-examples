package vezbanje1;

public class zad2 {

	public static void main(String[] args) {
//		Napisati Java program koji pomoæu metode, od 3 celobrojna argumenta, 
//		vraæa vrednost najmanjeg

		int broj1 = 11;
		int broj2 = 3;
		int broj3 = 17;

		int broj = najmanji(broj1, broj2, broj3);
		System.out.println(broj);

	}

	public static int najmanji(int num1, int num2, int num3) {

		if (num1 < num2 && num1 < num3) {
			return num1;
		} else if (num2 < num3 && num2 < num1) {
			return num2;
		} else {
			return num3;

		}
	}
}
