package OPPSConceptsDay01Constructor;

public class Kiwi {
	String name;
	String origin;
	int age;

	public Kiwi() {
		name = "";
		origin = "";
		age = 0;
	}

	public Kiwi(String newName) {
		name = newName;
		origin = "";
		age = 0;
	}

	public Kiwi(String newName, String originName) {
		name = newName;
		origin = originName;
		age = 0;
	}

	public Kiwi(String newName, String originName, int newAge) {
		name = newName;
		origin = originName;
		age = newAge;
	}

}
