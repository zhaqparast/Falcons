package JavaBasicsPackage;

public class Lesson11Patterns {

	public static void main(String[] args) {

		int alpha = 5;

		for (int i = 1; i <= alpha; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= alpha; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();

		int bravo = 8;

		for (int i = 1; i <= bravo; i++) {
			for (int j = 1; j <= bravo; j++) {

				if (i == 8 || i == 1) {
					System.out.print("$ ");
				} else if (j == 1 || j == 8) {
					System.out.print("$ ");
				}

				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//create this pattern
		//			  A
		//		   A     A
		//		A           A
		//	 A                 A
		//A  A  A  A  A  A  A  A  A
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 5 && j == 1 || i == 4 && j == 2 || i == 3 && j == 3 || i == 2 && j == 4 || i == 1 && j == 5) {
					System.out.print(j + " ");
				} else if (i == 2 && j == 6 || i == 3 && j == 7 || i == 4 && j == 8 || i == 5 && j == 9) {
					System.out.print(j + " ");
				} else if (i == 5 && j > 1 && j < 9) {
					System.out.print(j + " ");
				}

				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
