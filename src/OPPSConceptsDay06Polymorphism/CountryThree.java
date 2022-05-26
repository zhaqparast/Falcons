package OPPSConceptsDay06Polymorphism;

public class CountryThree extends CountryTwo {

	@Override
	public void origin() {
		System.out.println("This elephant is also from Africa");
	}

	@Override
	public void age() {
		System.out.println("This is a baby elephant. He is just " + 2 + " years old.");
	}

}
