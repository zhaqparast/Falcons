package StringManipulation;

public class PracticeTwo {

	public static void main(String[] args) {

		// write a function that would take one String and count the number of words
		// then write another function that would take one String and count the number
		// of characters and the repetition of each char
		// it should be a static method such as split based on space and would return a
		// number(words/chars)

		String words = "this is the test string that you have to count the number of words or characters for";
		System.out.println(countOfWords(words));
		System.err.println(countOfChars(words));

		System.out.println();

		String zebra = "I have no idea what you are talking about!";
		// write a function that would take one String and count the number of words
		// then write another function that would take one String and count the number
		// of character
		// it should be a static method such as split based on space and would return a
		// number(words/chars)

		System.out.println("There are " + countOfZebraWords(zebra) + " words in String zebra.");
		System.err.println("There are " + countOfZebraChars(zebra) + " characters in String zebra.");

		System.out.println();
		System.out.println();

		String yankee = "He who has a why to live can bear almost any how.";

		// write a function that would take a String and count the number of words in
		// the String
		// Then write another function that would also take a String and count the chars
		// of the String

		System.err.println("There are " + countOfYankeeChars(yankee) + " chars in String yankee.");
		System.out.println("There are " + countOfYankeeWords(yankee) + " words in String yankee.");
		System.out.println();

		// Write a function that would take a String and count the number of words in
		// the String
		// write another function that would also same String and count the number of
		// chars in the String

		String xRay = "There are no facts, only interpretations.";
		System.out.println("There are " + countOfXrayWords(xRay) + " words in String xRay.");
		System.err.println("There are " + countOfXrayChars(xRay) + " chars in String xRay.");

		System.out.println();

		// Write a function that would take a String and count the number of words in
		// the String
		// Then write a function that would take the same String and count the number of
		// chars in the String

		String whiskey = "The man of knowledge must be able not only to love his enemies but also to hate his friends.";
		System.out.println("There are " + countOfWhiskeyWords(whiskey) + " words in String Whiskey.");
		System.err.println("There are " + countOfWhiskeyChars(whiskey) + " chars in String whiskey.");
		System.out.println();

		// Write a function that would take a String and count all of the words in the
		// String.
		// Then write another function that would take the same String and count the
		// chars in the String

		String victor = "Faith: not wanting to know what is true.";
		System.err.println("There are " + countOfVictorWords(victor) + " words in String victor.");
		System.out.println("There are " + countOfVictorChars(victor) + " chars in String victor.");
		System.out.println();

		// Write a function that would take a String and count the words in the String
		// Then write a function to take the same String and count the chars of the
		// String

		String unit = "The best weapon against an enemy is another enemy.";
		System.out.println("There are " + countOfUnitChars(unit) + " chars in String unit.");
		System.err.println("There are " + countOfUnitWords(unit) + " words in String unit.");
		System.out.println();

		// Write a function that would take a String and count the number of words in
		// the String
		// Then write another function that would take the same String and coung the
		// chars of it

		String tom = "Sometimes people don't want to hear the truth because they don't want their illusions destroyed.";

		System.out.println(countOfTomWords(tom));
		System.out.println(countOfTomChars(tom));

		System.out.println();

		// Write a function that would take a String and count the number of words in
		// the String
		// Then write a another function to take the same String and count the chars of
		// the String

		String sam = "He who has a why to live for can bear almost any how.";
		System.out.println(countOfSamWords(sam));
		System.err.println(countOfSamChars(sam));
		System.out.println();

		// Write a function that would take a String and count the words in the String
		// Then write another function that would take the same String and count the
		// number if chars in the String

		String radio = "When we are tired, we are attacked by ideas we conquered long ago.";
		System.out.println(countRadioWords(radio));
		System.err.println(countRadioChars(radio));
		System.out.println();

		// Write a function that would take a String and count the words in the String
		// then write another function that would take the same String and count the
		// number if chars in it.

		String queen = "The queen has played quite a quick game and had all four queens in her hands.";
		System.out.println(countQueenWords(queen));
		System.err.println(countQueenChars(queen));
		System.out.println();

		// Write a function that would take a String and count the number of words in
		// the String
		// Then write another function that would take the same String and count the
		// number of chars in it

		String pen = "I cannot believe in a God who wants to be praised all the time.";
		System.err.println(countPenWords(pen));
		System.out.println(countPenChars(pen));
		System.out.println();

		// Write a function that would take a String a count the words in the String
		// Then write another function that would take the same String and count the
		// number of chars in it.

		String open = "Please keep the outer door open.";
		System.out.println(countOpenWords(open));
		System.err.println(countOpenChars(open));

		// Write a function that would take a String and count the number of words in
		// the String
		// Then write another function to take the same String and count the name

		String noble = "The surest way to corrupt a youth is to instruct him to hold in higher esteem those who think alike than those who think differently.";

		System.out.println();
		System.out.println(countNobleWords(noble));
		System.err.println(countNobleChars(noble));
		System.out.println();

		// Write a function that would take a String and count the words in the String
		// Then write another function to take the same String and count the chars of
		// the STRING

		String mike = "Is man merely a mistake of God's? Or God merely a mistake of man?";
		System.out.println(countMikeChars(mike));
		System.err.println(countMikeWords(mike));
		System.out.println();

		// Write a function that would take a String and count the number of words in
		// the String
		// Then write another function to take the same String and count the number of
		// chars it has

		String lima = "The thought of suicide is a great consolation: by means of it one gets through many a dark night.";
		System.out.println(countLimaWords(lima));
		System.err.println(countLimaChars(lima));
		System.out.println();

		// Write a function that would take a String and count the number of words in
		// the String
		// Then write another function that would take the same String and count the
		// number of chars in the String

		String kilo = "Every deep thinker is more afraid of being understood than of being misunderstood.";
		System.out.println(countKiloWords(kilo));
		System.err.println(countKiloChars(kilo));
		System.out.println();

		// Write a function that would take a String and count the number of words in
		// the String
		// Then write another function to take the same String and count the number of
		// chars in the String.

		String jack = "The thought of suicide is a great consolation: by means of it one gets through many a dark night.";
		System.out.println(countJackWords(jack));
		System.err.println(countJackChars(jack));
		System.out.println();

		// Write a function that would take a String and count the words in it.
		// Then write another function that would take the same String and count the
		// chars of the String.

		String india = "Man is the cruelest animal";
		System.err.println(countIndiaWords(india));
		System.out.println(countIndiaChars(india));
		System.out.println();

		// Write a function that would take a String and count the words used in the
		// String
		// Then write another function to take the same String and count the chars of
		// the String

		String hotel = "Is man merely a mistake of God's? Or God merely a mistake of man?";
		System.out.println(countHotelChars(hotel));
		System.err.println(countHotelWords(hotel));
		System.out.println();

		String golf = "aksghil ury vs dmvn akjsr hgli erhv lajshr gfiu erhv lizrhgwerufh hgh mblguog nbugb";
		System.err.println(countGolfChars(golf));
		System.out.println(countGolfWords(golf));
		System.out.println();

		// Write a function to that would take a String and count the words of the
		// String.
		// Then write another function that would take the same String and count the
		// chars of the String

		String fire = "When we are tired, we are attacked by ideas we conquered long ago.";
		System.out.println(countFireChars(fire));
		System.err.println(countFireWords(fire));
		System.out.println();

		// Write a function that it would take a String and count the words of the
		// String
		// Then write another function that it would take the same String and count the
		// chars of the String.

		String each = "We should consider every day lost on which we have not danced at least once.";
		System.out.println(countEachChar(each));
		System.err.println(countEachWords(each));
		System.out.println();

		// Write a function that would take a String and count the words of the String
		// Then write another function that would take the same String and coount the
		// chars of the String

		String delta = "The man of knowledge must be able not only to love his enemies but also to hate his friends.";
		System.err.println(countDeltaChars(delta));
		System.out.println(countDeltaWords(delta));
		System.out.println();

		// Write a function that would take a String and count the number of words in
		// the String
		// Then write another function to take the same String and count the number of
		// chars in the String

		String charlie = "There are no facts, only interpretations.";
		System.err.println(countCharlieWords(charlie));
		System.out.println(countCharlieChars(charlie));
		System.out.println();

		// Write a function that will take a String and count the words of the String
		// Then write another function to take the same String and count the number of
		// chars in the String

		String bravo = "In heaven, all the interesting people are missing.";
		System.out.println(countBravoChars(bravo));
		System.err.println(countBravoWords(bravo));
		System.out.println();

		// Write a function that would take a String and count the words of the String
		// Then write another function to take the same String and count the number of
		// chars in it.

		String alpha = "You must have chaos within you to give birth to a dancing star.";
		System.err.println(countAlphaWords(alpha));
		System.out.println(countAlphaChars(alpha));
	}

	public static int countAlphaWords(String alpha) {
		if (alpha == null || alpha.isEmpty()) {
			return 0;
		}
		return alpha.split(" ").length;
	}

	public static int countAlphaChars(String alpha) {
		if (alpha == null || alpha.isEmpty()) {
			return 0;
		}
		return alpha.replaceAll(" ", "").length();
	}

	public static int countBravoWords(String bravo) {
		if (bravo == null || bravo.isEmpty()) {
			return 0;
		}
		return bravo.split(" ").length;
	}

	public static int countBravoChars(String bravo) {
		if (bravo == null || bravo.isEmpty()) {
			return 0;
		}
		return bravo.replaceAll(" ", "").length();
	}

	public static int countCharlieWords(String charlie) {
		if (charlie == null || charlie.isEmpty()) {
			return 0;
		}
		return charlie.split(" ").length;
	}

	public static int countCharlieChars(String charlie) {
		if (charlie == null || charlie.isEmpty()) {
			return 0;
		}
		return charlie.replaceAll(" ", "").length();
	}

	public static int countDeltaWords(String delta) {
		if (delta == null || delta.isEmpty()) {
			return 0;
		}
		return delta.split(" ").length;
	}

	public static int countDeltaChars(String delta) {
		if (delta == null || delta.isEmpty()) {
			return 0;
		}
		return delta.replaceAll(" ", "").length();
	}

	public static int countEachWords(String each) {
		if (each == null || each.isEmpty()) {
			return 0;
		}

		return each.split(" ").length;
	}

	public static int countEachChar(String each) {
		if (each == null || each.isEmpty()) {
			return 0;
		}
		return each.replaceAll(" ", "").length();
	}

	public static int countFireWords(String fire) {
		if (fire == null || fire.isEmpty()) {
			return 0;
		}
		return fire.split(" ").length;
	}

	public static int countFireChars(String fire) {
		if (fire == null || fire.isEmpty()) {
			return 0;
		}
		return fire.replaceAll(" ", "").length();
	}

	public static int countGolfWords(String golf) {
		if (golf == null || golf.isEmpty()) {
			return 0;
		}
		return golf.split(" ").length;
	}

	public static int countGolfChars(String golf) {
		if (golf == null || golf.isEmpty()) {
			return 0;
		}
		return golf.replaceAll(" ", "").length();
	}

	public static int countHotelWords(String hotel) {
		if (hotel == null || hotel.isEmpty()) {
			return 0;
		}
		return hotel.split(" ").length;
	}

	public static int countHotelChars(String hotel) {
		if (hotel == null || hotel.isEmpty()) {
			return 0;
		}
		return hotel.replaceAll(" ", "").length();
	}

	public static int countIndiaWords(String india) {
		if (india == null || india.isEmpty()) {
			return 0;
		}
		return india.split(" ").length;
	}

	public static int countIndiaChars(String india) {
		if (india == null || india.isEmpty()) {
			return 0;
		}
		return india.replaceAll(" ", "").length();
	}

	public static int countJackWords(String jack) {
		if (jack == null || jack.isEmpty()) {
			return 0;
		}
		return jack.split(" ").length;
	}

	public static int countJackChars(String jack) {
		if (jack == null || jack.isEmpty()) {
			return 0;
		}
		return jack.replaceAll(" ", "").length();
	}

	public static int countKiloWords(String kilo) {
		if (kilo == null || kilo.isEmpty()) {
			return 0;
		}
		return kilo.split(" ").length;
	}

	public static int countKiloChars(String kilo) {
		if (kilo == null || kilo.isEmpty()) {
			return 0;
		}
		return kilo.replaceAll(" ", "").length();
	}

	public static int countLimaWords(String lima) {
		if (lima == null || lima.isEmpty()) {
			return 0;
		}

		return lima.split(" ").length;
	}

	public static int countLimaChars(String lima) {
		if (lima == null || lima.isEmpty()) {
			return 0;
		}
		return lima.replaceAll(" ", "").length();
	}

	public static int countMikeWords(String mike) {
		if (mike == null || mike.isEmpty()) {
			return 0;
		}
		return mike.split(" ").length;
	}

	public static int countMikeChars(String mike) {
		if (mike == null || mike.isEmpty()) {
			return 0;
		}
		return mike.replaceAll(" ", "").length();
	}

	public static int countNobleWords(String noble) {
		if (noble == null || noble.isEmpty()) {
			return 0;
		}
		return noble.split(" ").length;
	}

	public static int countNobleChars(String noble) {
		if (noble == null || noble.isEmpty()) {
			return 0;
		}
		return noble.replaceAll(" ", "").length();
	}

	public static int countOpenWords(String open) {
		if (open == null || open.isEmpty()) {
			return 0;
		}
		return open.split(" ").length;
	}

	public static int countOpenChars(String open) {
		if (open == null || open.isEmpty()) {
			return 0;
		}
		return open.replaceAll(" ", "").length();
	}

	public static int countPenWords(String pen) {
		if (pen == null || pen.isEmpty()) {
			return 0;
		}
		return pen.split(" ").length;
	}

	public static int countPenChars(String pen) {
		if (pen == null || pen.isEmpty()) {
			return 0;
		}
		return pen.replaceAll(" ", "").length();
	}

	public static int countQueenWords(String queen) {
		if (queen == null || queen.isEmpty()) {
			return 0;
		}
		return queen.split(" ").length;
	}

	public static int countQueenChars(String queen) {
		if (queen == null || queen.isEmpty()) {
			return 0;
		}
		return queen.replaceAll(" ", "").length();
	}

	public static int countRadioWords(String radio) {
		if (radio == null || radio.isEmpty()) {
			return 0;
		}

		return radio.split(" ").length;
	}

	public static int countRadioChars(String radio) {
		if (radio == null || radio.isEmpty()) {
			return 0;
		}
		return radio.replaceAll(" ", "").length();
	}

	public static int countOfSamWords(String sam) {
		if (sam == null || sam.isEmpty()) {
			return 0;
		}
		return sam.split(" ").length;
	}

	public static int countOfSamChars(String sam) {
		if (sam == null || sam.isEmpty()) {
			return 0;
		}
		return sam.replaceAll(" ", "").length();
	}

	public static int countOfTomWords(String tom) {
		if (tom == null || tom.isEmpty()) {
			return 0;
		}

		return tom.split(" ").length;
	}

	public static int countOfTomChars(String tom) {
		if (tom == null || tom.isEmpty()) {
			return 0;
		}

		return tom.replaceAll(" ", "").length();
	}

	public static int countOfUnitWords(String unit) {
		if (unit == null || unit.isEmpty()) {
			return 0;
		}
		return unit.split(" ").length;
	}

	public static int countOfUnitChars(String unit) {
		if (unit == null || unit.isEmpty()) {
			return 0;
		}

		return unit.replaceAll(" ", "").length();
	}

	public static int countOfVictorWords(String victor) {
		if (victor == null || victor.isEmpty()) {
			return 0;
		}
		return victor.split(" ").length;
	}

	public static int countOfVictorChars(String victor) {
		if (victor == null || victor.isEmpty()) {
			return 0;
		}
		return victor.replaceAll(" ", "").length();
	}

	public static int countOfWhiskeyWords(String whiskey) {
		if (whiskey == null || whiskey.isEmpty()) {
			return 0;
		}
		return whiskey.split(" ").length;
	}

	public static int countOfWhiskeyChars(String whiskey) {
		if (whiskey == null || whiskey.isEmpty()) {
			return 0;
		}
		return whiskey.replaceAll(" ", "").length();
	}

	public static int countOfXrayWords(String xRay) {
		if (xRay == null || xRay.isEmpty()) {
			return 0;
		}
		return xRay.split(" ").length;
	}

	public static int countOfXrayChars(String xRay) {
		if (xRay == null || xRay.isEmpty()) {
			return 0;
		}
		return xRay.replaceAll(" ", "").length();
	}

	public static int countOfYankeeWords(String yankee) {
		if (yankee == null || yankee.isEmpty()) {
			return 0;
		}
		return yankee.split(" ").length;
	}

	public static int countOfYankeeChars(String yankee) {
		if (yankee == null || yankee.isEmpty()) {
			return 0;
		}
		return yankee.replaceAll(" ", "").length();
	}

	public static int countOfZebraWords(String zebra) {
		if (zebra == null || zebra.isEmpty()) {
			return 0;
		}
		return zebra.split(" ").length;
	}

	public static int countOfZebraChars(String zebra) {
		if (zebra == null || zebra.isEmpty()) {
			return 0;
		}
		return zebra.replaceAll(" ", "").length();
	}

	public static int countOfWords(String words) {
		if (words == null || words.isEmpty()) {
			return 0;
		}
		return words.split(" ").length;
	}

	public static int countOfChars(String words) {
		if (words == null || words.isEmpty()) {
			return 0;
		}
		return words.replaceAll(" ", "").length();
	}

}
