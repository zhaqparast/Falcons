package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList02 {

	public static void main(String[] args) {

		// Below we have an ArrayList and a LinkedList
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Using the for loop, we iterate through both lists and we add elements to each
		// lists
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(i);
			linkedList.add(i);

		}

		// Then we have to retrieve specific element from each of these lists using the
		// .get method() and we set a timer to compare the difference

		// After that we have to use the .remove() method to remove an element from the
		// same location of each list to compare the difference

		// Then we would like to remove the first element of each list, let`s see which
		// one is faster. The LinkedList will directly go to that element and remove it
		// without shifting the rest of the data while the ArrayList will have to shift
		// all of its elements once it removes its first element.

		final long startTimeForAL = System.nanoTime();
		// arrayList.get(100);
		// arrayList.remove(500000);
		arrayList.remove(1);
		final long endTimeForAL = System.nanoTime();

		final long startTimeForLL = System.nanoTime();
		// linkedList.get(100);
		// linkedList.remove(500000);
		linkedList.remove(1);
		final long endTimeForLL = System.nanoTime();

		// Then we subtract the start time for each list from its end time to get the
		// total time
		long totalTimeForAL = endTimeForAL - startTimeForAL;
		long totalTimeForLL = endTimeForLL - startTimeForLL;

		System.out.println("Total time for the ArrayList execution is: " + totalTimeForAL);
		System.out.println("Total time for the LinkedList execution is: " + totalTimeForLL);
	}

}
