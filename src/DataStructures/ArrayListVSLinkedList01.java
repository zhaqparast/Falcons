package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList01 {

	public static void main(String[] args) {

		// Lets create to different lists of String data type, a LinkedList and an
		// ArrayList and compare them to see the differences

		ArrayList<String> arrayListOfNames = new ArrayList<>();
		LinkedList<String> linkedListOfNames = new LinkedList<>();

		// After creating the ArrayList and the LinkedList, lets add some elements to
		// these lists using the .add() method.

		arrayListOfNames.add("Jimmy 'The Tulip' Tudeski");
		arrayListOfNames.add("John Dillinger");
		arrayListOfNames.add("Jack Sparrow");
		arrayListOfNames.add("Ip Man");
		arrayListOfNames.add("Jackie Chan");
		arrayListOfNames.add("Mike Tyson");
		arrayListOfNames.add("Vin Diesel");
		arrayListOfNames.add("Rashid Khan");
		arrayListOfNames.add("Mujeeb Zadran");
		arrayListOfNames.add("MOhammad Nabi");

		linkedListOfNames.add("Jimmy 'The Tulip' Tudeski");
		linkedListOfNames.add("John Dillinger");
		linkedListOfNames.add("Jack Sparrow");
		linkedListOfNames.add("Ip Man");
		linkedListOfNames.add("Jackie Chan");
		linkedListOfNames.add("Mike Tyson");
		linkedListOfNames.add("Vin Diesel");
		linkedListOfNames.add("Rashid Khan");
		linkedListOfNames.add("Mujeeb Zadran");
		linkedListOfNames.add("MOhammad Nabi");

		// Now, let's loop through both of these list to see what is going to happen.

		for (int i = 0; i < 10; i++) {
			arrayListOfNames.get(i);
			linkedListOfNames.get(i);
		}

		// lets create a timer and try to retrieve the same element from each of the
		// lists and compare them which one is fast.

		// Now lets insert an element into a specific location of each list using the
		// .add() method and compare the difference

		final long startTimeAL = System.nanoTime();
		// arrayListOfNames.get(7);
		arrayListOfNames.add(8, "Bruce Lee"); // The ArrayList has to push all other elements to insert the new element
												// into the array
		final long endTimeAL = System.nanoTime();

		final long startTimeLL = System.nanoTime();
		// linkedListOfNames.get(7);
		linkedListOfNames.add(8, "Bruce Lee"); // The linked list will simply go and insert the new element between the
												// existing elements without pushing them to their new locations
		final long endTimeLL = System.nanoTime();

		// Now, let's get the total time for the execution of each list by subtracting
		// the start time from end time for each list

		long totalTimeAL = endTimeAL - startTimeAL;
		long totalTimeLL = endTimeLL - startTimeLL;

		System.out.println("Total time of execution for ArrayList in nano seconds: " + totalTimeAL);
		System.err.println("Total time of execution for LinkedList in nano seconds: " + totalTimeLL);

	}

}
