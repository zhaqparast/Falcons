package OPPSConceptsDay02AccessModifiers;

public class Car {

	private String make;
	private String model;
	private int yearMake;
	private String vin;

	public Car(String newVIN) {
		make = "";
		model = "";
		yearMake = 0;
		vin = newVIN;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String newMake) {

	}

	public String getModel() {
		return model;
	}

	public void setModel(String newModel) {

	}

	public int getYearMake() {
		return yearMake;
	}

	public void setYearMake(int newYearMake) {

	}

	public String getVin() {
		return vin;
	}
}