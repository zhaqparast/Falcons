package OPPSConceptsDay04Inheritance;

public class Lexus extends Car {

	private String condition;
	private double price;

	public Lexus() {
		super();
		this.condition = "";
		this.price = 0;
	}

	public Lexus(String model, String condition, double price) {
		super(model);
		this.condition = condition;
		this.price = price;
	}

}
