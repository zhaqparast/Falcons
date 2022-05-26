package OPPSConceptsDay01Constructor;

public class Car {

	private String make;
	private String model;
	private int yearMade;
	private String vinNumber;

	public Car(String newVinNumber) {
		make = "";
		model = "";
		yearMade = 0;
		setVinNumber(newVinNumber);
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

	public int getYearMade() {
		return yearMade;
	}

	public void setYearMade(int newYearMade) {
		yearMade = newYearMade;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	private void setVinNumber(String newVinNumber) {
		if (newVinNumber.length() == 8) {
			this.vinNumber = newVinNumber;
			System.out.println("A VIN number was assigned.");
		} else {
			vinNumber = "";
			System.out.println("VIN number was not 8 characters in length so it was not assigned.");
		}
	}

}
