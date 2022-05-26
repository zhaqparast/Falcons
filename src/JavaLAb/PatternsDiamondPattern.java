package JavaLAb;

public class PatternsDiamondPattern {

	public static void main(String[] args) {



		int zee = 10;
		for (int i = 1; i < zee; i++) {
			for (int j = i; j <= zee; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("A ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("B ");
			}
			System.out.println();
		}

		for (int i = 1; i <= zee; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}

			for (int l = zee - 1; l >= i; l--) {
				System.out.print("C ");
			}
			for (int m = zee + 1; m > i; m--) {
				System.out.print("D ");
			}
			System.out.println();
		}
	}

}
