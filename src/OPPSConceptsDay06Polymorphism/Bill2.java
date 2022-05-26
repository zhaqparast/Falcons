package OPPSConceptsDay06Polymorphism;

public class Bill2 extends Dollor {

	@Override
	public void bill() {
		System.out.println("Five Dollar Bill");
	}

	@Override
	public void photo() {
		System.out.println("Abraham Lincoln");
	}

}
