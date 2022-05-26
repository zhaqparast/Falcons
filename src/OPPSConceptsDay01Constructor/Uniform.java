package OPPSConceptsDay01Constructor;

public class Uniform {

	String name;
	String type;
	int pairs;

	public Uniform() {
		name = "";
		type = "";
		pairs = 0;
	}

	public Uniform(String uName) {
		name = uName;
		type = "";
		pairs = 0;
	}

	public Uniform(String uName, String uType) {
		name = uName;
		type = uType;
		pairs = 0;
	}

	public Uniform(String uName, String uType, int uPairs) {
		name = uName;
		type = uType;
		pairs = uPairs;
	}

}
