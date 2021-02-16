package vezbanje3;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		//Napisite program koji na osnovu vaseg unosa rednog
				//broja dana u nedelji napisati koji je to dan
				//primer: ako se unese 5 ispis je: 5. dan u nedelji je petak
				//ako broj ne spada u opseg 1-7 ispisite da nije validan
		
		int redniBrojDanaUNedelji;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite dan u nedelji ");
		redniBrojDanaUNedelji = sken.nextInt();
		
		switch (redniBrojDanaUNedelji) {
		case 1:
			System.out.println(redniBrojDanaUNedelji + " Dan u nedelji je ponedeljak");
			break;
			
		case 2:
			System.out.println(redniBrojDanaUNedelji + " Dan u nedelji je utorak");
			break;
			
		case 3:
			System.out.println(redniBrojDanaUNedelji + " Dan u nedelji je sreda");
			break;
			
		case 4:
			System.out.println(redniBrojDanaUNedelji + " Dan u nedelji je cetvrtak");
			break;
			
		case 5:
			System.out.println(redniBrojDanaUNedelji + " Dan u nedelji je petak");
			break;
			
		case 6:
			System.out.println(redniBrojDanaUNedelji + " Dan u nedelji je subota");
			break;
			
		case 7:
			System.out.println(redniBrojDanaUNedelji + " Dan u nedelji je nedelja");
			break;
			
			default:
				System.out.println("ima sedam dana u nedelji ");
			break;
		}
		
		System.out.println("Kraj programa");
	}

}
