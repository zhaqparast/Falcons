package ExceptionHandling;

public class ExceptionHandlingPractice {

	public static void main(String[] args) {

		int alpha = 17;
		int[] bravo = { 0, 56, 12, 8, 0, 0 };
		String[][] str = { { "Too Late", "Too Close", "Too Early" }, { "Too Short", "Too Many", "Too Far" } };
		String str2 = null;

		try {
			System.out.println(str2.length());
		} catch (NullPointerException e) {
			System.out.println("A NullPointerException was caught");
		}
		try {
			System.out.println(alpha / bravo[5]);
		} catch (ArithmeticException e) {
			System.out.println("ArrayIndexOutOfBoundsException was caught and handled");
		}
		try {
			System.out.println(str[4][1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException was caught and handled");
		}

		try {
			divideANumber(19, 14);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException was caught and handled.");
		}

	}

	public static void divideANumber(int a, double b) throws ArithmeticException {
		if (a == 0 || b == 0) {
			System.out.println("This throw an ArithmeticException which will be handled.");
		} else {
			System.out.println(a / b);
		}

	}

	public static String carMake(String make) throws Exception {
		if (make == "Lexus") {
			return make;
		} else {
			return null;
		}
	}

}
