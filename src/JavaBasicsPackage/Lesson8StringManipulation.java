package JavaBasicsPackage;

import javax.swing.Spring;

public class Lesson8StringManipulation {

	public static void main(String[] args) {

		String firstName = "Jack Ma is a Chinese business tycoon who owns Ali Baba, a wholesale company.\n";

		System.out.println(firstName.length());
		System.out.print(firstName.charAt(0));
		System.out.print(firstName.charAt(1));
		System.out.print(firstName.charAt(2));
		System.out.print(firstName.charAt(3));
		System.out.print(firstName.charAt(4));
		System.out.print(firstName.charAt(5));
		System.out.println(firstName.charAt(6));

		for (int index = 0; index < 76; index++) {
			System.out.print(firstName.charAt(index));
			System.out.println();
		}

		int countOfLowerCasee = 0;

		System.out.print(firstName);
		for (int index = 0; index < firstName.length(); index++) {
			if (firstName.charAt(index) == 'e') {
				System.out.print(firstName.charAt(index));
				countOfLowerCasee++;
			} else {
				System.out.print('*');
			}
		}

		System.out.println("\nThe count of lower case 'e' in this String is: " + countOfLowerCasee + "\n");

		// create a String "this is a test"
		// loop to the size of the String and on every print one char
		// and then go to the next line
		// optional - do the same thing in reverse

		String test = "this is a test";
		for (int i = 0; i < test.length(); i++) {
			System.out.print(test.charAt(i) + " ");
		}
		System.out.println();

		for (int copy = test.length() - 1; copy >= 0; copy--) {
			System.out.print(test.charAt(copy) + " ");
			System.out.print(" ");

		}
		// Write a String and find out how
		String aatish = "Kaash tum mujhse ek baar kaho, yumko mujhse pyaar hogaya";
		System.out.println();
		System.out.print(aatish);
		System.out.println();
		for (int i = 0; i < aatish.length(); i++) {
			System.out.print(i + " ");
		}

		String baarish = "Jab main baadal banjao, tum bhi baarish banjana"
				+ "Jo kam padd jaye sanse, tum mera dil banjana";
		System.out.println();
		System.out.println(baarish);
		System.out.println();
		for (int index = 0; index < baarish.length(); index++) {
			System.out.print(index + " ");
		}

		String charlie = "Nothing is permanent in this wicked world - not even our troubles";
		System.out.println("\n");
		System.out.println(charlie + "\n");
		for (int i = 0; i < charlie.length(); i++) {
			System.out.print(i + " ");
		}

		String delta = "\"A man's true character comes out when he's drunk.\"";
		System.out.println("\n");
		System.out.print(delta);
		System.out.println("\n");
		for (int i = 0; i <= delta.length(); i++) {
			System.out.print(i + " ");
		}

		String echo = "Sorry for the echo! I will sit back from the microphone and close my legs.";
		System.out.println("\n");
		System.out.println(echo);
		System.out.println();
		for (int indexOfEcho = 0; indexOfEcho <= echo.length(); indexOfEcho++) {
			System.out.print(indexOfEcho + " ");
		}

		String foxtrot = "The word \"Foxtrot\" means a code word representing the letter F, used in radio communication.\n";
		System.out.println("\n");
		System.out.println(foxtrot);
		for (int index = 0; index <= foxtrot.length(); index++) {
			System.out.print(index + " ");
		}

		String gulf = "The Gulf of Tonkin incident also known as the USS Maddox incident,"
				+ " was an international\nconfrontation that led to the United States engaging more directly in the Vietnam War.";
		System.out.println("\n");
		System.out.print(gulf + "\n");
		for (int i = 0; i <= gulf.length(); i++) {
			System.out.print(i + " ");
		}

		String hotel = "I would like to stay at Hyatt Regency Hotel when I go to Dubai.\n";
		System.out.println("\n");
		System.out.print(hotel);
		for (int index = 0; index <= hotel.length(); index++) {
			System.out.print(index + " ");
		}

		String india = "India is a country in South Asia. It is the second most populated country in the world after Chine"
				+ " and the largest democracy in the world.\n";
		System.out.println("\n");
		System.out.print(india + "\n");
		for (int index = 0; index <= india.length(); index++) {
			System.out.print(index + " ");
		}

		String juliet = "Juliet was a fictional character created by William Shakespeare.\n";
		System.out.println("\n");
		System.out.print(juliet + "\n");
		for (int index = 0; index <= juliet.length(); index++) {
			System.out.print(index + " ");
		}

		String kilo = "This chicken weighs 13 kilograms.";
		System.out.print("\n");
		System.out.print(kilo + "\n");
		for (int i = 0; i <= kilo.length(); i++) {
			System.out.print(i + " ");
		}

		String lima = "Lima is the capital city of Peru";
		System.out.println("\n");
		System.out.print(lima + "\n");
		for (int thIndex = 0; thIndex <= lima.length(); thIndex++) {
			System.out.print(thIndex + " ");
		}

		String mike = "What the fuck is going on?";
		System.out.println("\n");
		System.out.print(mike + "\n");
		for (int thIndexOfMike = 0; thIndexOfMike <= mike.length(); thIndexOfMike++) {
			System.out.print(thIndexOfMike + " ");
		}

		String november = "November is the penultimate month of the Gregorian calendar";
		System.out.println("\n");
		System.out.println(november + "\n");
		for (int i = 0; i <= november.length(); i++) {
			System.out.print(i + " ");
		}

		String oscars = "Oscars is an anuual event where filmmakers, stars, directors and all\n"
				+ "those involved in the cinema industry are awarded for their hard work.";
		System.out.println("\n");
		System.out.print(oscars + "\n");
		for (int thIndexOfOscars = 0; thIndexOfOscars <= oscars.length(); thIndexOfOscars++) {
			System.out.print(thIndexOfOscars + " ");
		}

		String papa = "We possess only the happiness we are able to understand.";
		System.out.println("\n");
		System.out.print(papa + "\n");
		for (int papaIndex = 0; papaIndex <= papa.length(); papaIndex++) {
			System.out.print(papaIndex + " ");
		}

		String quebec = "Quebec is a French speaking province in Canada.";
		System.out.println("\n");
		System.out.print(quebec + "\n");
		for (int thIndexOfQuebec = 0; thIndexOfQuebec <= quebec.length(); thIndexOfQuebec++) {
			System.out.print(thIndexOfQuebec + " ");
		}

		String romeo = "Romeo was yet another fictional character created by William Shakespears.";
		System.out.println("\n");
		System.out.print(romeo + "\n");
		for (int index = 0; index <= romeo.length(); index++) {
			System.out.print(index + " ");
		}

		String sierra = "Sierra is a country in the state of California in the United States of America.";
		System.out.println("\n");
		System.out.print(sierra + "\n");
		for (int index = 0; index <= sierra.length(); index++) {
			System.out.print(index + " ");
		}

		String tango = "Tango is a code word representing the letter T, used in voice communication by radio";
		System.out.println("\n");
		System.out.print(tango + "\n");
		for (int i = 0; i <= tango.length(); i++) {
			System.out.print(i + " ");
		}

		String uniform = "At every crossroads on the path that leads to the future,\ntradition has placed 10,000 men to guard the past.";
		System.out.println("\n");
		System.out.print(uniform + "\n");
		for (int index = 0; index <= uniform.length(); index++) {
			System.out.print(index + " ");
		}

		String victor = "This thing ======> is called a victor";
		System.out.println("\n");
		System.out.print(victor + "\n");
		for (int i = 0; i <= victor.length(); i++) {
			System.out.print(i + " ");
		}

		String whiskey = "Chivas Regal is a brand of Scotch whiskey.";
		System.out.println("\n");
		System.out.print(whiskey + "\n");
		for (int index = 0; index <= whiskey.length(); index++) {
			System.out.print(index + " ");
		}

		String xray = "Sometimes people don’t want to hear the truth\nbecause they don’t want their illusions destroyed.";
		System.out.println("\n");
		System.out.print(xray + "\n");
		for (int index = 0; index <= xray.length(); index++) {
			System.out.print(index + " ");
		}

		String yankee = "New York Yankees is a baseball team out of New York City, New York.";
		System.out.println("\n");
		System.out.print(yankee + "\n");
		for (int index = 0; index <= yankee.length(); index++) {
			System.out.print(index + " ");
		}

		String zulu = "I’m not upset that you lied to me, I’m upset that from now on I can’t believe you.";
		System.out.println("\n");
		System.out.print("This is one of the quotes of German philosoper Friedrich Nietzsche: " + zulu + "\n");
		for (int i = 0; i <= zulu.length(); i++) {
			System.out.print(i + " ");
		}

		String alpha1 = "I know I can learn coding if I try to practice enough.";
		System.out.println("\n");
		System.out.print(alpha1 + "\n");
		int countOfLowerCasec = 0;

		for (int index = 0; index < alpha1.length(); index++) {
			if (alpha1.charAt(index) == 'c') {
				System.out.print(alpha1.charAt(index));
				countOfLowerCasec++;
			} else {
				System.out.print('%');
			}
		}

		String bravo = "This is the second time I am telling you not to test my patience";
		int countOft = 0;
		System.out.println("\n");
		System.out.print(bravo + "\n");
		for (int i = 0; i < bravo.length(); i++) {
			if (bravo.charAt(i) == 't') {
				System.out.print(bravo.charAt(i));
				countOft++;
			} else {
				System.out.print('@');
			}
		}

		String charlie2 = "I have no idea what you are talking about!";
		int countOfa = 0;
		System.out.println("\n");
		System.out.print(charlie2 + "\n");
		for (int index = 0; index < charlie2.length(); index++) {
			if (charlie2.charAt(index) == 'a') {
				System.out.print(charlie2.charAt(index));
				countOfa++;
			} else {
				System.out.print("?");
			}
		}

		String delta2 = "Delta Force is a top U.S Military unit that is mostly involved in black ops.";
		int countLowerCaseI = 0;
		System.out.println("\n");
		System.out.print(delta2 + "\n");
		for (int i = 0; i < delta2.length(); i++) {
			if (delta2.charAt(i) == 'i') {
				System.out.print(delta2.charAt(i));
			} else {
				System.out.print('<');
			}
		}

		String echo2 = "Toyota Prius is an echo friendly hybrid car. It could save you a whole lots of money on gas.";
		int countOfLowerCaseo = 0;
		System.out.println("\n");
		System.out.print(echo2 + "\n");
		for (int index = 0; index < echo2.length(); index++) {
			if (echo2.charAt(index) == 'o') {
				System.out.print(echo2.charAt(index));
			} else {
				System.out.print('#');
			}
		}

		String foxtrot2 = "Fox is a very cunning animal.";
		int countOfLowerCaseLetters = 0;
		System.out.println("\n");
		System.out.print(foxtrot2 + "\n");
		for (int i = 0; i < foxtrot2.length(); i++) {
			if (foxtrot2.charAt(i) == 'a') {
				System.out.print(foxtrot2.charAt(i));
			} else {
				System.out.print('7');
			}
		}

		String golf = "Golf is a game mostly played by the wealthy.";
		int countOfLowerCaseY = 0;
		System.out.println("\n");
		System.out.print(golf + "\n");
		for (int index = 0; index < golf.length(); index++) {
			if (golf.charAt(index) == 'y') {
				System.out.print(golf.charAt(index));
			} else {
				System.out.print('^');
			}
		}

		String honda = "Honda has a wide range of sedan modesls to choose from, such as Accord, Civic, Insight and Clarity";
		int countOfLowerAndUpperCaseH = 0;
		System.out.println("\n");
		System.out.print(honda + "\n");
		for (int index = 0; index < honda.length(); index++) {
			if (honda.charAt(index) == 'H' || honda.charAt(index) == 'h') {
				System.out.print(honda.charAt(index));
				countOfLowerAndUpperCaseH++;
			} else {
				System.out.print('-');
			}
		}

		String impala = "The impala is a medium-sized antelope found in eastern and southern Africa.";
		int countOfLowerAndUpperCaseA = 0;
		System.out.println("\n");
		System.out.print(impala + "\n");
		for (int i = 0; i < impala.length(); i++) {
			if (impala.charAt(i) == 'A' || impala.charAt(i) == 'a') {
				System.out.print(impala.charAt(i));
			} else {
				System.out.print('/');
			}
		}

		String jack = "Captain Jack Sparrow is a fictional character from the series of \"Pirates of Caribbean\" movies.";
		int countOfLowerCaseI = 0;
		System.out.println("\n");
		System.out.print(jack + "\n");
		for (int index = 0; index < jack.length(); index++) {
			if (jack.charAt(index) == 'c' || jack.charAt(index) == 'i' || jack.charAt(index) == 'C') {
				System.out.print(jack.charAt(index));
			} else {
				System.out.print('-');
			}
		}

		String kremlin = "Kremlin is the presidential palace of the Russian Federation";
		int countOfLowerCaseL = 0;
		System.out.println("\n");
		System.out.print(kremlin + "\n");
		for (int index = 0; index < kremlin.length(); index++) {
			if (kremlin.charAt(index) == 'l') {
				System.out.print(kremlin.charAt(index));
			} else {
				System.out.print("^");
			}
		}

		String louisiana = "Louisiana is a southeastern U.S. state on the Gulf of Mexico.";
		int countOfLowerCaseAAndE = 0;
		System.out.println("\n");
		System.out.print(louisiana + "\n");
		for (int i = 0; i < louisiana.length(); i++) {
			if (louisiana.charAt(i) == 'a' || louisiana.charAt(i) == 'e') {
				System.out.print(louisiana.charAt(i));
			} else {
				System.out.print('.');
			}
		}

		String motor = "Toyota produces a wide range of vehicles.\nSuch as cars, SUVs, vans, sedans, hatchbacks, estation wagons and trucks";
		int countOfLowerCaseSU = 0;
		System.out.println("\n");
		System.out.print(motor + "\n");
		for (int index = 0; index < motor.length(); index++) {
			if (motor.charAt(index) == 's' || motor.charAt(index) == 'u') {
				System.out.print(motor.charAt(index));
				countOfLowerCaseAAndE++;
			} else {
				System.out.print('_');
			}
		}

		String north = "Nine nice night nurses nursing nicely";
		int countOfLowerCaseN = 0;
		System.out.println("\n");
		System.out.print(north + "\n");
		for (int n = 0; n < north.length(); n++) {
			if (north.charAt(n) == 'n' || north.charAt(n) == 'i') {
				System.out.print(north.charAt(n));
				countOfLowerCaseN++;
			} else {
				System.out.print('.');
			}
		}

		String over = "Ed had re-edited the previously edited eidtion of the audit";
		int lowerCaseDAndT = 0;
		System.out.println("\n");
		System.out.print(over + "\n");
		for (int index = 0; index < over.length(); index++) {
			if (over.charAt(index) == 'd' || over.charAt(index) == 't') {
				System.out.print(over.charAt(index));
				lowerCaseDAndT++;
			} else {
				System.out.print('.');
			}
		}

		String power = "Which wristwatches are Swiss wristwatches?";
		int countOfLowerCaseWAndS = 0;
		System.out.println("\n");
		System.out.print(power + "\n");
		for (int p = 0; p < power.length(); p++) {
			if (power.charAt(p) == 'W' || power.charAt(p) == 'w' || power.charAt(p) == 's') {
				System.out.print(power.charAt(p));
			} else {
				System.out.print('=');
			}
		}

		String queen = "The queen invited Anthony Quinn to her Quebec quarter a quarter past four.";
		int countOfLowerAndUpperCaseQ = 0;
		System.out.println("\n");
		System.out.print(queen + "\n");
		for (int q = 0; q < queen.length(); q++) {
			if (queen.charAt(q) == 'Q' || queen.charAt(q) == 'q') {
				System.out.print(queen.charAt(q));
				countOfLowerAndUpperCaseQ++;
			} else {
				System.out.print('^');
			}
		}

		String robert = "Lesser leather never weathered wetter weather better.";
		int countOfLowerCaseE = 0;
		System.out.println("\n");
		System.out.print(robert + "\n");
		for (int r = 0; r < robert.length(); r++) {
			if (robert.charAt(r) == 'r' || robert.charAt(r) == 'e') {
				System.out.print(robert.charAt(r));
				countOfLowerCaseE++;
			} else {
				System.out.print('.');
			}
		}

		String SpinGhar = "I slit the sheet, the sheet I slit, and on the slitted sheet I sit.";
		int countOfLowerCaseSAndL = 0;
		System.out.println("\n");
		System.out.print(SpinGhar + "\n");
		for (int sl = 0; sl < SpinGhar.length(); sl++) {
			if (SpinGhar.charAt(sl) == 's' || SpinGhar.charAt(sl) == 'l') {
				System.out.print(SpinGhar.charAt(sl));
				countOfLowerCaseSAndL++;
			} else {
				System.out.print('_');
			}
		}

		String tombraider = "Two tried and true tridents";
		int countOfLowerCaseT = 0;
		System.out.println("\n");
		System.out.print(tombraider + "\n");
		for (int t = 0; t < tombraider.length(); t++) {
			if (tombraider.charAt(t) == 't' || tombraider.charAt(t) == 'T') {
				System.out.print(tombraider.charAt(t));
				countOfLowerCaseT++;
			} else {
				System.out.print('.');
			}
		}

		String uboat = "We surely shall see the sun shine soon.";
		int countOfLowerCaseS = 0;
		System.out.println("\n");
		System.out.print(uboat + "\n");
		for (int u = 0; u < uboat.length(); u++) {
			if (uboat.charAt(u) == 's') {
				System.out.print(uboat.charAt(u));
				countOfLowerCaseS++;
			} else {
				System.out.print('*');
			}
		}

		String vlad = "Thin sticks, thick bricks";
		int countOfTAndI = 0;
		System.out.println("\n");
		System.out.print(vlad + "\n");
		for (int v = 0; v < vlad.length(); v++) {
			if (vlad.charAt(v) == 'i' || vlad.charAt(v) == 'T' || vlad.charAt(v) == 't') {
				System.out.print(vlad.charAt(v));
				countOfTAndI++;
			} else {
				System.out.print('&');
			}
		}

		String what = "Of all the vids I’ve ever viewed, I’ve never viewed a vid as valued as Alex’s engVid vid.";
		int countOfLowerCaseV = 0;
		System.out.println("\n");
		System.out.print(what + "\n");
		for (int w = 0; w < what.length(); w++) {
			if (what.charAt(w) == 'v' || what.charAt(w) == 'V') {
				System.out.print(what.charAt(w));
			} else {
				System.out.print('0');
			}
		}

		String xbox = "as87yfqfbq 3fnJHBzj bvo34yqgn zxj guyqegf,nfl kbanasd bva7tqf u4gajhsbc8 o7q3 t4ejabcjy7t6";
		int countOfLowerCaseZ = 0;
		System.out.println("\n");
		System.out.print(xbox + "\n");
		for (int x = 0; x < xbox.length(); x++) {
			if (xbox.charAt(x) == 'z' || xbox.charAt(x) == ' ') {
				System.out.print(xbox.charAt(x));
				countOfLowerCaseZ++;
			} else {
				System.out.print('%');
			}
		}

		String yakaulang = "Yakawlang is a district in Bamyan province in central Afghanistan";
		int countOfLowerCasei = 0;
		System.out.println("\n");
		System.out.print(yakaulang + "\n");
		for (int y = 0; y < yakaulang.length(); y++) {
			if (yakaulang.charAt(y) == 'i' || yakaulang.charAt(y) == 'y' || yakaulang.charAt(y) == 'Y') {
				System.out.print(yakaulang.charAt(y));
				countOfLowerCasei++;
			} else {
				System.out.print('*');
			}
		}

		String zebra = "I have got a date at a quarter to eight; I’ll see you at the gate, so don’t be late.";
		int countOfLowerCasel = 0;
		System.out.println("\n");
		System.out.print(zebra + "\n");
		for (int z = 0; z < zebra.length(); z++) {
			if (zebra.charAt(z) == 'I' || zebra.charAt(z) == 'l') {
				System.out.print(zebra.charAt(z));
				countOfLowerCasei++;
			}
			System.out.print('.');
		}

		System.out.println("\n");

		// create a String
		// loop to the size of the String and on every print one char
		// and then go to the next line
		// optional - do the same thing in reverse

		String afghan = "This is the country where I was born.";
		for (int index = 0; index < afghan.length(); index++) {
			System.out.print(afghan.charAt(index) + " ");
		}
		System.out.println(" ");

		for (int index = afghan.length() - 1; index >= 0; index--) {
			System.out.print(afghan.charAt(index) + " ");
		}
		System.out.println(" ");

		String babyGirl = "This is a Punjabi song by Guru Randhawa & Dhvani Bhanushali";
		for (int i = 0; i < babyGirl.length(); i++) {
			System.out.print(babyGirl.charAt(i));
		}
		System.out.println("\n");
		for (int j = babyGirl.length() - 1; j >= 0; j--) {
			System.out.print(babyGirl.charAt(j));
		}
		System.out.println("\n");

		String barish = "Rim Jhim Ye Sawan Pher Barsaten Le Aya Hain";
		for (int bar = 0; bar < barish.length(); bar++) {
			System.out.print(barish.charAt(bar));
		}
		System.out.println();
		for (int ish = barish.length() - 1; ish >= 0; ish--) {
			System.out.print(barish.charAt(ish));
		}
		System.out.println("\n");

		String abhijeet = "Chalo Ek Bar Phir Se Ajnabee Banjaye Hum Duno";
		for (int i = 0; i < abhijeet.length(); i++) {
			System.out.print(abhijeet.charAt(i));
		}
		System.out.println();
		for (int index = abhijeet.length() - 1; index >= 0; index--) {
			System.out.print(abhijeet.charAt(index));
		}
		System.out.println("\n");

		String doom = "Dhoom Machale";
		for (int i = 0; i < doom.length(); i++) {
			System.out.print(doom.charAt(i));
		}
		System.out.println();
		for (int index = doom.length() - 1; index >= 0; index--) {
			System.out.print(doom.charAt(index));
		}
		System.out.println();

		String echoFriendly = "Try to buy a Lexus CT since it is a luxury hybrid, an echo-friendly car.";
		for (int i = 0; i < echoFriendly.length(); i++) {
			System.out.print(echoFriendly.charAt(i));
		}
		System.out.println();
		for (int index = echoFriendly.length() - 1; index >= 0; index--) {
			System.out.print(echoFriendly.charAt(index));
		}
		System.out.println("\n");

		String fairfield = "Fairfield is a city in northern California";
		for (int i = 0; i < fairfield.length(); i++) {
			System.out.print(fairfield.charAt(i) + " ");
		}
		System.out.println();
		for (int index = fairfield.length() - 1; index >= 0; index--) {
			System.out.print(fairfield.charAt(index)
					+ " 																		");
		}
		System.out.println("\n");

		String gujrat = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";
		for (int i = 0; i < gujrat.length(); i++) {
			System.out.print(gujrat.charAt(i));
		}
		System.out.println("\n");
		for (int i = gujrat.length() - 1; i >= 0; i--) {
			System.out.print(gujrat.charAt(i));
		}
		System.out.println("\n");

		String humtum = "He threw three free throws.";
		for (int index = 0; index < humtum.length(); index++) {
			System.out.print(humtum.charAt(index));
		}
		System.out.println("\n");
		for (int index = humtum.length() - 1; index >= 0; index--) {
			System.out.print(humtum.charAt(index));
		}
		System.out.println("\n");

		String indochina = "Can you can a can as a canner can can a can?";
		for (int i = 0; i < indochina.length(); i++) {
			System.out.print(indochina.charAt(i));
		}
		System.out.println();
		for (int i = indochina.length() - 1; i >= 0; i--) {
			System.out.print(indochina.charAt(i));
		}
		System.out.println("\n");

		String jackInTheBox = "Jack in the Box is a restaurant chain in the United States";
		for (int index = 0; index < jackInTheBox.length(); index++) {
			System.out.print(jackInTheBox.charAt(index));
		}
		System.out.println();
		for (int index = jackInTheBox.length() - 1; index >= 0; index--) {
			System.out.print(jackInTheBox.charAt(index));
		}
		System.out.println("\n");

		String kargil = "Kargil district one of two districts in Ladakh, a region administered by India as a union territory.";
		for (int index = 0; index < kargil.length(); index++) {
			System.out.print(kargil.charAt(index));
		}
		System.out.println();
		for (int index = kargil.length() - 1; index >= 0; index--) {
			System.out.print(kargil.charAt(index));
		}
		System.out.println("\n");

		String loveSong = "Hone Laga Tumse Pyaar";
		for (int i = 0; i < loveSong.length(); i++) {
			System.out.print(loveSong.charAt(i));
		}
		System.out.println();
		for (int i = loveSong.length() - 1; i >= 0; i--) {
			System.out.print(loveSong.charAt(i));
		}
		System.out.println("\n");

		String meraNaamJoker = "\"Mera Naam Joker\" is an Indian classic movie";
		for (int index = 0; index < meraNaamJoker.length(); index++) {
			System.out.print(meraNaamJoker.charAt(index));
		}
		System.out.println();
		for (int index = meraNaamJoker.length() - 1; index >= 0; index--) {
			System.out.print(meraNaamJoker.charAt(index));
		}
		System.out.println("\n");

		String noSmoking = "Smoking is strictly prohibited in and around this building";
		for (int index = 0; index < noSmoking.length(); index++) {
			System.out.print(noSmoking.charAt(index));
		}
		System.out.println();
		for (int index = noSmoking.length() - 1; index >= 0; index--) {
			System.out.print(noSmoking.charAt(index));
		}
		System.out.println("\n");

		String ops = "\"Operation Enduring Freedom\" ended  on Dec 31, 2014. On Jan 1, 2015, a new NATO mession begun which was called\"Resolute Support Mission\".";
		for (int i = 0; i < ops.length(); i++) {
			System.out.print(ops.charAt(i));
		}

		System.out.println();
		for (int i = ops.length() - 1; i >= 0; i--) {
			System.out.print(ops.charAt(i));
		}
		System.out.println("\n");

		String profit = "There is no profit for me if I sell you the car for the price I have bought it for";
		for (int index = 0; index < profit.length(); index++) {
			System.out.print(profit.charAt(index));
		}
		System.out.println();
		for (int index = profit.length() - 1; index >= 0; index--) {
			System.out.print(profit.charAt(index));
		}
		System.out.println("\n");

		String quickQuack = "QuickQuack is carwash chain in Sacramento, the capital city of the state of California.";
		for (int index = 0; index < quickQuack.length(); index++) {
			System.out.print(quickQuack.charAt(index));
		}
		System.out.println();
		for (int index = quickQuack.length() - 1; index >= 0; index--) {
			System.out.print(quickQuack.charAt(index));
		}
		System.out.println("\n");

		String richard = "Robert DiNero is a famous Hollywood starr.";
		for (int i = 0; i < richard.length(); i++) {
			System.out.print(richard.charAt(i) + " ");
		}
		System.out.println();
		for (int j = richard.length() - 1; j >= 0; j--) {
			System.out.print(richard.charAt(j) + " ");
		}
		System.out.println("\n");

		String sultan = "Sultan is normally referred to a Muslim monarch";
		for (int index = 0; index < sultan.length(); index++) {
			System.out.print(sultan.charAt(index));
		}
		System.out.println();
		for (int index = sultan.length() - 1; index >= 0; index--) {
			System.out.print(sultan.charAt(index));
		}
		System.out.println("\n");

		String tom = "Tom Cruies is a famous Hollywood actor, one of the A-Listers.";
		for (int index = 0; index < tom.length(); index++) {
			System.out.print(tom.charAt(index) + " ");
		}
		System.out.println();
		for (int index = tom.length() - 1; index >= 0; index--) {
			System.out.print(tom.charAt(index) + " ");
		}
		System.out.println("\n");

		String understand = "I understand your frustration but you have to be patient with me";
		for (int index = 0; index < understand.length(); index++) {
			System.out.print(understand.charAt(index));
		}
		System.out.println();
		for (int index = understand.length() - 1; index >= 0; index--) {
			System.out.print(understand.charAt(index));
		}
		System.out.println("\n");

		String versailles = "Versailles is a palace in the city of Versailles in France.";
		for (int index = 0; index < versailles.length(); index++) {
			System.out.print(versailles.charAt(index));
		}
		System.out.println();
		for (int index = versailles.length() - 1; index >= 0; index--) {
			System.out.print(versailles.charAt(index));
		}
		System.out.println("\n");

		String waga = "Waga is a town on the border of India and Pakistan";
		for (int index = 0; index < waga.length(); index++) {
			System.out.print(waga.charAt(index));
		}
		System.out.println();

		for (int index = waga.length() - 1; index >= 0; index--) {
			System.out.print(waga.charAt(index));
		}
		System.out.println("\n");

		String xing = "The word \"Xing\" as we see on the road actually means \"Crossing\".";
		for (int index = 0; index < xing.length(); index++) {
			System.out.print(xing.charAt(index));
		}
		System.out.println();
		for (int index = xing.length() - 1; index >= 0; index--) {
			System.out.print(xing.charAt(index));
		}
		System.out.println("\n");

		String yeah = "Hell yeah! I can do whatever I want with my life.";
		for (int index = 0; index < yeah.length(); index++) {
			System.out.print(yeah.charAt(index));
		}
		System.out.println();
		for (int index = yeah.length() - 1; index >= 0; index--) {
			System.out.print(yeah.charAt(index));
		}
		System.out.println("\n");

		String zip = "Zip is tightening mechanism";
		for (int i = 0; i < zip.length(); i++) {
			System.out.print(zip.charAt(i));
		}
		System.out.println();
		for (int j = zip.length() - 1; j >= 0; j--) {
			System.out.print(zip.charAt(j));
		}
		System.out.println("\n");

		System.out.println("End of the class.");
	}

}
