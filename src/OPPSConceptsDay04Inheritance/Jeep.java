package OPPSConceptsDay04Inheritance;

public class Jeep extends Car {

	private int cylinder;

	public Jeep() {
		super();
		this.cylinder = 0;
	}

	public Jeep(String model, int cylinder) {
		super(model);
		this.cylinder = cylinder;
	}

	public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

}
