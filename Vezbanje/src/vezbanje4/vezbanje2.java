package vezbanje4;

import java.util.Scanner;

public class vezbanje2 {

	public static void main(String[] args) {
		        //Write a program in Java to input 5 numbers from keyboard and 
				//find their sum and average

		int broj = 0;
		int sum = 0;
		double avr = 0;
		Scanner sken = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Upisati broj " + (i + 1));
			broj = sken.nextInt();
			
			sum = sum + broj;
			avr = (double) sum /5;
		
		}
		System.out.println("SUma je " + sum);
		System.out.println("Prosek je " + avr);
	}

}
