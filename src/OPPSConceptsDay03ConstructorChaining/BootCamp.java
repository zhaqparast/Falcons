package OPPSConceptsDay03ConstructorChaining;

public class BootCamp {

	private String name;
	private String location;
	private int duration;
	private double fees;

	public BootCamp() {
		this.name = "";
		this.location = "";
		this.duration = 0;
		this.fees = 0;
	}

	public BootCamp(String name) {
		this();
		this.name = name;
	}

	public BootCamp(String name, String location) {
		this(name);
		this.location = location;
	}

	public BootCamp(String name, String location, int duration) {
		this(name, location);
		this.duration = duration;
	}

	public BootCamp(String name, String location, int duration, double fees) {
		this(name, location, duration);
		this.fees = fees;
	}

}
