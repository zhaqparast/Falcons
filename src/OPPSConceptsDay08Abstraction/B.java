package OPPSConceptsDay08Abstraction;

public class B implements InterfaceOne {

	@Override
	public int calcInterest(double value, double percent) {
		return 0;
	}

	@Override
	public void printSomething(String something) {
		System.out.println("This is class b");
	}

}
