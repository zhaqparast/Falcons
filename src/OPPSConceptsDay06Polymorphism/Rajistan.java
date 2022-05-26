package OPPSConceptsDay06Polymorphism;

public class Rajistan extends India {

	@Override
	public int population(int pop) {
		return 20987601;
	}

	@Override
	public double area(double area) {
		return 687639.6;
	}

	@Override
	public void govStyle() {
		System.out.println("State Government");
	}

}
