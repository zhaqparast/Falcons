package JavaLAb;

public class LabFour {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };

		for (int i : a) {
			System.out.println(i);
		}
		System.out.println();

		int[] a2 = new int[3];
		a2[0] = 1;
		a2[1] = 2;
		a2[2] = 3;

		for (int i : a2) {
			System.out.println(i);
		}

		System.out.println();

		int[] b = new int[a.length];
		int temp = 0;
		for (int i : a) {
			b[temp] = i;
			System.out.print(b[temp] + ", ");
		}
		System.out.println();
		System.out.println();

		int[] c = new int[a.length + b.length];
		int nums = 0;
		for (int i = 0; i < 1; i++) {
			for (int one : a) {
				c[nums] = one;
				System.out.print(c[nums] + " ");
				nums++;
			}
			for (int two : b) {
				c[nums] = two;
				System.out.print(c[nums] + " ");
				nums++;

			}

		}
		System.out.println("\n5th index of array C : " + c[4]);
		System.out.println();

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			for (int k = 6; k >= i; k--) {
				System.out.print("  ");
			}

			for (int l = 6; l >= i; l--) {
				System.out.print("  ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print(m + " ");
			}
			System.out.println();

		}

		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print(j + " ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("  ");
			}

			for (int l = 1; l <= i; l++) {
				System.out.print("  ");
			}
			for (int m = 6; m >= i; m--) {
				System.out.print(m + " ");
			}
			System.out.println();

		}

		System.out.println();

		for (int i = 1; i <= 7; i++) {
			for (int j = 7; j >= i; j--) {
				System.out.print(j + " ");
			}
			for (int k = 2; k <= i; k++) {
				System.out.print("  ");
			}
			for (int l = 2; l <= i; l++) {
				System.out.print("  ");
			}
			for (int m = 7; m >= i; m--) {
				System.out.print(m + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int k = 6; k >= i; k--) {
				System.out.print("  ");
			}
			for (int l = 6; l >= i; l--) {
				System.out.print("  ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 7; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l + " ");
			}
			for (int m = 7; m >= i; m--) {
				System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = 6; k >= i; k--) {
				System.out.print(i + " ");
			}
			for (int l = 5; l >= i; l--) {
				System.out.print(i + " ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();

		int height = 9;
		int width = 9;

		for (int i = 1; i <= height; i++) {
			for (int j = width; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					System.out.print("* ");
				} else if (i == 9 && j == 1) {
					System.out.print("* ");
				} else if (i == 8 && j == 2) {
					System.out.print("* ");
				} else if (i == 7 && j == 3) {
					System.out.print("* ");
				} else if (i == 6 && j == 4) {
					System.out.print("* ");
				} else if (i == 4 && j == 6) {
					System.out.print("* ");
				} else if (i == 3 && j == 7) {
					System.out.print("* ");
				} else if (i == 2 && j == 8) {
					System.out.print("* ");
				} else if (i == 1 && j == 9) {
					System.out.print("* ");
				}

				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		int[][][] adam = { { { 12, 23 } }, { { 12, 23, 34 }, { 12, 23, 34, 45 } },
				{ { 12, 23, 34, 45, 56 }, { 12, 23, 34, 45, 56, 67 }, { 12, 23, 34, 45, 56, 67, 78 } } };
		outer: for (int i = 0; i < adam.length; i++) {
			inner: for (int j = 0; j < adam[i].length; j++) {
				interior: for (int k = 0; k < adam[i][j].length; k++) {
					if (adam[i][j][k] == 45) {
						continue interior;
					}
					System.out.print(adam[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
