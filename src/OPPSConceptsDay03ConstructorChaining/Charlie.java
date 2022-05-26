package OPPSConceptsDay03ConstructorChaining;

public class Charlie {

	private String name;
	private int count;
	private double salary;
	private String status;

	public Charlie() {
		this.name = "";
		this.count = 0;
		this.salary = 0;
		this.status = "";
	}

	public Charlie(String name) {
		this();
		this.name = name;
	}

	public Charlie(String name, int count) {
		this(name);
		this.count = count;
	}

	public Charlie(String name, int count, double salary) {
		this(name, count);
		this.salary = salary;
	}

	public Charlie(String name, int count, double salary, String status) {
		this(name, count, salary);
		this.status = status;
	}

}
