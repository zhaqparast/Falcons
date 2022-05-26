package OPPSConceptsDay03ConstructorChaining;

public class Driver {

	private String name;
	private String dob;
	private String ssn;
	private int age;
	private int yearsOfEmployment;
	private double salary;

	public Driver() {
		this.name = "";
		this.dob = "";
		this.ssn = "";
		this.age = 0;
		this.yearsOfEmployment = 0;
		this.salary = 0;
	}

	public Driver(String name) {
		this();
		this.name = name;
	}

	public Driver(String name, String dob) {
		this(name);
		this.dob = dob;
	}

	public Driver(String name, String dob, String ssn) {
		this(name, dob);
		this.ssn = ssn;
	}

	public Driver(String name, String dob, String ssn, int age) {
		this(name, dob, ssn);
		this.age = age;
	}

	public Driver(String name, String dob, String ssn, int age, int yearsOfEmployment) {
		this(name, dob, ssn, age);
		this.yearsOfEmployment = yearsOfEmployment;
	}

	public Driver(String name, String dob, String ssn, int age, int yearsOfEmployment, double salary) {
		this(name, dob, ssn, age, yearsOfEmployment);
		this.salary = salary;
	}

}
