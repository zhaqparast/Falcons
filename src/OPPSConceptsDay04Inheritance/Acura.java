package OPPSConceptsDay04Inheritance;

public class Acura extends Car {

	private String variant;

	public Acura() {
		super();
		this.variant = "";
	}

	public Acura(String model, String variant) {
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
