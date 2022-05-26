package OPPSConceptsDay04Inheritance;

public class Forester extends Subaru {

	private double price;
	private String color;

	public Forester() {
		super();
		this.price = 0;
		this.color = "";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
