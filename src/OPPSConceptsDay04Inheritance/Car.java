package OPPSConceptsDay04Inheritance;

public class Car {

	private String model;

	public Car() {
		model = "";

	}

	public Car(String model) {
		this();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
