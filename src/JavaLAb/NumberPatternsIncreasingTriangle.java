package JavaLAb;

public class NumberPatternsIncreasingTriangle {

	public static void main(String[] args) {

		int alpha = 5;
		for (int i = 1; i <= alpha; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			System.out.println();
		}
		System.out.println();

		int bravo = 6;
		for (int i = 1; i <= bravo; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			for (int k = i; k < bravo; k++) {
				System.out.print("  ");
			}

			for (int l = bravo; l > i; l--) {
				System.out.print("  ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= bravo - 1; i++) {
			for (int j = i; j <= bravo - 1; j++) {
				System.out.print(i + " ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("  ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("  ");
			}
			for (int m = bravo - 1; m >= i; m--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
