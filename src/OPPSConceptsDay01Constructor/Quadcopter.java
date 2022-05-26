package OPPSConceptsDay01Constructor;

public class Quadcopter {

	String brand;
	String batteryType;
	int batteries;

	public Quadcopter() {
		brand = "";
		batteryType = "";
		batteries = 0;
	}

	public Quadcopter(String newBrand) {
		brand = newBrand;
		batteryType = "";
		batteries = 0;
	}

	public Quadcopter(String newBrand, String newType) {
		brand = newBrand;
		batteryType = newType;
		batteries = 0;
	}

	public Quadcopter(String newBrand, String newType, int numberOfBatteries) {
		brand = newBrand;
		batteryType = newType;
		batteries = numberOfBatteries;
	}

}
