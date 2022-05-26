package OPPSConceptsDay04Inheritance;

public class Benz extends Car {

	private String variant;

	public Benz() {
		super();
		this.variant = "";
	}

	public Benz(String model, String variant) {
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
