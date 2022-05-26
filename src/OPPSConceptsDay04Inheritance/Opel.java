package OPPSConceptsDay04Inheritance;

public class Opel extends Car {

	private String fuelType;

	public Opel() {
		super();
		this.fuelType = "";
	}

	public Opel(String model, String fuelType) {
		super(model);
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

}
