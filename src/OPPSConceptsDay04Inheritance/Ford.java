package OPPSConceptsDay04Inheritance;

public class Ford extends Car {

	private String engineType;

	public Ford() {
		super();
		this.engineType = "";
	}

	public Ford(String model, String engineType) {
		super(model);
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

}
