package OPPSConceptsDay04Inheritance;

public class Wanderer extends Car {

	private String type;

	public Wanderer() {
		super();
		this.type = "";
	}

	public Wanderer(String model, String type) {
		super(model);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
