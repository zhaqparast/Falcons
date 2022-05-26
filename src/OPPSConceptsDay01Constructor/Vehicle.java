package OPPSConceptsDay01Constructor;

public class Vehicle {

	String make;
	String model;
	String type;
	int wheels;

	public Vehicle() {
		make = "";
		model = "";
		type = "";
		wheels = 0;
	}

	public Vehicle(String newMake) {
		make = newMake;
		model = "";
		type = "";
		wheels = 0;
	}

	public Vehicle(String newMake, String newModel) {
		make = newMake;
		model = newModel;
		type = "";
		wheels = 0;
	}

	public Vehicle(String newMake, String newModel, String newType) {
		make = newMake;
		model = newModel;
		type = newType;
		wheels = 0;
	}

	public Vehicle(String newMake, String newModel, String newType, int allWheels) {
		make = newMake;
		model = newModel;
		type = newType;
		wheels = allWheels;
	}

}
