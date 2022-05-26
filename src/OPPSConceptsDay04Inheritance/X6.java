package OPPSConceptsDay04Inheritance;

public class X6 extends BMW {

	private String x6Color;

	public X6() {
		super();
		x6Color = "";
	}

	public String getX6Color() {
		return x6Color;
	}

	public void setX6Color(String x6Color) {
		this.x6Color = x6Color;
	}

	public String getBmwVersion() {
		return "This method is getting ran from X6 class";
	}

}
