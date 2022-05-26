package OPPSConceptsDay04Inheritance;

public class Dodge extends Car {

	private String variant;

	public Dodge() {
		super();
		this.variant = "";
	}

	public Dodge(String model, String variant) {
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
