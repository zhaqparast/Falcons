package OPPSConceptsDay02AccessModifiers;

public class QuickQuack {

	private String name;
	private String location;
	private int employees;
	private int numberOfCarsWashed;
	private double singleCarWashCost;
	private double monthlyPackage;
	private String monthlyPackageType;

	public QuickQuack() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public int getNumberOfCarsWashed() {
		return numberOfCarsWashed;
	}

	public void setNumberOfCarsWashed(int numberOfCarsWashed) {
		this.numberOfCarsWashed = numberOfCarsWashed;
	}

	public double getSingleCarWashCost() {
		return singleCarWashCost;
	}

	public void setSingleCarWashCost(double singleCarWashCost) {
		this.singleCarWashCost = singleCarWashCost;
	}

	public double getMontlyPackage() {
		return monthlyPackage;
	}

	public void setMonthlyPackage(double monthlyPackage) {
		this.monthlyPackage = monthlyPackage;
	}

	public String getMonthlyPackageType() {
		return monthlyPackageType;
	}

	public void setMonthlyPackageType(String monthlyPackageType) {
		this.monthlyPackageType = monthlyPackageType;
	}

}
