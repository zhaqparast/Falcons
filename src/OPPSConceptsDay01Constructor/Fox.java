package OPPSConceptsDay01Constructor;

public class Fox {

	String name;
	String breed;
	String location;
	int age;

	public Fox() {
		name = "";
		breed = "";
		location = "";
		age = 0;
	}

	public Fox(String newName) {
		name = newName;
		breed = "";
		location = "";
		age = 0;
	}

	public Fox(String newName, String newBreed) {
		name = newName;
		breed = newBreed;
		location = "";
		age = 0;
	}

	public Fox(String newName, String newBreed, String newLocation) {
		name = newName;
		breed = newBreed;
		location = newLocation;
		age = 0;
	}

	public Fox(String newName, String newBreed, String newLocation, int newAge) {
		name = newName;
		breed = newBreed;
		location = newLocation;
		age = newAge;
	}
}
