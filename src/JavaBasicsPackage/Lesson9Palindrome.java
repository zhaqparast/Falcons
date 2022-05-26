package JavaBasicsPackage;

public class Lesson9Palindrome {

	public static void main(String[] args) {

		String alpha = "Madam";
		String revAlpha = "";
		System.out.println(alpha);

		for (int index = 0; index < alpha.length(); index++) {
			System.out.print(alpha.charAt(index));

		}
		System.out.println();

		for (int i = alpha.length() - 1; i >= 0; i--) {
			revAlpha = revAlpha + alpha.charAt(i);
		}
		System.out.println(revAlpha);

		String sonInLaw = "damad";
		for (int index = 0; index < sonInLaw.length(); index++) {
			System.out.print(sonInLaw.charAt(index));
		}
		System.out.println();

		String revSonInLaw = "";
		for (int i = sonInLaw.length() - 1; i >= 0; i--) {
			System.out.println(revSonInLaw = revSonInLaw + sonInLaw.charAt(i));

			if (revSonInLaw.equals(sonInLaw)) {
				System.out.println("This is a palindrome");
			} else {
				System.out.println("It is not a palindrom");
			}
		}

		String bravo = "Nurses run";
		String revBravo = "";
		for (int index = bravo.length() - 1; index >= 0; index--) {
			System.out.println(bravo);
			revBravo += bravo.charAt(index);
			if (bravo.equals(revBravo)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not Palindrom");
			}

		}

		String charlie = "Damad";
		String revCharlie = "";
		for (int i = 0; i <= charlie.length(); i++) {
			System.out.println(i);
		}
		for (int i = charlie.length() - 1; i >= 0; i--) {
			revCharlie = revCharlie + charlie.charAt(i);
		}
		if (revCharlie.equals(charlie)) {
			System.out.println(charlie + " is equal to " + revCharlie);
		} else {
			System.out.println(charlie + " is not equal to " + revCharlie);
		}

		String delta = "Nurses\" run";
		String revDelta = "";
		for (int index = delta.length() - 1; index >= 0; index--) {
			revDelta += delta.charAt(index);
		}
		if (revDelta.equals(delta)) {
			System.out.println(delta + " is a palindrome phrase.");
		} else {
			System.out.println(delta + " is not a palidrome phrase.");
		}

		String foxtrot = "rotator";
		String revFox = "";
		for (int index = foxtrot.length() - 1; index >= 0; index--) {
			revFox += foxtrot.charAt(index);
		}

		if (foxtrot.equals(revFox)) {
			System.out.println("Palindrom");
			System.out.println(foxtrot + " is equal to " + revFox);
		} else {
			System.out.println("Not Palindrome");
			System.out.println(foxtrot + " is not equal to " + revFox);
		}

		String echo = "reviver";
		String revEcho = "";
		for (int index = echo.length() - 1; index >= 0; index--) {
			revEcho += echo.charAt(index);
		}
		if (revEcho.equals(echo)) {
			System.out.println("Palindrome");
			System.out.println(echo + " is equal to " + revEcho);
		} else {
			System.out.println("Not Palindrome");
			System.out.println(echo + " is not equal to " + revEcho);
		}

		String golf = "naan";
		String revGolf = "";
		for (int i = golf.length() - 1; i >= 0; i--) {
			revGolf += golf.charAt(i);

		}
		if (golf.equals(revGolf)) {
			System.out.println("Palindrome");
			System.out.println(golf + " is equal to " + revGolf);
		} else {
			System.out.println("Not Palindrome");
			System.out.println(golf + " is not equal to " + revGolf);
		}

		String hotel = "babak";
		String revHotel = "";
		for (int index = hotel.length() - 1; index >= 0; index--) {
			revHotel = revHotel + hotel.charAt(index);

		}

		if (hotel.equals(revHotel)) {
			System.out.println("Palindrome");
			System.out.println(hotel + " is equal to " + revHotel);
		} else {
			System.out.println("Palindrome");
			System.out.println(hotel + " is not equal to " + revHotel);
		}

		String india = "toot";
		String revIndia = "";
		for (int index = india.length() - 1; index >= 0; index--) {
			revIndia = revIndia + india.charAt(index);
		}
		if (india.equals(revIndia)) {
			System.out.println("Palindrome");
			System.out.println(india + " is equal to " + revIndia);
		} else {
			System.out.println("Not Palindrome");
			System.out.println(india + " is not equal to " + revIndia);
		}

		String july = "ahahaha";
		String revJuly = "";
		for (int index = july.length() - 1; index >= 0; index--) {
			revJuly = revJuly + july.charAt(index);
		}
		if (revJuly.equals(july)) {
			System.out.println("Palindrome");
			System.out.println(july + " is equal to " + revJuly);
		} else {
			System.out.println("Not Palindrom");
			System.out.println(july + " does not match " + revJuly);
		}

		String kilo = "Kakar";
		String revKilo = "";
		for (int i = kilo.length() - 1; i >= 0; i--) {
			revKilo += kilo.charAt(i);

		}
		if (kilo.equals(revKilo)) {
			System.out.println("Palindrome");
			System.out.println(kilo + " equals or matches " + revKilo);
		} else {
			System.out.println("Not a palindrome");
			System.out.println(kilo + " is not equal to " + revKilo);
		}

		String lima = "canyon";
		String revLima = "";
		for (int i = lima.length() - 1; i >= 0; i--) {
			revLima += lima.charAt(i);

		}
		if (lima.equals(revLima)) {
			System.out.println("This is palindrome");
			System.out.println(lima + " is equal to " + revLima);
		} else {
			System.out.println("This is not Palindrom");
			System.out.println(lima + " is not equal to " + revLima);
		}

		String mike = "kayak";
		String revMike = "";
		for (int index = mike.length() - 1; index >= 0; index--) {
			revMike = revMike + mike.charAt(index);

		}
		if (mike.equals(revMike)) {
			System.out.println("Palindrome");
			System.out.println(mike + " is equal to " + revMike);
		} else {
			System.out.println("Not Palindrome");
			System.out.println(mike + " is not equal to " + revMike);
		}

		String nova = "babar";
		String revNova = "";
		for (int index = nova.length() - 1; index >= 0; index--) {
			revNova = revNova + nova.charAt(index);

		}
		if (nova.equals(revNova)) {
			System.out.println("Palindrome");
			System.out.println(nova + " is equal to " + revNova);
		} else {
			System.out.println("Not Palindrome");
			System.out.println(nova + " is not equal to " + revNova);
		}

		String opel = "1234321";
		String revOpel = "";
		for (int i = opel.length() - 1; i >= 0; i--) {
			revOpel += opel.charAt(i);

		}
		if (opel.equals(revOpel)) {
			System.out.println("Palindrome");
			System.out.println(opel + " is equal to " + revOpel);
		} else {
			System.out.println("Not Palindrome");
			System.out.println(opel + " is not equal " + revOpel);
		}

		String pop = "popcorn";
		String revPop = "";
		for (int index = pop.length() - 1; index >= 0; index--) {
			revPop = revPop + pop.charAt(index);
		}
		if (pop.equals(revPop)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		String queen = "moon";
		String revQueen = "";
		for (int index = queen.length() - 1; index >= 0; index--) {
			revQueen += queen.charAt(index);

		}
		if (queen.equals(revQueen)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not a Palindrome");
		}

		String room = "raven";
		String revRoom = "";
		for (int index = room.length() - 1; index >= 0; index--) {
			revRoom = revRoom + room.charAt(index);
		}
		if (room.equals(revRoom)) {
			System.out.println("Palindrome");
			System.out.println(room + " is equal to " + revRoom);
		} else {
			System.out.println("Not Palindrome");
			System.out.println(room + " is not equal to " + revRoom);
		}

		String satan = "0987890";
		String revSatan = "";
		for (int index = satan.length() - 1; index >= 0; index--) {
			revSatan += satan.charAt(index);
		}
		if (satan.equals(revSatan)) {
			System.out.println("Palindrome");
			System.out.println(satan + " is equal to " + revSatan);
		} else {
			System.out.println("Not Palindrome");
			System.out.println(satan + " is not equal to " + revSatan);
		}

		String tom = "radar";
		String revTom = "";
		for (int index = tom.length() - 1; index >= 0; index--) {
			revTom += tom.charAt(index);
		}
		if (tom.equals(revTom)) {
			System.out.println("Palindrom");
			System.out.println(tom + " is equal to " + revTom);
		} else {
			System.out.println("Not a Palindrone");
			System.out.println(tom + " is not equal to " + revTom);
		}

		String uniform = "loop";
		String revUniform = "";
		for (int index = uniform.length() - 1; index >= 0; index--) {
			revUniform = revUniform + uniform.charAt(index);

		}
		if (uniform.equals(revUniform)) {
			System.out.println("Palindrome");
			System.out.println(uniform + " is equal to " + revUniform);
		} else {
			System.out.println("Not Palindrome");
			System.out.println(uniform + " is not equal to " + revUniform);
		}

		String victor = "vivian";
		String revVictor = "";
		for (int index = victor.length() - 1; index >= 0; index--) {
			revVictor += victor.charAt(index);
		}
		if (victor.equals(revVictor)) {
			System.out.println("Palindrom");
			System.out.println(victor + " is equal to " + revVictor);
		} else {
			System.out.println("Not Palindrom");
			System.out.println(victor + " is not equal to " + revVictor);
		}

		String win = "wow";
		String revWin = "";
		for (int index = win.length() - 1; index >= 0; index--) {
			revWin = revWin + win.charAt(index);

		}
		if (win.equals(revWin)) {
			System.out.println("Palindrome");
			System.out.println(win + " is equal to " + revWin);
		} else {
			System.out.println("Not a Palindrome");
			System.out.println(win + " is not equal to " + revWin);
		}

		String xray = "xoxoxoxox";
		String revXray = "";
		for (int index = xray.length() - 1; index >= 0; index--) {
			revXray += xray.charAt(index);
		}
		if (xray.equals(revXray)) {
			System.out.println("Palindrome");
			System.out.println(xray + " is equal to " + revXray);

		} else {
			System.out.println("Not Palindrome");
			System.out.println(xray + " is not equal to " + revXray);
		}

		String yankee = "nadan";
		String revYankee = "";
		for (int index = yankee.length() - 1; index >= 0; index--) {
			revYankee = revYankee + yankee.charAt(index);

		}
		if (yankee.equals(revYankee)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		// Scanner bravo = new Scanner (System.in);

		String one = "boob";

		for (int i = 0, j = one.length() - 1; i < one.length(); i++, j--) {
			if (i == j) {
				break;
			} else {
				System.out.println(one.charAt(i) + " " + one.charAt(j));
				if (one.charAt(i) != one.charAt(j)) {
					System.out.println(one + " is not a palindrome word.");
				}
			}
		}

	}

}
