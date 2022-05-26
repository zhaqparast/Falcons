package JavaBasicsPackage;

public class Lesson7SwitchStatement {

	public static void main(String[] args) {

		String day = "Saturday";

		switch (day) {
		case "Wednesday":
			System.out.println("Today is Wednesday, not Saturday.\n");
			break;
		case "Thursaday":
			System.out.println("Today is Thursday, not Saturday.\n");
			break;
		case "Friday":
			System.out.println("Today is Friday, not Saturday.\n");
			break;
		case "Saturday":
			System.out.println("Today is Saturday.\n");
			break;
		case "Sunday":
			System.out.println("Today is Sunday, not Saturday.\n");
			break;
		case "Monday":
			System.out.println("Today is Monday, not Saturday.\n");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday, not Saturday.\n");
			break;
		default:
			System.out.println("By default, today is Saturday.");
		}

		if (day == "Wednesday") {
			System.out.println("Today is Wednesday, not Saturday.\n");
		} else if (day == "Thursday") {
			System.out.println("Today is Thursday, not Saturday.\n");
		} else if (day == "Friday") {
			System.out.println("Today is Friday, not Saturday.\n");
		} else if (day == "Saturday") {
			System.out.println("Today is Saturday.\n");
		} else if (day == "Sunday") {
			System.out.println("Today is Sunday, not Saturday.\n");
		} else if (day == "Monday") {
			System.out.println("Today is Monday, not Saturday.\n");
		} else if (day == "Tuesday") {
			System.out.println("Today is Tuesday, not Saturday.\n");
		} else {
			System.out.println("This is the second time I am saying it is Saturday.\n");
		}

		int year = 2021;

		switch (year) {
		case 1995:
			System.out.println("This is 1995;");
			break;
		case 1996:
			System.out.println("This is 1996");
			break;
		case 1997:
			System.out.println("This is 1997");
			break;
		case 1998:
			System.out.println("This is 1998");
			break;
		case 1999:
			System.out.println("This 1999");
			break;
		case 2000:
			System.out.println();
			break;
		case 2001:
			System.out.println("This is " + year + "\n");
			break;
		case 2002:
			System.out.println("This is " + year);
		default:
			System.out.println("The system could not find which year you are looking for");
		}

		if (year == 1998) {
			System.out.println("This is " + year + "\n");
		} else if (year == 1999) {
			System.out.println("This is " + year + "\n");
		} else if (year == 2000) {
			System.out.println("This is " + year + "\n");
		} else if (year == 2001) {
			System.out.println("This is " + year + "\n");
		} else if (year == 2002) {
			System.out.println("This is " + year + "\n");
		} else {
			System.out.println("The system could not find the year you are looking for.");
		}

		String car = "Subaru";

		switch (car) {
		case "Lexus":
			System.out.println("This is Lexus, not Subaru.\n");
			break;
		case "Toyota":
			System.out.println("This is Toyota, not Subaru.\n");
			break;
		case "Mitsubishi":
			System.out.println("This is Mitsubishi, not Subaru.\n");
			break;
		case "Subaru":
			System.out.println("This is Subaru.\n");
			break;
		case "Volga":
			System.out.println("This is a Volga, not a Subaru.\n");
			break;
		case "BMW":
			System.out.println("This is a BMW, not a Subaru.\n");
			break;
		default:
			System.out.println("This is non of the above, it is a Suzuki Samurai.\n");
		}

		int weight = 876;
		switch (weight) {
		case 98789:
			System.out.println("The weight is " + weight + " pounds.\n");
			break;
		case 97657:
			System.out.println("The weight is " + weight + " pounds.\n");
			break;
		case 54567:
			System.out.println("The weight is " + weight + " pounds.\n");
			break;
		case 8768:
			System.out.println("The weight is " + weight + " pounds.\n");
			break;
		default:
			System.out.println("The weight of the cargo is " + weight + " pounds.\n");
		}

		String myName = "Toar Esmat Qani";
		switch (myName) {
		case "Nazar Maad Muttamyen":
			System.out.println("His name is " + myName + ".\n");
			break;
		case "Paiz Mamad Ghwalanz":
			System.out.println("His name is " + myName + ".\n");
			break;
		case "Khairo Gul":
			System.out.println("His name is " + myName + ".\n");
			break;
		default:
			System.out.println("His name is " + myName + ". He is a well know poet.\n");
		}

		String cellPhoneBrand = "\"Apple IPhone\"";
		switch (cellPhoneBrand) {
		case "\"Samsung Galaxy Note 11\"":
			System.out.println("My cellphone is " + cellPhoneBrand + "\n");
			break;
		case "\"Nokia Lumia 3310\"":
			System.out.println("My cellphone is " + cellPhoneBrand + "\n");
			break;
		case "\"Blackberry\"":
			System.out.println("My cellphone is " + cellPhoneBrand + "\n");
			break;
		default:
			System.out.println("My cell phone is " + cellPhoneBrand + "\n");

		}

		int myGrade = 11;
		switch (myGrade) {
		case 5:
			System.out.println("This is an elementary school grade.\n");
			break;
		case 7:
			System.out.println("This is a secondary school grade.\n");
			break;
		case 10:
			System.out.println("This is a high school grade but not the one I am looking for.");
			break;
		default:
			System.out.println("What I am looking for is the " + myGrade + "th grade.\n");
		}

		String sportCar = "Mustang";
		switch (sportCar) {
		case "Camaro":
			System.out.println("This is Camaro\n");
			break;
		case "Challenger":
			System.out.println("This is Challenger\n");
			break;
		case "Mustang":
			System.out.println("This is Mustang\n");
			break;
		default:
			System.out.println("This is a Supra\n");
		}

		int myAge = 37;
		switch (myAge) {
		case 18:
			System.out.println("I can not purchase neither cigarettes nor liquor.\n");
			break;
		case 21:
			System.out.println("I can go and get a pack of cigarettes and a bottle of Chivas Regal.\n");
			break;
		case 40:
			System.out.println(" I am to old to smoke but I would love a shot of whiskey.\n");
			break;
		default:
			System.out.println("I am " + myAge + " years old and can do whatever I want.\n");

		}

		String movie = "\"John Wick\"";
		switch (movie) {
		case "Wrath of Man":
			System.out.println("This is \"Wrath of Man\"");
			break;
		case "\"Fast 7\"":
			System.out.println("This is \"Fast 7\"");
			break;
		case "\"John Wick\"":
			System.out.println("This is \"John Wick\"\n");
			break;
		case "\"John Wick: Chapter Two\"":
			break;
		default:
			System.out.println("Oh yeah, I am back.");
		}

		int myNumber = 123;
		switch (myNumber) {
		case 234:
			System.out.println("This is " + myNumber);
		case 345:
			System.out.println("This is " + myNumber);
		case 456:
			System.out.println("This is " + myNumber);
		case 567:
			System.out.println("This is " + myNumber);
		default:
			System.out.println(myNumber + "\n");
		}

		String mySUV = "Land Cruiser";
		switch (mySUV) {
		case "Pajero":
			System.out.println("My SUV is " + mySUV);
		case "Land Rover":
			System.out.println("My SUV is " + mySUV);
		case "G Wagon":
			System.out.println("My SUV is " + mySUV);
		case "Macan":
		default:
			System.out.println("My SUV is " + mySUV + "\n");
		}

		int myNum = 987;
		switch (myNum) {
		case 876:
			System.out.println("This is my number " + myNum);
		case 765:
			System.out.println("This is my number " + myNum);
		case 654:
			System.out.println("This is my number " + myNum);
		case 543:
			System.out.println("This is my number " + myNum);
		case 432:
			System.out.println("This is my number " + myNum);
		default:
			System.out.println("My number is " + myNum + "\n");
		}

		String brand = "CalvinKlein";
		switch (brand) {
		case "Gucci":
			System.out.println("My shoes' brand is " + brand + "\n");
			break;
		case "Dolce Gabbana":
			System.out.println("His shoes' brand is " + brand + "\n");
			break;
		case "GAP":
			System.out.println("She is wearing a " + brand + "jacket.\n");
			break;
		case "Adidas":
			System.out.println("I am wearing my " + brand + " sneakers.\n");
			break;
		case "Armani":
			System.out.println("She is wearing an " + brand + "scarf.\n");
			break;
		default:
			System.out.println("He is wearing a " + brand + " cheker shirt.\n");
		}

		String fizzFuzz = "fizzFuzz";
		switch (fizzFuzz) {
		case "Fizz":
			System.out.println("Fizz" + "break");
			break;
		case "fizzFuzz":
			System.out.println("fizzFuzz.");
			break;
		case "Fuzz:":
			System.out.println("Fuzz");
			break;
		default:
			System.out.println("Threr is not such thing as fizzfuzz.");
		}

		int one = 567;
		switch (one) {
		case 123:
			System.out.println("Print " + one);
			break;
		case 234:
			System.out.println("Print " + one + "\n");
			break;
		case 345:
			System.out.println("Print " + one + "\n");
			break;
		case 456:
			System.out.println("Print " + one + "\n");
			break;
		case 567:
			System.out.println("Print " + one + "\n");
			break;
		case 678:
			System.out.println("Print " + one + "\n");
			break;
		default:
			System.out.println("The system could not print the number you are looking for\n");
		}

		String make = "Toyota";
		switch (make) {
		case "Toyota":
			System.out.println("This is Toyota\n");
			// break;
		case "Honda":
			System.out.println("This is Honda\n");
			// break;
		case "Nissan":
			System.out.println("This is Nissan\n");
			// break;
		case "Ford":
			System.out.println("Tbis is Ford\n");
			// break;
		default:
			System.out.println("We could not make the make you are looking for\n");
		}

		int two = 160;
		switch (two) {
		case 120:
			System.out.println("This is 120\n");
			break;
		case 130:
			System.out.println("This is 130\n");
			break;
		case 140:
			System.out.println("This is 140\n");
			break;
		case 150:
			System.out.println("This is 150\n");
			break;
		case 160:
			System.out.println("This is 160\n");
			break;
		case 170:
			System.out.println("This is 170\n");
			break;
		case 180:
			System.out.println("This is 180\n");
			break;
		case 190:
			System.out.println("This is 190\n");
			break;
		default:
			System.out.println("This is 200\n");
		}

		String yourName = "Jackie Chan";
		switch (yourName) {
		case "Sammo Hung":
			System.out.println("This is Sammo Hung\n");
			break;
		case "Jet Li":
			System.out.println("This is Jet Li\n");
			break;
		case "Yuen Biao":
			System.out.println("This is Yuen Biao\n");
			break;
		case "Jackie Chan":
			System.out.println("This is Jackie Chan\n");
			break;
		case "Mark Dacascos":
			System.out.println("This is Mark Dacascos\n");
			break;
		default:
			System.out.println("Jackie motherfucking Chan\n");
		}

		int three = 130;
		switch (three) {
		case 120:
			System.out.println("This is 120\n");
			break;
		case 130:
			System.out.println("This is 130\n");
			break;
		case 140:
			System.out.println("This is 140\n");
			break;
		case 150:
			System.out.println("This is 150\n");
			break;
		default:
			System.out.println("This is not the number I am looking for\n");
		}

		String politician = "Hamid Karzai";
		switch (politician) {
		case "Ashraf Ghani":
			System.out.println("Ashraf Ghani\n");
			break;
		case "Joe Biden":
			System.out.println("Joe Biden\n");
			break;
		case "Donald Trump":
			System.out.println("Donald Trump\n");
			break;
		case "Hamid Karzai":
			System.out.println("Hamid Karzai\n");
			break;
		case "George Bush":
			System.out.println("George Bush\n");
			break;
		default:
			System.out.println("I am a politician myself.\n");
		}

		int four = 90;
		switch (four) {
		case 100:
			System.out.println(four + "\n");
			break;
		case 110:
			System.out.println(four + "\n");
			break;
		case 80:
			System.out.println(four + "\n");
			break;
		case 90:
			System.out.println(four + "\n");
			break;
		case 120:
			System.out.println(four + "\n");
			break;
		default:
			System.out.println("This is not the number I was looking for\n");

		}

		String country = "Italy";
		switch (country) {
		case "Brazil":
			System.out.println("Brazil");
			break;
		case "Italy":
			System.out.println("Italy\n");
			break;
		case "China":
			System.out.println("China");
			break;
		case "Japan":
			System.out.println("Japan");
			break;
		default:
			System.out.println("Afghanistan");
		}

		int five = 55765;
		switch (five) {
		case 868868:
			System.out.println("This should be number.\n");
			break;
		case 765787:
			System.out.println("This might be number.\n");
			break;
		case 644647:
			System.out.println("This must be the number.\n");
			break;
		default:
			System.out.println(five + "\n");
		}

		String city = "Kabul";
		switch (city) {
		case "Herat":
			System.out.println("This is Herat\n");
			break;
		case "Kandahar":
			System.out.println("This is Kandahar.\n");
			break;
		case "Kabul":
			System.out.println("This is the capital of Afghanistan\n");
			break;
		case "Helmand":
			System.out.println("This is not a city, it is a province.\n");
			break;
		default:
			System.out.println("Jalalabad.\n");
		}

		int six = 87368;
		switch (six) {
		case 866:
			System.out.println("Is this the number you are looking for?\n");
			break;
		case 7876:
			System.out.println("Is this your number?\n");
			break;
		case 868889898:
			System.out.println("My name is Khan.\n");
			break;
		default:
			System.out.println(six + " is my number.\n");
		}

		String truck = "Peterbilt";
		switch (truck) {
		case "Freightliner":
			System.out.println("This is Freightliner\n");
			break;
		case "Kenworth":
			System.out.println("This is Kenworth\n");
			break;
		case "Peterbilt":
			System.out.println("This is Peterbilt\n");
			break;
		case "Volvo":
			System.out.println("This is Volvo\n");
			break;
		default:
			System.out.println("Mack");
		}

		int seven = 252;
		switch (seven) {
		case 9878:
			System.out.println("This is number " + seven + "\n");
			// break;
		case 977:
			System.out.println("This is number " + seven + "\n");
			// break;
		case 7979:
			System.out.println("This is number " + seven + "\n");
			// break;
		default:
			System.out.println("This is the actual " + seven + "\n");
		}

		String actor = "Keanu Reeves";
		switch (actor) {
		case "Robert Di Nero":
			System.out.println("This is the actor who played the lead role in the movie \"Irishman\".\n");
			break;
		case "Robert Downey Jr":
			System.out.println("This is the actor who played the lead role in the movie \"Ironman\".\n");
			break;
		case "John Travolta":
			System.out.println("This is the actor who played the lead role in the movie \"Swordfish\".\n");
			break;
		case "Brad Pitt":
			System.out.println("This is the actor who played the lead role in the movie \"Troy\".\n");
			break;
		default:
			System.out.println("I am looking for Jean-Claude Van Damme\n");
		}

		int eight = 988087;
		switch (eight) {
		case 9876:
			System.out.println("Print this number.\n");
			break;
		case 65675:
			System.out.println("Print that number.\n");
			break;
		case 876:
			System.out.println("Print another number.\n");
			break;
		case 6547:
			System.out.println("Print yet another number.\n");
			break;
		default:
			System.out.println("This would be the final number.\n");
		}

		String comedian = "Robin Williams";
		switch (comedian) {
		case "Rowan Atkinson":
			System.out.println("This is Rowan Atkinson\n");
			break;
		case "Lilly Singh":
			System.out.println("This is Lilly Singh\n");
			break;
		case "Jim Carrey":
			System.out.println("This is " + comedian + "\n");
			break;
		case "Jimmy \"The Tulip\"Tudeski":
			System.out.println("This is Jimmy \"The Tulip\" Teduski.\n");
			break;
		default:
			System.out.println("I am looking for \"Jim Carrey\", have you seen him?\n");
		}

		int nine = 876786;
		switch (nine) {
		case 6545:
			System.out.println("This is not nine.\n");
			break;
		case 54376:
			System.out.println("This is not nine either.\n");
			break;
		case 4565888:
			System.out.println("Nor is this nine.\n");
			break;
		default:
			System.out.println(nine + "\n");
		}

		String afghanName = "Mirwais";
		switch (afghanName) {
		case "Tsarrban":
			System.out.println("This is not " + afghanName + "! This is Tsarrban.\n");
			break;
		case "Gharghasht":
			System.out.println("This is not " + afghanName + " either! His name is Gharghasht.\n");
			break;
		case "Mirwais":
			System.out.println("This is my son " + afghanName + ". We named hin after the founder of modern day"
					+ "Afghanistan to honor his legacy.\n");
			break;
		case "Maiwand":
			System.out.println("Maiwand is yet another Afghan name");
			break;
		default:
			System.out.println("Print out " + afghanName + "\n");
		}

		int ten = 10;
		switch (ten) {
		case 6:
			System.out.println("This is six.\n");
			break;
		case 7:
			System.out.println("This is seven.\n");
			break;
		case 8:
			System.out.println("This is eight.\n");
			break;
		case 9:
			System.out.println("This is nine.\n");
			break;
		default:
			System.out.println(ten + "\n");
		}

		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("Nice, good job.\n");
			break;
		case 'B':
			System.out.println("Way to go, it's still a good place to be.\n");
			break;
		case 'C':
			System.out.println("We need to work more.\n");
			break;
		case 'D':
			System.out.println("Need to plan and study more.\n");
			break;
		default:
			System.out.println("It's OK. Maybe next time.\n");
		}

		int alpha = 234;
		switch (alpha) {
		case 123:
			System.out.println("This is my first number: " + alpha);
			break;
		case 234:
			System.out.println("My second number is: " + alpha);
			break;
		case 345:
			System.out.println("My third number is: " + alpha);
			break;
		case 456:
			System.out.println("My fourth number is: " + alpha);
			break;
		default:
			System.out.println("My actual number is: " + 234);
		}
	}
}
