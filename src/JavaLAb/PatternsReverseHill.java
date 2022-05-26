package JavaLAb;

public class PatternsReverseHill {

	public static void main(String[] args) {

		int alpha = 5;
		for (int i = 1; i <= alpha; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= alpha; j++) {
				System.out.print("* ");
			}
			for (int j = i; j < alpha; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		int bravo = 6;
		for (int i = 0; i <= bravo; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= bravo; j++) {
				System.out.print("Z ");
			}
			for (int j = i; j < bravo; j++) {
				System.out.print("Z ");
			}
			System.out.println();
		}
		System.out.println();

		int charlie = 7;
		for (int i = 1; i <= charlie; i++) {
			for (int j = 1; j <= charlie; j++) {
				if (i == 4 || j == 4) {
					System.out.print("X ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		/*
		 * 
		 * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
		 *
		 */

		int delta = 8;

		for (int i = 1; i <= delta; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= delta; k++) {
				System.out.print("G ");
			}
			for (int l = delta; l >= i; l--) {
				System.out.print("G ");
			}
			System.out.println();
		}
		System.out.println();

		int echo = 9;
		for (int row = 1; row <= echo; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print("  ");
			}
			for (int anotherColumn = row; anotherColumn <= echo; anotherColumn++) {
				System.out.print("W ");
			}
			for (int the3rdColumn = echo - 1; the3rdColumn >= row; the3rdColumn--) {
				System.out.print("M ");
			}
			System.out.println();
		}
		System.out.println();

		int fox = 10;
		for (int i = 1; i <= fox; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("1 ");
			}
			for (int k = i; k <= fox; k++) {
				System.out.print("2 ");
			}
			for (int l = fox - 1; l >= i; l--) {
				System.out.print("3 ");
			}
			for (int m = 1; m <= i - 1; m++) {
				System.out.print("$ ");
			}

			System.out.println();
		}
		System.out.println();

		int get = 9;
		for (int i = 1; i <= get; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= get; k++) {
				System.out.print("@ ");
			}
			for (int l = get - 1; l >= i; l--) {
				System.out.print("@ ");
			}
			System.out.println();
		}
		System.out.println();

		int hi = 8;
		for (int i = 1; i <= hi; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= hi; k++) {
				System.out.print("G ");
			}
			for (int l = hi - 1; l >= i; l--) {
				System.out.print("G ");
			}
			System.out.println();
		}
		System.out.println();

		int idea = 7;
		for (int i = 1; i <= idea; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= idea; k++) {
				System.out.print("% ");
			}
			for (int l = idea - 1; l >= i; l--) {
				System.out.print("% ");
			}
			System.out.println();
		}
		System.out.println();

		int james = 6;
		for (int i = 1; i <= james; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= james; k++) {
				System.out.print("A ");
			}
			for (int l = james - 1; l >= i; l--) {
				System.out.print("A ");
			}
			System.out.println();
		}
		System.out.println();

		int kilo = 5;
		for (int i = 1; i <= kilo; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= kilo; k++) {
				System.out.print("@ ");
			}
			for (int l = kilo - 1; l >= i; l--) {
				System.out.print("@ ");
			}
			System.out.println();
		}
		System.out.println();

		int lima = 6;
		for (int i = 1; i <= lima; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= lima; k++) {
				System.out.print("& ");
			}
			for (int l = lima - 1; l >= i; l--) {
				System.out.print("& ");
			}
			System.out.println();
		}
		System.out.println();

		int mike = 7;
		for (int i = 1; i <= mike; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= mike; k++) {
				System.out.print("B ");
			}
			for (int l = mike - 1; l >= i; l--) {
				System.out.print("R ");
			}
			System.out.println();
		}

		System.out.println();

		int noble = 8;
		for (int i = 1; i <= noble; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= noble; k++) {
				System.out.print("A ");
			}
			for (int l = noble - 1; l >= i; l--) {
				System.out.print("V ");
			}
			System.out.println();
		}
		System.out.println();

		int one = 9;
		for (int i = 1; i <= one; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= one; k++) {
				System.out.print("6 ");
			}
			for (int l = one - 1; l >= i; l--) {
				System.out.print("9 ");
			}
			System.out.println();
		}
		System.out.println();

		int pet = 10;
		for (int i = 1; i <= pet; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= pet; k++) {
				System.out.print("% ");
			}
			for (int l = pet - 1; l >= i; l--) {
				System.out.print("B ");
			}
			System.out.println();
		}
		System.out.println();

		int quit = 9;
		for (int i = 1; i <= quit; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= quit; k++) {
				System.out.print("U ");
			}
			for (int l = quit - 1; l >= i; l--) {
				System.out.print("N ");
			}
			System.out.println();
		}
		System.out.println();

		int rob = 8;
		for (int i = 1; i <= rob; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= rob; k++) {
				System.out.print("H ");
			}
			for (int l = rob - 1; l >= i; l--) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println();

		int sob = 7;
		for (int i = 1; i <= sob; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= sob; k++) {
				System.out.print("M ");
			}
			for (int l = sob - 1; l >= i; l--) {
				System.out.print("W ");
			}
			System.out.println();
		}
		System.out.println();

		int tom = 6;
		for (int i = 1; i <= tom; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= tom; k++) {
				System.out.print("V ");
			}
			for (int l = tom - 1; l >= i; l--) {
				System.out.print("A ");
			}
			System.out.println();
		}
		System.out.println();

		int uber = 5;
		for (int i = 1; i <= uber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= uber; k++) {
				System.out.print("O ");
			}
			for (int l = uber - 1; l >= i; l--) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println();

		int vice = 6;
		for (int i = 1; i <= vice; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= vice; k++) {
				System.out.print("+ ");
			}
			for (int l = vice - 1; l >= i; l--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		int why = 7;
		for (int i = 1; i <= why; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= why; k++) {
				System.out.print("Q ");
			}
			for (int l = why - 1; l >= i; l--) {
				System.out.print("R ");
			}
			System.out.println();
		}
		System.out.println();

		int xor = 7;
		for (int i = 1; i <= xor; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= xor; k++) {
				System.out.print("* ");
			}
			for (int l = xor - 1; l >= i; l--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		int yes = 8;
		for (int i = 1; i <= yes; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= yes; k++) {
				System.out.print("E ");
			}
			for (int l = yes - 1; l >= i; l--) {
				System.out.print("F ");
			}
			System.out.println();
		}
		System.out.println();

		int zach = 9;
		for (int i = 1; i <= zach; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= zach; k++) {
				System.out.print("V ");
			}
			for (int l = zach - 1; l >= i; l--) {
				System.out.print("A ");
			}
			System.out.println();
		}
		System.out.println();
		
	
		}

	}

