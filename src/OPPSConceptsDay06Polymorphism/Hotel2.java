package OPPSConceptsDay06Polymorphism;

public class Hotel2 extends Hotel {

	@Override
	public void hotelName() {
		System.out.println("Hyatt Regency");
	}

	@Override
	public void hotelLocation() {
		System.out.println("Dubai");
	}

	@Override
	public double getLodging(double lodging) {
		return 179.9;
	}

}
