package OPPSConceptsDay03ConstructorChaining;

public class Island {

	private String name;
	private String location;
	private int population;
	private double area;

	public Island() {
		this.name = "";
		this.location = "";
		this.population = 0;
		this.area = 0;
	}

	public Island(String name) {
		this();
		this.name = name;
	}

	public Island(String name, String location) {
		this(name);
		this.location = location;
	}

	public Island(String name, String location, int population) {
		this(name, location);
		this.population = population;
	}

	public Island(String name, String location, int population, double area) {
		this(name, location, population);
		this.area = area;
	}

}
