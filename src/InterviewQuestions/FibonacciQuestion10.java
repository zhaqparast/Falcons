package InterviewQuestions;

import java.util.ArrayList;

public class FibonacciQuestion10 {

	public static void main(String[] args) {

		// The Fibonacci Sequence is follows: the next number is the sum of two previous numbers
		// 0 + 1 = 1 on the first iteration
		// 1 + 1 = 2 on the second iteration
		// 1 + 2 = 3 on the third iteration
		// 2 + 3 = 5 on the fourth iteration
		// 3 + 5 = 8 on the fifth iteration
		// 5 + 8 = 13 on the sixth iteration and so on and so forth

		// In order to find the Fibonacci sequence via code is as follows:

		// First Example:
		// First of all, we have to create an ArrayList on Integer
		ArrayList<Integer> fibSeq = new ArrayList<Integer>();

		// Then, we have to add two number to the ArrayList
		fibSeq.add(1);
		fibSeq.add(2);

		// Then, I have to loop through the ArrayList
		for (int i = 0; i < 10; i++) {
			// Inside the implementation of the loop, I have to keep adding to the existing
			// count
			fibSeq.add(fibSeq.get(fibSeq.size() - 1) + fibSeq.get(fibSeq.size() - 2));
		}
		System.out.println(fibSeq);
	}

}
