package DataStructures;

import java.util.ArrayList;

public class CollectionPracticeOne {

	public static void main(String[] args) {

		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		ArrayList<String> firstName = new ArrayList<String>();
		ArrayList<String> lastName = new ArrayList<String>();
		firstName.add("Jack1");
		firstName.add("Jack2");
		firstName.add("Jack3");
		firstName.add("Jack4");
		firstName.add("Jack5");

		lastName.add("Sparrow");

		data.add(firstName);
		data.add(lastName);

		// This is also possible to add empty arrayList such as bellow;

		data.add(new ArrayList<String>());
		data.add(new ArrayList<String>());
		data.add(new ArrayList<String>());

		// Now our nested ArrayList will have 5 elements in one list, one in another,
		// and three empty elements in another.

		// The question now is how do we get to these indexes and how do we manipulate
		// them? Here is how:

		// For example, I want to add something to the third index.

		data.get(3).add("How is he doing?");
		data.get(2).add("Where is Jack?");
		data.get(4).add("It has been a long time sine I have last seen him.");

		// remove Jack3
		data.get(0).remove(2);

		// remove jack2 and add jack2.0 in that same location
		data.get(0).set(1, "Jack2.0");

		System.out.println(data);
	}

}
