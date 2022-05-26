package DataStructures;

import java.util.ArrayList;

public class ArrayListPractice00 {

	public static void main(String[] args) {

		ArrayList<Integer> firstAL = new ArrayList<Integer>();
		firstAL.add(10);
		firstAL.add(11);
		firstAL.add(12);
		firstAL.add(13);
		firstAL.add(12345);
		firstAL.add(4, 14);
		firstAL.get(4);

		System.out.println(firstAL);
		System.out.println(firstAL.get(4));

//		for (int i = 0; i < firstAL.size(); i++) {
//			System.out.println(firstAL.get(i));
//
//		}
	}

}
