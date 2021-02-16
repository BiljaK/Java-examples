package zadatak7Student;

public class StudentMaster extends Student {

	public StudentMaster(String imeIPrezime, int brojIndexa, int godinaStudija) {
		super(imeIPrezime, brojIndexa, godinaStudija);
		
	}
	public double cenaSkolarine() {
		if (budzet() == true) {
			return 0;
		}else {
			return 10000;
		}
	}
	public boolean budzet() {
		if (getGodinaStudija() < 2) {
			return true;
		}else {
			return false;
		}
	}
	public void stampajMaster() {
		System.out.println("Student master studija " + getImeIPrezime() + " sa brojem indexa " + getBrojIndexa() 
		+ " koji je na " + getGodinaStudija() + " godini studija i skolarinu placa " + cenaSkolarine() + " dinara.");
		System.out.println("Student je na budzetu " + budzet());
	}

}

//Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//•	koja za cenu skolarine vraca 100000
//•	za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
