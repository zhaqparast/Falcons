package OPPSConceptsDay03ConstructorChaining;

public class Queen {

	private String name;
	private int age;
	private String country;
	private int inPowerSince;

	public Queen() {
		this.name = "";
		this.age = 0;
		this.country = "";
		this.inPowerSince = 0;
	}

	public Queen(String name) {
		this();
		this.name = name;
	}

	public Queen(String name, int age) {
		this(name);
		this.age = age;
	}

	public Queen(String name, int age, String country) {
		this(name, age);
		this.country = country;
	}

	public Queen(String name, int age, String country, int inPowerSince) {
		this(name, age, country);
		this.inPowerSince = inPowerSince;
	}

}
