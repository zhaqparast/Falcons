package JavaLAb;

public class ForLoopPractice {

	public static void main(String[] args) {

		// Create a for loop that will print out the following message 5 times

		String coding = "Coding is fun but it is also driving me crazy.";
		for (int index = 1; index <= 5; index++) {
			System.out.println(coding);
		}

		// Create a loop to count from 1 to 10

		int count = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();

		int countRev = 10;
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + ", ");
		}
		System.out.println();

		String tekSchool = "I attended the TEK school for my SDET boot camp";
		for (int i = 0; i < tekSchool.length(); i++) {
			System.out.print(tekSchool.charAt(i) + " ");
		}
		System.out.println();

		// create an int x; and give value0 0. In loop, if the value of iterated char is
		// equal to char == '0'
		// increment x and print the value of x

		int x = 0;
		for (int index = 0; index < tekSchool.length(); index++) {
			if (tekSchool.charAt(index) == 'o') {
				System.out.print(tekSchool.charAt(index));
			} else {
				System.out.print("*");
			}
		}
		System.out.println();

		// please create a while loop, while the condition is true, it will print out
		// the num variable. While looping, the num variable will increment by one. Once
		// it reaches numMax, it has to stop.

		int num = 0;
		int numMax = 10;
		while (num <= numMax) {
			System.out.print(num++ + ", ");
		}
		System.out.println("\n");

		int number = 15;
		boolean condition = true;
		while (condition) {
			if (number < 10) {
				System.out.println("The number is less than " + number);
				condition = false;
			} else if (number < 15) {
				System.out.println("The number is smaller than " + number);
				condition = false;
			} else {
				System.out.println("The number is <= 20");
				condition = false;
			}
		}

	}

}
