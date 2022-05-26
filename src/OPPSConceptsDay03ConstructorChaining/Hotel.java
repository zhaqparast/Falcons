package OPPSConceptsDay03ConstructorChaining;

public class Hotel {

	private int stars;
	private String name;
	private double costOfStayPerNight;
	private String nearestAirport;

	public Hotel() {
		this.name = "";
		this.stars = 0;
		this.costOfStayPerNight = 0;
		this.nearestAirport = "";
	}

	public Hotel(String name) {
		this();
		this.name = name;
	}

	public Hotel(String name, int stars) {
		this(name);
		this.stars = stars;
	}

	public Hotel(String name, int stars, double costOfStayPerNight) {
		this(name, stars);
		this.costOfStayPerNight = costOfStayPerNight;
	}

	public Hotel(String name, int stars, double costOfStayPerNight, String nearestAirport) {
		this(name, stars, costOfStayPerNight);
		this.nearestAirport = nearestAirport;
	}

}
