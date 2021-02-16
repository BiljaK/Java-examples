package zadatak9Figura;

public class Pravougaonik extends Figura {
	private double a;
	private double b;
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Pravougaonik(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double povrsina() {
		return a * b;
	}

	@Override
	public double obim() {
		return (a * a) + (b * b);
	}

}

//Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//•	stranice a i b
//•	gettere/settere/konstruktore
//•	implementira metodu povrsina
//•	implementira metodu obim
