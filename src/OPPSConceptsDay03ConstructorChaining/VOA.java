package OPPSConceptsDay03ConstructorChaining;

public class VOA {

	private String name;
	private String division;
	private int anchors;
	private double frequency;

	public VOA() {
		this.name = "";
		this.division = "";
		this.anchors = 0;
		this.frequency = 0;
	}

	public VOA(String name) {
		this();
		this.name = name;
	}

	public VOA(String name, String division) {
		this(name);
		this.division = division;
	}

	public VOA(String name, String division, int anchors) {
		this(name, division);
		this.anchors = anchors;
	}

	public VOA(String name, String division, int anchors, double frequency) {
		this(name, division, anchors);
		this.frequency = frequency;
	}

}
