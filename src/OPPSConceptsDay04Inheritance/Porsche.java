package OPPSConceptsDay04Inheritance;

public class Porsche extends Car {

	private String variant;

	public Porsche() {
		super();
		this.variant = "";
	}

	public Porsche(String model, String variant) {
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
