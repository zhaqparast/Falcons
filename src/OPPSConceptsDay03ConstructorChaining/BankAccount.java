package OPPSConceptsDay03ConstructorChaining;

public class BankAccount {

	private String firstName;
	private String lastName;
	private int accountNumber;
	private double balance;
	private int phoneNumber;

	public BankAccount() {
		this.firstName = "";
		this.lastName = "";
		this.accountNumber = 0;
		this.balance = 0;
		this.phoneNumber = 0;
		System.out.println("Constructor: public BankAccount()");

	}

	// the "this" keyword has two use cases
	// 1 - this.variable or method name
	// 2 - this() <<this will call any of the constructors of your class. Match the
	// signature>>
	public BankAccount(int accountNumber) {

		this();
		this.accountNumber = accountNumber;
		System.out.println("Constructor: public BankAccount( int accountNumber)");

	}

	public BankAccount(int accountNumber, double balance) {

		this(accountNumber);
		this.balance = balance;
		System.out.println("Constructor: public BankAccount(int accountNumber, double balance)");
	}

	public BankAccount(int accountNumber, double balance, String firstName, String lastName) {
		this(accountNumber, balance);
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println(
				"Constructor: BankAccount(int accountNumber, double balance, String firstName, String lastName)");

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
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String toString() {
		return "(First Name: " + firstName + ", Last Name: " + lastName + ")";
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("The amount requested is more that your existing balance");
		} else {
			this.balance -= amount;
			System.out.println("$" + amount + " is deducted from your account. And $" + amount * 0.01
					+ " interest is also deducted as well.\nYour current balance is $" + balance);
			this.balance -= amount * 0.01;
		}
	}

}
