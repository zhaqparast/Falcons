package InterviewQuestions;

import java.util.PrimitiveIterator.OfDouble;

public class LargestNums07 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 90, 12, 45, 89, 110, 23, 199 };
		// find the largest number in the array above
		// find the smallest number in the array above
		// find the sum of all of the numbers in the array above
		// find the average of all numbers in the array above

		int max = numbers[0];
		int min = numbers[0];
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			} else if (numbers[i] < min) {
				min = numbers[i];
			}
			sum += numbers[i];
		}
		double avg = (double) sum / numbers.length;
		System.out.println(
				"Minmum number: " + min + " Maximum number: " + max + " Sum of numbers: " + sum + " Average: " + avg);

		// Find the minimum, maximum, average and sum of the following array of doubles;

		double[] alpha = { 768, 876, 75, 12, 267, 23, 19, 99 };

		// First, I have to create four additional variables to store the desired
		// numbers in.
		double smallestNum = alpha[0];
		double largestNum = alpha[0];
		double sumOfNum = 0;
		double avgOfNum = 0;

		// Then I have to loop through them using either a for loop or a for each loop
		for (double dn : alpha) {
			if (dn > largestNum) {
				largestNum = dn;
			} else if (dn < smallestNum) {
				smallestNum = dn;
			}
			sumOfNum += dn;
			avgOfNum = sumOfNum / alpha.length;
		}
		System.out.println("The smallest number is: " + smallestNum + "\nThe Largest number is: " + largestNum
				+ "\nThe sum is: " + sumOfNum + "\nThe average is: " + avgOfNum);


		

	}

}
