package JavaBasicsPackage;

public class Lesson8ForLoop {

	public static void main(String[] args) {

		// The flow of execution of the for loop is as follows:
		// We start with the word "for" followed by (), followed by {}
		// Then we initialize the counter.
		// After that, we evaluate the condition of the loop. If it is true,
		// then we execute the body of the loop and we update our counter.
		// We again evaluate our condition. If true, we execute the body of
		// the loop and we then update our counter ..........
		// ==> initialization ==> evaluating the condition ==> execution of the body of
		// the loop (if true)
		// ==> updating the counter ==> evaluating the condition ==> execution of the
		// body of the loop (if true)
		// ==> updating the counter ...................... until the condition turns
		// false and we get out of the loop.

		for (int i = 0; i < 10; ++i) {
			System.out.println("i is " + i);
		}

		for (int j = 0; j <= 10; j++) {
			if (j % 2 == 0) {
				System.out.println(j + " is an even number.\n");
			} else {
				System.out.println(j + " is an odd number.\n");
			}

		}

		for (int k = 0; k < 10 && k > 5; k++) {
			System.out.println(k);

		}

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
		}

		System.out.println();
		System.out.println("End of the class.");

		int a = 234;
		for (int index = a; index >= 1; index--) {
			System.out.println("The value of index is " + a-- + " on this iteration.\n");
		}

		int b = 345;
		for (int jack = b; jack >= 10; jack--) {
			System.out.println("The value of jack is " + jack + " on this iteration.\n");
		}

		int c = 11;
		for (int index = c; index <= 500; index++) {
			System.out.println("The value of index is " + index + " on this iteration.\n");
		}

		int d = 500;
		for (int myNumber = d; myNumber >= 15; myNumber--) {
			System.out.println("The value of my number is " + myNumber + " on this iteration.\n");
		}

		int e = 3;
		for (int dr = e; dr <= 20; dr++) {
			System.out.println("This time the doctor saw his " + dr + "th patient.\n");
		}

		int f = 989;
		for (int dishes = f; dishes >= 15; dishes--) {
			if (dishes > 15) {
				System.out.println("All of the dishes were washed except " + dishes);
			} else {
				System.out.println("A total of " + dishes + " remain unfinished. We will wash them tomorrow.\n");
			}

		}

		int g = 89;
		for (int kites = g; kites <= 100; kites++) {
			if (kites < 100) {
				System.out
						.println("We have so far prepared " + kites + " kites. We have to reach the 100 kites goal.\n");
			} else {
				System.out.println("We accomplished our daily target and prepared a total of " + kites + " kites.");
			}
		}

		int h = 12;
		for (int carsToBeWashed = h; carsToBeWashed >= 0; carsToBeWashed--) {
			if (carsToBeWashed > 1) {
				System.out
						.println("There are still " + carsToBeWashed + " cars left. We have to finish all of them.\n");
			} else if (carsToBeWashed == 1) {
				System.out.println(
						"There is still " + carsToBeWashed + " car left. We have to finish that one as well.\n");
			} else {
				System.out.println("There is " + carsToBeWashed + " car left. Great job guys.\n");
			}
		}

		int i = 456;
		for (int carsToBeSold = i; carsToBeSold >= 5; carsToBeSold--) {
			if (carsToBeSold >= 11) {
				System.out.println("We have so far sold " + carsToBeSold
						+ " cars so far. Still time to reach the monthly goal.\n");
			} else if (carsToBeSold == 5) {
				System.out.println("We crossed last month's target and sold more cars this moneth. There is only "
						+ carsToBeSold + " cars left in our inventory.\n");
			} else {
				System.out.println("Great job guys! There is only " + carsToBeSold + " left on the lot.\n");
			}
		}

		int j = 23;
		for (int bread = j; bread <= 50; bread++) {
			if (bread < 39) {
				System.out.println("We still need to bake 11 more loaves of bread.\n");
			} else if (bread <= 50) {
				System.out.println("We baked all " + bread + " loaves of bread the customer needed.\n");
			} else {
				System.out.println("Keep baking till all of the " + bread + " loaves of bread is baked.\n");
			}
		}

