package OPPSConceptsDay04Inheritance;

public class Kia extends Car {

	public double mileage;

	public Kia() {
		super();
		this.mileage = 0;
	}

	public Kia(String model, double mileage) {
		super(model);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

}
