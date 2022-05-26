package OPPSConceptsDay01Constructor;

public class Lima {

	String name;
	String country;
	int population;

	public Lima() {
		name = "";
		country = "";
		population = 0;
	}

	public Lima(String cityName) {
		name = cityName;
		country = "";
		population = 0;
	}

	public Lima(String cityName, String countryName) {
		name = cityName;
		country = countryName;
		population = 0;
	}

	public Lima(String cityName, String countryName, int sensus) {
		name = cityName;
		country = countryName;
		population = sensus;
	}

}
