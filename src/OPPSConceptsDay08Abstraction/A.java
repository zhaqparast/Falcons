package OPPSConceptsDay08Abstraction;

public class A implements InterfaceOne {

	@Override
	public int calcInterest(double value, double percent) {
		return 0;
	}

	@Override
	public void printSomething(String something) {
		System.out.println("this is class a");
	}

}
