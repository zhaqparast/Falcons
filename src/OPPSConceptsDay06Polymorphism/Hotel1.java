package OPPSConceptsDay06Polymorphism;

public class Hotel1 extends Hotel {

	@Override
	public void hotelName() {
		System.out.println("JW Marriott");
	}

	@Override
	public void hotelLocation() {
		System.out.println("Ankara");
	}

	@Override
	public double getLodging(double lodging) {
		return 125.9;
	}

}
