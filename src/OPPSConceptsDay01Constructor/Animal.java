package OPPSConceptsDay01Constructor;

public class Animal {

	String name;
	String type;
	int age;
	int legs;

	public Animal() {
		name = "";
		type = "";
		age = 0;
		legs = 0;

	}

	public Animal(String animalName) {
		name = animalName;
		type = "";
		age = 0;
		legs = 0;

	}

	public Animal(String animalName, String animalType) {
		name = animalName;
		type = animalType;
		age = 0;
		legs = 0;

	}

	public Animal(String animalName, String animalType, int animalAge) {
		name = animalName;
		type = animalType;
		age = animalAge;
		legs = 0;
	}

	public Animal(String animalName, String animalType, int animalAge, int noOfLegs) {
		name = animalName;
		type = animalType;
		age = animalAge;
		legs = noOfLegs;
	}

}
