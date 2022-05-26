package JavaLAb;

import java.util.Scanner;

public class PracticeTwoScannerClass {

	public static void main(String[] args) {

		/*
		 * System.out.println("Hello, please type your name.");
		 * 
		 * Scanner scan = new Scanner(System.in); String input = scan.next();
		 * System.out.println("so your name is : " + input);
		 * System.out.println("So how old are you?"); String myAge = scan.next();
		 * System.out.println("so your age is :" + myAge);
		 * System.out.println("So where are you from?"); String birthPlace =
		 * scan.next(); System.out.println("I see that you are from: " + birthPlace);
		 * System.out.println("Where in Japan exactly are you from?"); String birthCity
		 * = scan.next(); System.out.println("Oh " + birthCity +
		 * "! That is where my wife is from.");
		 */

		/*
		 * System.out.println("Please type in first name: "); Scanner scan2 = new
		 * Scanner(System.in); String firstName = scan2.next();
		 * System.out.println("Please type lastName"); String lastName = scan2.next();
		 * System.out.
		 * println("Please enter your sixteen digit card number followed by the pound key"
		 * ); String cardNumber = scan2.next(); System.out.
		 * println("Now enter the three digit security code at the back of the card");
		 * int securityCode = scan2.nextInt(); System.out.
		 * println("Now choose your four digit pincode followed by the pound key.");
		 * String pinCode = scan2.next(); System.out.println(
		 * "Now reenter the same four digit pincode to confirm the two pincodes match followed by the pound key"
		 * ); String rePinCode = scan2.next(); double currentBalance = 6789;
		 * System.out.println("Your card has been activated. Your current balance is: "
		 * + currentBalance);
		 */

		/*
		 * System.out.println("Please type in first name: "); Scanner scan3 = new
		 * Scanner(System.in); String firstName = scan3.next();
		 * System.out.println("Please type in last name: "); String lastName =
		 * scan3.next(); System.out.println("Please enter grade (9-12): "); int grade =
		 * scan3.nextInt(); System.out.println("Please enter student ID: "); int
		 * studentId = scan3.nextInt(); System.out.println("GPA (0.0 - 4.0)"); double
		 * gpa = scan3.nextDouble();
		 * 
		 * System.out.println("Which student are you looking for? Please type below: ");
		 * String searchName = scan3.next();
		 * 
		 * if (searchName.contains(firstName)) { System.out.println("Type last name: ");
		 * String searchLast = scan3.next(); if (searchLast.contains(lastName) &&
		 * searchName.contains(firstName)) { System.out.println("James' file" +
		 * "\nGrade: " + grade + "\nGPA: " + gpa);
		 */

		/*
		 * System.out.
		 * println("Welcome to T-Mobile. For English, press one, for Spanish, press two"
		 * ); Scanner tMobile = new Scanner(System.in); int language =
		 * tMobile.nextInt();
		 * System.out.println("If you are calling for adding a new line, press one," +
		 * " if your prepaid balance is due, \npress two, if you are calling to find out"
		 * +
		 * " about our most recent rates and promotions, press three. \nFor any other issues"
		 * + " press 4 to be transferred to a customer services representative."); int
		 * options = tMobile.nextInt(); System.out
		 * .println("Weclome to T-Mobile telephone payment. Please enter your 16 digit debet or credit card number"
		 * + " folowed by the pound key."); long cardNumber = tMobile.nextLong();
		 * 
		 * System.out.println("Please enter the name of the card holder"); String
		 * fullName = tMobile.next();
		 * 
		 * System.out.println("Enter the expiration date:"); String expDate =
		 * tMobile.next();
		 * 
		 * System.out.
		 * println("Now enter the three digit security code on the back of the card");
		 * int securityCode = tMobile.nextInt();
		 * 
		 * System.out.
		 * println("Your mobile payment for the month of August of 2021 was successfuly made."
		 * );
		 * 
		 */

		/*
		 * System.out.println("Please type in the first name:"); Scanner student = new
		 * Scanner(System.in); String firstName = student.next();
		 * System.out.println("Please type in last name:"); String lastName =
		 * student.next();
		 * System.out.println("Please choose the grade you are looking for (9-12):");
		 * int grade = student.nextInt();
		 * System.out.println("Please enter the student ID number:"); int studentID =
		 * student.nextInt(); System.out.println("Please enter GPA (0.0 - 4.0):");
		 * double gpa = student.nextDouble();
		 * 
		 * System.out.println("Which student are you looking for? Please type below:");
		 * String searchName = student.next();
		 * 
		 * if (searchName.contains(firstName)) {
		 * System.out.println("Enter last name: "); String searchLast = student.next();
		 * if (searchLast.contains(lastName)) { System.out.println(firstName +
		 * "'s File: " + "\nGrade: " + grade + "\nGPA: " + gpa); } else {
		 * System.out.println("No such student student exists, please try again."); } }
		 */

		/*
		 * System.out.
		 * println("Thank you for calling RC Dental. For English press 1, for Spanish press 2."
		 * ); Scanner dental = new Scanner(System.in); int languageOption =
		 * dental.nextInt(); System.out.
		 * println("If you are health care provider calling to make an inquire, press 1.\n"
		 * + "If you are a new patient trying to schedule an appointment, press 2.\n" +
		 * "If you are a returning patient to either schedule or cancel an appointment, press 3.\n"
		 * + "For any other issue, press 0."); int options = dental.nextInt();
		 * System.out.println("Please enter your name"); String name = dental.next();
		 * System.out.println("Please enter your last name"); String lastName =
		 * dental.next(); System.out.println("Please enter your date of birth"); String
		 * dob = dental.next();
		 * System.out.println("Please select the desired date from the calender below");
		 * String appointmentDate = dental.next(); System.out.
		 * println("Please select the desired time from the date you have chosen");
		 * String time = dental.next(); System.out.
		 * println("You have successfully made your dental appointment. Your appointment is on\n"
		 * + appointmentDate + " at " + time + " oclock." +
		 * " Please bring your insurance card and ID with you.\nAny payments not covered by your insurance will be due at the time\nof your visit."
		 * );
		 */

		System.out.println("Please type the link in the browser");
		Scanner facebook = new Scanner(System.in);
		String link = facebook.next();
		System.out.println("Click on the sign up button");
		System.out.println("Once the sign up page opens, type in your username");
		String userName = facebook.next();
		System.out.println("Now enter your password");
		String password = facebook.next();
		System.out.println("Now re-enter the same password to confirm both passwords match");
		String rePassword = facebook.next(password);
		System.out.println("Please enter a valid email address");
		String emailAddress = facebook.next();
		System.out.println("Now enter a valid phone number");
		String phoneNumber = facebook.next();
		System.out.println("Enter your first name");
		String firstName = facebook.next();
		System.out.println("Enter your last name");
		String lastName = facebook.next();
		System.out.println("Enter your age");
		int age = facebook.nextInt();
		System.out.println("Enter your date of birth");
		String dob = facebook.next();
		System.out.println("Now click on the register button");
		boolean clickReg = facebook.hasNext();
		if (clickReg == false) {
			System.out.println("Congratulations! Your facebook account has been created successfully.");
		} else {
			System.out.println("Your registration faild. Please try again.");
		}

	}

}
