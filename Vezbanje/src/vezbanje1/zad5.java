package vezbanje1;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
//		napisati program koji sabira dva broja i ispisuje rezultat
//		Test Data:
//		74 + 36
//		Expected Output :
//		110
		
		int a = 74;
		int b = 36;
		int zbir;
		
		zbir = a + b;
		
		System.out.println(zbir);

		
//		napisati program koji deli dva broja i ispisuje rezultat
//		Test Data :
//		50/3
//		Expected Output :
//		16
		int c = 50;
		int d = 3;
		int zbir2;
		zbir2 = c/d;
		System.out.println(zbir2);

		
//		napisati program koji ispisuje rezultate od sledecih operacija
//		Test Data:
//		a. -5 + 8 * 6
//		b. (55+9) % 9
//		c. 20 + -3*5 / 8
//		d. 5 + 15 / 3 * 2 - 8 % 3
//		Expected Output :
//		43
//		1
//		19
//		13
		int e = -5;
		int f = 8;
		int g = 6;
		int sum;
		sum = e + (f*g);
		System.out.println(sum);
		int h = 55;
		int i = 9;
		int sum2;
		sum2 = (h + i)%i;
		System.out.println(sum2);
		int j = 20;
		int k = -3;
		int l = 5;
		int sum3;
		sum3 = j +(k *l)/f;
		System.out.println(sum3);
		int m = 15;
		int n= 3;
		int o = 2;
		int sum4;
		sum4 = (l+(m/n)*o)-f%n;
		System.out.println(sum4);
		

		
//		napisati program gde korisnik unosi dva broja i ispisuje rezultat mnozenja ta dva broja
//		Test Data:
//		Input first number: 25
//		Input second number: 5
//		Expected Output :
//		25 x 5 = 125
		
		int p;
		int q;
		Scanner sken = new Scanner(System.in);
		System.out.println("prvi");
		p = sken.nextInt();
		System.out.println("drugi");
		q = sken.nextInt();
		int summ;
		summ = p * q;
		System.out.println(summ);

//
//		napisati program gde ce korisnik da unese dva broja i program ce da uporedi ta dva broja i da ispise koji je veci
//		Input Data:
//		Input first integer: 25
//		Input second integer: 39
		
		int r;
		int s;
		Scanner sk = new Scanner(System.in);
		System.out.println("prvi");
		r = sk.nextInt();
		System.out.println("drugi");
		s = sk.nextInt();
		//int summm;
		if (r>s) {
			System.out.println("prvi veci od drugog");
		}else {
			System.out.println("drugi veci od prvog");
		}

//
//		napisati program koji ce da ispisuje sve neparne brojeve od 1 do 99
		
		int broj = 0;
		for (int t = 1; t <= 99; t++) {
			if (t %2 != 0) {
				System.out.println(t);
			}
		}
		

	}

}
