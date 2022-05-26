package InterviewQuestions;

import java.util.HashMap;

public class StringRelatedQuestions09 {

	public static void main(String[] args) {

		String text = "This is to check if we can code it or not";
		// Please find out how many vowel and how many consonant characters we have in
		// this String

		// I first have to create two ints to store the number of the vowel and
		// consonant letters
		int vowelLetters = 0;
		int consonantLetters = 0;

		// Then, we have to get rid of all of the spaces in the String by using the
		// .replaceAll() method

		String temp = text.replaceAll(" ", "");

		// I have to loop through
		for (int i = 0; i < temp.length(); i++) {
			// Here I have to define my condition
			if (temp.toLowerCase().charAt(i) == 'a' || temp.toLowerCase().charAt(i) == 'e'
					|| temp.toLowerCase().charAt(i) == 'i' || temp.toLowerCase().charAt(i) == 'o'
					|| temp.toLowerCase().charAt(i) == 'u') {
				vowelLetters++;
			} else {
				consonantLetters++;
			}
		}
		System.out.println("The count of vowel characters: " + vowelLetters);
		System.err.println("The count of consonant letters: " + consonantLetters);
		System.out.println();

		// What is the character that has the second largest number of repetition in
		// this String

		// I have to create a HashMap to store all of the characters in it
		HashMap<Character, Integer> allChars = new HashMap<Character, Integer>();

		// Then I have to loop through the array of chars and assign the elements to the
		// HashMap
		// Inside the loop, I have to convert my String to an array of chars
		for (char c : temp.toLowerCase().toCharArray()) {
			// Here, I have to define my condition
			if (allChars.containsKey(c)) {
				// if the element already exists, I have to increase the count of it
				allChars.put(c, allChars.get(c) + 1);
			} else {
				// If the element does not exist, I will have to assign it to the HashMap for
				// the first time
				allChars.put(c, 1);
			}
		}
		System.out.println(allChars);

		// In order to find the largest repetition of any characters, I have to do the
		// following:
		// I will create two variables that would store the largest number and the
		// second largest number
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;

		// Then I have to loop through the values of the HashMap to find the two largest
		// numbers of repetition of chars

		for (int values : allChars.values()) {
			// Here, I have to define my condition
			if (values > max) {
				max = values;
			} else if (values > secMax && values < max) {
				secMax = values;
			}
		}
		System.out.println(secMax);

		// Now I have to find the character with the penultimate repetition in the
		// String above
		// I have to look for the character in the HashMap values which will give me the
		// desired char
		for (char c : allChars.keySet()) {
			// Here, I have to define my condition
			if (allChars.get(c) == secMax) {
				System.out.println("The character that was the second most repeated in the String is: " + c
						+ ". It has been repeated " + secMax + " times.");
			}
		}

		// Write a function that would count the vowel and consonant letters in the
		// String below:
		String alpha = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t very fuzzy, was he?";

		// First, we have to create two variables to store the count of vowel and
		// consonant letters
		int countOfVowel = 0;
		int countOfConsonant = 0;
		int countofOtherCharacters = 0;

		// Then I have to remove all of the spaces and all other characters using the
		// .replaceAll() method
		String temp1 = alpha.replaceAll(" ", "").toLowerCase();
//		String temp2 = temp1.replaceAll(".", "");
//		String temp3 = temp2.replaceAll("’", "");
//		String temp4 = temp3.replaceAll(",", "");
//		String temp5 = temp4.replaceAll("?", "");

		// Then I have to loop through all of the elements of the String
		for (int i = 0; i < temp1.length(); i++) {
			// Here I have to define the condition of the loop
			if ("aeiou".contains(String.valueOf(temp1.charAt(i)))) {
				countOfVowel++;
			} else if (".,’?".contains(String.valueOf(temp1.charAt(i)))) {
				countofOtherCharacters++;
			} else {
				countOfConsonant++;
			}
		}
		System.out.println("The count of vowel letters: " + countOfVowel);
		System.err.println("The count of consonant letters: " + countOfConsonant);
		System.out.println("The count of other characters: " + countofOtherCharacters);
		
		System.out.println();
		

		
	}

}
