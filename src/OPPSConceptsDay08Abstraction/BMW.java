package OPPSConceptsDay08Abstraction;

public class BMW implements Car, SportCar {

	@Override
	public void brake(double speed) {
		System.out.println("BMW is braking.");
	}

	@Override
	public boolean startEngine() {
		System.out.println("BMW is staring the engine");
		return true;
	}

	@Override
	public boolean leftTurnSignal() {
		System.out.println("BMW is turning on left signal.");
		return true;
	}

	@Override
	public boolean rightTurnSignal() {
		System.out.println("BMW is turninig on right signal");
		return true;
	}

	@Override
	public void adjustLeftMirror() {

		System.out.println("BMW is adjusting its left mirror.");
	}

	@Override
	public void adjustRightMirror() {
		System.out.println("BMW is adjusting its right mirror.");
	}

	@Override
	public void turnOnTurbo() {

	}

	public void theNewDefaultMethod() {
		System.err.println("this is the new default method from the Car Interface which is overriden in BMW class.");
	}

}
