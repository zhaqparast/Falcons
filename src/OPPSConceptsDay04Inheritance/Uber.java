package OPPSConceptsDay04Inheritance;

public class Uber extends Car {

	private double fare;

	public Uber() {
		super();
		this.fare = 0;
	}

	public Uber(String model, double fare) {
		super(model);
		this.fare = fare;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

}
