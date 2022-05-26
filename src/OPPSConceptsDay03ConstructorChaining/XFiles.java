package OPPSConceptsDay03ConstructorChaining;

public class XFiles {

	private String cast;
	private int firstBroadcast;
	private int lastBroadcast;
	private double budget;

	public XFiles() {
		this.cast = "";
		this.firstBroadcast = 0;
		this.lastBroadcast = 0;
		this.budget = 0;
	}

	public XFiles(String cast) {
		this();
		this.cast = cast;
	}

	public XFiles(String cast, int firstBroadcast) {
		this(cast);
		this.firstBroadcast = firstBroadcast;
	}

	public XFiles(String cast, int firstBroadcast, int lastBroadcast) {
		this(cast, firstBroadcast);
		this.lastBroadcast = lastBroadcast;
	}

	public XFiles(String cast, int firstBroadcast, int lastBroadcast, double budget) {
		this(cast, firstBroadcast, lastBroadcast);
		this.budget = budget;
	}

}
