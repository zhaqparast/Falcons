package OPPSConceptsDay06Polymorphism;

public class Bill3 extends Dollor {

	@Override
	public void bill() {
		System.out.println("Ten Dollar Bill");
	}

	@Override
	public void photo() {
		System.out.println("Alexander Hamilton");
	}

}
