package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PrimitiveIterator.OfDouble;

public class FindingSecondLargestNumber08 {

	public static void main(String[] args) {

		double[] alpha = { 87, 56, 67, 12, 34, 90, 77, 99 };
		// Can you give us the second highest number of the double array of alpha

		// I would have to loop through this array
		// I first have to find the max number in this array
		double largest = alpha[0];
		double secondLargestNum = alpha[0];
		for (int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] > largest) {
				secondLargestNum = largest;
				largest = alpha[i];
			} else if (alpha[i] > secondLargestNum) {
				secondLargestNum = alpha[i];
			}
		}
		System.err.println(secondLargestNum);

		// Then find the second largest number from the array

		double[] bravo = { 12, 23, 34, 45, 56, 67, 78, 8, 90 };

		// I first have to create the smallest and largest variables which will keep
		// track of the largest and the second largest elements in this array
		double largestNumber = 0;
		double secondLargestNumber = 0;

		// Next we have to create a loop to find these two elements in the array
		for (int i = 0; i < bravo.length; i++) {

			// Next we have to define our condition to find the two elements
			if (bravo[i] > largestNumber) {
				secondLargestNumber = largestNumber;
				largestNumber = bravo[i];
			} else if (bravo[i] > secondLargestNumber) {
				secondLargestNumber = bravo[i];

			}

		}
		System.out.println(secondLargestNumber);

		// Find the second largest number in an array

		// There are two different approaches to do this. The first one is sorting the
		// array as shown below:

		int[] charlie = { 67, 45, 12, -23, 67, 56, 30 };

		// We store the length of the array in another variable as show below:
		int allElements = charlie.length;

		// Then we use the .sort() method of the Arrays and pass the array
		// into its parameter as follows:
		Arrays.sort(charlie);

		// Lets print out our sorted array to see what has happened
		// We should print the array with the index number - 1 because the index number
		// starts at 0
		// This would give us the largest number
		System.out.println(charlie[allElements - 1]);

		// Finally we print out the our sorted array with the array name and index
		// number - 2 which will give us the number of the second larget number inside
		// the sorted array
		System.out.println(charlie[allElements - 2]);

		// But the Arrays.sort method does not work if we have duplicate elements in an
		// array. For example, if we add another element 67 to the array above, the
		// result would be 67 as the second largest number not 56

		System.out.println(charlie[allElements - 2]);

		// Write a function that would find the second largest element in an Array of
		// int

		// There are two ways to achieve this:

		// The first way is through sorting the array as shown below

		// We create the array and another variable that will store the size of the
		// array
		// of the array
		int[] delta = { 23, 12, -9, 67, 34, 78 };
		int size = delta.length;

		// Then we sort the array using the Arrays.sort() method. The array will be
		// sorted in ascending order
		Arrays.sort(delta);

		// Once the array is sorted, we will have to subtract 2 from the length of the
		// array to give us the second largest number because the index starts from zero
		System.err.println(delta[size - 2]);
		System.out.println();

		// The second way is as follows:

		// We create an array
		double[] eco = { 32, 56, 12, 89, 45, -7, 111, 20, 99, 11 };

		// Since we are trying to find the second largest number, we first have to find
		// the largest number and then the second largest number. To do so, we need to
		// initialize two variables, one for the largest number and another for the
		// second largest number
		double theLargestNumber = eco[0];
		double theSecondLargetNumber = eco[0];

		// Then we have to loop through the array to find these numbers
		// First, we have to find the largest number
		for (double firstNumber : eco) {
			// Here I have to define my condition to find the largest number
			if (firstNumber > theLargestNumber) {
				theLargestNumber = firstNumber;
			}
		}
		System.out.println("The largest number is: " + theLargestNumber);
		System.out.println();

		// Then we should loop through the array again to find the second largest number
		for (double secondNumber : eco) {
			// Here I have to define the condition for finding the second largest number
			if (secondNumber > theSecondLargetNumber && secondNumber < theLargestNumber) {
				theSecondLargetNumber = secondNumber;
			}
		}
		System.err.println("The second largest number is: " + theSecondLargetNumber);
		System.out.println();

		// Write a function that would find the count of the second most char in the
		// String below

		String fox = "Six sick hicks nick six slick bricks with picks and sticks bricks sick "
				+ "six slick six bricks picks slick sick hicks nick slick six bricks.";

		// Since we are looking for the second largest element, we first have to find
		// the largest element and then the second largest element

		// In order to do so, we have to create two variable that would store the counts
		// of both elements
		int countOfMostlyUsedElement = Integer.MIN_VALUE;
		int countOfSecondMostlyUsedElement = Integer.MIN_VALUE;

		// First, I have to store the String in an array of chars and use the
		// .replaceAll() method to get rid of all of the spaces

		char[] allFoxChars = fox.replaceAll(" ", "").toLowerCase().toCharArray();
		// System.out.println(allFoxChars);

		// Then, I have to store all of the elements of the char array to a HashMap
		// The HashMap will take Character as keys and Integer as value
		HashMap<Character, Integer> finalCountOfChars = new HashMap<Character, Integer>();

		// Then I have to loop through the array of chars and assign each element to the
		// HashMap
		for (int i = 0; i < allFoxChars.length; i++) {
			// Here, I have to define the conditions for assigning each element to the
			// HashMap
			if (finalCountOfChars.containsKey(allFoxChars[i])) {
				// If the element already exists in the HashMap, I would have to increase the
				// count of it
				finalCountOfChars.put(allFoxChars[i], finalCountOfChars.get(allFoxChars[i]) + 1);
			} else {
				// If the element does not exist in the HashMap, I will find it and assign it
				// for the very first time
				finalCountOfChars.put(allFoxChars[i], 1);
			}
		}
		System.out.println(finalCountOfChars);

		// Now I have to loop through all of the values of the HashMap to find the
		// largest and second largest use case of any char using the .keySet() method of
		// the HashMap

		for (int v : finalCountOfChars.values()) {
			// Here, I have to define the conditions to get each value
			if (v > countOfMostlyUsedElement) {
				// This is in case the count of value is larger than the number of the mostly
				// used value
				countOfMostlyUsedElement = v;
			} else if (v > countOfSecondMostlyUsedElement && v < countOfMostlyUsedElement) {
				// This is in case the count of value is smaller than the count of the larger
				// number but larger than the count of the rest of the elements
				countOfSecondMostlyUsedElement = v;
			}
		}

		for (char c : finalCountOfChars.keySet()) {
			//
			if (finalCountOfChars.get(c) == countOfSecondMostlyUsedElement) {
				System.out
						.println("The letter " + c + " has the second largest use case in the String fox. It was used "
								+ countOfSecondMostlyUsedElement + " times.");
			}
			System.out.println();

		}

		// Write a function that would find the second mostly used character in the
		// String below:

		String golf = "Imagine an imaginary menagerie manager managing an imaginary menagerie.";
		System.out.println(golf);

		// Since we are looking for the second largest use case of a character, I would
		// have to find the largest use case first and then find the second largest use
		// case. For that, I have to create two variables to store the count of each use
		// case

		int countMostChars = Integer.MIN_VALUE;
		int countSecondMostChars = Integer.MIN_VALUE;

		// First, I would replace all of the spaces in the String and assign the String
		// to an array of chars.
		char[] golf1 = golf.replaceAll(" ", "").toLowerCase().toCharArray();
		// System.out.println(golf1);

		// Then I would have to create a HashMap and store the char array in it. The
		// HashMap would take Character as key and Integer as value
		HashMap<Character, Integer> finalCountOfGolfChars = new HashMap<Character, Integer>();

		// Then I have to loop through the char array and assign each element to the
		// HashMap

		for (int i = 0; i < golf1.length; i++) {
			// Here, I have to define the condition for assigning each character to the
			// HashMap
			if (finalCountOfGolfChars.containsKey(golf1[i])) {
				// This is in case the element already exists in the HashMap. If so, I would
				// have to increment the count of the element
				finalCountOfGolfChars.put(golf1[i], finalCountOfGolfChars.get(golf1[i]) + 1);
			} else {
				// This is in case the element does not exist in the HashMap. If so, I would
				// have to assign it to the HashMap for the very first time
				finalCountOfGolfChars.put(golf1[i], 1);
			}
		}

		// Then I have to loop through the values of the HashMap to find the highest
		// count of characters
		for (int v : finalCountOfGolfChars.values()) {
			// Here, I have to define my condition for counting the values
			if (v > countMostChars) {
				countMostChars = v;
			} else if (v > countSecondMostChars && v < countMostChars) {
				countSecondMostChars = v;
			}

		}

		// Then I have to loop through all the keys of the HashMap to find the count of
		// all keys

		for (char c : finalCountOfGolfChars.keySet()) {
			// Here, I have to define my condition
			if (finalCountOfGolfChars.get(c) == countSecondMostChars) {
				System.out.println("The alphabet " + c
						+ " is the second mostly used alphabate in String golf and it has been repeated "
						+ countSecondMostChars + " times.");
			}
			System.out.println();
		}

		// Write a function that would count the second mostly used character in the
		// String below:

		String hi = "What's up Tom. How is everybody doing? I hope no one has testes positive for Covid-19 duirng their stay at this hotel.";

		// Since we are looking for the highest and second highest use case of
		// characters, we have to create two variables of type int and assign the
		// minimum values to them

		int highestCharCount = Integer.MIN_VALUE;
		int secondHighestCharCount = Integer.MIN_VALUE;

		// Then, I have to assign the String to an array of chars using the
		// .toCharArray() method. While doing so, I have to make sure I get rid of all
		// of the spaces in the String using the .replaceAll() method and also ignore
		// the upper case characters.
		char[] hichars = hi.toLowerCase().replaceAll(" ", "").toCharArray();

		// Then I have to assign the array of char to a HashMap. The HashMap would take
		// Character as Key and Integer as Value. The keys will store each char and the
		// values would store the count of each char.
		HashMap<Character, Integer> totalCountOfChars = new HashMap<Character, Integer>();

		// Then I have to loop through the array of chars and assign each char to the
		// HashMap
		for (int i = 0; i < hichars.length; i++) {
			// Here, I have to define the condition for assigning each char
			if (totalCountOfChars.containsKey(hichars[i])) {
				// This is in case the HashMap already contains the element. If so, I will have
				// to increment it
				totalCountOfChars.put(hichars[i], totalCountOfChars.get(hichars[i]) + 1);
			} else {
				// This is in case the HashMap does not contain any elements. If so, I will have
				// to assign it for the first time
				totalCountOfChars.put(hichars[i], 1);

			}
		}
		System.out.println(totalCountOfChars);

		// Then I have to loop through the values of the HashMap to find the Highest and
		// Penultimate Highest numbers of the used case of chars

		for (int value : totalCountOfChars.values()) {
			// Here I have to define the condition for finding the highest and second
			// highest values
			if (value > highestCharCount) {
				// This is in case the values is equal to the highest used case
				highestCharCount = value;
			} else if (value > secondHighestCharCount && value < highestCharCount) {
				// This is in case the second highest value is smaller than the rest of the
				// values but smaller than the highest value
				secondHighestCharCount = value;
			}
		}

		// Then I have to loop through all of the keys of the HashMap to give us the
		// count of each key and how many times it was used
		for (char c : totalCountOfChars.keySet()) {
			// Here, I have to define the conditions
			// This is in case the count of chars is equal to the highest used case of it
			if (totalCountOfChars.get(c) == highestCharCount) {
				System.out.println("The letter " + c + " has the highest used case in String hi. It has been used "
						+ highestCharCount + " times.");
			} else if (totalCountOfChars.get(c) == secondHighestCharCount) {
				// This is in case the count of chars is equal to the second highest use case of
				// any char
				System.out
						.println("The letter " + c + " has the second highest use case in String hi. It has been used "
								+ secondHighestCharCount + " times.");
			}
		}

		// Write a function that would give us the second largest use case of chars in a
		// String

		String jack = "If a dog chews shoes, whose shoes does he choose? Of course those of yours.";

		// Since we are looking for the second largest use case of chars, we first have
		// to find the largest use case and then find the second largest use case.

		// First, we have to create two int variables and initialize them with MIN_Value
		// of the Integer. They will ultimately store the two numbers we are looking for
		int maxChar = Integer.MIN_VALUE;
		int secMaxChar = Integer.MIN_VALUE;

		// Then, I have to store the String in an array of chars using the
		// .toCharArray() method as well as getting rid of all the spaces by using the
		// .replaceAll() method and changing all of the upper case chars to lower case
		// using the .toLowerCase() method
		char[] jack1 = jack.toLowerCase().replaceAll(" ", "").toCharArray();

		// Then, I have would use a HashMap to store the array of chars in it. The
		// HashMap would take Character as Key and Integer as Value. The Key would store
		// each char from the array and the Value would store the count of each char
		HashMap<Character, Integer> jack2 = new HashMap<Character, Integer>();

		// Then, I would loop through the array of chars to assign each element to the
		// HashMap.
		for (int i = 0; i < jack1.length; i++) {
			// Inside the loop, I would have to define my conditions for assigning the
			// elements
			if (jack2.containsKey(jack1[i])) {
				// This is in case the element already exists in the HashMap. If so, I would
				// have to increment the count of it
				jack2.put(jack1[i], jack2.get(jack1[i]) + 1);
			} else {
				// This is in case the element does not exist in the HashMap. If so, I would
				// have to assign it for the very first time
				jack2.put(jack1[i], 1);
			}
		}
		// By printing out the HashMap, we would be able to see the count of each
		// element before we proceed further.
		System.out.println(jack2);

		// Then I would have to loop through the values of HashMap to find the count of
		// each required value
		for (int value : jack2.values()) {
			// Here, I have to provide the condition for finding the required two values of
			// largest and second largest counts of the chars
			if (value > maxChar) {
				maxChar = value;
			} else if (value > secMaxChar && value < maxChar) {
				secMaxChar = value;
			}
		}

		// Then, I have to loop through the keys of the HashMap to find out the keys and
		// to see how many times were they used.

		for (char c : jack2.keySet()) {
			// Here, I have to define the conditions
			// This is in case the char is equal to the highest use case
			if (jack2.get(c) == maxChar) {
				System.out.println("The letter " + c + " has the highest use case in String jack. It has been repeated "
						+ maxChar + " time.");
			} else if (jack2.get(c) == secMaxChar) {
				System.out.println(
						"The letter " + c + " has the second highest use case in String jack. It has been repeatet "
								+ secMaxChar + " times.");
			}
		}
		System.out.println();

		// Write a function that would find the second highest use case of a char in the
		// String below:

		String kick = "Betty’s big bunny bobbled by the blueberry bush.";

		// Since we are looking for the second highest use case of char, we first have
		// to find the highest use case of char and then find the second highest use
		// case of char
		// In order to do that, we first have to create to int variables and initialize
		// them with the MIN_VALUE of Integer
		int maximumChars = Integer.MIN_VALUE;
		int secMaximumChars = Integer.MIN_VALUE;

		// Then, I have to assign the String to an array of chars using the
		// .toCharArray() method but before that, I have to replace all of the spaces
		// using the .replaceAll() method and also change the upper case chars to lower
		// case using the .toLowerCase() method
		char[] kick2 = kick.toLowerCase().replaceAll(" ", "").toCharArray();

		// Then, I have to create a HashMap that would take Character as key and Integer
		// as value. It will store all of the unique chars and their counts
		HashMap<Character, Integer> kick3 = new HashMap<Character, Integer>();

		// Then, I have to loop through the array of chars and assign each element to
		// the HashMap.
		for (int i = 0; i < kick2.length; i++) {
			// In the body of the loop, I have to define the conditions for assigning each
			// element.
			if (kick3.containsKey(kick2[i])) {
				// This is in case the element already contains the element. If so, I have to
				// increment the count of it
				kick3.put(kick2[i], kick3.get(kick2[i]) + 1);
			} else {
				// This is in case the element does not exist in the HashMap.If so, I have to
				// find it and then assign it to the HashMap for the very first time.
				kick3.put(kick2[i], 1);
			}
		}
		System.out.println(kick3);

		// Then, I have to loop through the values of the HashMap find the unique values
		// for the highest and second highest values

		for (int value : kick3.values()) {
			// Here, I have to define my conditions
			if (value > maximumChars) {
				// This is in case the value is more than the value of the char with the most
				// use cases
				maximumChars = value;
			} else if (value > secMaximumChars && value < maximumChars) {
				// This is in case the value is less that the maximum value but more than the
				// rest of the values
				secMaximumChars = value;
			}
		}

		// Then, I have to loop through the keys of the HashMap to find the count of the
		// unique keys and assign them to their respective values
		for (char c : kick3.keySet()) {
			// Here, I have to define my condition
			if (kick3.get(c) == maximumChars) {
				System.out.println("The letter " + c
						+ " has the maximum number of repetition in String kick. It has been repeated " + maximumChars
						+ " times.");
			} else if (kick3.get(c) == secMaximumChars) {
				System.out.println("The letter " + c
						+ " has the second maximum number of repetition in String kick. It has been used "
						+ secMaximumChars + " times.");
			}

		}

	}

}
