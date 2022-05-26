package OPPSConceptsDay04Inheritance;

public class Chevrolet extends Car {

	private String variant;

	public Chevrolet() {
		super();
		this.variant = "";
	}

	public Chevrolet(String model, String variant) {
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
