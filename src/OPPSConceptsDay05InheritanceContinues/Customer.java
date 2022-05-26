package OPPSConceptsDay05InheritanceContinues;

public class Customer {

	private String firstName;
	private String lastName;
	private int accountNumber;
	private double balance;

	public Customer() {
		this.firstName = "";
		this.lastName = "";
		this.accountNumber = 0;
		this.balance = 0;
	}

	public Customer(String firstName, String lastName, int accountNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {

		if (this.accountNumber == 0) {
			this.accountNumber = accountNumber;
		} else {
			System.out.println("The account number is already assigned to this Customer.");
		}
		// check to see if the account number is already provided,if so,
		// then do not assign a new number and print a message that account is set.
		// If it is the first time, then we are assigning the account number
		// for this object
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		// add the amount to the balance
		this.balance += amount;
	}

	public void withdraw(double amount) {
		// if the amount is less that the balance, subtract
		// the amount from the balance otherwise,print a message
		// and say that amount is more than the existing balance

		if (amount < balance) {
			System.out.println("Waitdrawal successfull: $" + amount + " has been withdrawn");
			this.balance -= amount;
		} else {
			System.out.println("The amount $" + amount
					+ " you are trying to withdraw, is more than your existing balance of $" + balance);
		}
	}

	public double calculateAccountCharges() {

		// if the balance is more than $1000, then there would be no charges,
		// otherwise, the charges would be 5% of the balance
		// +$10 for checking account
		// +$5 for saving account
		// + $15 for business account
		if (balance >= 1000) {
			return 0;
		} else {
			return balance * 0.05;
		}

	}

	// create a toString method
	@Override
	public String toString() {
		return "[First Name: " + this.firstName + ", Last Name: " + this.lastName + ", Account Number: "
				+ this.accountNumber + ", Balance: $" + this.balance + "]";
	}

}
