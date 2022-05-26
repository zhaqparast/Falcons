package JavaBasicsPackage;

import java.util.Random;
import java.util.Scanner;

public class Lesson7WhileLoop {

	public static void main(String[] args) {

		int i = 0;
		int x = 0;
		while (i < 10) {
			System.out.println(i++);
			System.out.println();
		}

		int A = 78;
		while (A > 10) {
			System.out.println(A--);
		}

//		Random rand = new Random();
//		int num = rand.nextInt(10) + 1;
//
//		System.out.println("I am thinking of a number between 1 and 10. Try to guess it.");
//
//		Scanner scan = new Scanner(System.in);
//
//		while (true) {
//			int guess = scan.nextInt();
//
//			if (guess > num) {
//				System.out.println("Too high!\n");
//			} else if (guess < num) {
//				System.out.println("Too low!\n");
//			} else {
//				System.out.println("Correct!");
//				break;
//			}
//		}

		int grades = 25;
		boolean pass = false;
		while (pass == false) {
			System.out.println("You failed! Your grades are: " + grades);
			System.out.println("Since you watched this iteration, I will give you 1 point ");
			grades++;

			if (grades > 60) {
				pass = true;
			}
		}

		int y = 78;
		int z = 99;

		while (y < z) {
			if (y <= z) {
				System.out.println("Please add one on every iteratiion" + y);
				y++;
			}
		}

		int num1 = 7;
		while (num1 > 3) {
			System.out.println(--num1 + " ");
		}

		int myShift = 6;

		while (myShift > 0) {
			System.out.println(myShift-- + "\n");
		}

		int myPills = 30;
		while (myPills > 0) {
			System.out.println(myPills-- + "\n");
		}

		// create a loop that prints from a - z

		char alphabet = 97;
		while (alphabet <= 122) {
			System.out.print(alphabet++ + " ");

		}
		System.out.println();

		char alphabet2 = 'a';
		while (alphabet2 <= 'z') {
			System.out.print(alphabet2++ + " ");
		}

		// find out if a number is palindrome

		System.out.println();
		char capLetter = 'Z';
		while (capLetter >= 'A') {
			System.out.print(capLetter-- + " ");
		}
		System.out.println();
		char symbol = '!';
		while (symbol <= '?') {
			System.out.print(symbol++ + " ");
		}

		System.out.println();
		char symbol2 = '+';
		while (symbol2 >= ' ') {
			System.out.print(symbol2-- + " ");
		}

		boolean smsSubscription = true;
		int smsToBeSent = 567;

		while (smsSubscription && smsToBeSent >= 0) {
			System.out.println("Whitney Elementary School Welcomes you all. " + smsToBeSent-- + " ");
		}

		int dishesToBeWashed = 234;
		boolean dishWashingLiquid = false;
		boolean warmWater = true;

		while (warmWater && dishesToBeWashed >= 0) {
			System.out.println(dishesToBeWashed--);

			if (dishWashingLiquid && !warmWater) {
				System.out.println(--dishesToBeWashed + "Use cold water\n");
			} else {
				System.out.println("Don`t wash the dishes!\n");
			}
		}

//		Scanner scan2 = new Scanner(System.in);
//		int theNumber = scan2.nextInt();
//
//		while (theNumber < 1 || theNumber > 10) {
//			System.out.println(theNumber + " is not between 1 and 10. Please try again.\n");
//			theNumber = scan2.nextInt();
//		}
//		System.out.println(theNumber + " is between 1 and 10.");

		int toursMade = 0;
		boolean truckIsWorking = true;
		while (toursMade <= 10 && truckIsWorking) {
//			System.out.println("Print out " + toursMade++ + " times\n");
			System.out.println(toursMade++);
		}

		String sayMyName = "Jimmy \"The Tulip\" Tudeski";
		int one = 1;
		while (one <= 5) {
			System.out.println("Say " + sayMyName + " " + one++ + " times\n");
		}

		String guests = "guest";
		int count = 14;

		while (count >= 1) {
			System.out.println(
					count-- + " " + guests + " departed the hotel each time a taxi showed up in front of the loby\n");
		}

		boolean cleaningSupplies = true;
		int weeklyRoomService = 7;
		while (cleaningSupplies && weeklyRoomService >= 1) {
			System.out.println(weeklyRoomService--);
		}

		boolean sewingMachine = true;
		int shirt = 5;
		while (sewingMachine && shirt < 0) {
			System.out.println(shirt--);
		}

		int time = 56;
		int hoursOfWork = time / 7;
		boolean weekend = true;

		while (weekend && !(time > 56 || time < 1) && hoursOfWork <= 0) {
			System.out.println(hoursOfWork + "\n");
		}

		boolean libraryIsOpen = true;
		int booksToBeRead = 5;
		while (libraryIsOpen && booksToBeRead >= 1) {
			System.out.print(booksToBeRead--);

//			if (!libraryIsOpen && booksToBeRead <=0) {
//				System.out.println(
//						"I have to wait for the library to open and then borrow " + booksToBeRead-- + " books.\n");
//			}
		}

		boolean computerIsOn = true;
		int pagesToRead = 0;

		while (computerIsOn && pagesToRead <= 12) {
			System.out.println(pagesToRead++);
		}

		boolean tea = false;
		int cupsToBeFilled = 0;
		while (tea && cupsToBeFilled <= 13) {
			System.out.println(cupsToBeFilled++);

		}

		boolean chives = true;
		int boolaniToBeMade = 0;
		while (chives && boolaniToBeMade <= 20) {
			System.out.println("Please make " + boolaniToBeMade++ + " boolani.\n");
		}

		int gallonsOfGasNeeded = 0;
		boolean gasStationIsOpen = true;
		while (gasStationIsOpen && gallonsOfGasNeeded <= 17) {
			System.out.println("Fill up " + gallonsOfGasNeeded++ + " gallons of gas.\n");
		}

		boolean isShining = true;
		int minutes = 0;
		while (isShining && minutes <= 30) {
			System.out.println("Run for " + minutes++);
		}

		boolean myCurrentPlace = false;
		int tries = 0;
		while (!myCurrentPlace && tries <= 10) {
			System.out.println("I will try " + tries++ + " times till I find a new apartment to move into.\n");
		}

		boolean myCarStarts = true;
		int hoursOfTravel = 13;
		while (myCarStarts && hoursOfTravel >= 0) {
			System.out.println(hoursOfTravel--);
		}

		boolean tiresWornout = true;
		int numberOfTiresToBeReplaced = 2;
		while (tiresWornout && numberOfTiresToBeReplaced <= 0)
			System.out.println(numberOfTiresToBeReplaced++);
		if (tiresWornout && numberOfTiresToBeReplaced <= 2) {
			System.out.println(numberOfTiresToBeReplaced++);
		}
		
		
	}

}
