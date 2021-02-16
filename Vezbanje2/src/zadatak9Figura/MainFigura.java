package zadatak9Figura;

public class MainFigura {

	public static void main(String[] args) {
		Figura trougao01 = new JednakostranicniTrougao(5); 
		Figura trougao02 = new JednakostranicniTrougao(10);
		Figura pravougaonik01 = new Pravougaonik(10, 20);
		Figura pravougaonik02 = new Pravougaonik(15, 25);
		Figura pravougaonik03 = new Pravougaonik(20, 30);
		
		Figura[] nizFigura = new Figura[5];
		
		nizFigura[0] = trougao01;
		nizFigura[1] = trougao02;
		nizFigura[2] = pravougaonik01;
		nizFigura[3] = pravougaonik02;
		nizFigura[4] = pravougaonik03;
		
		double sumaP = 0;
		double sumaO = 0;
		
		for (int i = 0; i < nizFigura.length; i++) {
			nizFigura[i].stampaj();
			System.out.println("***************");
			
			sumaP = sumaP + nizFigura[i].povrsina();
			sumaO = sumaO + nizFigura[i].obim();
		}

			System.out.println("Zbir povrsina je " + sumaP);
			System.out.println("Zbir povrsina je " + sumaO);
			
	

	}

}

//U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika)
//zatim sabrati sve povrsine i obime i za svaku figuru ispisati ponaosob