package OPPSConceptsDay01Constructor;

public class Bear {

	String family;
	String name;
	int age;

	public Bear() {
		family = "";
		name = "";
		age = 0;
	}

	public Bear(String newFamily) {
		family = newFamily;
		name = "";
		age = 0;
	}

	public Bear(String newFamily, String newName) {
		family = newFamily;
		name = newName;
		age = 0;
	}

	public Bear(String newFamily, String newName, boolean ture) {
		family = newFamily;
		name = newName;
		age = 0;
	}

	public Bear(String newFamily, String newName, int newAge) {
		family = newFamily;
		name = newName;
		age = newAge;

	}

}
