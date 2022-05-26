package OPPSConceptsDay05InheritanceContinues;

public class AutoInsurance {

	private String driverName;
	private boolean driverExperienced;
	private String vehicleMake;
	private String vehicleModel;
	private String yearMake;
	private String vin;
	private String titleStatus;
	private double mileage;
	private boolean coverage;
	private String coverageType;
	private boolean roadsideAssistance;

	public AutoInsurance() {
		this.driverName = "";
		this.driverExperienced = false;
		this.vehicleMake = "";
		this.vehicleModel = "";
		this.vin = "";
		this.yearMake = "";
		this.titleStatus = "";
		this.mileage = 0;
		this.coverageType = "";
		this.coverage = false;
		this.roadsideAssistance = false;
	}

	public AutoInsurance(String driverName, Boolean driverIsExperienced, String vehicleMake, String vehicleModel,
			String vin, String yearMake, String titleStatus, double mileage, String vehicleStatus, boolean coverage,
			String coverageType, boolean roadsideAssistance) {
		this.driverName = driverName;
		this.driverExperienced = driverExperienced;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.vin = vin;
		this.yearMake = yearMake;
		this.titleStatus = titleStatus;
		this.mileage = mileage;
		this.coverage = coverage;
		this.coverageType = coverageType;
		this.roadsideAssistance = roadsideAssistance;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public boolean isDriverExperienced() {
		return driverExperienced;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		if (vin == "") {
			this.vin = vin;
		} else {
			System.out.println("The vin number for this vehicle has already been registered.");
		}

	}

	public String getYearMake() {
		return yearMake;
	}

	public void setYearMake(String yearMake) {
		this.yearMake = yearMake;
	}

	public String getTitleStatus() {
		return titleStatus;
	}

	public void setTitleStatus(String titleStatus) {
		this.titleStatus = titleStatus;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public boolean coverage() {
		return coverage;
	}

	public String getCoverageType() {
		return coverageType;
	}

	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}

	public boolean roadsideAssistance() {
		return roadsideAssistance;
	}

	public double plan(double monthlyFee) {
		// if the driver is experienced and the car has less than or equal to 50000
		// miles
		// then assign standard rate otherwise the rates might vary depending on the
		// situation.
		if (isDriverExperienced() == true && mileage <= 50000) {
			return this.plan(monthlyFee);
		} else {
			return 0;
		}

	}

	public void requestRoadsideAssistance(String assistance) {
		// if the driver is experienced and has coverage
		//
		if (isDriverExperienced() == true && coverage == true) {
			if (roadsideAssistance == true) {
				System.out.println("Roadside Assistance is on its way.");
			} else {
				System.out.println(
						"You don`t have Roadside Assistance in your current coverage, please call support for details.");
			}
		}
	}

	public String toString() {
		return "Driver Name: " + driverName + "\nIs The Driver Experienced: " + isDriverExperienced() + "\n"
				+ "Vehicle Make: " + vehicleMake + "\nVehicle Model: " + vehicleModel + "\nYear Make: " + yearMake
				+ "\n" + "VIN: " + vin + "\nTitle Status: " + titleStatus + "\nMileage: " + mileage + "\nCoverage: "
				+ coverage + "\nCoverage Type: " + coverageType + "\n" + "Roadside Assistance: " + roadsideAssistance;

	}
}
