package StringManipulation;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class DotSubStringMethod11 {

	public static void main(String[] args) {

		String alpha = "Peter Piper picked a peck of pickled peppers."
				+ "A peck of pickled peppers Peter Piper picked\r\n"
				+ "If Peter Piper picked a peck of pickled peppers\r\n"
				+ "Where’s the peck of pickled peppers Peter Piper picked?";
		System.out.println(alpha.substring(54));
		System.out.println(alpha.substring(54, 101));

		String bravo = "Betty Botter bought some butter\r\n" + "But she said the butter’s bitter\r\n"
				+ "If I put it in my batter, it will make my batter bitter\r\n"
				+ "But a bit of better butter will make my batter better\r\n"
				+ "So ‘twas better Betty Botter bought a bit of better butter";

		System.err.println(bravo.substring(100));
		System.out.println(bravo.substring(100, 200));

		String charlieString = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?\r\n"
				+ "He would chuck, he would, as much as he could, and chuck as much wood\r\n"
				+ "As a woodchuck would if a woodchuck could chuck wood";

		System.err.println(charlieString.substring(123));
		System.out.println(charlieString.substring(123, 167));

		String delta = "She sells seashells by the seashore";
		System.err.println(delta.substring(12));
		System.out.println(delta.substring(11, 22));

		String echo = "How can a clam cram in a clean cream can?";
		System.out.println(echo.substring(20));
		System.out.println(echo.substring(9, 20));

		String fox = "I scream, you scream, we all scream for ice cream.";
		System.out.println(fox.substring(24));
		System.out.println(fox.substring(22, 49));

		String golf = "I saw Susie sitting in a shoeshine shop.";
		System.out.println(golf.substring(15));
		System.out.println(golf.substring(23, 35));

		String hotel = "Susie works in a shoeshine shop. Where she shines she sits, and where she sits she shines.";

		System.out.println(hotel.substring(33));
		System.out.println(hotel.substring(33, 55));

		String india = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";
		System.out.println(india.substring(40));
		System.out.println(india.substring(18, 50));

		String jack = "Can you can a can as a canner can can a can?";
		System.out.println(jack.substring(23));
		System.out.println(jack.substring(23, 40));

		String kilo = "I have got a date at a quarter to eight; I’ll see you at the gate, so don’t be late.";
		System.out.println(kilo.substring(34));
		System.out.println(kilo.substring(34, 45));

		String lima = "You know New York, you need New York, you know you need unique New York.";
		System.out.println(lima.substring(50));
		System.out.println(lima.substring(50, 71));

		String mike = "I saw a kitten eating chicken in the kitchen.";
		System.out.println(mike.substring(34));
		System.out.println(mike.substring(23, 34));

		String november = "If a dog chews shoes, whose shoes does he choose?";
		System.out.println(november.substring(20));
		System.out.println(november.substring(20, 35));

		String opel = "I thought I thought of thinking of thanking you.";
		System.out.println(opel.substring(12));
		System.out.println(opel.substring(12, 40));

		String quit = "I wish to wash my Irish wristwatch.";
		System.out.println(quit.substring(9));
		System.out.println(quit.substring(10, 35));

		String rob = "Near an ear, a nearer ear, a nearly eerie ear.";
		System.out.println(rob.substring(23));
		System.out.println(rob.substring(25, 38));

		String sam = "A big black bear sat on a big black rug.";
		System.out.println(sam.substring(34));
		System.out.println(sam.substring(12, 34));

		String tom = "Tom threw Tim three thumbtacks.";
		System.out.println(tom.substring(10));
		System.out.println(tom.substring(11, 21));

		String unit = "He threw three free throws.";
		System.out.println(unit.substring(8));
		System.out.println(unit.substring(7, 18));

		String vice = "Nine nice night nurses nursing nicely.";
		System.out.println(vice.substring(21));
		System.out.println(vice.substring(23, 35));

		String wine = "So, this is the sushi chef.";
		System.out.println(wine.substring(12));
		System.out.println(wine.substring(12, 21));

		String xray = "Wayne went to wales to watch walruses.";
		System.out.println(xray.substring(12));
		System.out.println(xray.substring(10, 31));

		String yankee = "Near an ear, a nearer ear, a nearly eerie ear.";
		System.out.println(yankee.substring(19));
		System.out.println(yankee.substring(19, 31));

		String zebra = "A skunk sat on a stump and thunk the stump stunk, but the stump thunk the skunk stunk.";
		System.out.println(zebra.substring(34));
		System.out.println(zebra.substring(34, 56));

	}

}
