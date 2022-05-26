package OPPSConceptsDay03ConstructorChaining;

public class Stone {

	private String name;
	private double weight;
	private String origin;
	private int price;

	public Stone() {
		this.name = "";
		this.weight = 0;
		this.origin = "";
		this.price = 0;
	}

	public Stone(String name) {
		this();
		this.name = name;
	}

	public Stone(String name, double weight) {
		this(name);
		this.weight = weight;
	}

	public Stone(String name, double weight, String origin) {
		this(name, weight);
		this.origin = origin;
	}

	public Stone(String name, double weight, String origin, int price) {
		this(name, weight, origin);
		this.price = price;
	}

}
