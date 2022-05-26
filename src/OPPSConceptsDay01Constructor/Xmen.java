package OPPSConceptsDay01Constructor;

public class Xmen {

	String cast;
	String character;
	double length;

	public Xmen() {
		cast = "";
		character = "";
		length = 0;
	}

	public Xmen(String newCast) {
		cast = newCast;
		character = "";
		length = 0;
	}

	public Xmen(String newCast, String newCharacter) {
		cast = newCast;
		character = newCharacter;
		length = 0;
	}

	public Xmen(String newCast, String newCharacter, double fullLength) {
		cast = newCast;
		character = newCharacter;
		length = fullLength;
	}

}
