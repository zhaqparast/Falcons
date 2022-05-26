package OPPSConceptsDay05InheritanceContinues;

public class DriverOne extends AutoInsurance {

	public DriverOne() {
		super();
	}

	public DriverOne(String driverName, Boolean driverIsExperienced, String vehicleMake, String vehicleModel,
			String vin, String yearMake, String titleStatus, double mileage, boolean coverage, String coverageType,
			boolean roadsideAssistance) {
		super(driverName, driverIsExperienced, vehicleMake, vehicleModel, vin, yearMake, titleStatus, mileage,
				coverageType, coverage, coverageType, roadsideAssistance);
	}

	@Override
	public double plan(double monthlyFee) {
		// if the driver is experienced and the car has less than or equal to 50000
		// miles
		// then assign standard rate otherwise the rates might vary depending on the
		// situation.
		if (isDriverExperienced() == false && getMileage() <= 50000) {
			return super.plan(monthlyFee) + 50;
		} else {
			return super.plan(monthlyFee);
		}
	}

	public void requestRoadsideAssistance(String assistance) {
		if (coverage() == true && getCoverageType() == "Full"
				|| getCoverageType() == "Liability" && roadsideAssistance() == true) {
			System.out.println("Roadside Assistance is on its way. Hang tight.");
		} else if (coverage() == true && getCoverageType() == "Full"
				|| getCoverageType() == "Liability" && roadsideAssistance() == false) {
			System.out.println("Please contact our customer service via phone to discuss the details.");
		}

	}
}
