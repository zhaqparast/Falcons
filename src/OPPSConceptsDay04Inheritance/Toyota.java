package OPPSConceptsDay04Inheritance;

public class Toyota extends Car {

	private String variant;
	private double towingCapacity;

	public Toyota() {
		super();
		this.variant = "";
		this.towingCapacity = 0;
	}

	public Toyota(String model, String variant, double towingCapacity) {
		super(model);
		this.variant = variant;
		this.towingCapacity = towingCapacity;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public double getTowingCapacity() {
		return towingCapacity;
	}

	public void setTowingCapacity(double towingCapacity) {
		this.towingCapacity = towingCapacity;
	}

}
