package OPPSConceptsDay04Inheritance;

public class Subaru extends Car {

	private String variant;

	public Subaru() {
		super();
		this.variant = "";
	}

	public Subaru(String model, String variant) {
		super(model);
		this.variant = variant;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

}
