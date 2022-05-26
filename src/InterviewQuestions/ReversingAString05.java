package InterviewQuestions;

public class ReversingAString05 {

	public static void main(String[] args) {

		// Reverse this String
		String text = "This should be easy";

		System.out.println(reverseSomeString(text));
		// We have three ways to do so which are as follows:

		// The second way is through using StringBuffer and/or StringBuilder

		StringBuffer sb = new StringBuffer(text);
		System.out.println(sb.reverse());

		// The third way is via StringBuilder

		StringBuilder sBuilder = new StringBuilder(text);
		System.out.println(sBuilder.reverse());
	}

	// 1 - Through a method
	public static String reverseSomeString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		return temp;
	}

}
