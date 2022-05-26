package OPPSConceptsDay05InheritanceContinues;

public class SavingAccount extends Customer {

	public SavingAccount() {
		super();
	}

	public SavingAccount(String firstName, String lastName, int accountNumber, double balance) {
		super(firstName, lastName, accountNumber, balance);
	}

	public double calcSavingInterest() {
		return getBalance() * .02;
	}

	@Override
	public double calculateAccountCharges() {
		if (getBalance() < 1000) {
			return super.calculateAccountCharges() + 5;
		} else {
			return 0;
		}
	}

}
