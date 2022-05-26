package OPPSConceptsDay03ConstructorChaining;

public class Nile {

	private String location;
	private double width;
	private int length;
	private String continent;

	public Nile() {
		this.location = "";
		this.width = 0;
		this.length = 0;
		this.continent = "";
	}

	public Nile(String location) {
		this();
		this.location = location;
	}

	public Nile(String location, double width) {
		this(location);
		this.width = width;
	}

	public Nile(String location, double width, int length) {
		this(location, width);
		this.length = length;
	}

	public Nile(String location, double width, int length, String continent) {
		this(location, width, length);
		this.continent = continent;
	}

}
