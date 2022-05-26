package DataStructures;

import java.util.LinkedList;

public class LinkedListPractice06 {

	public static void main(String[] args) {

		LinkedList<String> firstLL = new LinkedList<String>();

		firstLL.add("Test1");
		firstLL.add("Test2");
		firstLL.add("Test3");
		firstLL.add("Test4");
		firstLL.add("Test5");
		firstLL.add("Test6");

		System.err.println(firstLL.contains("test1"));
		System.out.println(firstLL.contains("Test1"));

//		for (int i = 0; i < firstLL.size(); i++) {
//			System.out.println(firstLL.get(i));
//		}

	}

}
