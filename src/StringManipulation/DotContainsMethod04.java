package StringManipulation;

public class DotContainsMethod04 {

	public static void main(String[] args) {

		String alpha = "ashkfhy787*^%$12944u2938AAKHFKDHMBMC*tf8RCD^";
		System.out.println(alpha.contains("AAk"));
		System.out.println(alpha.contains("AAKH"));
		System.out.println();

		String bravo = "I have no idea what you are talking abuut!";
		System.out.println(!bravo.contains("!"));

		String charlie = "sdfuvtdvbwjgbsjvgCIYD*H FbUYT*(&YE#";
		System.out.println(charlie.contains("*"));

		String delta = "She sells some sea shells by the sea shore.";
		System.err.println(delta.contains("shells"));

		String fox = "A \"White Fox\" also has a long tail";
		System.out.println(fox.contains("Wh"));

		String echo = "Echo does not mean economical";
		System.err.println(echo.contains("not "));

		String golf = "Golf is the game oo the so-called \"nobles\".";
		System.out.println(golf.contains("\""));

		String hotel = "I am staying in a hotel tonight";
		System.err.println(hotel.contains("toni"));

		String iwo = "The \"Letters from Iwo Jima\" is a war movie directed by Clint Eastwood.";
		System.out.println(iwo.contains("jima"));

		String jug = "A jug is a container used to serve water";
		System.err.println(jug.contains("cont"));

		String kilo = "The term \"kilo\" is a quantitive adjective/measurement unit mostly used in Europe and Asia.";
		System.out.println(!kilo.contains("\"kilo\""));

		String luft = "\"Luftwaffe\" was the air weapon component of the wehrmacht.";
		System.err.println(luft.contains("wehrmacht"));

		String motor1 = "A motor is also called a vehicle.";
		System.out.println(motor1.contains("(*&*(&(*&%&*^"));

		String note1 = "A note is a peice of writing you do about something to be used later on.";
		System.out.println(note1.contains("riting"));

		String open1 = "\"Opening Doors\" is an incorporation in charge of settling refugees";
		System.err.println(!open1.contains("\"Opening Doors\""));

		String perfect = "\"Perfect Storm\" is a movie based on a real story.";
		System.out.println(perfect.contains("t Stor"));

		String quick1 = "Quick Quack is a nice carwash.";
		System.err.println(quick1.contains(" quack"));

		String ramadan = "Ramadan is the \"Holy Qur'an\" month fasting";
		System.out.println(ramadan.contains("Ramadan"));

		String smartPhone = "Samsung is one kind of a smart phone";
		System.err.println(smartPhone.contains("Sung "));

		String tongueTwister = "She sells some shells by the sea shore";
		System.out.println(tongueTwister.contains("some shells"));

		String underwear = "He wears a \"Calvin Clien\" underwear.";
		System.err.println(underwear.contains("calvin"));

		String voice = "A voice note is a vocal message you leave for someone on his/her phone.";
		System.out.println(voice.contains("his/her"));

		String wow = "Wow is a local produce market in North Highlands.";
		System.err.println(wow.contains("th high"));

		String xBox = "X-Box is a gaming station.";
		System.out.println(xBox.contains("X-"));

		String yaran = "The term \"Yaran\" means \"friends\" in \"Pashto\".";
		System.err.println(yaran.contains("Bashto"));

		String zakham = "The word \"zakham\" means \"wound\" in both \"Dari\" & \"Pashto\".";
		System.out.println(zakham.contains("\"Pashto\""));

	}
}
