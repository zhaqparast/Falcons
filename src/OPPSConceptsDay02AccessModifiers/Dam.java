package OPPSConceptsDay02AccessModifiers;

public class Dam {

	private String name;
	private String location;
	private double elevation;
	private double height;
	private double width;

	public Dam() {

	}

	public String getName() {
		return name;
	}

	public void setName(String damName) {
		name = damName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String newLocation) {
		location = newLocation;
	}

	public double getElevation() {
		return elevation;
	}

	public void setElevaton(double elevation) {
		this.elevation = elevation;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
