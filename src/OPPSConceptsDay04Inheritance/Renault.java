package OPPSConceptsDay04Inheritance;

public class Renault extends Car{
	
	private String countryOfOrigin;
	
	public Renault() {
		super();
		this.countryOfOrigin = "";
	}
	
	public Renault(String model, String country) {
		super(model);
		this.countryOfOrigin = countryOfOrigin;
	}
	
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

}
