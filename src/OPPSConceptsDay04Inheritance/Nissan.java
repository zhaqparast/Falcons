package OPPSConceptsDay04Inheritance;

public class Nissan extends Car {

	private int totalNumbersOnTheLot;

	public Nissan() {
		super();
		this.totalNumbersOnTheLot = 0;
	}

	public Nissan(String model, int totalNumbersOnTheLot) {
		super(model);
		this.totalNumbersOnTheLot = totalNumbersOnTheLot;
	}

	public int getTotalNumbersOnTheLot() {
		return totalNumbersOnTheLot;
	}

	public void setTotalNumbersOnTheLot(int totalNumbersOnTheLot) {
		this.totalNumbersOnTheLot = totalNumbersOnTheLot;
	}

}
