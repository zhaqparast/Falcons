package OPPSConceptsDay04Inheritance;

public class Elio extends Car {

	private int wheels;
	private String variant;

	public Elio() {
		super();
		this.wheels = 0;
		this.variant = "";
	}

	public Elio(String model, int wheels, String variant) {
		super(model);
		this.wheels = wheels;
		this.variant = variant;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

}
