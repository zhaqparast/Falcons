package OPPSConceptsDay03ConstructorChaining;

public class AliBaba {

	private String businessName;
	private String ceo;
	private String homeCountry;
	private double capital;

	public AliBaba() {

		this.businessName = "";
		this.ceo = "";
		this.homeCountry = "";
		this.capital = 0;

	}

	public AliBaba(String businessName) {
		this();
		this.businessName = businessName;
	}

	public AliBaba(String businessName, String ceo) {
		this(businessName);
		this.ceo = ceo;
	}

	public AliBaba(String businessName, String ceo, String homeCountry) {
		this(businessName, ceo);
		this.homeCountry = homeCountry;
	}

	public AliBaba(String businessName, String ceo, String homeCountry, double capital) {
		this(businessName, ceo, homeCountry);
		this.capital = capital;
	}

}
