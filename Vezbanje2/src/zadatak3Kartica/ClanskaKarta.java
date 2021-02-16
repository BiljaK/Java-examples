package zadatak3Kartica;

public class ClanskaKarta {
	private int popust;
	private int brojKartice;
	
	public int getPopust() {
		return popust;
	}
	public void setPopust(int popust) {
		if (popust < 5) {
			this.popust = 5;
		}else if (popust > 10) {
			this.popust = 10;
		}else {
			this.popust = popust;
		}
		
	}
	public int getBrojKartice() {
		return brojKartice;
	}
	public void setBrojKartice(int brojKartice) {
		this.brojKartice = brojKartice;
	}
	public ClanskaKarta(int popust, int brojKartice) {
		super();
		this.popust = popust;
		this.brojKartice = brojKartice;
	}
	

}

//Kreirati klasu ClanskaKarta koja ima:
//●	popust (u rasponu od 5 do 10 %)
//●	broj kartice (npr: 9329-0239)
//●	gettere i setter 
//●	konstuktore
