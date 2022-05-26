package OPPSConceptsDay03ConstructorChaining;

public class Watch {

	private String brand;
	private double price;
	private String madeIn;
	private int producedSince;

	public Watch() {
		this.brand = "";
		this.price = 0;
		this.madeIn = "";
		this.producedSince = 0;
	}

	public Watch(String brand) {
		this();
		this.brand = brand;
	}

	public Watch(String brand, double price) {
		this(brand);
		this.price = price;
	}

	public Watch(String brand, double price, String madeIn) {
		this(brand, price);
		this.madeIn = madeIn;
	}

	public Watch(String brand, double price, String madeIn, int producedSince) {
		this(brand, price, madeIn);
		this.producedSince = producedSince;
	}

}
