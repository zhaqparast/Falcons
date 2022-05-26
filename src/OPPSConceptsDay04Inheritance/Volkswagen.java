package OPPSConceptsDay04Inheritance;

public class Volkswagen extends Car {

	private String engineType;
	private int range;

	public Volkswagen() {
		super();
		this.engineType = "";
		this.range = 0;
	}

	public Volkswagen(String model, String engineType, int range) {
		super(model);
		this.engineType = engineType;
		this.range = range;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String enigneType) {
		this.engineType = engineType;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

}
