package OPPSConceptsDay03ConstructorChaining;

public class Runner {

	public static void main(String[] args) {

		BankAccount obj1 = new BankAccount(123);
		BankAccount obj2 = new BankAccount(147, 50.52);
		BankAccount obj3 = new BankAccount(686, 7657.89, "James", "Bond");
		System.out.println(obj3.getFirstName());
		System.out.println(obj3.getFullName());
		System.out.println(obj3);
		obj3.deposit(60);
		System.out.println(obj3.getBalance());
		obj3.withdraw(598);
		System.out.println(obj3.getBalance());
	}

}
