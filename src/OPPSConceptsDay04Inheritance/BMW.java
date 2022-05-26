package OPPSConceptsDay04Inheritance;

public class BMW extends Car {

	private String bmwVersion;

	public BMW() {
		super();
		bmwVersion = "";

	}

	public BMW(String model, String bmwVersion) {
		super(model);
		this.bmwVersion = bmwVersion;
	}

	public String getBmwVersion() {
		return bmwVersion;
	}

	public void setBmwVersion(String bmwVersion) {
		this.bmwVersion = bmwVersion;
	}

}
