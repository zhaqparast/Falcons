package OPPSConceptsDay06Polymorphism;

public class Bill1 extends Dollor {

	@Override
	public void bill() {
		System.out.println("One Dollor Bill");
	}

	@Override
	public void photo() {
		System.out.println("George Washington");
	}

}
