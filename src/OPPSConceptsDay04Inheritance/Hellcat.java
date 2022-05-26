package OPPSConceptsDay04Inheritance;

public class Hellcat extends Dodge {

	private String color;
	private int doors;

	public Hellcat() {
		super();
		this.color = "";
		this.doors = 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

}
