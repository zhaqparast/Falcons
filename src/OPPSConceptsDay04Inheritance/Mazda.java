package OPPSConceptsDay04Inheritance;

public class Mazda extends Car {

	private String shape;

	public Mazda() {
		super();
		this.shape = "";
	}

	public Mazda(String model, String shape) {
		super(model);
		this.shape = shape;
	}
	
	public String getShape() {
		return shape;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}

}
