package OPPSConceptsDay03ConstructorChaining;

public class Kerosene {

	private String chemicalName;
	private String type;
	private int ignitionPoint;
	private String inventor;

	public Kerosene() {
		this.chemicalName = "";
		this.type = "";
		this.ignitionPoint = 0;
		this.inventor = "";
	}

	public Kerosene(String chemicalName) {
		this();
		this.chemicalName = chemicalName;
	}

	public Kerosene(String chemicalName, String type) {
		this(chemicalName);
		this.type = type;
	}

	public Kerosene(String chemicalName, String type, int ignitionPoint) {
		this(chemicalName, type);
		this.ignitionPoint = ignitionPoint;
	}

	public Kerosene(String chemicalName, String type, int ignitionPoint, String inventor) {
		this(chemicalName, type, ignitionPoint);
		this.inventor = inventor;
	}

}
