package InterviewQuestions;

import java.util.HashMap;

public class CountingChars04 {

	public static void main(String[] args) {

		// Write a function that would count the number of chars in the String alpha and
		// also count repetition of each char.

		String alpha = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";

		// I will have to write a method that is static and would have no return type
		// I have to split the String based on no-space to get the count of all chars
		// and then store them in an Array of
		// Then count the space but instead of the space in the HashMap, print Space
		// Do not consider upper/lower case for chars T or t should there be any.They
		// should all be counted in the same category

		// Lets see if our method actually works
		countChars(alpha);

		// Write a function that would count the number of chars in a String, including
		// the count of duplicate chars in the String

		String bravo = "The thirty-three thieves thought that they thrilled the throne throughout Thursday";
		countBravoChars(bravo);

		// Write a function that would count the chars of a String, including the chars
		// that are duplicates. Both upper and lower case chars should be considered the
		// same in the count

		String charlie = "Thirty-three thousand feathers on a thrushes throat.";

		// I would have to get out of the main method to create another method that
		// would count the chars in the String

		countCharlieChars(charlie);

		// Write a function that would take a String and count all of the chars in this
		// String, including the duplicate

		String delta = "Round and round the rugged rocks the ragged rascal ran.";

		// I would then get out of the main method to create a separate method that
		// would count the chars

		countDeltaChars(delta);

		// Write a function that would take a String and count the chars in the String,
		// including duplicate chars.

		String eco = "Fred fed Ted bread and Ted fed Fred bread.";

		// I have to create another method outside the main method to count the chars of
		// the String

		countEcoWords(eco);

	}

	// Since the method does not return anything not does it change, I will make it
	// static void which will take a String in the parameter

	public static void countEcoWords(String str) {
		// Here I have to create a char array and use .toCharArray() method to assign
		// all of the chars in the String to the String array

		char[] chars = str.toLowerCase().toCharArray();

		// Then I have to create a HashMap that would take Character as key and Integer
		// as value. Each key will store one char and each value will store the count of
		// each char.

		HashMap<Character, Integer> finalCountOfChars = new HashMap<Character, Integer>();

		// Then I have to loop through the array of chars to find each element and
		// assign it to the HashMap

		for (int i = 0; i < chars.length; i++) {

			// Inside the implementation of the loop, I will define the condition for
			// assigning elements of the char array to the HashMap

			if (finalCountOfChars.containsKey(chars[i])) {
				// In case a char has already been assigned to the HashMap but it is repeating,
				// I would have to add one char to the existing count and then assign the total
				// back to the HashMap
				finalCountOfChars.put(chars[i], finalCountOfChars.get(chars[i]) + 1);
			} else {
				// But if the HashMap does not contain any elements, I will have to assign one
				// to it for the very first time.
				finalCountOfChars.put(chars[i], 1);
			}
		}

		System.out.println(finalCountOfChars);

	}

	// Since the method does not return anything nor does it change, it should be
	// static and void which will take a String

	public static void countDeltaChars(String str) {
		// Then I have to create an array of chars and store the String in it using the
		// .toCharArray() method

		char[] chars = str.toCharArray();

		// Then I have to create a HashMap to store all of the chars in it. The HashMap
		// will take Character as a key and Integer as help us count all of the unique
		// characters and their repetition

		HashMap<Character, Integer> finalChars = new HashMap<Character, Integer>();

		// Then I have to loop through the array of chars and assign each element to the
		// HashMap

		for (int i = 0; i < chars.length; i++) {

			// Inside the implementation of the loop, I will define my condition for
			// assigning the elements to the HashMap.

			if (finalChars.containsKey(chars[i])) {
				// This is in case I already have a character in the HashMap. If so, I will add
				// one more to the existing count of chars and then assign them back to the
				// HashMap
				finalChars.put(chars[i], finalChars.get(chars[i]) + 1);
			} else {
				// In case I don`t have the char in my HashMap, I will have to assign it for the
				// very first time.
				finalChars.put(chars[i], 1);
			}
		}

		System.out.println(finalChars);

	}

	// Since the method does not return anything nor does it change, I will make it
	// static and void which will take a String in the parameter.

	public static void countCharlieChars(String str) {

		// Here I have to create an Array of Chars and will use the to store my String
		// in it to get the
		// count of each char.

		char[] chars = str.toLowerCase().toCharArray();

		// Then I will create a HashMap to store the Array of Chars in it. It will take
		// Character as key and Integer as value to give us the count of all of the
		// characters, including the unique characters.

		HashMap<Character, Integer> finalChars = new HashMap<Character, Integer>();

		// Then I will have to loop through the array of chars to find each element and
		// assign them to the HashMap.
		for (int i = 0; i < chars.length; i++) {
			// Here I have to define my conditions for storing the chars in the HashMap
			if (finalChars.containsKey(chars[i])) {
				// If the char already exists in the the HashMap, I would add another one to it
				// and will assign the final count of chars back to the HashMap
				finalChars.put(chars[i], finalChars.get(chars[i]) + 1);
			} else {
				// If my char does not exist in the HashMap, I will have to assign it to the
				// HashMap for the very first time
				finalChars.put(chars[i], 1);
			}
		}
		System.out.println(finalChars);
	}

	// For this, I have to write a method that is Static and void since it does not
	// return anything nor does it change
	// Don`t consider the upper case T either
	public static void countBravoChars(String str) {
		// Then I have to create an Array of Character and use the .toCharArray method
		// to store all of the chars in the array

		char[] chars = str.toLowerCase().toCharArray();

		// Then I have to store all of the elements of the array of chars into a HashMap
		// that would take Character as key and Integer as value

		HashMap<Character, Integer> finalCountOfChars = new HashMap<Character, Integer>();

		// Then I have to loop through the array of chars to find the total number of
		// chars
		for (int c = 0; c < chars.length; c++) {
			// Then I have to provide my condition for each char
			if (finalCountOfChars.containsKey(chars[c])) {
				// This is in case the element already exists in the HashMap. If so, I would add
				// one more to the existing count of the element and assign the total number
				// back to the HashMap
				finalCountOfChars.put(chars[c], finalCountOfChars.get(chars[c]) + 1);
			} else {
				finalCountOfChars.put(chars[c], 1);
			}
		}
		System.out.println(finalCountOfChars);
	}

	public static void countChars(String str) {
		// I would have to store my String in an array of chars and use the .toCharArray
		// method to convert all of the elements in my String to an array f chars
		// In order to ignore the lower/upper case chars, we have to use the
		// .toLowerCase method before converting our String to array of chars
		char[] chars = str.toLowerCase().toCharArray();

		// Then I would have to store my char array into a HashMap
		HashMap<Character, Integer> charactersWithCount = new HashMap<Character, Integer>();

		// I would then loop through the array of chars using a for each loop and then
		// which would give me each element of the char array
		for (char c : chars) {
			if (charactersWithCount.containsKey(c)) {
				// This is in case I have the chars and my String is not empty.
				charactersWithCount.put(c, charactersWithCount.get(c) + 1);
			} else {
				// This is in case if I don`t have any chars. If so, I have to add them to my
				// HashMap
				charactersWithCount.put(c, 1);
			}
		}

		// In order to replace ' ' with "Space", we have to run another for each loop
		// and inside the implementation, provide our condition

		for (char c : charactersWithCount.keySet()) {
			if (c == ' ') {
				System.out.println("'Space'" + " " + charactersWithCount.get(c));
			} else {
				System.out.println(c + " " + charactersWithCount.get(c));
			}
		}
	}

	// In order to count the chars in a String, I have to create a method that is
	// Static and void and will take a String as a parameter

}
