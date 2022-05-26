package OPPSConceptsDay04Inheritance;

public class Camry extends Toyota {

	private String engineType;

	public Camry() {
		super();
		this.engineType = "";
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

}
