package OPPSConceptsDay04Inheritance;

public class Honda extends Car {

	private String shape;

	public Honda() {
		super();
		this.shape = "";
	}

	public Honda(String model, String shape) {
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
