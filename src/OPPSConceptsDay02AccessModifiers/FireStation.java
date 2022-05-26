package OPPSConceptsDay02AccessModifiers;

public class FireStation {

	private String name;
	private int noOfFirefighters;
	private int noOfFireTrucks;
	private int noOfWorkShifts;
	private String firefighterName;

	public FireStation() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfFirefighters() {
		return noOfFirefighters;
	}

	public void setNoOfFirefighters(int noOfFirefighters) {
		this.noOfFirefighters = noOfFirefighters;
	}

	public int getNoOfFireTrucks() {
		return noOfFireTrucks;
	}

	public void setNoOfFireTrucks(int noOfFireTrucks) {
		this.noOfFireTrucks = noOfFireTrucks;
	}

	public int getNoOfWorkShifts() {
		return noOfWorkShifts;
	}

	public void setNoOfWorkShifts(int noOfWorkShifts) {
		this.noOfWorkShifts = noOfWorkShifts;
	}

	public String getFirefighterName() {
		return firefighterName;
	}

	public void setFirefighterName(String firefighterName) {
		this.firefighterName = firefighterName;
	}

}
