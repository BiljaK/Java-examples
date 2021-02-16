package vezbanje1;

public class zad1 {

	public static void main(String[] args) {
//		Napisati Java program koji pomoæu metode ispituje da li je uneti broj prost

		int broj = 15;

		boolean prost = true;

		if (prostNijeProst(broj, prost)) {
			System.out.println("Broj je prost" + broj);
		} else {
			System.out.println("broj nije proste " + broj);
		}

	}

	public static boolean prostNijeProst(int num, boolean prost) {

		boolean prost1 = true;
		for (int i = 2; i < num && prost1 == true; i++) {
			if (num % i == 0) {
				prost1 = false;
			}
		}

		if (prost1 == true) {
			return true;
		} else
			return false;

	}

}
