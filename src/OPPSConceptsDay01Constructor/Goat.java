package OPPSConceptsDay01Constructor;

public class Goat {

	String name;
	String breed;
	int age;

	public Goat() {
		name = "";
		breed = "";
		age = 0;
	}

	public Goat(String newName) {
		name = newName;
		breed = "";
		age = 0;
	}

	public Goat(String newName, String newBreed) {
		name = newName;
		breed = newBreed;
		age = 0;
	}

	public Goat(String newName, String newBreed, int newAge) {
		name = newName;
		breed = newBreed;
		age = newAge;
	}

}
