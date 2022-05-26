package StringManipulation;

public class PracticeOne {

	public static void main(String[] args) {

		// String is an array of char and is fixed in size
		// String implements an array of char interface to store our data
		// String is immutable which means it can not change in the memory

		String x = "test";
		x = "test2";
		x = "test3";
		x = "test4";
		x = "Test5";

		String y = "test5";

		x.charAt(0); // this will return one character in certain index
		System.out.println(x.charAt(3));

		x.compareTo("test4"); // this method is pretty much like equal but instead of
		// returning true or false, it returns either a positive number, a negative
		// number or zero. In other words, this method compares two String but returns
		// an int. If the two Strings match, it will return zero, else, it would return
		// either a positive number or a negative number.
		System.out.println(x.compareTo(y));
		System.out.println();

		System.out.println(x.compareToIgnoreCase(y));// this method is pretty much the same
		// as the .compareTo method except it would ignore the upper or lower case
		// characters

		System.out.println(x.concat(y));// this method is used to concatenate two Strings

		System.out.println(x.contains("564"));// this method is an example of upcasting
		// in which .contains method compares one string with another. if the two
		// strings match, it will return true otherwise, it will return false.

		System.out.println(x.endsWith("4"));// this method takes a String and verifies
		// whether or not the suffex of the string matches. It will return a boolean.

		System.out.println(x.equals(y));// This method is also an example of upcasting. It
		// compares the values of two strings not their references in the stack.

		System.out.println(x.equalsIgnoreCase(y));// This method is pretty much the same as
		// .equals except it ignores the upper or lower case characters while comparing
		// two strings

		System.out.println(x.indexOf('t', 1));// this method will return the index number of a
		// certain char in a String. The comma will skip the first intended char and
		// jump to the next one.

		String str = "testing is fun if t is in t the t right place t, t, t t, t";
		System.out.println(str.indexOf('t', +1));
		System.out.println(str.indexOf('t', str.indexOf('t', +1) + 1));
		System.out.println(str.indexOf('t', str.indexOf('t', str.indexOf('t', +1) + 1) + 1));
		int temp = 0;
		int occurance = 7;
		for (int i = 0; i < occurance; i++) {
			temp = str.indexOf('t', temp) + 1;
			System.out.println(temp - 1);
		}

		System.out.println(temp - 1 + " is the index of " + occurance + " occurance of letter 't'.");

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 't') {
				System.err.print(i + " " + str.charAt(i) + ", ");
			} else {
//				System.out.print(i + " " + str.charAt(i) + ", ");
			}
		}
		System.out.println();

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		String test = "Testing web applications is fun but this sort of fun can be achieved only through perseverance.";
		test.isEmpty();// This method returns a boolean. If the String has no character in it,
		// it will turn true, otherwise, it will return false;
		System.out.println(test.isEmpty());
		System.out.println();
		test.replace('t', 'T');// This method will replace one character with a new character
		System.out.println(test.replace('t', 'T'));
		System.out.println(test.replaceFirst("fun", "run"));// This method takes a String and will replace the first
		// occurrence of certain regex in a String.

		System.out.println(test.replaceAll("fun", "run"));// This method also takes a String but will replace all of
		// the occurrences of a certain regex in a String

		System.out.println(test.substring(56));
		System.out.println(test.substring(8, 24));// This method takes a int which will return the substring after the
		// the number of index given. If we provide two ints using a comma to separate,
		// it will return the substring beginning after the first and the last indexes
		// given.

		System.out.println(test.toUpperCase());// This method will convert all of the characters to upper case
		System.out.println(test.toLowerCase());// This method will convert all of the characters to lower case

		String mtn = " We are testing the Cell Phone for the .split method";
		System.out.println(mtn.trim());// This method is very crucial. It basically removes the spaces before and after
		// our String.

		System.out.println(mtn.split(" "));// this method takes regex/a partial String and splits our String
		// into an array of chars based on the regex we have provided. In the example
		// below, our regex is a space. We have to use a loop to find the result.
		String[] tempArray = mtn.split(" ");
		for (String string : tempArray) {
			System.out.println(string);
		}

		char[] tempArrayOfChars = mtn.toCharArray();// This method will convert our String into an array of chars.
		// In order to find the desired outcome, we have to loop through it.
		for (char c : tempArrayOfChars) {
			System.out.println(c);

		}

		int i = 1234567;
		String intToString = String.valueOf(i);
		System.out.println(intToString);// The .valueOf method will convert other data types to String as shown in the
		// example above.

		String regExp = "jasdvfi8tb,jser bgfo84y87y*$*^5mnKG^%$@#^)&GJGKYWbfjhg897987658754";
		System.out.println(regExp.replaceAll("[a-zA-Z0-9]", "+"));
		System.out.println(regExp.replaceAll("[^a-zA-Z0-9]", "+"));
		// This method replaces certain regex with new regex. The caret sign ^ reverses
		// everything as shown in the second example above.

	}

}
