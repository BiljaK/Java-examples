package zadatak7Student;

public class StudentOsnovnih extends Student {

	public StudentOsnovnih(String imeIPrezime, int brojIndexa, int godinaStudija) {
		super(imeIPrezime, brojIndexa, godinaStudija);
		
	}
	public double cenaSkolarine() {
		if (budzet() == true) {
			return 0;
		}else {
			return 90000;
		}
	}
	public boolean budzet() {
		if (getGodinaStudija() < 5) {
			return true;
		}else {
			return false;
		}
	}
	public void stampajStudent() {
		System.out.println("Student osnovnih studija " + getImeIPrezime() + " sa brojem indexa " + getBrojIndexa() 
		+ " koji je na " + getGodinaStudija() + " godini studija, placa skolarinu " + cenaSkolarine() + " dinara.");
		System.out.println("Student je na budzetu " + budzet());
	}

}

//Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//•	koja za cenu skolarine vraca 90000
//•	za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija

