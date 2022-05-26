package InterviewQuestions;

import java.util.HashMap;

public class CountingOfWords03 {

	public static void main(String[] args) {

		// Write a function that would count the number of words in this String.
		// then it should print the list of the words with the repetition number of each
		// one of them

		String alpha = "The brown cat jumped on the desk. The cat is looking at the window now. "
				+ "Can you tell me if there is another cat outside the window";

		countTheWords(alpha);

		// Write a function that would take a String and count the number of words in
		// it.
		// Then it should print the list of all words with the repetition of each word.

		String bravo = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";
		countWordsOfBravo(bravo);

		// Create a function that would take a String and count the number of words in
		// it and the repetition of each word

		String charlie = "A skunk sat on a stump and thunk the stump stunk, but the stump thunk the skunk stunk";
		countWordsOfCharlie(charlie);

		// Create a function that would take a String and count each word in it,
		// including the repetition of each word

		String delta = "You know New York, you need New York, you know you need unique New York";
		countDeltaWords(delta);

		// Write a function that would take a String and count the number of words,
		// including the count of each duplicate word

		String eco = "Susie works in a shoeshine shop. Where she shines she sits, and where she sits she shines";

		// Then I should get out of the main method and create a new method
		countEcoWords(eco);

		// Create a function that would take a String and count all of the words in it,
		// including finding the count of duplicate words

		String fox = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?\r\n"
				+ "He would chuck, he would, as much as he could, and chuck as much wood\r\n"
				+ "As a woodchuck would if a woodchuck could chuck wood";
		// Then I should get out of the main method to create a method that would count
		// our words

		countFoxWords(fox);

		// Create a function that would take a String and count all of the words in it,
		// including counting all of the duplicate elements

		String golf = "Birdie birdie in the sky laid a turdie in my eye."
				+ "If cows could fly I’d have a cow pie in my eye.";

		// Then I have to get out of the main method to create a new method that would
		// count the words

		countGolfWords(golf);
	}

	// Since the method does not return anything nor does it change, I have to make
	// it static which would take a String in the parameter

	public static void countGolfWords(String str) {

		// Then I have to create a String array to store my string in it using the
		// .split() method based on all of the spaces in the String

		String[] allGolfWords = str.split(" ");

		// Then I will create a HashMap which will store String as key and Integer as
		// value. It would give us the final count of all of the elements in our String
		// array, including the duplicate values

		HashMap<String, Integer> finalCountOfGolfWords = new HashMap<String, Integer>();

		// Then I have to loop through all of the elements of the String array
		for (int countOfWords = 0; countOfWords < allGolfWords.length; countOfWords++) {
			// Here I have to define my conditions using selection
			if (finalCountOfGolfWords.containsKey(allGolfWords[countOfWords])) {
				;
				// This is in case the element already exists in my HashMap. If so, I would add
				// one more to it and assign it back to the HashMap.
				finalCountOfGolfWords.put(allGolfWords[countOfWords],
						finalCountOfGolfWords.get(allGolfWords[countOfWords]) + 1);
			} else {
				// This is in case the element does not exist in the HashMap then I have to
				// assign it to the HashMap for the first timne.
				finalCountOfGolfWords.put(allGolfWords[countOfWords], 1);
			}
		}
		System.out.println(finalCountOfGolfWords);
	}

	// Since the method won`t return anything nor would it change, we would make it
	// static which will take a String in its parameter

	public static void countFoxWords(String str) {
		// Once inside the method, I have to create a String [] and assign all of the
		// elements of the String to it using the .split() method based on the space

		String[] allFoxWords = str.split(" ");

		// Then I have to create a HashMap that would take String as a key and Integer
		// as value. I will assign my String Array to the HashMap which would provide
		// the count of each word, including the count of all duplicate words.

		HashMap<String, Integer> uniqueFoxWords = new HashMap<String, Integer>();

		// Then I have to loop through the String [] to find each element and assign it
		// to the HashMap
		for (int i = 0; i < allFoxWords.length; i++) {
			// Here, I have to define my conditions
			if (uniqueFoxWords.containsKey(allFoxWords[i])) {
				// This is if our HashMap contains any of the words we are looking for. If so, I
				// would add one to the existing count and assign the total count back to the
				// HashMap
				uniqueFoxWords.put(allFoxWords[i], uniqueFoxWords.get(allFoxWords[i]) + 1);
			} else {
				// If the HashMap does not contain any of the words I am looking for, then I
				// would assign them to the HashMap and would be seeing them for the first time.
				uniqueFoxWords.put(allFoxWords[i], 1);
			}
		}
		System.out.println(uniqueFoxWords);

	}

	// I have to create a new method to count the words in the String. Since the
	// method does not return anything nor does it change, it should be static and
	// should take a String as a parameter

	public static void countEcoWords(String str5) {
		// Inside the method, I have to create a String [] and assign the String to it
		// using the .split() method based on the space in the String

		String[] allEcoWords = str5.split(" ");

		// Then I have to create a HashMap which will take String as key and Integer as
		// value which will give us all of the unique elements and their count

		HashMap<String, Integer> uniqueEcoWords = new HashMap<String, Integer>();

		// Here, I have to loop through the String [] and find each element and then
		// assign them to the HashMap
		for (int i = 0; i < allEcoWords.length; i++) {
			// Inside the for loop, I will have to define the conditions
			if (uniqueEcoWords.containsKey(allEcoWords[i])) {
				// if I have a word in the HashMap, I will add another one to it and will assign
				// the total number to the HashMap
				uniqueEcoWords.put(allEcoWords[i], uniqueEcoWords.get(allEcoWords[i]) + 1);
			} else {
				// But if I don`t have the word, I will assign it to the HashMap for the first
				// time.
				uniqueEcoWords.put(allEcoWords[i], 1);
			}
		}
		System.out.println(uniqueEcoWords);

	}

	// Then I have to get out of the main method to create another method to count
	// the words in the String. Since the method won`t return anything and does not
	// change either, it will take String as a parameter but we will make it static

	public static void countDeltaWords(String str4) {
		// Here I will create a String [] and assign my String to it using the .split()
		// method based on the spaces " " in the String to get the count of words

		String[] allDeltaWords = str4.split(" ");

		// Then I have to create a HashMap which will take String as key and Integer as
		// value to count the unique words and the repetition of each word

		HashMap<String, Integer> uniqueDeltaWords = new HashMap<String, Integer>();

		// Then I have to loop through the String [] and assign each element to the
		// HashMap
		for (int i = 0; i < allDeltaWords.length; i++) {
			// Inside the loop, I also have to define my condition for assigning the String
			// [] elements to the HashMap
			if (uniqueDeltaWords.containsKey(allDeltaWords[i])) {
				// if I the element already exists, then I will count it and will add another
				// one to it and then assign it back to the HashMap
				uniqueDeltaWords.put(allDeltaWords[i], uniqueDeltaWords.get(allDeltaWords[i]) + 1);
			} else {
				// If the element does not exit, then I will have to assign it to the HashMap
				// for the first time.
				uniqueDeltaWords.put(allDeltaWords[i], 1);
			}
		}
		System.out.println(uniqueDeltaWords);
	}

	// Then I have to get our of the main method and create another method that
	// would take a String and count the words in the String. Since the method does
	// not return anything and does not change, we will make it static void

	public static void countWordsOfCharlie(String str3) {
		// Once inside the method, I have to create a String Array to store my String in
		// it using the .split() method based on the space to count each word
		String[] charlieWords = str3.split(" ");

		// Then I have to create a HashMap which takes keys and values to store String
		// as key and Integer as values

		HashMap<String, Integer> uniqueCharlieWords = new HashMap<String, Integer>();

		// After that, I have to loop through my String array using for loop to find the
		// elements of the String Array

		for (int i = 0; i < charlieWords.length; i++) {
			// Inside the for loop, I have to define my conditions
			if (uniqueCharlieWords.containsKey(charlieWords[i])) { // If the word already exists, I will have to get it,
																	// add another one to it and
																	// assign it back to the HashMap
				uniqueCharlieWords.put(charlieWords[i], uniqueCharlieWords.get(charlieWords[i]) + 1);
			} else {
				// If the word does not exist, I will put it into the HashMap for the very first
				// time
				uniqueCharlieWords.put(charlieWords[i], 1);
			}
		}
		System.out.println(uniqueCharlieWords);
	}

	// Then I get out of the main method to create another method to count the words
	// Since the method won`t change and does not return anything, I would make it
	// static
	// The method would take a String

	public static void countWordsOfBravo(String str2) {

		// Once inside the method, I have to create a String Array to store my String in
		// it using the .split() method based on the " "
		String[] allBravoWords = str2.split(" ");

		// Then I have to store my String Array in a HashMap since it takes keys and
		// values
		// The HashMap would take String as a Key and Integer as value

		HashMap<String, Integer> bravoWords = new HashMap<String, Integer>();

		// Then I have to loop through the String Array to find the elements and assign
		// them to the HashMap
		for (int i = 0; i < allBravoWords.length; i++) {
			// Inside the loop, I have to define my conditions
			if (bravoWords.containsKey(allBravoWords[i])) {
				// If I have the words in the HashMap, I will have to add another one to it and
				// assign it back to the HashMap
				bravoWords.put(allBravoWords[i], bravoWords.get(allBravoWords[i]) + 1);
			} else {
				// If I don`t have it, I have to assign it to the HashMap for the first time
				bravoWords.put(allBravoWords[i], 1);
			}
		}
		System.out.println(bravoWords);
	}

	// Let's first count each word that would be separated by a space.
	// Then I have to create a unique list of all words
	// Then count repetition of each word to see how many times each word has been
	// mentioned.

	public static void countTheWords(String string) {

		// Here I split the String based on the space and assign it to the String Array
		// of words
		String[] allWords = string.split(" ");

		HashMap<String, Integer> words = new HashMap<String, Integer>();
		// I would have to loop through all words again to find out the length the
		// String Array
		for (int i = 0; i < allWords.length; i++) {
			if (words.containsKey(allWords[i])) {
				// if I have the word in my String
				words.put(allWords[i], (words.get(allWords[i]) + 1));
			} else {
				// if I don`t have the word in my String, then I have to put it in
				words.put(allWords[i], 1);
			}
		}

		System.out.println(words);

		// In the print statement, I should get the length of String Array which will
		// give me the count of allWords
		// System.out.println(allWords.length);

		// I would then loop through it to print out all of the words one by one.
//		for (int i = 0; i < allWords.length; i++) {
//			System.out.println(i + 1 + " " + allWords[i]);
//
//		}
		// This time I would try using a HashSet to store my String Array of allWords
//		HashSet<String> temp = new HashSet<String>();
//		// I would have to use a for each loop and then assign the array to the HashSet
//		for (String words : allWords) {
//			temp.add(words);
//
//		}
//		System.out.println(temp);
//		System.out.println(temp.size());
		// This is great but it still does not answer the question of the count of each
		// repetition.
		// Let's this time use a HashMap which takes unique keys and values.
		// I would store all of the words as keys in the HashMap and then increase the
		// count of each repeated word in the values.

	}

}
