package OPPSConceptsDay08Abstraction;

public interface Car {

	public void brake(double speed);

	public boolean startEngine();

	public boolean leftTurnSignal();

	public boolean rightTurnSignal();

	public void adjustLeftMirror();

	public void adjustRightMirror();

	public default void theNewDefaultMethod() {

	}

	public static void something() {
		System.out.println("this is the method that does something");
	}

}
