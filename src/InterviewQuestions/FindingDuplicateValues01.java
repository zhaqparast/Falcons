package InterviewQuestions;

import java.util.HashSet;

public class FindingDuplicateValues01 {

	public static void main(String[] args) {

		String[] data = { "test", "test1", "test2", "test", "test3", "test1", "test" };

		HashSet<String> temp = new HashSet<String>();

		for (int i = 0; i < data.length; i++) {
			if (!temp.add(data[i])) {
				System.out.println("There are duplicate values in your String Array " + data[i] + " at index " + i
						+ " is duplicate.");
			}
		}
		System.out.println(data.length + "     " + temp.size());
	}

}
