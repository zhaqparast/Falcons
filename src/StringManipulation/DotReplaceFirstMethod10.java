package StringManipulation;

public class DotReplaceFirstMethod10 {

	public static void main(String[] args) {

		String alpha = "She sells some se shell by the sea shore";
		System.out.println(alpha.replaceFirst("se", "xe"));

		String bravo = "What the fuck is going on there?";
		System.out.println(bravo.replaceFirst("fuc", "***"));

		String charlie = "I Like to move it move it, I like to move it, move it.";
		System.out.println(charlie.replaceFirst("move", "shove"));

		String delta = "Get the hell outta here!";
		System.out.println(delta.replaceFirst("Get", "jet"));

		String echo = "Peter Piper picked a peck of pickled peppers\r\n"
				+ "A peck of pickled peppers Peter Piper picked\r\n"
				+ "If Peter Piper picked a peck of pickled peppers\r\n"
				+ "Where’s the peck of pickled peppers Peter Piper picked?";
		System.out.println(echo.replaceFirst("Peter", "Guitar"));

		String fox = "Betty Botter bought some butter\r\n" + "But she said the butter’s bitter\r\n"
				+ "If I put it in my batter, it will make my batter bitter\r\n"
				+ "But a bit of better butter will make my batter better\r\n"
				+ "So ‘twas better Betty Botter bought a bit of better butter";
		System.out.println(fox.replaceFirst("batter", "chatter"));

		String golf = fox;
		System.out.println(golf.replaceFirst("better", "worse"));

		String hotel = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?\r\n"
				+ "He would chuck, he would, as much as he could, and chuck as much wood\r\n"
				+ "As a woodchuck would if a woodchuck could chuck wood";

		System.out.println(hotel.replaceFirst("chuck", "***k"));
		System.out.println(hotel.replaceAll("chuck", "f**k"));

		String india = "How can a clam cram in a clean cream can?\r\n";
		System.out.println(india.replaceAll("ca", "da"));
		System.out.println(india.replaceFirst("am", "om"));

		String jack = "I scream, you scream, we all scream for ice cream";
		System.out.println(jack.replaceFirst("cream", "clean"));
		System.out.println(jack.replaceAll("cream", "clean"));

		String kilo = "Susie works in a shoeshine shop. Where she shines she sits, and where she sits she shines";
		System.out.println(kilo.replaceFirst("sh", "hs"));
		System.out.println(kilo.replaceAll("shoe", "galoosh"));
		System.out.println(kilo.replaceAll("sh", "ch"));

		String lima = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";
		System.err.println(lima.replaceFirst("uzzy", "ury"));
		System.out.println(lima.replaceAll("uzzy", "unny"));

		String man = "Can you can a can as a canner can can a can?";
		System.out.println();
		System.err.println(man.replaceFirst("an", "up"));
		System.out.println(man.replaceAll("an", "up"));

		String noun = "Nine nice night nurses nursing nicely";
		System.err.println(noun.replaceFirst("nice", "mice"));
		System.out.println(noun.replaceAll("nice", "mice"));

		String open = "If a dog chews shoes, whose shoes does he choose?";
		System.err.println(open.replaceFirst("o", "O"));
		System.out.println(open.replaceAll("o", "O"));

		String queen = "Which wristwatches are Swiss wristwatches?";
		System.err.println(queen.replaceFirst("w", "p"));
		System.out.println(queen.replaceAll("wr", "cr"));

		String robert = "Near an ear, a nearer ear, a nearly eerie ear";
		System.err.println(robert.replaceFirst("r", "t"));
		System.out.println(robert.replaceAll("r", "t"));

		String star = "She sells seashells by the seashore.";
		System.err.println(star.replaceFirst("s", "p"));
		System.out.println(star.replaceAll("s", "p"));

		String tom = "Tom threw Tim three thumbtacks.";
		System.err.println(tom.replaceFirst("t", "zh"));
		System.out.println(tom.replaceAll("t", "zh"));

		String uniform = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";
		System.err.println(uniform.replaceFirst("uzz", "unn"));
		System.out.println(uniform.replaceAll("uzz", "unn"));

		String vice = "volkswagen and volvo are two European vehicle manufucturers";
		System.err.println(vice.replaceFirst("v", "w"));
		System.out.println(vice.replaceAll("v", "w"));

		String war = "Which wristwatches are Swiss wristwatches?";
		System.err.println(war.replaceFirst("w", "p"));
		System.out.println(war.replaceAll("w", "p"));

		String xRay = "We need six fixed size boxes for each sex to mix the wax.";
		System.err.println(xRay.replaceFirst("x", "ks"));
		System.out.println(xRay.replaceAll("x", "ks"));

		String yankee = "Yagak Yari Daruma Sheykh Aly Ya, Sar o Gardan ba manady pary ya.";
		System.err.println(yankee.replaceFirst("y", "ee"));
		System.out.println(yankee.replaceAll("y", "ee"));

		String zebra = "Hamzaban hamzaban maraw ke delam, baaz be to bahana megerad";
		System.out.println(zebra.replaceFirst("z", "dz"));
		System.out.println(zebra.replaceAll("z", "g"));

	}

}
