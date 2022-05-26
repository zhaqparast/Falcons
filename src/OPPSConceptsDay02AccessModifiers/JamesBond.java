package OPPSConceptsDay02AccessModifiers;

public class JamesBond {

	private String name;
	private String category;
	private int leadCharacter;
	private String leadActor;
	private double budget;
	private String releaseDate;
	private String releaseCountry;

	public JamesBond() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLeadCharacter() {
		return leadCharacter;
	}

	public void setLeadCharacter(int leadCharacter) {
		this.leadCharacter = leadCharacter;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReleaseCountry() {
		return releaseCountry;
	}

	public void setReleaseCountry(String releaseCountry) {
		this.releaseCountry = releaseCountry;
	}

}
