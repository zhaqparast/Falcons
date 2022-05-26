package InterviewQuestions;

public class ReversingNumbers06 {

	public static void main(String[] args) {

		// Can you switch the values of two variables without creating a third variable?
		// For example, int x = 10 and int y = 15. Can you switch the values of x with
		// y?

		// Here is how it is done.

		int x = 10;
		int y = 15;
		System.out.println("The value of x: " + x + "\nThe value of y: " + y);
		System.out.println();

		// First, we add both of x and y and assign the total value to x
		x = x + y;
		// Then we subtract y from x and assign its value to y
		y = x - y;
		// Then we subtract y from x and assign its value to x. This would switch the
		// values of both variables.
		x = x - y;
		System.out.println("The value of x: " + x + "\nThe value of y: " + y);
		System.out.println();

		// It could also be done via the multiplication and division operations as shown
		// below

		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("The value of x: " + x + "\nThe value of y: " + y);
		System.out.println();

		// The same process also works with the use of bitwise operator xor

		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("The value of x: " + x + "\nThe value of y: " + y);
		System.out.println();

		// Convert the int to String and then reverse the String using a loop,
		// then convert the reversed number to that same number

		int num = 68768;
		System.out.println(num);

		// First, I am creating a String and assign the value of num to it String using
		// the String.valueOf()
		// method
		String numberToString = String.valueOf(num);

		// Then I create another String which will be empty
		String reversedString = "";

		// Then I loop through the first String
		for (int i = numberToString.length() - 1; i >= 0; i--) {
			// Then I would have add the elements of the initial String that I have
			// subtracted to the reversed String
			reversedString += numberToString.charAt(i);
		}
		// Then I assign the value of the reversed String to my number using the
		// Integer.valueOfString() method
		num = Integer.valueOf(reversedString);
		System.out.println(num);

	}

}
