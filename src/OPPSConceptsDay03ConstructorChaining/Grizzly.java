package OPPSConceptsDay03ConstructorChaining;

public class Grizzly {

	private double weight;
	private String location;
	private int age;
	private int speed;

	public Grizzly() {
		this.weight = 0;
		this.location = "";
		this.age = 0;
		this.speed = 0;
	}

	public Grizzly(double weight) {
		this();
		this.weight = weight;
	}

	public Grizzly(double weight, String location) {
		this(weight);
		this.location = location;
	}

	public Grizzly(double weight, String location, int age) {
		this(weight, location);
		this.age = age;
	}

	public Grizzly(double weight, String location, int age, int speed) {
		this(weight, location, age);
		this.speed = speed;
	}

}
