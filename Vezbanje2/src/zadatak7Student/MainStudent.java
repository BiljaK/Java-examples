package zadatak7Student;

public class MainStudent {

	public static void main(String[] args) {
		Student student = new Student("Milos Milosevic", 123, 3);
		student.stampaj();
		
		StudentOsnovnih student01 = new StudentOsnovnih("Jovana Jovanovic", 456, 2);
		student01.stampajStudent();
		StudentMaster student02 = new StudentMaster("Milana Milanovic", 789, 3);
		student02.stampajMaster();
		

	}

}

//U glavnoj klasi kreirati studente i testirati funkciolanosti