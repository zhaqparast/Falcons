package OPPSConceptsDay01Constructor;

public class Elk {

	String name;
	String location;
	int age;

	public Elk() {
		name = "";
		location = "";
		age = 0;
	}

	public Elk(String newName) {
		name = newName;
		location = "";
		age = 0;
	}

	public Elk(String newName, String newLocation) {
		name = newName;
		location = newLocation;
		age = 0;
	}

	public Elk(String newName, String newLocation, int newAge) {
		name = newName;
		location = newLocation;
		age = newAge;
	}

}
