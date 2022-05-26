package JavaBasicsPackage;

public class PracticeOne {

	public static void main(String[] args) {

		// Creating a receipt

		String location = "MAKARIOU";
		int storeNumber = 531;
		String waiter = "Michael Daruta";
		String date = "08/09/2019";
		System.out.println("DINE IN");

		String order_01 = "1\tGarlic Bread 4 Pcs\n";
		String order_02 = "1\tCheese Sticks\n\tLarge Cheese Pizza";

		double total = 15.00;

		/*
		 * System.out.println("Location: " + location); System.out.println("Store #: " +
		 * storeNumber); System.out.println("Waiter Name: " + waiter);
		 * System.out.println("Date: " + date);
		 * 
		 * System.out.println(order_01 + "\n" + order_02 + "\n" );
		 * 
		 * System.out.println("Total: \t$" + total);
		 * System.out.println("************************************");
		 * System.out.println("*************Prereceipt*************");
		 * System.out.println("************************************\n\n\n");
		 */

		String address = " 1234 Lorem Ipsum, Dolor";
		String phoneNumber = "123-456-7890";
		String dateAndTime = "01-01-2018\t\t10:35";
		double lorem = 6.50;
		double ipsum = 7.50;
		double dolor_sit = 48.00;
		double amet = 9.30;
		double concectetur = 11.90;
		double adipiscing_elite = 1.20;
		double sed_do = 0.40;

		double total_price = lorem + ipsum + dolor_sit + amet + concectetur + adipiscing_elite + sed_do;
		double tax = 8.00;
		double final_price = tax + total_price;

		System.out.println("Receipt\n");
		System.out.println("Address: " + address + "\n");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n");
		System.out.println("Date: " + dateAndTime + "\n");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n");
		System.out.println("Lorem\t\t\t" + lorem);
		System.out.println("Ipsum\t\t\t" + ipsum);
		System.out.println("Dolor Sit\t\t\t" + dolor_sit);
		System.out.println("Amet\t\t\t" + amet);
		System.out.println("Concectetur\t\t\t" + concectetur);
		System.out.println("Adipiscing Elite\t\t\t" + adipiscing_elite);
		System.out.println("Sed Do\t\t\t" + sed_do + "\n");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n");
		System.out.println("Amount\t\t\t" + final_price + "\n");
		System.out.println("Sub-Total\t\t" + total_price);
		System.out.println("Sales Tax\t\t" + tax);
		System.out.println("Balance\t\t\t" + final_price);

	}

}
