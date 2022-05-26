package OPPSConceptsDay03ConstructorChaining;

public class Radio {

	private String stationName;
	private double frequency;
	private String frequencyType;
	private int broadcastingSince;

	public Radio() {
		this.stationName = "";
		this.frequency = 0;
		this.frequencyType = "";
		this.broadcastingSince = 0;
	}

	public Radio(String stationName) {
		this();
		this.stationName = stationName;
	}

	public Radio(String stationName, double frequency) {
		this(stationName);
		this.frequency = frequency;
	}

	public Radio(String stationName, double frequency, String frequencyType) {
		this(stationName, frequency);
		this.frequencyType = frequencyType;
	}

	public Radio(String stationName, double frequency, String frequencyType, int broadcastingSince) {
		this(stationName, frequency, frequencyType);
		this.broadcastingSince = broadcastingSince;
	}

}
