package vezbanje1;

public class zad3 {

	public static void main(String[] args) {
//		Napisati Java program koji za 3 unete duine dui, pomoæu metode, ispituje da li
//		one mogu graditi trougao

		int a = 5;
		int b = 10;
		int c = 15;

		boolean rezultat = trougao(a, b, c);
		System.out.println(rezultat);

	}

	public static boolean trougao(int num1, int num2, int num3) {
		int num = num3 * num3;

		if (num == num2 * num2 + num1 * num1) {

			return true;
		} else if (num1 == num2 && num2 == num3) {

			return true;
		} else {
			return false;
		}

	}
}
