package vezbanje3;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati program koji sabira
//		brojeve od 0 do broja koji ste uneli na tastaturi
//		i prikazuje sumu
		
//		suma = 0 + 1 + 2 + 3 + 4 + 5 = 15
//		i 	 = 0   1   2   3   4   5
//		suma = 0       suma = 0
//		suma = 1       suma = 0 + 1
//		suma = 3       suma = 1 + 2
//		suma = 6       suma = 3 + 3
//		suma = 10      suma = 6 + 4
//		suma = 15	   suma = 10 + 5
		
		int x;
		int sum = 0;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj ");
		x = sken.nextInt();
		
		while (0 <= x) {
			sum = sum + x;
			System.out.println("Suma je " + sum);
			x--;
		}
		
		System.out.println("Suma do granicnog broja je " + sum);

	}

}
