package InterviewQuestions;

import OPPSConceptsDay03ConstructorChaining.Nile;

public class FizzBuzz02 {

	public static void main(String[] args) {

		// Write a function that would take two numbers (Start and End). Print Fizz for
		// numbers that divisible by 3, print Buzz for the numbers that are divisible by
		// 5 and print FizzBuzz for numbers that are divisible by both of the numbers.
		// Print the other numbers.

		// if the number is divisible by 3 and 5, then let's print FizzBuzz
		// but if it is only divisible by 3, then print Fizz
		// and if the number is divisible by 5, then print Buzz
		// otherwise, print the given number
		printFizzBuzz(2, 50);

		printAliBaba(1, 234);

		// Write a function the would take two numbers (start and end). Print Barak for
		// number that divisible by 7 and print Wal for the number divisible by 9 and
		// Barakwal for the number that is divisible by both 7 and 9

		printBarakWal(11, 789);

		// Write a function that would take two numbers (Start and End). Print Charlie
		// for the number that is divisible by 5 and print Chaplin for the nuber that is
		// divisible by 7 and print Charlie Chapli for the number that is divisible by
		// both 5 and 7

		printCharlieChaplin(238, 876);

		// Write a function that would take two numbers (Start and End).Print Dil for
		// the number that is divisible by 2 and print Bar for the number that is
		// divisible by 3 and print DilBar for a number which is divisible by both of
		// the
		// numbers at the same time.

		printDilBar(65, 8792);

		// Write a function that would take two numbers (Start and End). Print Eco for
		// the number that is divisible by 4 and Logy for the number that is divisible
		// by 7 and Ecology for the number that is divisible for both 4 and 7;

		printEcology(7567, 89899);

		// Write a function that would take two numbers (start and end). Print Fire for
		// the number that is divisible by 5 and Fox for the number that is divisible by
		// 6 and print FireFox for the number that is divisible by both 5 and 6;

		printFireFox(6687, 87867);

		// Write a function that would take two numbers (start and end). Print Ghost for
		// the number that is divisible by 7 and print Rider for the number that is
		// divisible by 9 and if the number if is divisible by both 7 and 9, then print
		// Ghost Rider

		printGhostRider(658, 876);

		// Write a function that would take two numbers(Start & End). If the number is
		// divisible by 11 print Ham, if the number is divisible by 13, then print Dard,
		// but if the number is divisible by both 11 and 13, then print out Hamdard

		printHamdard(26725, 97970);

		// Write a function that would take two numbers (Start and End). If the number
		// is divisible by 4, print Indo. If the number is divisible by 7, print nesia.
		// If the number is divisible by both 4 and 7, print Indonesia.

		printIndonesia(68278, 99878);

		// Write a function that would take two numbers (start and end). If the number
		// is divisible by 9, print Jack but if the number is divisible by 7, print
		// Sparrow. But if the number is divisible by both of the number, print Jack
		// Sparrow.

		printJackSparrow(757, 5767);

		// Write a function that would take two numbers(start and end).If the number is
		// divisible by 3 and 7 at the same time, then print kilometer but if the number
		// is only divisible by 3, then print kilo or if the number is only divisible by
		// 9, print meter

		printKiloMeter(8768, 96876);

		printMountainDew(687);
	}

	// Here, let`s create a method. Since the method does not change nor does it
	// return anything, let's make it static and void

	public static void printKiloMeter(int start, int end) {
		// Here< i would have to loop through the numbers
		for (int numbers = start; numbers <= end; numbers++) {
			// Here I have to provide my condition
			if (numbers % 3 == 0 && numbers % 7 == 0) {
				System.out.println("KiloMeter");
			} else if (numbers % 3 == 0) {
				System.out.println("Kilo");
			} else if (numbers % 7 == 0) {
				System.out.println("meter");
			} else {
				System.out.println(numbers);
			}
		}
	}

	// Let's create a method. Since it does not return anything nor does it change,
	// we will make it static and void

	public static void printJackSparrow(int start, int end) {
		// Here I have to loop through the numbers to find the desired element
		for (int number = start; number <= end; number++) {
			// Here I would provide the condition
			if (number % 9 == 0 && number % 7 == 0) {
				System.out.println("Jack Sparrow");
			} else if (number % 9 == 0) {
				System.out.println("Jack");
			} else if (number % 7 == 0) {
				System.out.println("Sparrow");
			} else {
				System.out.println(number);
			}
		}
	}

	// Let's create a method. Since it does not change in the future and does not
	// return anything, it might be static

	public static void printIndonesia(int start, int end) {
		// Here I would like to loop through the numbers to get the desired elements
		for (int numbers = start; numbers <= end; numbers++) {
			// Here I have to provide the conditions
			if (numbers % 4 == 0 && numbers % 7 == 0) {
				System.out.println("Indonesia");
			} else if (numbers % 4 == 0) {
				System.out.println("Indo");
			} else if (numbers % 7 == 0) {
				System.out.println("nesia");
			} else {
				System.out.println(numbers);
			}
		}
	}

