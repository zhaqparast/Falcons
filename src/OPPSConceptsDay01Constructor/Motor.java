package OPPSConceptsDay01Constructor;

public class Motor {

	String make;
	String model;
	int yearMade;

	public Motor() {
		make = "";
		model = "";
		yearMade = 0;
	}

	public Motor(String newMake) {
		make = newMake;
		model = "";
		yearMade = 0;
	}

	public Motor(String newMake, String newModel) {
		make = newMake;
		model = newModel;
		yearMade = 0;
	}

	public Motor(String newMake, String newModel, int yearMake) {
		make = newMake;
		model = newModel;
		yearMade = yearMake;
	}

}
