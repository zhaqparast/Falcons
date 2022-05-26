package OPPSConceptsDay04Inheritance;

public class Astra extends Opel {

	private int cylinder;

	public Astra() {
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
