package JavaBasicsPackage;

public class Lesson9ForLoops2 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) { // This loop will go from o to 9 and from top to bottom
			System.out.print(i);

			System.out.print(" * "); // this will print out a star at the end of the first
										// loop and the beginning of the second loop which goes horizontally
			for (int j = i; j >= 0; j--) { // this loop will go from 0 to 9 horizontally
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\n");

		int num = 2;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}

		System.out.println("\n");

		// Please code the following

		// 2 1 2 3 4 5 6
		// 4 1 2 3 4 5 6
		// 6 1 2 3 4 5 6
		// 8 1 2 3 4 5 6

		for (int i = 2; i < 9; i = i + 2) {
			System.out.print(i + " ");
			for (int j = 1; j < 7; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			for (int j = i; j >= 0; j--) {
				System.out.print(j + " ");
			}

		}

		System.out.println("\n");

		int a = 9;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print("% ");
			}
			System.out.println();
		}

	}

}
