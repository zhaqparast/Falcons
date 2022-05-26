package OPPSConceptsDay03ConstructorChaining;

public class PostOffice {

	private String name;
	private double distance;
	private String location;
	private int customers;

	public PostOffice() {
		this.name = "";
		this.distance = 0;
		this.location = "";
		this.customers = 0;
	}

	public PostOffice(String name) {
		this();
		this.name = name;
	}

	public PostOffice(String name, double distance) {
		this(name);
		this.distance = distance;
	}

	public PostOffice(String name, double distance, String location) {
		this(name, distance);
		this.location = location;
	}

	public PostOffice(String name, double distance, String location, int customers) {
		this(name, distance, location);
		this.customers = customers;
	}

}
