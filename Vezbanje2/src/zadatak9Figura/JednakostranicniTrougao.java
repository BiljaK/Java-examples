package zadatak9Figura;

public class JednakostranicniTrougao extends Figura {
	private double a;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public JednakostranicniTrougao(double a) {
		super();
		this.a = a;
	}
	@Override
	public double povrsina() {
		return (a * a) * 1.73205 / 4;
		
	}

	@Override
	public double obim() {
		return a + a + a;
	}

}

//Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//•	stranicu a
//•	gettere/settere/konstruktore
//•	implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//•	implementira metodu obim
