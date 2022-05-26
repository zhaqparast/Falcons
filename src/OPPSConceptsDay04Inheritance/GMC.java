package OPPSConceptsDay04Inheritance;

public class GMC extends Car {

	private int horsePower;

	public GMC() {
		super();
		this.horsePower = 0;
	}

	public GMC(String model, int horsePower) {
		super(model);
		this.horsePower = horsePower;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

}
