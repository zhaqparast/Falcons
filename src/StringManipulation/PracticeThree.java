package StringManipulation;

public class PracticeThree {

	public static void main(String[] args) {

		// Assume that you have a math operation in a String. Try to do the a math and
		// return the result 1+2+5-4+3

		String num = "1+2+5-4+3";
		String[] numbers = num.split("[^0-9]");
		String[] signs = num.replaceAll("0-9", " ").split(" ");

		for (String result : numbers) {
			System.err.println(result);
		}

		for (int i = 0; i < signs.length; i++) {
			System.out.println(signs[i]);
		}

	}

}
