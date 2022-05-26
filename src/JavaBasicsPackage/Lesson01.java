package JavaBasicsPackage;

public class Lesson01 {

	public static void main(String[] args) {

		// Lesson One - Creating Variables

		System.out.println("First Java Program!\n");

		double price = 12.99;
		double taxRate = 3.87 / 100;
		double discount = 0.055;
		int quantity = 7;

		double totalBeforeTax = (price * quantity) - (price * quantity * discount);
		double totalAfterTax = totalBeforeTax + (totalBeforeTax * taxRate);

		System.out.println(totalAfterTax + "\n");

		// Create a String with the value "This is ".

		String s1 = "This is ";
		System.out.println(s1);

		// create an int with the value of 10

		int num1 = 10;
		System.out.println(num1);

		// create String s2 with the value "th time that I am asking this!"

		String s2 = "th time that I am asking this!";
		System.out.println(s2);

		// create String s3 with the value "No one is answering me?"

		String s3 = "No one is answering me? But why?";
		System.out.println(s3);

		// using the variables above, form one sentence and print it
		// you need to use one System.out.println(); but print the text in two lines
		// and before you print this, you need to leave two lines empty.

		System.out.println("\n\n" + s1 + num1 + s2 + "\n" + s3);

	}

}
