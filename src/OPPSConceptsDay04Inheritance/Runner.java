package OPPSConceptsDay04Inheritance;

public class Runner {

	public static void main(String[] args) {

		X6 niceCar = new X6();
		niceCar.setBmwVersion("X6");
		niceCar.setX6Color("Black");

		System.out.println(niceCar.getX6Color());
		System.out.println(niceCar.getBmwVersion());

		X7 evenNicerCar = new X7();
		evenNicerCar.setBmwVersion("Surprise");
		System.out.println(evenNicerCar.getBmwVersion());

	}

}
