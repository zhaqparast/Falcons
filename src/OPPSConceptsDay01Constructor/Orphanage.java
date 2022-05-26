package OPPSConceptsDay01Constructor;

public class Orphanage {

	String name;
	String location;
	int capacity;

	public Orphanage() {
		name = "";
		location = "";
		capacity = 0;
	}

	public Orphanage(String newName) {
		name = newName;
		location = "";
		capacity = 0;
	}

	public Orphanage(String newName, String newLocation) {
		name = newName;
		location = newLocation;
		capacity = 0;
	}

	public Orphanage(String newName, String newLocation, int fullCapacity) {
		name = newName;
		location = newLocation;
		capacity = fullCapacity;
	}

}