		int k = 789;
		for (int pairShoes = k; pairShoes >= 12; pairShoes--) {
			System.out.println("A total of " + pairShoes + " is left to be packed.\n");
		}

		int l = 9;
		for (int keys = l; keys <= 500; keys++) {
			if (keys <= 400) {
				System.out.println("This is how many keys we have made: " + keys + " \n");
			} else if (keys <= 450) {
				System.out.println("We have so far mede " + keys + " keys.\n");
			} else if (keys > 450 && keys < 500) {
				System.out.println(
						"This range of keys is between 451 & 499, is it? " + keys + " is between that range.\n");
			} else {
				System.out.println("We have made all " + keys + " keys.\n");
			}
		}

		int m = 50;
		for (int boolani = m; boolani >= 15; boolani--) {
			if (boolani < 50 && boolani > 40) {
				System.out.println("Take " + boolani + " boolani to Noor Agha, Samim & Reshad's houses.\n");
			} else if (boolani == 40 && boolani == 31) {
				System.out.println("Take " + boolani + " boolani to Noor Agha and Reshad's houses.\n");
			} else if (boolani < 31 && boolani > 20) {
				System.out.println("Take the " + boolani + " boolani to Noor Agha's house.\n");
			} else {
				System.out.println(
						"Don`t take any more boolani anywhere else since these is only " + boolani + " left for us.\n");
			}
		}

		int n = -123;
		for (int feet = n; feet <= 22; feet++) {
			if (feet < 0) {
				System.out.println("We have have " + feet + " left to reach the surface.\n");
			} else if (feet == 0) {
				System.out.println("We have just reached the surface.\n");
			} else {
				System.out.println("We have made " + feet + " progress so far.\n");
			}
		}

		int o = 9869;
		for (int bricks = o; bricks >= 0; bricks--) {
			if (bricks > 0) {
				System.out.println("This is how many bricks are left to be taken to the factory: " + bricks + "\n");
			} else {
				System.out.println("No more bricks left to be taken to the factory.\n");
			}
		}

		int p = 1;
		for (int booksRead = p; booksRead <= 20; booksRead++) {
			if (booksRead <= 5) {
				System.out.println("I have read " + booksRead + " books so far.\n");
			} else if (booksRead > 5 && booksRead <= 10) {
				System.out.println("I have read this many books so far: " + booksRead + "\n");
			} else if (booksRead > 10 && booksRead < 20) {
				System.out.println("I have read " + booksRead + " books so far.\n");
			} else {
				System.out.println(
						"I have finished reading all of the books. In total, I read " + booksRead + " books.\n");
			}
		}

		int q = 1234;
		for (int carsWashed = q; carsWashed >= 0; carsWashed--) {
			if (carsWashed <= 500) {
				System.out.println("A total of " + carsWashed + " cars are due for a wash.\n");
			} else if (carsWashed > 500 && carsWashed <= 1000) {
				System.out.println(
						"We washed the rest, this is how many cars are still due for washing: " + carsWashed + "\n");
			} else if (carsWashed > 1000 && carsWashed < 1234) {
				System.out.println("We just finished our first wash of the month. " + carsWashed + " more to go.\n");
			} else {
				System.out.println("We have not even washed a single car since the begining of the week. This means "
						+ carsWashed + " cars washed.\n");
			}
		}

		int r = 0;
		for (int paintJob = r; paintJob <= 25; paintJob++) {
			if (paintJob >= 0 && paintJob <= 10) {
				System.out.println("We have painted " + paintJob + " cars so far.\n");
			} else if (paintJob > 10 && paintJob <= 15) {
				System.out.println("We painted " + paintJob + " cars.\n");
			} else {
				System.out.println("This is how many cars have been painted so far: " + paintJob + "\n");
			}
		}

		int s = 567;
		for (int runs = s; runs >= 0; runs--) {
			if (runs <= 450 && runs >= 301) {
				System.out.println(runs + " more runs to level the match.\n");
			} else if (runs <= 300 && runs >= 201) {
				System.out.println(runs + " more runs to level the game.\n");
			} else if (runs <= 200 && runs >= 2) {
				System.out.println("We trail by " + runs + " more runs to level the this match.\n");
			} else if (runs == 1) {
				System.out.println("We need " + runs + " more run to level the match.\n");
			} else {
				System.out.println("Congratulations boys! We leveled the match.\n");
			}
		}

