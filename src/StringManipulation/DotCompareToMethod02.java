package StringManipulation;

public class DotCompareToMethod02 {

	public static void main(String[] args) {

		String alpha = "How is everybody doing?";
		String alpha1 = "hOW IS EVERYBODY DOING?";
		String alpha2 = "How is everybody doing?";
		System.out.println(alpha.compareTo(alpha1));
		System.out.println(alpha.compareTo(alpha2));
		System.out.println(alpha.compareToIgnoreCase(alpha1));

		String bravo = "I have no idea what you are talking about.";
		String bravo2 = "I HAVE AN IDEA BUT I AM NOT GONNA TELL YOU.";
		String bravo3 = "I have No idea what you are talking about.";
		System.out.println(bravo.compareTo(bravo3));
		System.out.println(bravo.compareToIgnoreCase(bravo2));

		String charcoal = "Charcoal is not only an element used in heating but also a color.";
		String charcoal2 = "CHARCOAL is a color AS WELL AS a heating material.";
		String carChoal = "Charcoal is not only an element used in heating but also a color.";
		System.out.println(charcoal.compareTo(charcoal2));
		System.out.println(charcoal.compareToIgnoreCase(charcoal2));
		System.out.println(charcoal.compareTo(carChoal));

		String duel = "A duel is a deadly contest";
		String duel1 = "A dueL iS A dEADLY ConTest";
		System.out.println(duel.compareTo(duel1));
		System.out.println(duel.compareToIgnoreCase(duel1));

		String epic = "Epic is a Chevy dealership in Sacramento.";
		String epic2 = "EPIC IS A CHEVY DEALERSHIIP IN SACRAMENTO.";
		String epic3 = "Epic is a Chevy dealership in Sacramento.";
		System.out.println(epic.compareTo(epic2));
		System.out.println(epic.compareToIgnoreCase(epic2));
		System.out.println(epic.compareTo(epic3));

		String french = "French stands for the language spoken in France, or someone from France.";
		String french2 = "French does not mean french kiss!";
		System.out.println(french.compareTo(french2));
		System.out.println(french.compareToIgnoreCase(french2));

		String goat = "Goat is a very naughty domestic animal.";
		String goat2 = "Goat is also a wild animal found in the mountains.";
		System.out.println(goat.compareTo(goat2));
		System.out.println(goat.compareToIgnoreCase(goat2));

		String horse = "There are two types of horses, wild and tamed.";
		String horse2 = "Horses have three categories. A grown male horse is called a Stallion. A grown female horse is called a mare and a baby horse is called a ponny.";
		String horse3 = "Horses have three categories. A grown male horse is called a Stallion. A grown female horse is called a mare and a baby horse is called a ponny.";
		System.out.println(horse.compareTo(horse2));
		System.out.println(horse.compareToIgnoreCase(horse2));
		System.out.println(horse2.compareToIgnoreCase(horse3));

		String ignorance = "Ignorance is a very bad habbit.";
		String ignorance1 = "Ignorance could be a very bad habbit.";
		System.out.println(ignorance.compareTo(ignorance1));
		System.out.println(ignorance.compareToIgnoreCase(ignorance1));

		String jammer = "Jammer is a device used to jam radio signals and remote controlled devices.";
		String jammer2 = "Jammers are used by militaries all over the world to twart IEDs.";
		String jammer3 = "JAMMERS are USed By miLITARIES aLL oVER The world TO TWart iedS.";
		System.out.println(jammer.compareTo(jammer2));
		System.out.println(jammer2.compareToIgnoreCase(jammer3));

		String killteam = "Kill Team is a war movie.";
		String kt = "Kill Team is a War movie.";
		System.out.println(killteam.compareTo(kt));
		System.out.println(killteam.compareToIgnoreCase(kt));

		String lamp = "Lamps are installed along the roads to illuminate these roads.";
		String cheraghString = "Lamps are installed along the roads to illuminate these roads.";
		String lamp3 = "LAMPs aRE cheep.";
		System.out.println(lamp.compareTo(cheraghString));
		System.out.println(lamp.compareToIgnoreCase(lamp3));

		String man = "Man fears time, yet the time fears the pyramids";
		String man2 = "No one knows how were the pyramids build!";
		System.out.println(man.compareTo(man2));
		System.out.println(man.compareToIgnoreCase(man2));

		String noun = "Noun can be used to name a person, a place and/a thing.";
		String pronoun = "Pronoun is used to replace a name to avoid the redundant repeatation of it.";
		System.out.println(noun.compareTo(pronoun));
		System.out.println(noun.compareToIgnoreCase(pronoun));

		String orange = "Orange is a kind of fruit.";
		String orange2 = "Orange is also a color.";
		System.out.println(orange.compareTo(orange2));
		System.out.println(orange.compareToIgnoreCase(orange2));

		String panda = "Panda is a bread of bears found only in China";
		String panda2 = "Panda is also a character in the Dreamworks animitation Kung Fu Panda";
		System.out.println(panda.compareTo(panda2));
		System.out.println(panda.compareToIgnoreCase(panda2));

		String quit = "I quit smoking.";
		String quit2 = "Quiting smoking is not easy.";
		String quit3 = "I also quit chewing tobacco";
		System.out.println(quit.compareTo(quit2));
		System.out.println(quit.compareToIgnoreCase(quit3));

		String rupee = "Rupee is the currency of both Pakistan and India.";
		String rupee2 = "RuPEE IS THE CUrrencY Of boTh PAKISTAN anD INdia.";
		System.out.println(rupee.compareTo(rupee2));
		System.out.println(rupee.compareToIgnoreCase(rupee2));

		String superman = "Superman is a comic movie.";
		String superman2 = "Superman is based on a comic book.";
		System.out.println(superman.compareTo(superman2));
		System.out.println(superman.compareToIgnoreCase(superman2));

		String toothpaste = "Colgate is a brand of toothpaste";
		String toothpaste2 = "Pepsedent is also a brand of toothpaste";
		System.out.println(toothpaste.compareTo(toothpaste2));
		System.out.println(toothpaste.compareToIgnoreCase(toothpaste2));

		String ultra = "Ultra is yet another synonym for extra.";
		String ultra2 = "Ultra is Yet Another synonym for extra.";
		System.out.println(ultra.compareTo(ultra2));
		System.out.println(ultra.compareToIgnoreCase(ultra2));

		String voice = "Voice of America or VOA";
		String voice2 = "Voice of America OR voa";
		System.out.println(voice.compareTo(voice2));
		System.out.println(voice.compareToIgnoreCase(voice2));

		String wave = "Wave was a brand of cigarettes from early 90s.";
		String wave2 = "Wave is also a current of radio broadcast.";
		System.out.println(wave.compareTo(wave2));
		System.out.println(wave.compareToIgnoreCase(wave2));

		String xtera = "Xtera is a model of the car brand Nissan";
		String xtera2 = "Xtera is actually an off-road SUV.";
		System.out.println(xtera.compareTo(xtera2));
		System.out.println(xtera.compareToIgnoreCase(xtera2));

		String yawn = "Yawning in public is a sign of boredom";
		String yawn2 = "If your host starts yawning, it means you have to end whatever you are doing. It is time to call the day.";
		System.out.println(yawn.compareTo(yawn2));
		System.out.println(yawn.compareToIgnoreCase(yawn2));

		String zebra = "Zebra is a wild animal";
		String zebra2 = "A zebra could never be tamed.";
		System.out.println(zebra.compareTo(zebra2));
		System.out.println(zebra.compareToIgnoreCase(zebra2));
	}

}
