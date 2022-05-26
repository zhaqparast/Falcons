package OPPSConceptsDay05InheritanceContinues;

public class BusinessAccount extends Customer {

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(String firstName, String lastName, int accountNumber, double balance) {
		super(firstName, lastName, accountNumber, balance);
	}

	@Override
	public double calculateAccountCharges() {
		if (getBalance() < 1000) {
			return super.calculateAccountCharges() + 15;
		} else {
			return 0;
		}
	}

}
