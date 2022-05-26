package OPPSConceptsDay02AccessModifiers;

public class Airplane {

	private String make;
	private String model;
	private int engine;
	private String engineType;
	private String tailNumber;

	public Airplane() {

		tailNumber = "NT62KZ";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String newMake) {
		make = newMake;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String newModel) {
		model = newModel;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int numberOfEngine) {
		engine = numberOfEngine;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String newType) {
		engineType = newType;
	}

	public String getTailNumber() {
		return tailNumber;
	}

}
