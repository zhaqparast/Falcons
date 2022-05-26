package OPPSConceptsDay01Constructor;

public class Runner {

	public static void main(String[] args) {

		// In this class, we will create objects of our Student class
		// Below are examples of the objects of the Student class

		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		student1.fn = "Jack";
		student1.ln = "Sparks";
		student1.age = 56;

		student2.fn = "John";
		student2.ln = "Wick";
		student2.age = 45;

		student3.fn = "Jason";
		student3.ln = "Bourne";
		student3.age = 40;

		System.out.println(student1.fn + " is " + student1.age + " years old.");

		Student student4 = new Student("Toyota", "Corolla", 2019);

		System.out.println(student4.fn);

		System.out.println(
				"**********************************************************************************************");
		System.out.println();

		System.out.println();

		Animal wolf = new Animal("Alpha");
		System.out.println(wolf.name);

		Animal dog = new Animal("Rex", "Domestic");
		System.out.println(dog.name + " is a " + dog.type + " animal.");

		Animal porcupine = new Animal("Spartan", "Wild", 7);
		System.out.println(
				porcupine.name + " is a " + porcupine.type + " animal. It is " + porcupine.age + " years old.");

		Animal turtle = new Animal("Turtle", "wild", 50, 4);
		System.out.println(turtle.name + " is a " + turtle.type + " reptile. It sometimes ages more than " + turtle.age
				+ " and has " + turtle.legs + " short legs.");

		System.out.println(
				"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();

		Bear bear = new Bear("North American Bear");
		System.out.println(bear.family);
		Bear bear2 = new Bear("Bear", "Polar Bear");
		System.out.println("Another heavy animal of the " + bear2.family + " family is the cunning " + bear2.name
				+ ", which sometimes weighs more than two tons");
		Bear bear3 = new Bear("Bear", "Panda", 12);
		System.out.println(bear3.name + " is yet another animal of the " + bear3.family + " family. This one is "
				+ bear3.age + " years old.");

		System.out.println(
				">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println();

		Dog dog1 = new Dog("Gulttaer");
		System.out.println(dog1.name);
		System.out.println();
		Dog dog2 = new Dog("Cox", "German Shepard");
		System.out.println(dog2.name + " is a " + dog2.classification);
		System.out.println();
		Dog dog3 = new Dog("Rex", "Siberian Husky", 6);
		System.out.println(dog3.name + " is a " + dog3.classification + ". He is " + dog.age + " years old.");
		System.out.println(
				"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();

		Elk elk1 = new Elk("Deer");
		System.out.println(elk1.name + " is not and elk.");
		System.out.println();

		Elk elk2 = new Elk("Antalop", "jungle");
		System.out.println(elk2.name + " could only be found in " + elk2.location);
		System.out.println();

		Elk elk3 = new Elk("Elk ", "North America, Central and East Asia", 13);
		System.out.println(elk3.name + " is also known as wapiti. It could be found in " + elk3.location
				+ ". Its life span is between " + 10 + " to " + elk3.age + " years.");
		System.out.println(
				"********************************************************************************************");
		System.out.println();

		Fox fox1 = new Fox("Fox");
		System.out.println(fox1.name + " is a small mammal animal.");
		System.out.println();

		Fox fox2 = new Fox("Polar Fox", "Snow Fox");
		System.out.println(fox2.name + " is also known as the " + fox2.breed);
		System.out.println();

		Fox fox3 = new Fox("Tibetan Fox", "Tibetan Sand Fox",
				"Tibetan Plateau, Ladakh plateau, Nepal, China and Sikkim plateau.");
		System.out.println(fox3.name + " is also know as " + fox3.breed + ". It could be found in the" + fox3.location);
		System.out.println();

		Fox fox4 = new Fox("Red Fox", "true fox", "Norther Hemisphere, Europe, Asia and Northern Africa", 4);
		System.out.println(fox4.name + " is a mammal animal of the " + fox4.breed + " family. It could be found in the "
				+ fox4.location + " and ages \nup to " + fox4.age + " years in the wild.");
		System.out.println();

		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		System.out.println();

		Goat g1 = new Goat("Boar goat");
		System.out.println("The " + g1.name
				+ " is a breed of goat that was developed in South Africa in the early 1900s and is a popular breed for meat production");
		System.out.println();
		Goat g2 = new Goat("Damascus goat", "Aleppo, Halep, Baladi, Damascene, Shami, or Chami");
		System.out.println(g2.name + " is a breed of the " + g2.breed + " goat.");
		System.out.println();

		Goat g3 = new Goat("The Angora", "Turkish", 10);
		System.out.println(
				g3.name + " is a " + g3.breed + " breed of domesticated goat. It ages up to " + g3.age + " years.");

		System.out.println("****************************************************************************************");
		System.out.println();

		Hotel h1 = new Hotel("JW Marriott");
		System.out.println(h1.name + " is a luxury hotel brand owned by Marriott International");
		System.out.println();

		Hotel h2 = new Hotel("Hyatt Regency", "Dubai");
		System.out.println(h2.name + " hotel is located in Deira, " + h2.city + " in the United Arab Emirates.");
		System.out.println();

		Hotel h3 = new Hotel(h1.name, "Ankara", 300);
		System.out.println(h3.name + " hotel is located in " + h3.city + ", the capital of Turkey. It has " + h3.rooms
				+ " Five Star rooms.");
		System.out.println();

		System.out
				.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println();

		Jungle one = new Jungle("Daintree Rainforest");
		System.out.println(one.name + " is a jungle in Queensland, Australia.");
		System.out.println();

		Jungle two = new Jungle("Crooked Forset", "Poland.");
		System.out.println("The " + two.name
				+ " is a grove of oddly-shaped pine trees located near the town of Gryfino, West Pomerania in "
				+ two.country);
		System.out.println();

		Jungle three = new Jungle("Amazon Rainforest", "Brazil", 2.587);
		System.out.println("The " + three.name + " is located in " + three.country + ". It covers an area of "
				+ three.size + " million square miles.");

		System.out.println(
				")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");
		System.out.println();

		Kiwi fruit = new Kiwi("Kiwifruit");
		System.out.println(fruit.name + ", also known as Chinese gooseberry, is a kind of fruit.");
		System.out.println();

		Kiwi bird = new Kiwi("Kiwi", "New Zealand");
		System.out.println(bird.name + " is the national bird of " + bird.origin);
		System.out.println();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println();

		Lima capital = new Lima("Lima");
		System.out.println(capital.name + " is the capital city of Peru");
		System.out.println();

		Lima city = new Lima("Lima", "USA");
		System.out.println(city.name + " is also the name of a city in the state of Ohio, in " + city.country);
		System.out.println();

		Lima l = new Lima(capital.name, "Peru", 9751717);
		System.out.println(
				l.name + " is the capital city of " + l.country + ". It has a population of " + l.population + ".");
		System.out.println();
		System.out.println("****************************************************************************************");
		System.out.println();

		Motor m1 = new Motor("Toyota");
		System.out.println(m1.make + " is a leading motor corporation based in Japan");
		System.out.println();

		Motor m2 = new Motor("Lexus", "UX");
		System.out.println(m2.model + " is a luxury " + m2.make + " compact Hybrid SUV.");
		System.out.println();

		Motor m3 = new Motor(m2.make, "LX", 2021);
		System.out.println("The " + m3.yearMade + " " + m3.model
				+ " is the latest variant of the largest SUV produced by the luxury brand " + m2.make + ".");

		System.out.println("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		System.out.println();

		Nissan n1 = new Nissan("Armada");
		System.out.println(n1.model + " is the larges SUV produced by the car manufacturer Nissan.");
		System.out.println();

		Nissan n2 = new Nissan("Titan", "Double Cab");
		System.out.println("The " + n2.model + " " + n2.variant
				+ " is the larges pickup truck produced by the Japanese car manufacturer Nissan");
		System.out.println();

		Nissan n3 = new Nissan(n2.model, n2.variant, 6);
		System.out.println("The Nissan " + n2.model + " " + n2.variant + " has a full capacity of " + n3.capacity
				+ " people in the cab.");
		System.out.println();
		System.out.println("*****************************************************************************************");
		System.out.println();

		Orphanage o1 = new Orphanage("Kalampour");
		System.out.println(o1.name + " is one of the few orphanages in the state run by a charity.");
		System.out.println();

		Orphanage o2 = new Orphanage("Parwarish Gah-e-Watan", "Kabul");
		System.out.println(o2.name + " was the only government run orphanage in " + o2.location
				+ " before the civil war started.");
		System.out.println();

		Orphanage o3 = new Orphanage(o2.name, o2.location, 500);
		System.out.println(o2.name + " was the only state run orphanage in " + o2.location
				+ " until 1992 when the civil war broke out. It was home to " + o3.capacity + " orphans.");
		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println();

		Project p1 = new Project("\"Operation Condor\"");
		System.out.println(p1.name + " is the name of a movie.");
		System.out.println();

		Project p2 = new Project("\"Nightfall\"", "Facebook");
		System.out.println("Project " + p2.name + " is a social media page on " + p2.location);
		System.out.println();

		Project p3 = new Project("\"Wrath of Man\"", "Chicago", 967);
		System.out.println("The movie " + p3.name + " was filmed in " + p3.location + " the total budget of which was $"
				+ p3.budget + " million.");

		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();

		Quadcopter q1 = new Quadcopter("EXO Blackhawk");
		System.out.println(q1.brand + " is a brand of quadcopter drone.");
		System.out.println();

		Quadcopter q2 = new Quadcopter(q1.brand, "7.6V 3400mah");
		System.out.println("I hope the " + q2.batteryType + " battery that I have ordered fits my " + q2.brand
				+ " quadcopter drone.");
		System.out.println();

		Quadcopter q3 = new Quadcopter(q1.brand, q2.batteryType, 2);
		System.out.println(
				"My " + q3.brand + " quadcopter drone uses " + q3.batteries + " " + q3.batteryType + " batteries.");
		System.out.println();
		System.out
				.println("******************************************************************************************");
		System.out.println();

		Road r1 = new Road("Fruitridge");
		System.out.println(r1.name + " road stritches between south Sacramento and Florin.");
		System.out.println();

		Road r2 = new Road("El Camino", "Fair Oaks Blvd in Carmichael");
		System.out.println(r2.name + " Ave's starting point is on " + r2.startingPoint);
		System.out.println();

		Road r3 = new Road("US 50 west bound", "Eldorado County", "Sacramento");
		System.out.println("The " + r3.name + " freeway starts in " + r3.startingPoint + " and ends near downtown "
				+ r3.endingPoint);
		System.out.println();

		Road r4 = new Road("I-80 east bound", "San Francisco", "Teaneck, New Jersey", 2900);
		System.out.println(r4.name + " freeway is an transcontinental highway which striches \nfrom " + r4.startingPoint
				+ " all the way to " + r4.endingPoint + ", the total length of which is " + r4.length + " miles.");
		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();

		Sport s1 = new Sport("Running");
		System.out.println(s1.name + " is a very hard sport.");
		System.out.println();

		Sport s2 = new Sport("Soccer", "group sport");
		System.out.println(s2.name + " is a type of " + s2.type);
		System.out.println();

		Sport s3 = new Sport("Cricket", s2.type, 11);
		System.out.println(s3.name + " is also a " + s3.type + " each team of which has " + s3.players + " players");
		System.out.println();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();

		Truck t1 = new Truck("International");
		System.out.println(t1.name + " is a brand of heavy commercial trucks.");
		System.out.println();

		Truck t2 = new Truck("Peterbilt", "semi trucks");
		System.out.println(t2.name + " is a prestigeous brand of heavy " + t2.type);
		System.out.println();

		Truck t3 = new Truck("Toyota Tundra", "heavy duty pick-up", 381);
		System.out.println(
				t3.name + " is a very reliable " + t3.type + " truck that has " + t3.horsepower + " horsepower.");
		System.out.println();
		System.out.println("??????????????????????????????????????????????????????????????????????????????????????");
		System.out.println();

		Uniform u1 = new Uniform("Security");
		System.out.println(u1.name);
		System.out.println();

		Uniform u2 = new Uniform("ACU", "military");
		System.out.println(u2.name
				+ " stands for Army Combat Uniform. It is was the primary uniform of \nthe US Army, a branch of the US "
				+ u2.type + " until a different was introduced in 2010");
		System.out.println();
		System.out.println(
				"______________________________________________________________________________________________");
		System.out.println();

		Vehicle vic1 = new Vehicle("Subaru");
		System.out.println(vic1.make);
		System.out.println();

		Vehicle vic2 = new Vehicle("Toyota", "Matrix");
		System.out.println(vic2.model + " is a discontinued model of the famous car brand " + vic2.make);
		System.out.println();

		Vehicle vic3 = new Vehicle("UAZ", "UAZ Hunter", "Civilian");
		System.out.println(vic3.model + " is the " + vic3.type
				+ " variant of the UAZ 469 Russian Military jeep manufactured by " + vic3.make);
		System.out.println();

		Vehicle vic4 = new Vehicle("Toyota", "Land Cruiser GXL 70", "Off-Road", 6);
		System.out.println("The " + vic4.model + " 6X6 is the most recent " + vic4.type
				+ " truck that has been produced in limited numbers \nsince 2019 by " + vic4.make
				+ " Motors Incorporation. The vechicle has " + vic4.wheels + " wheels.");
		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println();

		Woman w1 = new Woman("Zuhal");
		System.out.println(w1.name + " is my classmate.");
		System.out.println();

		Woman w2 = new Woman("Jane", "Teacher");
		System.out.println(w2.name + " is a " + w2.occupation + " in my children's school.");
		System.out.println();

		Woman w3 = new Woman(w2.name, "teaches", 27);
		System.out.println(
				w2.name + " is a " + w3.age + " years old. She " + w3.occupation + " geography in my kids' school.");
		System.out.println();

		Woman w4 = new Woman("Catherine", "banker", 28, 4800);
		System.out.println(w4.name + " is " + w4.age + " years old. She works as a " + w4.occupation
				+ " \nin a local bank and gets paid $" + w4.salary + " on a monthly basis.");
		System.out.println();
		System.out.println("_______________________________________________________________________");
		System.out.println();

		Xmen man1 = new Xmen("Michael Fassbender");
		System.out.println(man1.cast);
		System.out.println();

		Xmen man2 = new Xmen(man1.cast, "Magneto");
		System.out.println(man2.cast + " plays the role of " + man2.character + " in the X-Men Movie franchise.");

	}

}
