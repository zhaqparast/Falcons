package OPPSConceptsDay01Constructor;

public class Dog {

	String name;
	String classification;
	int age;

	public Dog() {
		name = "";
		classification = "";
		age = 0;

	}

	public Dog(String newName) {
		name = newName;
		classification = "";
		age = 0;

	}

	public Dog(String newName, String newClass) {
		name = newName;
		classification = newClass;
		age = 0;

	}

	public Dog(String newName, String newClass, int newAge) {
		name = newName;
		classification = newClass;
		age = newAge;
	}

}
