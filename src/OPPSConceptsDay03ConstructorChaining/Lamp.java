package OPPSConceptsDay03ConstructorChaining;

public class Lamp {

	private String name;
	private String fuelType;
	private double fuelCapacity;
	private double price;

	public Lamp() {
		this.name = "";
		this.fuelType = "";
		this.fuelCapacity = 0;
		this.price = 0;
	}

	public Lamp(String name) {
		this();
		this.name = name;
	}

	public Lamp(String name, String fuelType) {
		this(name);
		this.fuelType = fuelType;
	}

	public Lamp(String name, String fuelType, double fuelCapacity) {
		this(name, fuelType);
		this.fuelCapacity = fuelCapacity;
	}

	public Lamp(String name, String fuelType, double fuelCapacity, double price) {
		this(name, fuelType, fuelCapacity);
		this.price = price;
	}
}
