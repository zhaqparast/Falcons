package OPPSConceptsDay04Inheritance;

public class Hummer extends GMC {

	private String engineType;
	private String color;

	public Hummer() {
		super();
		this.engineType = "";
		this.color = "";
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
