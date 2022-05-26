package JavaBasicsPackage;

public class Lesson6ConditionalOperators {

	public static void main(String[] args) {

		// The syntax of conditional operators is as follows:
		// datatype + variable + assignment operator + condition + question mark + true
		// block + colon + false block + semicolon

		// String myName = 8 > 9? "Abdul Aziz" : "Pardis";

		String myName = 8 > 9 ? "Abdul Aziz" : "Pardis";
		System.out.println(myName);

		int aName = 110 < 120 ? 12 : 13;
		System.out.println(aName + "\n");

		double bName = 780 >= 780.00 ? 12.45 : 13.50;
		System.out.println(bName + "\n");

		String cName = 12 * 30 == 370 ? "True" : "False";
		System.out.println(cName + "\n");

		double dName = 8679.9 / 4 == 2169.975 ? 876 : 7987;
		System.out.println(dName + "\n");

		int eName = 6986876 * 76567 == 987698698 ? 8768 : 2342;
		System.out.println(eName + "\n");

		String fName = 897986 > 686 / 12 ? "Jamboray" : "Agha Babah";
		System.out.println(fName + "\n");

		double gName = ('a') + 23 == 120 ? 8698.687 : 463655.99;
		System.out.println(gName + "\n");

		int hName = ('B') - 12 == 56 ? 98798 : 64;
		System.out.println(hName + "\n");

		String iName = ('%') - 1 == 77 ? "True" : "False\n";
		System.out.println(iName);

		double jName = 8698 + ('&') == 9000.9 ? 9876 : 1234;
		System.out.println(jName + "\n");

		int kName = ('@') % ('<') == 4 ? 4 : 6;
		System.out.println(kName + "\n");

		String lName = ('}') % ('@') == 61 ? "61" : "57";
		System.out.println(lName + "\n");

		double mName = ('©') - ('%') == 132 ? 132 : 240;
		System.out.println(mName + "\n");

		int nName = 35 / 5 + 13 == 20 ? 20 : 21;
		System.out.println(nName + "\n");

		String oName = ('@') * ('&') == 2432 ? "2432" : "2433";
		System.out.println(oName + "\n");

		double pName = 34 == 33 ? 98766 : 87989;
		System.out.println(pName + "\n");

		String qName = "Fuck ISI";
		System.out.println(qName.isEmpty() ? "The name is not valid" : qName + "\n");

		String rName = "";
		System.out.println(rName.isEmpty() ? "The name is not valid\n" : rName + "\n");

		int sName = 886 + 867876 == 123456 ? 123456 : 654321;
		System.out.println(sName + "\n");

		double tName = 8686.8768 / 7652 == 85 ? 85 : 100;
		System.out.println(tName + "\n");

		String uName = "Ha yo all doin??????";
		System.out.println(uName.isBlank() ? "The string is blank.\n" : uName + "\n");

		int vName = 98797 % 797 == 786 ? 97987 : 9797;
		System.out.println(vName + "\n");

		double wName = 7987.786756 / 5643 == 86.76 ? 876.89 : 456.7;
		System.out.println(wName + "\n");

		String xName = ('$') % ('?') == 12 ? "12" : "13";
		System.out.println(xName + "\n");

		int yName = 86876 + 86868 == 1616161 ? 1616161 : 171717;
		System.out.println(yName + "\n");

		double zName = 987987 >= 9879798 ? 979897.0009 : 87876.889;
		System.out.println(zName + "\n");

		String AName = "Spin Ghar";
		System.out.println(AName.isBlank() ? "The String is blank.\n" : "Spin Ghar\n");

		int BName = 688 - 88 == 600 ? 600 : null;
		System.out.println(BName + "\n ");

		double CName = 88.987 * 123.321 == 34566.987 ? 34566.987 : 987979.7868;
		System.out.println(CName + "\n");

		String DName = 9889 % 876 == 56 ? "56" : "65";
		System.out.println(DName + "\n");

		int EName = 86878 + 57567 == 169878 ? 169876 : 868237;
		System.out.println(EName + "\n");

		double FName = 876876.24243 > 76575.099877 ? 876886 : 98987;
		System.out.println(FName + "\n");

		String GName = 6868998 - 87687 == 7287 ? "7287" : "8787";
		System.out.println(GName + "\n");

		int HName = 887 / 65 == 10 ? 10 : 11;
		System.out.println(HName + "\n");

		double IName = 7868.7657 * 5456 == 87868.878 ? 888.98878 : 87876.878;
		System.out.println(IName + "\n");

		String JName = "Wasssup?";
		System.out.println(JName.isEmpty() ? "The String is empty" : JName + "\n");

		int KName = 12345 + 54321 == 66666 ? 66666 : 55555;
		System.out.println(KName + "\n");

		double LName = 654321.123456 - 123456.654321 == 122334.788991 ? 122334.788991 : 887.98686987;
		System.out.println(LName + "\n");

		String MName = "Get the hell outa here!";
		System.out.println(MName.charAt(4) == 't' ? 't' + "\n" : 'T' + "\n");

		int NName = 9798 < 868 ? 687 : 789;
		System.out.println(NName + "\n");

		double OName = 66989.6798789 >= 98696 ? 9698.79 : 878686.98;
		System.out.println(OName + "\n");

		String PName = "I have no clue what you are talking about!";
		System.out.println(PName.charAt(10) == 'c' ? 'c' + "\n" : PName.charAt(11));

		int QName = 797 % 7 == 0 ? null : 1;
		System.out.println(QName + "\n");

		double RName = 87689.9 / 777 == 19898.1 ? 868.9798 : 9797.8798;
		System.out.println(RName + "\n");

		String SName = "Dover Air Force Base";
		System.out.println(SName.contains("Air") ? "Air\n" : "Air Force");

		int TName = 979 - 11 == 968 ? 968 : 969;
		System.out.println(TName + "\n");

		double UName = 9734 + 16 == 9750 ? 9750 : 9760;
		System.out.println(UName + "\n");

		String VName = "Going back to war";
		System.out.println(VName.contains("?") ? "?\n" : "It does not contain \"?\".");

		int WName = 9879 > 9890 ? 9879 : 9890;
		System.out.println(WName + "\n");

		double XName = 989.657 % 989 == 0.989 ? 0.989 : 10000;
		System.out.println(XName + "\n");

		String YName = "The world is changing, isn`t it?";
		System.out.println(YName.contains("world") ? "world\n" : "The string does not contain the word \"wolrd\".");

		int ZName = 10 / 5 == 20 ? 2 : 20;
		System.out.println(ZName + "\n");

		double a = 98787.78 * 876 == 1086877 ? 6888979 : 8577898;
		System.out.println(a + "\n");

		String b = "I belive I can fly.";
		System.out.println(b.charAt(9) == 'I' ? "The character at index 9 of String \"b\" is \"I\".\n"
				: "There is no" + " such character as \"I\" in String \"b\".\n");
		int c = 89876 / 6 == 231 ? 231 : 123;
		System.out.println(c + "\n");

		double d = 9686.7 * 5.0 == 786 ? 786 : 876;
		System.out.println(d + "\n");

		String e = "Say hello to my little friend!";
		System.out.println(
				e.contentEquals("Say hello to my little friend!") ? e + "\n" : "Say hello to my big friend!.\n");

		int f = 575 - 123 == 452 ? 452 : 542;
		System.out.println(f + "\n");

		double g = 687686 > 676679 ? 687686 : 676679;
		System.out.println(g + "\n");

		String h = "I will practice as much as I can.\n";
		String h2 = "i WiLL PracTiCe as muCH AS i Can.\n";
		System.out.println(h.equalsIgnoreCase(h2) ? "True\n" : "False");

		int i = 8686 * 76765 == 886876 ? 876868 : 8686876;
		System.out.println(i + "\n");

		double j = 8986.876 * 19 == 170750.644 ? 170750.644 : 87966.987987;
		System.out.println(j + "\n");

		String k1 = "I like to move it move it!\n";
		String k2 = "i LIKE To MoVe It MoVe It!\n";
		System.out.println(k1.equalsIgnoreCase(k2) ? "True\n" : "False\n");

		int l = 5887 % 67 == 58 ? 58 : 60;
		System.out.println(l + "\n");

		double m = 68787.98789 / 686.98 == 100.13099055285453 ? 100.13099055285453 : 8768.987;
		System.out.println(m + "\n");

		String n1 = "Ali Baba and the 40 theives\n";
		String n2 = "I have no idea what you are talking about.\n";
		System.out.println(n1.equalsIgnoreCase(n2) ? n1 : n2);

		int o = 9868 + 768 == 10636 ? 10636 : 9799879;
		System.out.println(o + "\n");

		double p = 86987.0 / 5.0 == 17397.4 ? 17397.4 : 17397.8;
		System.out.println(p + "\n");

		String q1 = "Karzai was worse than Ghani!\n";
		String q2 = "Khalilzad is a devil.\n";

		int r = 76876 / 982 == 78 ? 78 : 80;
		System.out.println(r + "\n");

		double s = 97987.8798 > 9709 ? 98979.987 : 67868.889;
		System.out.println(s + "\n");

		String t1 = "I am gonna shove this up your ass!\n";
		String t2 = "Stop! Or I am gonna shove this up your ass!\n";
		System.out.println(t1.length() == 35 ? 35 + "\n" : null);
		System.out.println(t2.length() == 43 ? 43 : 44 + "\n");

		int v = 989 + 11 == 1001 ? 1001 : 1000;
		System.out.println(v + "\n");

		double w = 86898.667 / 9698.765 == 56 ? 56.7 : 65.9;
		System.out.println(w + "\n");

		String x = "Always bet on black!";
		System.out.println(x.length() == 21 ? 20 : 21 + "\n");

		int y = 667 != 789 ? 767 : 57;
		System.out.println(y + "\n");

		double z = 7557 % 878 == 533 ? 533 : 500;
		System.out.println(z + "\n");

		String chuckNorris = "Chuck Norris has been cast with Bruce Lee in a movie";
		String vanDamme = "Jean Claude Van Damme is known as muscles from Brussels";
		System.out.println(chuckNorris.length() == vanDamme.length() ? "Correct:" : "Incorrect");

		int alpha = 96678;
		int bravo = 79899;
		System.out.println(alpha >= bravo ? true : false);
	}

}
