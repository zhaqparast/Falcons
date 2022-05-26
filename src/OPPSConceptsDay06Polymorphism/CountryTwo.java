package OPPSConceptsDay06Polymorphism;

public class CountryTwo extends Elephant {

	@Override
	public void origin() {
		System.out.println("This elephant is originally from Africa");
	}

	public void age() {
		System.out.println("This elephant is " + 11 + " years old.");
	}

}