	// Lets create a method. Since it does not change later nor does it return
	// anything, it should be static and void

	public static void printHamdard(int start, int end) {
		// Here I have to loop through the numbers to get the desired element
		for (int numbers = start; numbers <= end; numbers++) {
			// Here I have to provide the condition
			if (numbers % 11 == 0 && numbers % 13 == 0) {
				System.out.println("Hamdard");
			} else if (numbers % 11 == 0) {
				System.out.println("Ham");
			} else if (numbers % 13 == 0) {
				System.out.println("Dard");
			} else {
				System.out.println(numbers);
			}
		}
	}

	// Let's create a method. Since it does not change nor return anything, it
	// should be static
	public static void printGhostRider(int start, int end) {
		// Here I have to loop through the numbers to find the desired number
		for (int number = start; number <= end; number++) {
			// Here I have to provide the conditions
			if (number % 7 == 0 && number % 9 == 0) {
				System.out.println("Ghost Rider");
			} else if (number % 7 == 0) {
				System.out.println("Ghost");
			} else if (number % 9 == 0) {
				System.out.println("Rider");
			} else {
				System.out.println(number);
			}
		}
	}

	// Let's first create a method that would take two ints and be static since it
	// would not change and would not return anything

	public static void printFireFox(int start, int end) {
		// Here I have to loop through the numbers to get the desired elements
		for (int numbers = start; numbers <= end; numbers++) {
			// Here, I have to provide the conditions for the method
			if (numbers % 5 == 0 && numbers % 6 == 0) {
				System.out.println("FireFox");
			} else if (numbers % 5 == 0) {
				System.out.println("Fire");
			} else if (numbers % 6 == 0) {
				System.out.println("Fox");
			} else {
				System.out.println(numbers);
			}
		}
	}

	// Lets first create a method that should be static since it won`t change and
	// should have no return type

	public static void printEcology(int start, int end) {
		// Here I have to loop through the numbers to find the desired elements
		for (int numbers = start; numbers <= end; numbers++) {
			// Here I would provide my conditions
			if (numbers % 4 == 0 && numbers % 7 == 0) {
				System.out.println("Ecology");
			} else if (numbers % 4 == 0) {
				System.out.println("Eco");
			} else if (numbers % 7 == 0) {
				System.out.println("Logy");
			} else {
				System.out.println(numbers);
			}
		}
	}

	// I first need to create a method that would be static in nature since it does
	// not change and it would have no return type

	public static void printDilBar(int start, int end) {
		// Here, I have to go through the loop of the numbers to get the desired numbers
		for (int number = start; number <= end; number++) {
			// inside the implementation of the loop, I have to provide my conditions
			if (number % 2 == 0 && number % 3 == 0) {
				System.out.println("DilBar");
			} else if (number % 2 == 0) {
				System.out.println("Dill");
			} else if (number % 3 == 0) {
				System.out.println("Bar");
			} else {
				System.out.println(number);
			}
		}
	}

	// I first need to create a method outside the main method
	// It would be static since it does not change and would have no return type.

	public static void printCharlieChaplin(int start, int end) {
		// I have to loop through these numbers to find the desired numbers
		for (int number = start; number <= end; number++) {
			if (number % 5 == 0 && number % 7 == 0) {
				System.out.println("Charlie Chaplin");
			} else if (number % 5 == 0) {
				System.err.println("Charlie");
			} else if (number % 7 == 0) {
				System.out.println("Chaplin");
			} else {
				System.out.println(number);
			}
		}
	}

	public static void printBarakWal(int start, int end) {
		for (int number = start; number <= end; number++) {
			if (number % 7 == 0 && number % 9 == 0) {
				System.out.println("BarakWal");
			} else if (number % 7 == 0) {
				System.out.println("Barak");
			} else if (number % 9 == 0) {
				System.out.println("Wal");
			} else {
				System.out.println(number);
			}
		}
	}

	public static void printAliBaba(int start, int end) {
		for (int number = start; number <= end; number++) {
			if (number % 3 == 0 && number % 8 == 0) {
				System.out.println("Ali Baba");
			} else if (number % 3 == 0) {
				System.out.println("Ali");
			} else if (number % 8 == 0) {
				System.out.println("Baba");
			} else {
				System.out.println(number);
			}
		}
	}

	public static void printFizzBuzz(int start, int end) {
		for (int number = start; number <= end; number++) {
			if (number % 3 == 0 && number % 7 == 0) {
				System.out.println("FizzBuzz");
			} else if (number % 3 == 0) {
				System.out.println("Fizz");
			} else if (number % 7 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(number);
			}
		}
	}

	public static void printMountainDew(int number) {
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println("Mountain Dew");
			} else if (i % 3 == 0) {
				System.out.println("Mountain");
			} else if (i % 7 == 0) {
				System.out.println("Dew");
			} else {
				System.out.println(i);
			}
		}
	}

}
