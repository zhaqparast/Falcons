package OPPSConceptsDay01Constructor;

public class Jungle {

	String name;
	String country;
	double size;

	public Jungle() {
		name = "";
		country = "";
		size = 0;
	}

	public Jungle(String jungleName) {
		name = jungleName;
		country = "";
		size = 0;
	}

	public Jungle(String jungleName, String countryName) {
		name = jungleName;
		country = countryName;
		size = 0;
	}

	public Jungle(String jungleName, String countryName, double xSquareMiles) {
		name = jungleName;
		country = countryName;
		size = xSquareMiles;
	}

}
