package OPPSConceptsDay04Inheritance;

public class Quant extends Car {

	private String madeIn;

	public Quant() {
		super();
		this.madeIn = "";
	}

	public Quant(String model, String madeIn) {
		super(model);
		this.madeIn = madeIn;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

}