		int t = 0;
		for (int runsToWin = t; runsToWin <= 301; runsToWin++) {
			if (runsToWin > 50 && runsToWin < 100) {
				System.out
						.println("We can't afford to lose more than one batsman with " + runsToWin + " runs to win.\n");
			} else if (runsToWin >= 100 && runsToWin < 150) {
				System.out
						.println("We still have to keep adding to the existing " + runsToWin + " on the scoreboard.\n");
			} else if (runsToWin >= 150 && runsToWin < 200) {
				System.out.println(" Keep adding to the " + runsToWin + " score on the board.\n");
			} else if (runsToWin >= 200 && runsToWin < 250) {
				System.out.println("It is drinks break. CSK has scored " + runsToWin + " so far.\n");
			} else if (runsToWin >= 251 && runsToWin <= 300) {
				for (int temp = 50; temp <= 1; temp--)
					System.out.println("CSK scored " + runsToWin + " runs and require just " + temp + "to win.\n");
			} else if (runsToWin == 301) {
				System.out.println("CSK won the game and scored " + runsToWin + " runs in their chase against RCB.\n");
			}
		}

		int u = 456;
		for (int bottlesToBeRecycled = u; bottlesToBeRecycled >= 0; bottlesToBeRecycled--) {
			if (bottlesToBeRecycled >= 350 && bottlesToBeRecycled <= 400) {
				System.out.println("This is how many bottles are due for recycling: " + bottlesToBeRecycled + "\n");
			} else if (bottlesToBeRecycled >= 250 && bottlesToBeRecycled <= 349) {
				System.out.println("The currect number of bottles due for recycling is: " + bottlesToBeRecycled + "\n");
			} else if (bottlesToBeRecycled >= 150 && bottlesToBeRecycled <= 249) {
				System.out.println("There now just " + bottlesToBeRecycled + " left to be recycled.\n");
			} else if (bottlesToBeRecycled >= 50 && bottlesToBeRecycled <= 140) {
				System.out.println(bottlesToBeRecycled + " bottles are all that is left of the initial " + u);
			} else if (bottlesToBeRecycled > 1 && bottlesToBeRecycled <= 49) {
				System.out.println("Total number of bottles left for recycling: " + bottlesToBeRecycled + "\n");
			} else if (bottlesToBeRecycled == 1) {
				System.out.println("There is just " + bottlesToBeRecycled + " bottle left for recycling.\n");
			} else {
				System.out.println("All done!");
			}
		}

		int v = 30;
		for (int runs = v; runs <= 450; runs++) {
			if (runs >= 50 && runs <= 99) {
				System.out.println("The team scored " + runs + " and lost " + 1 + " wicket.\n");
			} else if (runs >= 100 && runs <= 149) {
				System.out.println("The team lost its " + 2 + "nd wicket after " + 1
						+ "st powerplay. The current score is " + runs + "\n");
			} else if (runs >= 150 && runs <= 249) {
				System.out
						.println("This is the current score " + runs + ". The team has lost its " + 3 + "rd wicket.\n");
			} else if (runs >= 250 && runs <= 400) {
				System.out.println("The current score is: " + runs + "\n");
			} else if (runs >= 401 && runs <= 449) {
				System.out.println("The team lost its " + 4 + "th wicket but the current score is: " + runs + "\n");
			} else {
				System.out.println("The current score is " + runs + ". The team won the match.\n");
			}
		}

