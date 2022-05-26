package JavaBasicsPackage;

public class Lesson04LogicalGates {

	public static void main(String[] args) {

		int grade = 60;
		double attendancePercent = 0.5;
		boolean isOpen = true;

		if (!isOpen) {

		}

		if (!(!(grade >= 60) && !(attendancePercent > 0.7))) {
			System.out.println("Pass");
		}

		double money = 235;
		boolean tintShopIsOpen = true;

		if (!(!(money >= 200) && !(!(tintShopIsOpen)))) {
			System.out.println("I can go and tint my cars windows.\n");
		} else {
			System.out.println("I will have to do the tinting on my own.\n");
		}

		boolean enoughGas = true;
		boolean flatTire = true;

		if (!(!(enoughGas) && !(flatTire))) {
			System.out.println("I would not be able to travel.\n");
		} else {
			System.out.println("I will hit the road for a road-trip.\n");
		}

		double price = 20000;
		boolean situationGetsBetter = false;

		if (price <= 200000 && situationGetsBetter) {
			System.out.println("I will buy some property in Afghanistan.\n");
		} else if ((price > 200000) || !situationGetsBetter) {
			System.out.println("I will not buy any property in Afghanistan.\n");
		}

		int daysPassed = 18;
		boolean vinegerHasNotLeakedOut = false;

		if (vinegerHasNotLeakedOut && daysPassed >= 25) {
			System.out.println("The pickles might be ready.\n");
		} else if (!vinegerHasNotLeakedOut && daysPassed >= 25) {
			System.out.println("The pickles are probably rotten.\n");
		} else if (vinegerHasNotLeakedOut && daysPassed < 25) {
			System.out.println("The pickles are probably not ready yet.\n");
		} else if (!(!vinegerHasNotLeakedOut) && daysPassed < 25) {
			System.out.println("We need to refill the vinegar to make sure the pickles are ready on time.\n");
		} else {
			System.out.println("We need to make some pickles coz non exists at the moment.\n");
		}

		boolean myFootHurts = true;
		boolean iHaveAPairOfSneakers = true;
		boolean raining = false;

		if (!myFootHurts && iHaveAPairOfSneakers && !raining) {
			System.out.println("I will go hiking.\n");
		} else if (!(!myFootHurts && iHaveAPairOfSneakers) && !raining) {
			System.out.println("I will use the treadmill home to run rather than go out and get soaked.\n");
		} else if (!myFootHurts && !iHaveAPairOfSneakers && !raining) {
			System.out.println("I will put on my shoes and go out for a walk in the park.\n");
		} else if ((myFootHurts && iHaveAPairOfSneakers) && raining) {
			System.out.println("I better stay home and rest.\n");
		}

		boolean a = true;
		boolean b = false;

		if (a == b) {
			System.out.println("\"a\" is equal to \"b\".\n");
		} else {
			System.out.println("\"a\" is not equal to \"b\".\n");
		}

		boolean isRaining = true;
		double tempreture = 55;
		int wind = 15;

		if (isRaining && tempreture > 60) {
			System.out.println("It is raining but the tempreture is fine.\n");
		} else if (!isRaining && tempreture > 20) {
			System.out.println("Don't need the umbrella, but it is windy.\n");
		} else if (isRaining && tempreture < 20 && wind > 20) {
			System.out.println("Stay, inside, not a good a day.\n");
		} else {
			System.out.println("Non of the conditions evaluate to true and that is why nothing shows up on console.\n");
		}

		double weight = 56.7;
		boolean scaleIsWorkingProperly = false;

		if (weight >= 60.6 && scaleIsWorkingProperly == true) {
			System.out.println("The scale works properly but.\n this item weighs 60.6 punds.\n");
		} else if (weight >= 60.6 && !scaleIsWorkingProperly == true) {
			System.out.println("The scale is not working properly and I am not sure if 60.6 is the correct weight");
		} else if (weight >= 50 && scaleIsWorkingProperly == true) {
			System.out.println("The item weighs 56.7 pounds but I am not sure if the scale is working properly.\n");
		} else if (weight >= 50 && scaleIsWorkingProperly == false) {
			System.out.println("I think the scale is acting up and I am not sure if the weight indicator"
					+ " is showing the right weight.\n");
		} else {
			System.out.println(
					"The scale is broken. We have to fix it before we get into some" + " hot water with a customer.\n");
		}

		boolean isSnowing = true;
		boolean iHaveACoat = true;
		boolean groundIsFrozen = false;

		if (isSnowing && iHaveACoat && groundIsFrozen) {
			System.out.println("I will go out but will not engage in a snow fight.\n");
		} else if (isSnowing && iHaveACoat && !groundIsFrozen) {
			System.out.println("I will go out and do snow-ball fighting with my friends.\n");
		} else if (!isSnowing && iHaveACoat && groundIsFrozen) {
			System.out.println("I will go put on my ice-breaker shes and go out for a walk.\n");
		} else if (isSnowing && !iHaveACoat && groundIsFrozen) {
			System.out.println("I will stay home and sit by the fireplace.\n");
		} else {
			System.out.println("I will stay put and play cards with my buddies.\n");
		}

		boolean highwayIsFrozen = false;
		boolean myCarHasChains = false;
		boolean myCarHasAntiFreeze = true;

		if (highwayIsFrozen && myCarHasChains && myCarHasAntiFreeze) {
			System.out.println("We will still drive to Lake Tahoe.\n");
		} else if (!highwayIsFrozen && myCarHasChains && myCarHasAntiFreeze) {
			System.out.println("We will go to Lake Tahoe to get a ride on the cable car.\n");
		} else if (!highwayIsFrozen && !myCarHasChains && myCarHasAntiFreeze) {
			System.out.println("I will instead go somewhere with no freezing tempreture.\n");
		} else if (highwayIsFrozen && !myCarHasChains && !myCarHasAntiFreeze) {
			System.out.println("I will go to Twin Peaks in San Francisco instead.\n");
		} else {
			System.out.println("I will stay home and maybe watch a movie.\n");
		}

		double enoughFuel = 15.9;
		double distance = 189.4;
		boolean myCarStarts = true;

		if (!(enoughFuel >= 15.9) && distance >= 200 && myCarStarts) {
			System.out.println("I might probaby have to refuel after an hour.\n");
		} else if (enoughFuel >= 15.9 && !(distance >= 200) && !myCarStarts) {
			System.out.println("I might not need to refuel in the middle of my trip.\n");
		} else if (enoughFuel >= 15.9 && distance <= 200 && !myCarStarts) {
			System.out.println("I first neet to make sure my car strts.\n");
		} else {
			System.out.println("I won`t be able to travel.\n");
		}

		int vehiclesSold = 50;
		double profitMade = 34500;
		boolean endOfTheMonth = true;

		if (vehiclesSold < 50 && profitMade < 30000 && endOfTheMonth) {
			System.out.println("We have not sold enough cars this month. Nobody gets a bonus.\n");
		} else if (vehiclesSold >= 50 && profitMade < 30000 && endOfTheMonth) {
			System.out.println("Only those agents will get a bonus who have worked hard to earn it.\n");
		} else if (vehiclesSold <= 50 && profitMade >= 35000 && !endOfTheMonth) {
			System.out.println("Everybody will get a bonus.\n");
		} else if (vehiclesSold >= 50 && profitMade >= 34500 && endOfTheMonth) {
			System.out.println("Everyone will still get a bonus despite barely missing the monthly target.\n");
		} else {
			System.out.println("Everyone should work hard so we can sell more cars this month.\n");
		}

		int scores = 75;

		if (scores <= 90) {
			System.out.println("The student has got an \"A\".\n");
		} else if (scores <= 89 && scores >= 80) {
			System.out.println("The student has got a \"B\".\n");
		} else if (scores <= 79 && scores >= 70) {
			System.out.println("The student has got a \"C\".\n");
		} else if (scores <= 69 && scores >= 60) {
			System.out.println("The student has got a \"D\".\n");
		} else {
			System.out.println("The student has failed, call his parents!\n");
		}

		int serviceRecords = 22;

		if (serviceRecords <= 25 || serviceRecords >= 20) {
			System.out.println("The vehicle was well maintained.\n");
		} else if (serviceRecords <= 19 || serviceRecords >= 15) {
			System.out.println("The vehicle was maintained regularly.\n");
		} else if (serviceRecords <= 14 || serviceRecords >= 10) {
			System.out.println("The vehicle service history is partial.\n");
		} else if (serviceRecords <= 9 || serviceRecords >= 5) {
			System.out.println("The vehicle was badly maintained. Or maybe, the owner himself changed the oil.\n");
		} else {
			System.out
					.println("The vehicle's service history is inconsestant. Maybe the odometer was tempered with.\n");
		}

		boolean iHaveMoney = true;
		boolean myFriendHasMoney = false;
		boolean restaurantIsOpen = true;

		if (!(iHaveMoney || !myFriendHasMoney) && restaurantIsOpen) {
			System.out.println("We won't be able to dine at the restaurant.\n");
		} else if (iHaveMoney || !myFriendHasMoney && !restaurantIsOpen) {
			System.out.println("We still won't be able to dine at the restaurant."
					+ " Instead, we will have to order something using UberEat.\n");
		} else if (iHaveMoney && !myFriendHasMoney && restaurantIsOpen) {
			System.out.println("We will not only dine at the restaurant but we will also get some icecream.\n");
		} else if ((iHaveMoney || !myFriendHasMoney) && restaurantIsOpen) {
			System.out.println("We will go out and dine at the restaurant in downtown.\n");
		} else {
			System.out.println("We will both stay home and cook something instead.\n");
		}

		String month = "August";

		if (month.contains("Jan")) {
			System.out.println("This is the month of \"January\".\n");
		} else if (month.contains("Feb")) {
			System.out.println("This is the month of \"February\".\n");
		} else if (month.contains("Mar")) {
			System.out.println("This is the month of \"March\".\n");
		} else if (month.contains("Apr")) {
			System.out.println("This is the month of\"April\".\n");
		} else if (month.contains("May")) {
			System.out.println("This is the month of \"May\".\n");
		} else if (month.contains("Jun")) {
			System.out.println("This is the month of \"June\".\n");
		} else if (month.contains("Jul")) {
			System.out.println("This is the month of \"July\".\n");
		} else if (month.contains("Aug")) {
			System.out.println("This is the month of \"August\".\n");
		} else if (month.contains("Sep")) {
			System.out.println("This is the month of \"September\".\n");
		} else if (month.contains("Oct")) {
			System.out.println("This is the month of \"October\".\n");
		} else if (month.contains("Nov")) {
			System.out.println("This is the month of \"November.\n");
		} else {
			System.out.println("This is the month of \"December\".\n");
		}

		String today = "Thursday";

		if (today.contains("Sat")) {
			System.out.println("Today is \"Staurday\".\n");
		} else if (today.contains("Sun")) {
			System.out.println("Today is \"Sunday\".\n");
		} else if (today.contains("Mon")) {
			System.out.println("Today is \"Monday\".\n");
		} else if (today.contains("Tu")) {
			System.out.println("Today is \"Tuesday\".\n");
		} else if (today.contains("Wed")) {
			System.out.println("Today is \"Wednesday\".\n");
		} else if (today.contains("Thu")) {
			System.out.println("Today is \"Thursday\".\n");
		} else {
			System.out.println("Today is \"Friday\".\n");
		}

		String truck = "Kenworth";
		truck = "Freightliner";
		truck = "Volvo";

		if (truck.contains("Fr")) {
			System.out.println("Freightliner\n");
		} else if (truck.contains("Vo")) {
			System.out.println("Volvo\n");
		} else if (truck.contains("Int")) {
			System.out.println("International\n");
		} else if (truck.contains("Ken")) {
			System.out.println("Kenworth\n");
		} else if (truck.contains("Ma")) {
			System.out.println("Mack\n");
		} else if (truck.contains("Pet")) {
			System.out.println("Peterbilt\n");
		} else if (truck.contains("Hi")) {
			System.out.println("Hino\n");
		} else {
			System.out.println("The system could not find the brand of the truck you are looking for.\n");
		}

		boolean correctUsername = true;
		boolean correctPassword = true;
		double currentBalance = 19600;

		if (!correctUsername && correctPassword && currentBalance >= 19600) {
			System.out.println("You entered the wrong username. Please enter the correct username and try again.\n");
		} else if (correctUsername && !correctPassword && currentBalance >= 19600) {
			System.out.println("You entered the wrong password. Please enter the correct password and try again.\n ");
		} else if ((!correctUsername || !correctPassword) && currentBalance >= 19600) {
			System.out.println("You entered wrong credintials. Please enter correct credintials and try again.\n");
		} else if (correctUsername && correctPassword && currentBalance < 19600) {
			System.out.println(
					"Welcome to AIB online banking. You don`t have enough balance to make this transaction.\n");
		} else {
			System.out.println("Welcome to AIB online banking. Your current balance is " + currentBalance + "\n");
		}

		String name = "Asadullah ";
		String lastName = "Babakarkhil ";
		String street = "2345 Watt Ava ";
		String city = "Elk Grove ";
		String state = "CA ";
		int zipCode = 76573;

		System.out.println(name + lastName + street + city + state + zipCode + "\n");

		double cardBalance = 567;
		boolean costcoWholesaleIsOpen = true;
		boolean costcoAcceptsEBT = true;

		if (!(cardBalance >= 567) && costcoWholesaleIsOpen && costcoAcceptsEBT) {
			System.out.println("Instead of going to Costco, I will go to WinCo Foods.\n");
		} else if (cardBalance >= 567 && !costcoWholesaleIsOpen && costcoAcceptsEBT) {
			System.out.println("I will wait at the parking lot till Costco opens.\n");
		} else if (cardBalance >= 567 && (!costcoWholesaleIsOpen || !costcoAcceptsEBT)) {
			System.out.println(
					"I might have to wait for Costco to open and then get a membership car to be able to shop.\n");
		} else {
			System.out.println("I will start shopping as soon as Costco opens.\n");
		}

	}

}
