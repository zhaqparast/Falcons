package OPPSConceptsDay03ConstructorChaining;

public class Zain {

	private String lastName;
	private int age;
	private double salary;
	private int yearsActive;

	public Zain() {
		this.lastName = "";
		this.age = 0;
		this.salary = 0;
		this.yearsActive = 0;
	}

	public Zain(String lastName) {
		this();
		this.lastName = lastName;
	}

	public Zain(String lastName, int age) {
		this(lastName);
		this.age = age;
	}

	public Zain(String lastName, int age, double salary) {
		this(lastName, age);
		this.salary = salary;
	}

	public Zain(String lastName, int age, double salary, int yearsActive) {
		this(lastName, age, salary);
		this.yearsActive = yearsActive;
	}

}