		int w = 50;
		int w1 = 0;
		for (int dishes = w; dishes >= 0; dishes--) {
			if (dishes <= 50 && dishes >= 41) {
				System.out.println(
						"We washed " + (w1++) + " dishes. The number of dishes yet to be washed is: " + dishes + "\n");
			} else if (dishes <= 40 && dishes >= 31) {
				System.out.println("Total number of dishes washed : " + (w1++)
						+ " Total number of dishes yet to be washed: " + dishes + "\n");
			} else if (dishes <= 30 && dishes >= 21) {
				System.out.println("I have, so far, washed " + (w1++) + " dishes. There are still " + dishes
						+ " left unwashed.\n");
			} else if (dishes <= 20 && dishes >= 11) {
				System.out.println("Washed dishes: " + (w1++) + " Unwashed dishes: " + dishes + "\n");
			} else if (dishes <= 10 && dishes >= 1) {
				System.out.println("Total number of dishses washed: " + (w1++) + " Total number of dishes unwashed: "
						+ dishes + "\n");
			} else {
				System.out.println("All of the dishes were washed.\n");
			}
		}

		int x = 0;
		int x1 = 500;
		for (int carsSold = x; carsSold <= 500; carsSold++) {
			if (carsSold >= 0 && carsSold <= 100) {
				System.out.println(
						"We sold " + carsSold + " cars but there are still about " + x1-- + " remaining on the lot.\n");
			} else if (carsSold >= 101 && carsSold <= 200) {
				System.out.println("A total of " + carsSold + " cars were sold this week. There still " + x1--
						+ " reamining on the inventory.\n");
			} else if (carsSold >= 201 && carsSold <= 300) {
				System.out.println(
						"Number of sold cars: " + carsSold + " Number of cars remaining on the lot: " + x1-- + "\n");
			} else if (carsSold >= 301 && carsSold <= 400) {
				System.out.println("This is how many we have sold so far: " + carsSold
						+ " and this is how many are yet to be sold: " + x1-- + "\n");
			} else if (carsSold >= 401 && carsSold <= 499) {
				System.out.println("We sold all " + carsSold + " cars but " + x1-- + "\n");
			} else {
				System.out.println("We sold all of the cars.\n");
			}
		}

		int y = 123;
		int y1 = 0;
		for (int flowersToBePicked = y; flowersToBePicked >= 0; flowersToBePicked--) {
			if (flowersToBePicked <= 23 && flowersToBePicked >= 1) {
				System.out.println("Number of flowers picked: " + y1++ + " - Number of flowers yet to be picked: "
						+ flowersToBePicked + "\n");
			} else if (flowersToBePicked <= 73 && flowersToBePicked >= 24) {
				System.out.println("This is how many flowers were picked: " + y1++
						+ " - This is the number of flowers yet to be picked: " + flowersToBePicked + "\n");
			} else if (flowersToBePicked <= 100 && flowersToBePicked >= 74) {
				System.out.println("We picked " + y1++ + " flowers but still have to pick " + flowersToBePicked + "\n");
			} else if (flowersToBePicked <= 122 && flowersToBePicked >= 101) {
				System.out.println("We picked all " + y1++ + " but " + flowersToBePicked + "\n");
			} else {
				System.out.println("All of the " + y1++ + " flowers have been picked up.\n");
			}
		}

		int z = 0;
		int z1 = 123;
		for (int plantsSold = z; plantsSold <= 123; plantsSold++) {
			if (plantsSold >= 0 && plantsSold <= 20) {
				System.out.println("I have sold " + plantsSold + " and I yet to sell " + z1-- + "\n");
			} else if (plantsSold >= 21 && plantsSold <= 40) {
				System.out.println("This is how many plants is have sold: " + plantsSold
						+ " and this is the number of plants that remain: " + z1-- + "\n");
			} else if (plantsSold >= 41 && plantsSold <= 60) {
				System.out.println("Sold: " + plantsSold + " - Yet to be sold: " + z1-- + "\n");
			} else if (plantsSold >= 61 && plantsSold <= 80) {
				System.out.println("Kharts: " + plantsSold + " - Pata: " + z1-- + "\n");
			} else if (plantsSold >= 81 && plantsSold <= 100) {
				System.out.println(
						"All the plants I have sold: " + plantsSold + " - Plants yet to be sold: " + z1-- + "\n");
			} else if (plantsSold >= 101 && plantsSold <= 122) {
				System.out.println("I sold all " + plantsSold + " plants except just " + z1-- + "\n");
			} else {
				System.out.println("This is the total number of the plants I sold this week: " + plantsSold + "\n");
			}
		}

	}
}
