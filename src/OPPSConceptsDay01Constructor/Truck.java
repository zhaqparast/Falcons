package OPPSConceptsDay01Constructor;

public class Truck {

	String name;
	String type;
	int horsepower;

	public Truck() {
		name = "";
		type = "";
		horsepower = 0;
	}

	public Truck(String truckName) {
		name = truckName;
		type = "";
		horsepower = 0;
	}

	public Truck(String truckName, String truckType) {
		name = truckName;
		type = truckType;
		horsepower = 0;
	}

	public Truck(String truckName, String truckType, int hp) {
		name = truckName;
		type = truckType;
		horsepower = hp;
	}

}
