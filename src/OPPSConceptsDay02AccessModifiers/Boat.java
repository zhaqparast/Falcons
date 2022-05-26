package OPPSConceptsDay02AccessModifiers;

public class Boat {

	private String make;
	private String model;
	private int speed;
	private boolean flagFlying;

	public Boat() {

	}

	public String getMake() {
		return make;
	}

	public void setMake(String newMake) {
		make = newMake;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String newModel) {
		model = newModel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int mph) {
		speed = mph;
	}

}
