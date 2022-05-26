package OPPSConceptsDay03ConstructorChaining;

public class Motorcycle {

	private String brand;
	private int enginePower;
	private double price;
	private String madeIn;

	public Motorcycle() {
		this.brand = "";
		this.enginePower = 0;
		this.price = 0;
		this.madeIn = "";
	}

	public Motorcycle(String brand) {
		this();
		this.brand = brand;
	}

	public Motorcycle(String brand, int enginePower) {
		this(brand);
		this.enginePower = enginePower;
	}

	public Motorcycle(String brand, int enginePower, double price) {
		this(brand, enginePower);
		this.price = price;
	}

	public Motorcycle(String brand, int enginePower, double price, String madeIn) {
		this(brand, enginePower, price);
		this.madeIn = madeIn;
	}

}
