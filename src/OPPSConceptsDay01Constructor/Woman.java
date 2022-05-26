package OPPSConceptsDay01Constructor;

public class Woman {

	String name;
	String occupation;
	int age;
	double salary;

	public Woman() {
		name = "";
		occupation = "";
		age = 0;
		salary = 0;
	}

	public Woman(String newName) {
		name = newName;
		occupation = "";
		age = 0;
		salary = 0;
	}

	public Woman(String newName, String job) {
		name = newName;
		occupation = job;
		age = 0;
		salary = 0;
	}

	public Woman(String newName, String job, int newAge) {
		name = newName;
		occupation = job;
		age = newAge;
		salary = 0;
	}

	public Woman(String newName, String job, int newAge, double pay) {
		name = newName;
		occupation = job;
		age = newAge;
		salary = pay;
	}

}
