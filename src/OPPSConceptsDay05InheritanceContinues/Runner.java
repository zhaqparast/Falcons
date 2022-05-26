package OPPSConceptsDay05InheritanceContinues;

public class Runner {

	public static void main(String[] args) {

		CheckingAccount obj1 = new CheckingAccount();
		obj1.deposit(900);
		System.out.println(obj1);
		System.out.println("Charges for obj1: $" + obj1.calculateAccountCharges());

		SavingAccount sa1 = new SavingAccount();
		sa1.deposit(900);
		System.out.println("Charges for sa1: $" + sa1.calculateAccountCharges());

		BusinessAccount ba1 = new BusinessAccount();
		ba1.deposit(900);
		System.out.println("Charges for ba1: $" + ba1.calculateAccountCharges());

		System.out
				.println("__________________________________________________________________________________________");
		System.out.println(obj1.transferWithZelle(100));
		System.out.println(obj1);
		System.out
				.println("___________________________________________________________________________________________");
		System.out.println(obj1.transferWithZelle(800));
		System.out.println();

		/*
		 * DriverOne d1 = new DriverOne(); d1.setDriverName("James Jones");
		 * d1.setVehicleMake("Lexus"); d1.setCoverageType("Full"); d1.setMileage(67000);
		 * d1.setTitleStatus("Clean"); d1.setVehicleModel("CT");
		 * d1.setVehicleMake("LEXUS"); d1.setVin("10687KGDNVC8921");
		 * d1.setYearMake("2015"); d1.coverage();
		 * 
		 * System.out.println(d1);
		 */

	}

}
