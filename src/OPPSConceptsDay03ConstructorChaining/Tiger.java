package OPPSConceptsDay03ConstructorChaining;

public class Tiger {

	private String color;
	private int age;
	private double weight;
	private String family;

	public Tiger() {
		this.color = "";
		this.age = 0;
		this.weight = 0;
		this.family = "";
	}

	public Tiger(String color) {
		this();
		this.color = color;
	}

	public Tiger(String color, int age) {
		this(color);
		this.age = age;
	}

	public Tiger(String color, int age, double weight) {
		this(color, age);
		this.weight = weight;
	}

	public Tiger(String color, int age, double weight, String family) {
		this(color, age, weight);
		this.family = family;
	}

}
