package OPPSConceptsDay04Inheritance;

public class Infinity extends Car {

	private int horsePower;

	public Infinity() {
		super();
		this.horsePower = 0;
	}

	public Infinity(String model, int horsePower) {
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
