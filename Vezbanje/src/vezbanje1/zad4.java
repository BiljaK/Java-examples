package vezbanje1;

public class zad4 {

	public static void main(String[] args) {
//		Napisati Java program koji pomoæu metode izraèunava zbir cifara unetog broja
		
		int a = 5;
		int b = 10;
		int zbir;
		
		zbir = sum(a, b);
		 System.out.println(zbir);

	}
	public static int sum(int num1, int num2) {
		
		int sum = 0;
		sum = num1 + num2;
		return sum;
		
	}

}
