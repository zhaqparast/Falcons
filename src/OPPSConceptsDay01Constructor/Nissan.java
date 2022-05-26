package OPPSConceptsDay01Constructor;

public class Nissan {

	String model;
	String variant;
	int capacity;

	public Nissan() {
		model = "";
		variant = "";
		capacity = 0;
	}

	public Nissan(String newModel) {
		model = newModel;
		variant = "";
		capacity = 0;
	}

	public Nissan(String newModel, String newVariant) {
		model = newModel;
		variant = newVariant;
		capacity = 0;
	}

	public Nissan(String newModel, String newVariant, int fullCapacity) {
		model = newModel;
		variant = newVariant;
		capacity = fullCapacity;
	}

}
