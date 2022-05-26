package OPPSConceptsDay05InheritanceContinues;

public class CheckingAccount extends Customer {

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String firstName, String lastName, int accountNumber, double balance) {

		super(firstName, lastName, accountNumber, balance);
	}

	@Override
	public double calculateAccountCharges() {
		if (getBalance() < 1000) {
			return super.calculateAccountCharges() + 10;
		} else {
			return 0;
		}

	}

	public boolean transferWithZelle(double amount) {
		// charges for Zelle is 10% of the amount being transferred.
		// if the balance is more than charges + amount, then transfer
		// otherwise, dont transfer.
		double amountToBeDeducted = amount + (amount * .1);
		if (amountToBeDeducted < getBalance()) {
			withdraw(amountToBeDeducted);
			System.out.println("Zelle transfer successfull: $" + amount + " was sent and $" + (amount * .1)
					+ " charges were deducted from your account.");
			return true;
		} else {
			System.out.println("Zelle transfer failed: $" + amount + " and " + (amount * .1)
					+ " charges is more than your existing balance of $" + getBalance() + ".");
			return false;
		}
	}
}