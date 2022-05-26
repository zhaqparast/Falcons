package DataStructures;

import java.util.HashSet;

public class HashSetExample05 {

	public static void main(String[] args) {

		HashSet<Integer> numbers = new HashSet<Integer>();

		// HashSet takes unique values, not repeated as shown below. We will try to add
		// a specific number more than once but once we print it, the result will show
		// that the HashSet did not accept the duplicate values.

		numbers.add(15);
		numbers.add(19);
		numbers.add(78);
		numbers.add(15);
		numbers.add(55);
		numbers.add(16);
		numbers.add(15);
		// The result below will show that duplicate values we excluded by the HashSet
		System.out.println(numbers);
		System.out.println();

		HashSet<String> names = new HashSet<String>();
		names.add("James Bond");
		names.add("James Baker");
		names.add("James Brown");
		names.add("Jason Bourne");
		names.add("James Bond");
		System.out.println(names);
		System.out.println();

		HashSet<String> alpha = new HashSet<String>();
		alpha.add("Alpha");
		alpha.add("bravo");
		alpha.add("charlie");
		alpha.add("Alpha");
		alpha.add("Delta");
		alpha.add("Echo");
		alpha.add("bravo");
		alpha.add("Fox");
		System.out.println(alpha);
		System.out.println(alpha.contains("alpha"));
		System.out.println(alpha.contains("Alpha"));
		System.out.println(alpha.remove("Alpha"));
		System.out.println(alpha);
		System.out.println(alpha.removeAll(alpha));
		System.out.println(alpha);
		System.out.println();

		HashSet<Character> bravo = new HashSet<Character>();
		bravo.add('A');
		bravo.add('1');
		bravo.add('@');
		bravo.add('!');
		bravo.add('1');
		bravo.add('%');

		System.out.println(bravo);
		System.out.println(bravo.remove('@'));
		System.out.println(bravo);
		System.out.println(bravo.size());
		System.out.println();

		HashSet<String> charlie = new HashSet<String>();
		charlie.add("Rashid Khan");
		charlie.add("Mujeeb Zadran");
		charlie.add("Zahir Khan Pakteen");
		charlie.add("Amir Hamza Hotak");
		charlie.add("Mirwais Ashraf");
		charlie.add("Rashid Khan");
		charlie.add("Mohammad Nabi");
		charlie.add("Najib Zadran");
		charlie.add("Rahmanullah Gurbaz");
		charlie.add("Gulbadin Naib");
		charlie.add("Dawlat Zadran");
		charlie.add("Hamid Hassan");
		charlie.add("Samiullah Shenwari");
		charlie.add("Mohammad Nabi");
		System.err.println(charlie.size());
		System.out.println(charlie);
		System.out.println(charlie.contains("Nawrooz Mangal"));
		System.out.println(charlie.isEmpty());
		System.out.println(charlie.clone());
		System.out.println(charlie);
		System.out.println(charlie.remove("Hamid Hassan"));
		System.out.println(charlie);

		HashSet<String> delta = new HashSet<String>();
		delta.add("Alpha");
		delta.add("Bravo");
		delta.add("Charlie");
		delta.add("Delta");
		delta.add("Echo");
		delta.addAll(charlie);
		System.out.println(delta);
		System.out.println(delta.containsAll(charlie));

	}

}
