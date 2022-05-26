package StringManipulation;


public class DotIndexOfMethod07 {

	public static void main(String[] args) {

		String alpha = "She sells some sea shells by the sea shore.";

		System.out.println(alpha.indexOf('s'));
		System.out.println(alpha.indexOf('s', +1));
		System.out.println(alpha.indexOf('s', alpha.indexOf('s', +1) + 1));
		System.out.println(alpha.indexOf('s', alpha.indexOf('s', alpha.indexOf('s', +1) + 1) + 1));
		System.out.println(
				alpha.indexOf('s', alpha.indexOf('s', alpha.indexOf('s', alpha.indexOf('s', +1) + 1) + 1) + 1));

		System.out.println(alpha.indexOf('s',
				alpha.indexOf('s', alpha.indexOf('s', alpha.indexOf('s', alpha.indexOf('s', +1) + 1) + 1) + 1) + 1));

		System.out.println(alpha.indexOf('s', alpha.indexOf('s',
				alpha.indexOf('s', alpha.indexOf('s', alpha.indexOf('s', alpha.indexOf('s', +1) + 1) + 1) + 1) + 1)
				+ 1));

		System.out.println(alpha.indexOf('s', alpha.indexOf('s', alpha.indexOf('s',
				alpha.indexOf('s', alpha.indexOf('s', alpha.indexOf('s', alpha.indexOf('s', +1) + 1) + 1) + 1) + 1) + 1)
				+ 1));

		System.out
				.println(
						alpha.indexOf(
								's', alpha
										.indexOf(
												's', alpha
														.indexOf(
																's', alpha
																		.indexOf(
																				's', alpha
																						.indexOf('s', alpha.indexOf('s',
																								alpha.indexOf('s',
																										alpha.indexOf(
																												's', +1)
																												+ 1)
																										+ 1)
																								+ 1)
																						+ 1)
																		+ 1)
														+ 1)
										+ 1));

		String bravo = "Send toast to ten tense stout saints' ten tall tents.";

		int temp = 0;
		int occurance = 12;
		for (int i = 0; i < bravo.length(); i++) {
			if (bravo.charAt(i) == 't') {
				System.err.print(i + " " + bravo.charAt(i) + ", ");
			} else {
				System.out.print(i);
			}
			System.out.println();

		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		String charlie = "Six sick hicks nick six slick bricks with picks and sticks";
		// Find out the exact index numbers of each character s and character i in the
		// String above
		System.out.println(charlie.indexOf('s'));
		System.out.println(charlie.indexOf('s', charlie.indexOf('s', +1) + 1));
		System.out.println(charlie.indexOf('s', charlie.indexOf('s', charlie.indexOf('s', +1) + 1) + 1));
		System.out.println(
				charlie.indexOf('s', charlie.indexOf('s', charlie.indexOf('s', charlie.indexOf('s', +1) + 1) + 1) + 1));
		System.out.println(charlie.indexOf('s',
				charlie.indexOf('s', charlie.indexOf('s', charlie.indexOf('s', charlie.indexOf('s', +1) + 1) + 1) + 1)
						+ 1));
		System.out
				.println(charlie.indexOf('s',
						charlie.indexOf('s', charlie.indexOf('s',
								charlie.indexOf('s', charlie.indexOf('s', charlie.indexOf('s', +1) + 1) + 1) + 1) + 1)
								+ 1));

		System.out.println("***************************************************************************");
		System.out.println();

		System.out.println(charlie.indexOf('i', +1));
		System.out.println(charlie.indexOf('i', charlie.indexOf('i', +1) + 1));
		System.out.println(charlie.indexOf('i', charlie.indexOf('i', charlie.indexOf('i', +1) + 1) + 1));
		System.out.println(
				charlie.indexOf('i', charlie.indexOf('i', charlie.indexOf('i', charlie.indexOf('i', +1) + 1) + 1) + 1));
		System.out.println(charlie.indexOf('i',
				charlie.indexOf('i', charlie.indexOf('i', charlie.indexOf('i', charlie.indexOf('i' + 1) + 1) + 1) + 1)
						+ 1));
		System.out
				.println(charlie.indexOf('i',
						charlie.indexOf('i', charlie.indexOf('i',
								charlie.indexOf('i', charlie.indexOf('i', charlie.indexOf('i', +1) + 1) + 1) + 1) + 1)
								+ 1));
		System.out
				.println(
						charlie.indexOf(
								'i', charlie
										.indexOf('i',
												charlie.indexOf(
														'i', charlie
																.indexOf('i', charlie.indexOf('i',
																		charlie.indexOf('i',
																				charlie.indexOf('i', +1) + 1) + 1)
																		+ 1)
																+ 1)
														+ 1)
										+ 1));

		System.out
				.println(
						charlie.indexOf(
								'i', charlie
										.indexOf(
												'i', charlie
														.indexOf(
																'i', charlie
																		.indexOf(
																				'i', charlie
																						.indexOf('i', charlie.indexOf(
																								'i',
																								charlie.indexOf('i',
																										charlie.indexOf(
																												'i', +1)
																												+ 1)
																										+ 1)
																								+ 1)
																						+ 1)
																		+ 1)
														+ 1)
										+ 1));

		System.out
				.println(
						charlie.indexOf(
								'i', charlie
										.indexOf(
												'i', charlie
														.indexOf('i',
																charlie.indexOf('i',
																		charlie.indexOf('i', charlie
																				.indexOf('i', charlie
																						.indexOf('i', charlie.indexOf(
																								'i',
																								charlie.indexOf('i',
																										charlie.indexOf(
																												'i', +1)
																												+ 1)
																										+ 1)
																								+ 1)
																						+ 1)
																				+ 1) + 1)
																		+ 1))
										+ 1));
		System.out
				.println(
						charlie.indexOf(
								'i', charlie
										.indexOf(
												'i', charlie
														.indexOf('i',
																charlie.indexOf('i',
																		charlie.indexOf('i', charlie
																				.indexOf('i', charlie
																						.indexOf('i', charlie.indexOf(
																								'i',
																								charlie.indexOf('i',
																										charlie.indexOf(
																												'i', +1)
																												+ 1)
																										+ 1)
																								+ 1)
																						+ 1)
																				+ 1) + 1)
																		+ 1)
														+ 1)
										+ 1));

		String delta = "I wish to wish the wish you wish to wish, but if you wish the wish the witch wishes, I won't wish the wish you wish to wish.";

		int temp1 = 0;
		int countOfW = 14;
		for (int i = 0; i < delta.length(); i++) {
			if (delta.charAt(i) == 'w') {
				temp1 = delta.indexOf('w', temp1) + 1;
				System.err.println("Count of " + countOfW + " w");
			} else {
				System.out.println(i);
			}
		}

		// We have to find out the count of i in our String delta. Here is how it is
		// done:
		int temp2 = 0;
		int countOfi = delta.indexOf('i');
		for (int i = 0; i < delta.length(); i++) {
			if (delta.charAt(i) == 'i') {
				temp2 = delta.indexOf('i', temp2) + 1;
				System.err.println("Index no " + i + " contains our " + countOfi++ + "th i in String delta.");
			} else {
				System.out.println(i);
			}

		}
		// Write down a code that will give me the location of the the 5th h in String
		// delta

		int initCountOfH = 0;
		int countOfH = 5;
		for (int i = 0; i < countOfH; i++) {
			if (delta.charAt(i) == 'h') {
				initCountOfH = delta.indexOf('h', initCountOfH) + 1;
				System.err.println("Index " + i + " contains " + countOfH++ + "th h in String delta.");
//			} else {
//				System.out.println(i);
			}
		}

		// Lets find out the location of the 8th 't' in String delta. Here is how it is
		// done:

		int initialCountOft = 0;
		int occurance1 = 7;
		for (int i = 0; i < occurance1; i++) {
			initialCountOft = delta.indexOf('t', initialCountOft) + 1;
			System.err.println(initialCountOft - 1);
		}
		System.out.println(initialCountOft - 1 + " is the index of the " + occurance1 + "th occurance of letter t");

		// This could also be done in the following way:
		System.out.println(delta.indexOf('t', delta.indexOf('t', delta.indexOf('t',
				delta.indexOf('t', delta.indexOf('t', delta.indexOf('t', delta.indexOf('t', +1) + 1) + 1) + 1) + 1) + 1)
				+ 1) + " is the index of the 7th occurance of letter t");

		System.out.println();
		System.out.println("***************************************************************************************");
		System.out.println();

		String echo = "Six sleek swans swam swiftly southwards";

		// Lets find out the index of the 5th s in the String above.

		int indexNumber = 0;
		int countOfs = 5;
		for (int i = 0; i < countOfs; i++) {
			indexNumber = echo.indexOf('s', indexNumber) + 1;
		}
		System.out.println(indexNumber - 1 + " is the index number of the " + countOfs + "th s.");

		System.out.println();

		System.err.println(echo.indexOf('s',
				echo.indexOf('s', echo.indexOf('s', echo.indexOf('s', echo.indexOf('s', +1) + 1) + 1) + 1) + 1)
				+ " is the index number of the 5th s.");

		System.out.println();

		String fox = "Send toast to ten tense stout saints' ten tall tents.";

		// Lets find the index number for the 10th t in String fox. Here is how it is
		// done:

		int indexOft = 0;
		int countOft = 10;
		for (int i = 0; i < countOft; i++) {
			indexOft = fox.indexOf('t', indexOft) + 1;
		}
		System.out.println(indexOft - 1 + " is the index number of the " + countOft + "th t.");

		// the other method we can use is as follows:

		System.err
				.println(
						fox.indexOf(
								't', fox
										.indexOf(
												't', fox
														.indexOf('t',
																fox.indexOf('t',
																		fox.indexOf('t', fox.indexOf('t', fox
																				.indexOf('t', fox.indexOf('t',
																						fox.indexOf('t',
																								fox.indexOf('t', +1)
																										+ 1)
																								+ 1)
																						+ 1)
																				+ 1) + 1) + 1)
																		+ 1)
														+ 1)
										+ 1)
								+ " is the index number of the 10th t.");
		System.out.println();

		String golf = "If you must cross a course, cross the cow across a crowded cow crossing, cross the cross coarse cow across the crowded cow crossing carefully.";

		// lets find the index number of the 11th c in the String above. Here is how is
		// it done:

		int indexOfc = 0;
		int countOfc = 11;

		for (int indexNumber1 = 0; indexNumber1 < countOfc; indexNumber1++) {
			indexOfc = golf.indexOf('c', indexOfc) + 1;
		}
		System.err.println(indexOfc - 1 + " is the index number of " + countOfc + "th c in the String golf.");

		System.out.println();

		System.out
				.println(
						golf.indexOf(
								'c', golf
										.indexOf(
												'c', golf
														.indexOf('c',
																golf.indexOf('c',
																		golf.indexOf('c',
																				golf.indexOf('c', golf.indexOf('c', golf
																						.indexOf('c', golf.indexOf('c',
																								golf.indexOf('c',
																										golf.indexOf(
																												'c', +1)
																												+ 1)
																										+ 1)
																								+ 1)
																						+ 1) + 1) + 1)
																				+ 1)
																		+ 1)
														+ 1)
										+ 1)
								+ " is the index number of 11th c in the String golf.");
		System.out.println();

		String hotel = golf;
		// Lets find out the index number of the 9th r in String hotel. Here is how it
		// is done.
		int indexOfr = 0;
		int countOfr = 9;

		for (int i = 0; i < countOfr; i++) {
			indexOfr = hotel.indexOf('r', indexOfr) + 1;
		}
		System.err.println(indexOfr - 1 + " is the index number for the " + countOfr + "th r");

		// the other way to achieve this is as follows:

		System.out
				.println(
						hotel.indexOf(
								'r', hotel
										.indexOf(
												'r', hotel
														.indexOf(
																'r', hotel
																		.indexOf('r',
																				hotel.indexOf('r', hotel
																						.indexOf('r', hotel.indexOf('r',
																								hotel.indexOf('r',
																										hotel.indexOf(
																												'r', +1)
																												+ 1)
																										+ 1)
																								+ 1)
																						+ 1) + 1)
																		+ 1)
														+ 1)
										+ 1)
								+ " is the index number for the 9th r");

		System.out.println();

		String india = "Brisk brave brigadiers brandished broad bright blades, blunderbusses, and bludgeons—balancing them badly";
		// lets find out the index number of the 8th b in the String above. Here is how:

		int indexOfb = 0;
		int countOfb = 8;
		for (int i = 0; i < countOfb; i++) {
			indexOfb = india.indexOf('b', indexOfb) + 1;
		}
		System.err.println(indexOfb - 1 + " is the index number for " + countOfb + "th b.");
		System.out.println();

		// The other way around is to find this out using the .indexOf method to print
		// out the index of the character we are looking for.

		System.out
				.println(
						india.indexOf(
								'b', india
										.indexOf(
												'b', india
														.indexOf(
																'b', india
																		.indexOf(
																				'b', india
																						.indexOf('b', india.indexOf('b',
																								india.indexOf('b',
																										india.indexOf(
																												'b', +1)
																												+ 1)
																										+ 1)
																								+ 1)
																						+ 1)
																		+ 1)
														+ 1)
										+ 1)
								+ " is the index number for 8th b.");
		System.out.println();

		String jack = "There is a difference between jerk and jelly bean but eggs are a separate thing.";
		// Let's find out the index number of the 9th e in String jack. Here is how it
		// is done:

		int indexNumberOfe = 0;
		int countOfe = 9;
		for (int i = 0; i < countOfe; i++) {
			indexNumberOfe = jack.indexOf('e', indexNumberOfe) + 1;
		}
		System.out.println(indexNumberOfe - 1 + " is the index number of the " + countOfe + "th e in String jack.");

		System.err
				.println(
						jack.indexOf(
								'e', jack
										.indexOf(
												'e', jack
														.indexOf(
																'e', jack
																		.indexOf('e',
																				jack.indexOf('e', jack
																						.indexOf('e', jack.indexOf('e',
																								jack.indexOf('e',
																										jack.indexOf(
																												'e', +1)
																												+ 1)
																										+ 1)
																								+ 1)
																						+ 1) + 1)
																		+ 1)
														+ 1)
										+ 1)
								+ " is the index number for the 9th e in String jack.");
		System.out.println();

		String kiwi = "Imagine an imaginary menagerie manager managing an imaginary menagerie";
		// Let's find the index number for the 5th g in String kiwi. Here is how it is
		// done:

		int indexNumberOfg = 0;
		int countOfg = 5;
		for (int i = 0; i < countOfg; i++) {
			indexNumberOfg = kiwi.indexOf('g', indexNumberOfg) + 1;
		}
		System.out.println(indexNumberOfg - 1 + " is the index number for the " + countOfg + "th g in String kiwi");

		System.err.println(kiwi.indexOf('g',
				kiwi.indexOf('g', kiwi.indexOf('g', kiwi.indexOf('g', kiwi.indexOf('g', +1) + 1) + 1) + 1) + 1)
				+ " is the index number for the 5th g in String kiwi");
		System.out.println();
		System.out.println();

		String lima = "Imagine an imaginary menagerie manager managing an imaginary menagerie";

		// Lets find out the 7th n in String lima. Here is how it is done:

		int indexOfn = 0;
		int countOfn = 7;
		for (int i = 0; i < countOfn; i++) {
			indexOfn = lima.indexOf('n', indexOfn) + 1;
		}
		System.out.println(indexOfn - 1 + " is the index number of " + countOfn + "th n in String lima.");

		System.err.println(lima.indexOf('n',
				lima.indexOf('n', lima.indexOf('n',
						lima.indexOf('n', lima.indexOf('n', lima.indexOf('n', lima.indexOf('n', +1) + 1) + 1) + 1) + 1)
						+ 1) + 1)
				+ " is the index number of 7th n in String lima.");

		String mike = "Mike likes bikes and wants to hike at night but tonight is not the right time to hike.";
		System.out.println();

		// Let's find the index number of the 6th i in the String mike. Here is how it
		// is done:
		int indexNumberOfi = 0;
		int countOfI = 6;
		for (int i = 0; i < countOfI; i++) {
			indexNumberOfi = mike.indexOf('i', indexNumberOfi) + 1;
		}
		System.err.println(indexNumberOfi - 1 + " is the index number of the " + countOfI + "th i in String mike.");

		// This is a different way to achieve the same result:

		System.out.println(mike.indexOf('i',
				mike.indexOf('i',
						mike.indexOf('i', mike.indexOf('i', mike.indexOf('i', mike.indexOf('i', +1) + 1) + 1) + 1) + 1)
						+ 1)
				+ " is the index number of the " + countOfI + "th i in String mike.");
		System.out.println();

		String nobody = "Nobody knows nothing about none of the notetakes in newsroom.";
		// lets find out the index number of the 5th n in String nobody. Here is how;

		int indexOfN = 0;
		int countOfN = 5;
		for (int i = 0; i < countOfN; i++) {
			indexOfN = nobody.indexOf('n', indexOfN) + 1;
		}
		System.err.println(indexOfN - 1 + " is the index of " + countOfN + "th n.");

		// Here is a different way to achieve the same thing:
		System.out.println(nobody.indexOf('n',
				nobody.indexOf('n', nobody.indexOf('n', nobody.indexOf('n', nobody.indexOf('n', +1) + 1) + 1) + 1) + 1)
				+ " is the index of " + countOfN + "th n.");
		System.out.println();
		System.out.println();

		String opel = "Baby shark doo doo doo, mommy shark doo doo doo.";
		// Let's find the index of the 6th o in the String above. Here is how:
		int indexOfo = 0;
		int countOfo = 6;
		for (int i = 0; i < countOfo; i++) {
			indexOfo = opel.indexOf('o', indexOfo) + 1;
		}
		System.out.println(indexOfo - 1 + " is the index number of " + countOfo + "th o.");
		// Here is a different way to achieve the same thing:
		System.out.println(opel.indexOf('o',
				opel.indexOf('o',
						opel.indexOf('o', opel.indexOf('o', opel.indexOf('o', opel.indexOf('o', +1) + 1) + 1) + 1) + 1)
						+ 1)
				+ " is the index number of " + countOfo + "th o.");

		System.out.println();

		String pick = "A pickpocket picked my pocket and stole my purse.";

		// let's find out the index number of the 4th p in String pick. Here is how;

		int countOfP = 5;
		int indexOfP = 0;
		for (int i = 0; i < countOfP; i++) {
			indexOfP = pick.indexOf('p', indexOfP) + 1;
			if (indexOfP - 1 == pick.indexOf('p', +1)) {
				System.err.println(indexOfP - 1 + " is the index of " + (countOfP - 4) + "st p");
			} else if (indexOfP - 1 == pick.indexOf('p', pick.indexOf('p', +1) + 1)) {
				System.err.println(indexOfP - 1 + " is the index of " + (countOfP - 3) + "nd p");
			} else if (indexOfP - 1 == pick.indexOf('p', pick.indexOf('p', pick.indexOf('p', +1) + 1) + 1)) {
				System.err.println(indexOfP - 1 + " is the index of " + (countOfP - 2) + "rd p");
			}
		}
		System.err.println(indexOfP - 1 + " is the index of " + countOfP + "th p.");

		// Here is another way to find the same thing differently;

		System.out.println(pick.indexOf('p', pick.indexOf('p', pick.indexOf('p', pick.indexOf('p', +1) + 1) + 1) + 1)
				+ " is the index of " + countOfP + "th p.");
		System.out.println();

		String queen = "The queen has quit her quarantine in a quick move to quickly respond to the recent earthquake.";
		// lets find out the index number of the 5th q in the String queen.

		int countOfQ = 5;
		int indexOfQ = 0;
		for (int i = 0; i < countOfQ; i++) {
			indexOfQ = queen.indexOf('q', indexOfQ) + 1;
		}
		System.out.println(indexOfQ - 1 + " is the index number of the " + countOfQ + "th q.");
		// Here is another way to achieve this differently.
		System.out.println(queen.indexOf('q',
				queen.indexOf('q', queen.indexOf('q', queen.indexOf('q', queen.indexOf('q', +1) + 1) + 1) + 1) + 1));

		System.out.println();

		String romeo = "The room needs renewal, part of which will include repainting the roof.";
		// Let's find out the index number of the 4th r in String romeo. Here is how:

		int countOfR = 4;
		int indexOfR = 0;
		for (int i = 0; i < countOfR; i++) {
			indexOfR = romeo.indexOf('r', indexOfR) + 1;
		}
		System.err.println(indexOfR - 1 + " is the index number for the " + countOfR + "th r.");

		// This could also be achieved differently. Here is how:

		System.out
				.println(romeo.indexOf('r', romeo.indexOf('r', romeo.indexOf('r', romeo.indexOf('r', +1) + 1) + 1) + 1)
						+ " is the index number for the " + countOfR + "th r.");

		System.out.println();

		String six = "It is six pm. I will leave in six seconds, so, will I see you soon or so.";
		// Let's find out the index number of the 6th s in the String above. Here is
		// how:

		int countOfS = 6;
		int indexOfS = 0;
		for (int i = 0; i < countOfS; i++) {
			indexOfS = six.indexOf('s', indexOfS) + 1;
		}

		System.out.println(indexOfS - 1 + " is the index of " + countOfS + "th s. ");
		// This could be also achieved differently. Here is how:

		System.err.println(six.indexOf('s',
				six.indexOf('s',
						six.indexOf('s', six.indexOf('s', six.indexOf('s', six.indexOf('s', +1) + 1) + 1) + 1) + 1) + 1)
				+ " is the index of " + countOfS + "th s.");

		System.out.println();

		String tom = "A male cat is referred to as tom and a to think it is tomo is totally true.";
		int countOfT = 7;
		int indexOfT = 0;
		for (int i = 0; i < countOfT; i++) {
			indexOfT = tom.indexOf('t', indexOfT) + 1;
		}
		System.err.println(indexOfT - 1 + " is the index of " + countOfT + "th t.");

		// It could also be done differently. Here is how:

		System.out.println(tom.indexOf('t',
				tom.indexOf('t', tom.indexOf('t',
						tom.indexOf('t', tom.indexOf('t', tom.indexOf('t', tom.indexOf('t', +1) + 1) + 1) + 1) + 1) + 1)
						+ 1)
				+ " it the index of " + countOfT + "th t.");
		System.out.println();

		String unit = "Do you know Keanu Reeves? Would or could you please tell him his wife is so beautifull.";
		// Let's find the 5th u in String unit. Here is how it is done.

		int countOfU = 5;
		int indexOfU = 0;
		for (int i = 0; i < countOfU; i++) {
			indexOfU = unit.indexOf('u', indexOfU) + 1;
		}
		System.out.println(indexOfU - 1 + " is the index of " + countOfU + "th u.");

		System.err.println(unit.indexOf('u',
				unit.indexOf('u', unit.indexOf('u', unit.indexOf('u', unit.indexOf('u', +1) + 1) + 1) + 1) + 1)
				+ " is the index of " + countOfU + "th u.");

		System.out.println();

		String vice = "He is a very vocal voice against the villegers involved in violance.";
		// Let's find the index number of the 6th v in String vice.
		int countOfV = 6;
		int indexOfV = 0;
		for (int i = 0; i < countOfV; i++) {
			indexOfV = vice.indexOf('v', indexOfV) + 1;
		}
		System.out.println(indexOfV - 1 + " is the index of " + countOfV + "th v.");

		// Let's do the same thing a little bit differently.
		System.err.println(vice.indexOf('v',
				vice.indexOf('v',
						vice.indexOf('v', vice.indexOf('v', vice.indexOf('v', vice.indexOf('v', +1) + 1) + 1) + 1) + 1)
						+ 1)
				+ " is the index of " + countOfV + "th v");

		System.out.println();

		String was = "I was with a woman when I see another woman walking down the driveway.";

		// Let's find the index number of the 4th w. Here is how:
		int countOfw = 4;
		int indexOfW = 0;
		for (int i = 0; i < countOfw; i++) {
			indexOfW = was.indexOf('w', indexOfW) + 1;
		}

		System.out.println(indexOfW - 1 + " is the index number of the " + countOfw + "th w.");

		// The same thing could be achieved a bit differetly. Here is how:

		System.out.println(was.indexOf('w', was.indexOf('w', was.indexOf('w', was.indexOf('w', +1) + 1) + 1) + 1)
				+ " is the index of the " + countOfw + "th w.");

	}
}
