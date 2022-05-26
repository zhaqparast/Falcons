package ExceptionHandling;

public class ExceptionHandlingPracticeOne {

	public static void main(String[] args) {

		double x = 4;
		int[] y = { 0, 11, 25, 0 };
		String string = null;

		try {
			System.err.println(x / y[2]);
			// System.out.println(string.length());
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			try {

			} catch (Exception e2) {
			}
			System.err.println("Something went wrong with your code, not sure what?");
		} catch (Exception e) {
			System.out.println("This is where the exception happend: " + e.getClass());
		} finally {
			System.out.println("This is the finally block and it will run regardless of the other catch blocks");
		}

		// System.out.println("End of main method");

		divide(20, 0);
	}

	public static void divide(int a, int b) throws ArithmeticException {
		System.out.println(a / b);
	}
}
