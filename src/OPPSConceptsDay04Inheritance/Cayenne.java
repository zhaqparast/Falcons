package OPPSConceptsDay04Inheritance;

public class Cayenne extends Porsche {

	private int cylinder;

	public Cayenne() {
		super();
		this.cylinder = 0;
	}

	public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

}
