package OPPSConceptsDay04Inheritance;

public class X7 extends BMW {

	private String x7Color;

	public X7() {
		super();
		x7Color = "";
	}

	public String getX7Color() {
		return x7Color;
	}

	public void setX7Color(String x7Color) {
		this.x7Color = x7Color;
	}

	public String getBmwVersion() {
		return "This is being ran from X7 class";
	}

}
