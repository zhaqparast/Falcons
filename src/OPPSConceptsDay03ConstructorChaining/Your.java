package OPPSConceptsDay03ConstructorChaining;

public class Your {

	private String name;
	private int age;
	private double height;
	private String homeCountry;

	public Your() {
		this.name = "";
		this.age = 0;
		this.height = 0;
		this.homeCountry = "";
	}

	public Your(String name) {
		this();
		this.name = name;
	}

	public Your(String name, int age) {
		this(name);
		this.age = age;
	}

	public Your(String name, int age, double height) {
		this(name, age);
		this.height = height;
	}

	public Your(String name, int age, double height, String homeCountry) {
		this(name, age, height);
		this.homeCountry = homeCountry;
	}

}
