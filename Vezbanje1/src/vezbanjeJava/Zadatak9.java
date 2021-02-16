package vezbanjeJava;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		// Napisati Java program koji od unetog niza celih broja i unete vrednosti p kreira
		// drugi niz u kome su izostavljeni elementi èija je vrednost p

		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int broj = sken.nextInt();
		
		int[] niz = new int[broj];
		
		for (int i = 0; i < broj; i++) {
			System.out.println("Unesite vrednost " + (i + 1));
			niz[i] = sken.nextInt();
		}
		System.out.println("Unesite vrednost p ");
		int p = sken.nextInt();
		
		int[] drugiNiz = izostavljeniElement(niz,p);
		
		for (int i = 0; i < drugiNiz.length; i++) {
			System.out.println("Drugi niz bez " + p + " je " + drugiNiz[i] + " , ");
		}
		
	}

	public static int[] izostavljeniElement(int[] niz, int element) {
		int brojP = 0;
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == element) {
				brojP++;
			}
		}
		int[] rez = new int[niz.length - brojP];
		int temp = 0;
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != element) {
				rez[temp++] = niz[i];
				
			}
		}
		
		return rez;
		
	}
}
