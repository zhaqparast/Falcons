package OPPSConceptsDay03ConstructorChaining;

public class Earpeice {

	private int quantity;
	private String brand;
	private double cost;
	private String shippingDate;
	private double shippingCost;

	public Earpeice() {
		this.quantity = 0;
		this.brand = "";
		this.cost = 0;
		this.shippingDate = "";
		this.shippingCost = 0;
	}

	public Earpeice(int quantity) {
		this();
		this.quantity = quantity;
	}

	public Earpeice(int quantity, String brand) {
		this(quantity);
		this.brand = brand;
	}

	public Earpeice(int quantity, String brand, double cost) {
		this(quantity, brand);
		this.cost = cost;
	}

	public Earpeice(int quantity, String brand, double cost, String shippingDate) {
		this(quantity, brand, cost);
		this.shippingDate = shippingDate;
	}

	public Earpeice(int quantity, String brand, double cost, String shippingDate, double shippingCost) {
		this(quantity, brand, cost, shippingDate);
		this.shippingCost = shippingCost;
	}

}
