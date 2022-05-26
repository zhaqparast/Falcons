package JavaBasicsPackage;

import java.util.Scanner;

public class Lesson8DoWhilleLoop {

	public static void main(String[] args) {

		// There are three main differences between while and do while loops
		// - 1 - The first one is the difference in syntax

		// - 2 - The second difference is the way it these two are executed:
		// For example, with the while loop, we first have to evaluate the condition of
		// the loop and then, if the condition is true, execute the block of code until
		// the condition changes to false. But if the condition is false at the first
		// place, we won`t execute any iteration at all.
		// But for the Do while loop, we first have to run the the code and then
		// evaluate the condition of the loop, regardless of the condition of the
		// loop being either true or false. This leads to our third and last difference.

		// - 3 - The third difference is that the execution of do while loop guarantees
		// at least one iteration before the condition of the loop is evaluated to
		// either true or false wherein the case of while loop, the loop's condition
		// should be evaluated to true to execute the iteration. Otherwise, it won`t
		// execute at all.

		int i = 1;
		do {
			System.out.println("Say hello to my little friend " + i++);
		} while (i <= 5);

		int j = 1;
		while (j <= 5) {
			System.out.println("Say hello to Tony \"The Scarface\" Montana " + j++);
		}

		// In the the while loop below, the condition is false and it will never be
		// executed thus it won`t print anything at all.
		int k = 100;
		while (k <= 5) {
			System.out.println("hello " + k++);
		}
		// In the do while loop below, the block of code will be executed at least once
		// despite the fact that the condition of the loop is false.

//		do {
//			System.out.println("This is the \"do while\" loop " + k++);
//		} while (k <= 5);
//
//		Scanner scan1 = new Scanner(System.in);
//		int number;
//		do {
//			System.out.print("Enter a number between 1 and 10");
//			number = scan1.nextInt();
//		} while (number < 1 || number > 10);
//
//		System.out.println(number + " is between 1 and 10.\n");

		int alpha = 15;
		do {
			System.out.println("The value of alpha is " + alpha++ + " on this iteration.");
		} while (alpha <= 10);

		int bravo = 444;
		do {
			System.out.println("The value of bravo is " + bravo-- + " on this iteration");
		} while (bravo >= 123);

		System.out.println();

//		String month;
//		do {
//			System.out.println("Enter the the first month");
//			Scanner charlie = new Scanner(System.in);
//			String firstMonth = charlie.next();
//			System.out.println("Enter the name of the second month");
//			String secondMonth = charlie.next();
//			System.out.println("Enter the name of the third month");
//			String thirdMonth = charlie.next();
//			System.out.println("Enter the name of the fourth month");
//			String fourthMonth = charlie.next();
//			System.out.println("Enter the name of the fifth month");
//			String fifthMonth = charlie.next();
//			System.out.println("Enter the name of the sixth month");
//			String sixthMonth = charlie.next();
//			break;
//
//		} while (month == "August");

		int studentAge = 8;
		if (studentAge >= 7) {
			System.out.println("This student is ready for school.");
			do {
				System.out.println(studentAge);
			} while (false);
		} else if (studentAge >= 18) {
			System.out.println("This student is ready for college.");
		} else {
			System.out.println("This student is not ready for school. He is barely " + studentAge + " years old.");
		}

	}

}
