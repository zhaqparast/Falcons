package OPPSConceptsDay01Constructor;

public class Project {

	String name;
	String location;
	double budget;

	public Project() {
		name = "";
		location = "";
		budget = 0;
	}

	public Project(String pName) {
		name = pName;
		location = "";
		budget = 0;
	}

	public Project(String pName, String pLocation) {
		name = pName;
		location = pLocation;
		budget = 0;
	}

	public Project(String pName, String pLocation, int pBudget) {
		name = pName;
		location = pLocation;
		budget = pBudget;
	}

}
