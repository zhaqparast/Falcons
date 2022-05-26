package JavaLAb;

public class MultiDimensionArrays {

	public static void main(String[] args) {

		int[] oneD = new int[10];
		oneD[0] = 23;
		oneD[1] = 34;
		oneD[2] = 45;
		oneD[3] = 56;
		oneD[4] = 67;
		oneD[5] = 78;
		oneD[6] = 89;
		oneD[7] = 90;
		oneD[8] = 10;
		oneD[9] = 12;

		for (int i = 0; i < oneD.length; i++) {
			System.out.print(oneD[i] + ", ");
		}
		System.out.println();

		int[][] twoD = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int[][][] threeD = new int[3][4][6];

		String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

		for (int row = 0; row < days.length; row++) {
			System.out.print(days[row] + ", ");
		}
		System.out.println();
		System.out.println();

		if (days[0] == "Saturday") {
			System.out.println("Today is " + days[0] + ", the 16th of July");
		} else if (days[1] == "Sunday") {
			System.out.println("Today is " + days[1] + ", the 17th of July");
		} else if (days[2] == "Monday") {
			System.out.println("Today is " + days[2] + ", the 18th of July");
		} else if (days[3] == "Tuesday") {
			System.out.println("Today is " + days[3] + ", the 19th of July");
		} else if (days[4] == "Wednesday") {
			System.out.println("Today is" + days[4] + ", the 20th of July");
		} else {
			System.out.println("Today is neither Thursday nor Friday");
		}

		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}
		System.out.println();

		for (String daysOfWeek : days) {
			System.out.println(daysOfWeek);
		}

		String[][] alpha = new String[3][4];
		alpha[0][0] = "James";
		alpha[0][1] = "Jabar";
		alpha[0][2] = "Jafar";
		alpha[0][3] = "Jamil";

		alpha[1][0] = "Toyota";
		alpha[1][1] = "Subaru";
		alpha[1][2] = "Honda";
		alpha[1][3] = "Ford";

		alpha[2][0] = "Bat";
		alpha[2][1] = "Ball";
		alpha[2][2] = "Shot";
		alpha[2][3] = "Run";

		for (int row = 0; row < alpha.length; row++) {
			for (int column = 0; column < alpha[row].length; column++) {
				System.out.print(alpha[row][column] + "\t");
			}
			System.out.println();
		}

		System.out.println();

		int[][][] alpha2 = { { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } },
				{ { 20, 21, 22 }, { 23, 24, 25 }, { 26, 27, 28 } }, { { 29, 30, 31 }, { 32, 33, 34 }, { 35, 36, 37 } },
				{ { 38, 39, 40 }, { 41, 42, 43 }, { 44, 45, 46 } } };

		for (int table = 0; table < alpha2.length; table++) {
			for (int row = 0; row < alpha2[table].length; row++) {
				for (int column = 0; column < alpha2[table][row].length; column++) {
					System.out.print(alpha2[table][row][column] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		String[][][] bravo = new String[3][4][5];

		bravo[0][0][0] = "One";
		bravo[0][0][1] = "Two";
		bravo[0][0][2] = "Three";
		bravo[0][0][3] = "Four";
		bravo[0][0][4] = "Five";

		bravo[0][1][0] = "Six";
		bravo[0][1][1] = "Seven";
		bravo[0][1][2] = "Eight";
		bravo[0][1][3] = "Nine";
		bravo[0][1][4] = "Ten";

		bravo[0][2][0] = "Eleven";
		bravo[0][2][1] = "Twelve";
		bravo[0][2][2] = "Thirteen";
		bravo[0][2][3] = "Fourteen";
		bravo[0][2][4] = "Fifteen";

		bravo[0][3][0] = "Hi";
		bravo[0][3][1] = "How";
		bravo[0][3][2] = "Are";
		bravo[0][3][3] = "You";
		bravo[0][3][4] = "????";

		bravo[1][0][0] = "Sixteen";
		bravo[1][0][1] = "Seventeen";
		bravo[1][0][2] = "Eighteen";
		bravo[1][0][3] = "Nineteen";
		bravo[1][0][4] = "Twenty";

		bravo[1][1][0] = "Twenty One";
		bravo[1][1][1] = "Twenty Two";
		bravo[1][1][2] = "Twenty Three";
		bravo[1][1][3] = "Twenty Four";
		bravo[1][1][4] = "Twenty Five";

		bravo[1][2][0] = "Twenty Six";
		bravo[1][2][1] = "Twenty Seven";
		bravo[1][2][2] = "Twenty Eight";
		bravo[1][2][3] = "Twenty Nine";
		bravo[1][2][4] = "Thirty";

		bravo[1][3][0] = "Thirty One";
		bravo[1][3][1] = "Thirty Two";
		bravo[1][3][2] = "Thirty Three";
		bravo[1][3][3] = "Thirty Four";
		bravo[1][3][4] = "Thirty Five";

		bravo[2][0][0] = "Thirty Six";
		bravo[2][0][1] = "Thirty Seven";
		bravo[2][0][2] = "Thirty Eight";
		bravo[2][0][3] = "Thirty Nine";
		bravo[2][0][4] = "Fourty";

		bravo[2][1][0] = "Fourty One";
		bravo[2][1][1] = "Fourty Two";
		bravo[2][1][2] = "Fourty Three";
		bravo[2][1][3] = "Fourty Four";
		bravo[2][1][4] = "Fourty Five";

		bravo[2][2][0] = "Fourty Six";
		bravo[2][2][1] = "Fourty Seven";
		bravo[2][2][2] = "Fourty Eight";
		bravo[2][2][3] = "Fourty Nine";
		bravo[2][2][4] = "Fifty";

		bravo[2][3][0] = "Fifty One";
		bravo[2][3][1] = "Fifty Two";
		bravo[2][3][2] = "Fifty Three";
		bravo[2][3][3] = "Fifty Four";
		bravo[2][3][4] = "Fifty Five";

		for (int hour = 0; hour < bravo.length; hour++) {
			for (int minute = 0; minute < bravo[hour].length; minute++) {
				for (int second = 0; second < bravo[hour][minute].length; second++) {
					System.out.print(bravo[hour][minute][second] + " \t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int[][][] bravo1 = { { { 23, 34 }, { 45, 56 }, { 67, 78 } }, { { 12, 23, 34 }, { 45, 56, 67 }, { 78, 89, 90 } },
				{ { 11, 22, 33, 44 }, { 55, 66, 77, 88 }, { 99, 88, 77, 66 } },
				{ { 19, 28, 37, 46, 55 }, { 64, 73, 82, 91, 10 }, { 90, 80, 70, 60, 50 } } };

		for (int i = 0; i < bravo1.length; i++) {
			for (int j = 0; j < bravo1[i].length; j++) {
				for (int k = 0; k < bravo1[i][j].length; k++) {
					System.out.print(bravo1[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		String[][][] charlie = new String[5][4][3];

		charlie[0][0][0] = "Kabul";
		charlie[0][0][1] = "Herat";
		charlie[0][0][2] = "Balkh";

		charlie[0][1][0] = "CA";
		charlie[0][1][1] = "VA";
		charlie[0][1][2] = "WA";

		charlie[0][2][0] = "Car";
		charlie[0][2][1] = "Bar";
		charlie[0][2][2] = "Tar";

		charlie[0][3][0] = "Ahmad";
		charlie[0][3][1] = "Wais";
		charlie[0][3][2] = "Qais";

		charlie[1][0][0] = "Wazir";
		charlie[1][0][1] = "Raees";
		charlie[1][0][2] = "Mudeer";

		charlie[1][1][0] = "Rashid";
		charlie[1][1][1] = "Nabi";
		charlie[1][1][2] = "Mujeeb";

		charlie[1][2][0] = "apple";
		charlie[1][2][1] = "orange";
		charlie[1][2][2] = "pear";

		charlie[1][3][0] = "One";
		charlie[1][3][1] = "Two";
		charlie[1][3][2] = "Three";

		charlie[2][0][0] = "Alpha";
		charlie[2][0][1] = "Bravo";
		charlie[2][0][2] = "Charlie";

		charlie[2][1][0] = "Delta";
		charlie[2][1][1] = "Echo";
		charlie[2][1][2] = "Fox";

		charlie[2][2][0] = "Golf";
		charlie[2][2][1] = "Hotel";
		charlie[2][2][2] = "India";

		charlie[2][3][0] = "Jack";
		charlie[2][3][1] = "Kilo";
		charlie[2][3][2] = "Lima";

		charlie[3][0][0] = "Mike";
		charlie[3][0][1] = "Noble";
		charlie[3][0][2] = "Open";

		charlie[3][1][0] = "Quit";
		charlie[3][1][1] = "Pot";
		charlie[3][1][2] = "Run";

		charlie[3][2][0] = "Son";
		charlie[3][2][1] = "Tom";
		charlie[3][2][2] = "Unique";

		charlie[3][3][0] = "VOA";
		charlie[3][3][1] = "Who";
		charlie[3][3][2] = "XYZ";

		charlie[4][0][0] = "One";
		charlie[4][0][1] = "Two";
		charlie[4][0][2] = "Three";

		charlie[4][1][0] = "Four";
		charlie[4][1][1] = "Five";
		charlie[4][1][2] = "Six";

		charlie[4][2][0] = "Bro";
		charlie[4][2][1] = "How";
		charlie[4][2][2] = "Are";

		charlie[4][3][0] = "You";
		charlie[4][3][1] = "Dad";
		charlie[4][3][2] = "?";

		for (int i = 0; i < charlie.length; i++) {
			for (int j = 0; j < charlie[i].length; j++) {
				for (int k = 0; k < charlie[i][j].length; k++) {
					System.out.print(charlie[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int[][][] charlie1 = {
				{ { 12, 23, 34, 45, 56 }, { 56, 45, 34, 23, 12 }, { 90, 89, 78, 67, 56 }, { 54, 43, 32, 21, 11 } },
				{ { 90, 80, 70, 60 }, { 12, 23, 34, 45 }, { 90, 89, 78, 67 }, { 10, 29, 38, 47 } },
				{ { 56, 47, 38 }, { 29, 10, 11 }, { 12, 13, 14 }, { 15, 16, 17 } },
				{ { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 98, 87, 76 }, { 54, 43, 32, 21 } },
				{ { 12, 23, 34, 45, 56 }, { 67, 78, 89, 90, 19 }, { 18, 17, 16, 15, 14 }, { 13, 12, 11, 10, 20 } } };

		for (int i = 0; i < charlie1.length; i++) {
			for (int j = 0; j < charlie1[i].length; j++) {
				for (int k = 0; k < charlie1[i][j].length; k++) {
					System.out.print(charlie1[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		String[][][] delta = new String[2][3][4];

		delta[0][0][0] = "Hum";
		delta[0][0][1] = "Dill";
		delta[0][0][2] = "Di";
		delta[0][0][3] = "Choki";

		delta[0][1][0] = "Sanam";
		delta[0][1][1] = "Tere";
		delta[0][1][2] = "Hogaye";
		delta[0][1][3] = "Hain";

		delta[0][2][0] = "Hum";
		delta[0][2][1] = "Rhim";
		delta[0][2][2] = "Jhim";
		delta[0][2][3] = "Oops";

		delta[1][0][0] = "Sawan";
		delta[1][0][1] = "Ki";
		delta[1][0][2] = "Barsaten";
		delta[1][0][3] = "Oops";

		delta[1][1][0] = "Le";
		delta[1][1][1] = "Aya";
		delta[1][1][2] = "Re";
		delta[1][1][3] = "Oops";

		delta[1][2][0] = "Sanam";
		delta[1][2][1] = "Re";
		delta[1][2][2] = "Tu";
		delta[1][2][3] = "Oops";

		for (int i = 0; i < delta.length; i++) {
			for (int j = 0; j < delta[i].length; j++) {
				for (int k = 0; k < delta[i][j].length; k++) {
					System.out.print(delta[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int[][][] delta1 = { { { 123 }, { 234, 345 }, { 456, 567, 678 }, { 789, 890, 901, 902 } },
				{ { 111, 112, 113, 114, 115 }, { 211, 212, 213, 214, 215, 216 }, { 311, 312, 313, 314, 315, 316, 317 },
						{ 411, 412, 413, 414, 415, 416, 417, 418 } },
				{ { 123, 234, 345, 456, 567, 678, 789, 890, 901 }, { 100, 200, 300, 400, 500, 600, 700, 800, 900, 101 },
						{ 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111 },
						{ 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212 } },
				{ { 901, 801, 701, 601, 501, 401, 301, 201, 101, 191, 181, 171, 161 },
						{ 111, 211, 311, 411, 511, 611, 711, 811, 911, 110, 111, 112, 113, 114 },
						{ 151, 161, 171, 181, 191, 201, 211, 221, 231, 241, 251, 261, 271, 281, 291 },
						{ 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 410, 411, 412, 413, 414, 415 } },
				{ { 112, 213, 314, 415, 516, 617, 718, 819, 910, 119, 118, 117, 116, 115, 114, 113, 112 },
						{ 110, 210, 310, 410, 510, 610, 710, 810, 910, 100, 110, 120, 130, 140, 150, 160, 170, 180 },
						{ 111, 222, 223, 224, 225, 226, 227, 228, 229, 210, 211, 212, 213, 214, 215, 216, 217, 218,
								219 },
						{ 220, 219, 218, 217, 216, 215, 214, 213, 212, 211, 210, 229, 228, 227, 226, 225, 224, 223, 222,
								221 } } };
		for (int i = 0; i < delta1.length; i++) {
			for (int j = 0; j < delta1[i].length; j++) {
				for (int k = 0; k < delta1[i][j].length; k++) {
					System.out.print(delta1[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println();

		String[][][] echo = new String[2][2][3];

		echo[0][0][0] = "Jab";
		echo[0][0][1] = "Main";
		echo[0][0][2] = "Badal";

		echo[0][1][0] = "Banjao";
		echo[0][1][1] = "Tum";
		echo[0][1][2] = "Bhi";

		echo[1][0][0] = "Barish";
		echo[1][0][1] = "Banjana";
		echo[1][0][2] = "Jab";

		echo[1][1][0] = "Kam";
		echo[1][1][1] = "Padjaye";
		echo[1][1][2] = "Sansi";

		for (int i = 0; i < echo.length; i++) {
			for (int j = 0; j < echo[i].length; j++) {
				for (int k = 0; k < echo[i][j].length; k++) {
					System.out.print(echo[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println();

		int[][][] echo1 = { { { 11 }, { 22, 22 }, { 33, 44, 55 }, { 66, 77, 88, 99 } },
				{ { 12, 23, 34, 45, 56 }, { 90, 89, 78, 67, 56, 45 }, { 11, 22, 33, 44, 55, 66, 77 },
						{ 88, 77, 66, 55, 44, 33, 22, 11 }, { 90, 80, 70, 60, 50, 40, 30, 20, 10 } },
				{ { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 },
						{ 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90, 10, 11, 12, 13 },
						{ 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 },
						{ 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 79, 78, 77, 76, 75 } } };

		for (int i = 0; i < echo1.length; i++) {
			for (int j = 0; j < echo1[i].length; j++) {
				for (int k = 0; k < echo1[i][j].length; k++) {
					System.out.print(echo1[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		String[][][] fox = new String[2][3][4];

		fox[0][0][0] = "Ox";
		fox[0][0][1] = "Fox";
		fox[0][0][2] = "Box";
		fox[0][0][3] = "Sox";

		fox[0][1][0] = "One";
		fox[0][1][1] = "Two";
		fox[0][1][2] = "Was";
		fox[0][1][3] = "Saw";

		fox[0][2][0] = "See";
		fox[0][2][1] = "Ask";
		fox[0][2][2] = "Tap";
		fox[0][2][3] = "Bat";

		fox[1][0][0] = "Win";
		fox[1][0][1] = "Won";
		fox[1][0][2] = "Why";
		fox[1][0][3] = "Too";

		fox[1][1][0] = "How";
		fox[1][1][1] = "Are";
		fox[1][1][2] = "You";
		fox[1][1][3] = "Mom";

		fox[1][2][0] = "I'm";
		fox[1][2][1] = "Bea";
		fox[1][2][2] = "Uti";
		fox[1][2][3] = "Ful";

		for (int i = 0; i < fox.length; i++) {
			for (int j = 0; j < fox[i].length; j++) {
				for (int k = 0; k < fox[i][j].length; k++) {
					System.out.print(fox[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int[][][] fox1 = { { { 12 }, { 12, 23 } }, { { 12, 23, 34 }, { 12, 23, 34, 45 }, { 12, 23, 34, 45, 56 } },
				{ { 12, 23, 34, 45, 56, 67 }, { 12, 23, 34, 45, 56, 67, 78 }, { 12, 23, 34, 45, 56, 67, 78, 89 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90 } } };

		for (int i = 0; i < fox1.length; i++) {
			for (int j = 0; j < fox1[i].length; j++) {
				for (int k = 0; k < fox1[i][j].length; k++) {
					System.out.print(fox1[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		String[][][] golf = new String[3][2][1];

		golf[0][0][0] = "Ahmad";

		golf[0][1][0] = "James";

		golf[1][0][0] = "Jones";

		golf[1][1][0] = "Mike";

		golf[2][0][0] = "Ghani";

		golf[2][1][0] = "Khushal";

		for (int i = 0; i < golf.length; i++) {
			for (int j = 0; j < golf[i].length; j++) {
				for (int k = 0; k < golf[i][j].length; k++) {
					System.out.print(golf[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int[][][] golf1 = { { { 12 }, { 12, 23 } }, { { 12, 23, 34 }, { 12, 23, 34, 45 }, { 12, 23, 34, 45, 56 } },
				{ { 12, 23, 34, 45, 56, 67 }, { 12, 23, 34, 45, 56, 67, 78 }, { 12, 23, 34, 45, 56, 67, 78, 89 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90 } } };

		for (int i = 0; i < golf1.length; i++) {
			for (int j = 0; j < golf1[i].length; j++) {
				for (int k = 0; k < golf1[i][j].length; k++) {
					System.out.print(golf1[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		String[][][] hot = new String[2][2][2];

		hot[0][0][0] = "What";
		hot[0][0][1] = "Some";

		hot[0][1][0] = "Much";
		hot[0][1][1] = "Fact";

		hot[1][0][0] = "Hurt";
		hot[1][0][1] = "Lock";

		hot[1][1][0] = "Hunt";
		hot[1][1][1] = "Heat";

		for (int i = 0; i < hot.length; i++) {
			for (int j = 0; j < hot[i].length; j++) {
				for (int k = 0; k < hot[i][j].length; k++) {
					System.out.print(hot[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int[][][] hot1 = {
				{ { 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23, 34, 45, 56 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23, 34, 45 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23, 34 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23 }, { 12, 23, 34, 45, 56, 67, 78, 89, 90, 12 } },
				{ { 12, 23, 34, 45, 56, 67, 78, 89, 90 }, { 12, 23, 34, 45, 56, 67, 78, 89 },
						{ 12, 23, 34, 45, 56, 67, 78 }, { 12, 23, 34, 45, 56, 67 } },
				{ { 12, 23, 34, 45, 56 }, { 12, 23, 34, 45 }, { 12, 23, 34 } }, { { 12, 23 }, { 12 } } };
		for (int i = 0; i < hot1.length; i++) {
			for (int j = 0; j < hot1[i].length; j++) {
				for (int k = 0; k < hot1[i][j].length; k++) {
					System.out.print(hot1[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		char[][][] idle = new char[2][3][5];

		idle[0][0][0] = 'a';
		idle[0][0][1] = 'b';
		idle[0][0][2] = 'c';
		idle[0][0][3] = 'd';
		idle[0][0][4] = 'e';

		idle[0][1][0] = 'f';
		idle[0][1][1] = 'g';
		idle[0][1][2] = 'h';
		idle[0][1][3] = 'i';
		idle[0][1][4] = 'j';

		idle[0][2][0] = 'k';
		idle[0][2][1] = 'l';
		idle[0][2][2] = 'm';
		idle[0][2][3] = 'n';
		idle[0][2][4] = 'o';

		idle[1][0][0] = 'p';
		idle[1][0][1] = 'q';
		idle[1][0][2] = 'r';
		idle[1][0][3] = 's';
		idle[1][0][4] = 't';

		idle[1][1][0] = 'u';
		idle[1][1][1] = 'v';
		idle[1][1][2] = 'w';
		idle[1][1][3] = 'x';
		idle[1][1][4] = 'y';

		idle[1][2][0] = 'z';
		idle[1][2][1] = '1';
		idle[1][2][2] = '2';
		idle[1][2][3] = '3';
		idle[1][2][4] = '4';

		for (int i = 0; i < idle.length; i++) {
			for (int j = 0; j < idle[i].length; j++) {
				for (int k = 0; k < idle[i][j].length; k++) {
					System.out.print(idle[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int[][][] india = { { { 12 } }, { { 12, 23 }, { 12, 23, 34 } },
				{ { 12, 23, 34, 45 }, { 12, 23, 34, 45, 56 }, { 12, 23, 34, 45 } }, { { 12, 23, 34 }, { 12, 23 } },
				{ { 12 } } };
		for (int i = 0; i < india.length; i++) {
			for (int j = 0; j < india[i].length; j++) {
				for (int k = 0; k < india[i][j].length; k++) {
					System.out.print(india[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		String[][][] jack = new String[1][3][4];

		jack[0][0][0] = "Jack";
		jack[0][0][1] = "Stop";
		jack[0][0][2] = "Utah";
		jack[0][0][3] = "Adam";

		jack[0][1][0] = "Your";
		jack[0][1][1] = "Sean";
		jack[0][1][2] = "John";
		jack[0][1][3] = "Shut";

		jack[0][2][0] = "Fire";
		jack[0][2][1] = "Hire";
		jack[0][2][2] = "Tire";
		jack[0][2][3] = "Mine";

		for (int i = 0; i < jack.length; i++) {
			for (int j = 0; j < jack[i].length; j++) {
				for (int k = 0; k < jack[i][j].length; k++) {
					System.out.print(jack[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int jack1[][][] = { { { 12, 23, 34, 45, 56, 67 }, { 12, 23, 34, 45, 56 }, { 12, 23, 34, 45 }, { 12, 23, 34 } },
				{ { 12, 23 }, { 12 }, { 12, 23 } },
				{ { 12, 23, 34 }, { 12, 23, 34, 45 }, { 12, 23, 34, 45, 56 }, { 12, 23, 34, 45, 56, 67 } } };
		for (int i = 0; i < jack1.length; i++) {
			for (int j = 0; j < jack1[i].length; j++) {
				for (int k = 0; k < jack1[i][j].length; k++) {
					System.out.print(jack1[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		String kilo[][][] = new String[4][3][2];

		kilo[0][0][0] = "John";
		kilo[0][0][1] = "Four";

		kilo[0][1][0] = "Tree";
		kilo[0][1][1] = "Town";

		kilo[0][2][0] = "Mine";
		kilo[0][2][1] = "Hers";

		kilo[1][0][0] = "Arab";
		kilo[1][0][1] = "Ours";

		kilo[1][1][0] = "Best";
		kilo[1][1][1] = "Baby";

		kilo[1][2][0] = "Five";
		kilo[1][2][1] = "Fine";

		kilo[2][0][0] = "Hour";
		kilo[2][0][1] = "Sick";

		kilo[2][1][0] = "Kilo";
		kilo[2][1][1] = "Book";

		kilo[2][2][0] = "Root";
		kilo[2][2][1] = "Both";

		kilo[3][0][0] = "Fire";
		kilo[3][0][1] = "Dire";

		kilo[3][1][0] = "Gone";
		kilo[3][1][1] = "Good";

		kilo[3][2][0] = "Chin";
		kilo[3][2][1] = "Name";

		for (int i = 0; i < kilo.length; i++) {
			for (int j = 0; j < kilo[i].length; j++) {
				for (int k = 0; k < kilo[i][j].length; k++) {
					System.out.print(kilo[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int kilo1[][][] = { { { 12 }, { 12, 23 }, { 12, 23, 34 }, { 12, 23, 34, 45 } },
				{ { 12, 23, 34, 45, 56 }, { 12, 23, 34, 45, 56, 67 }, { 12, 23, 34, 45, 56, 67, 78 } },
				{ { 12, 23, 34, 45, 56, 67, 78, 89 }, { 12, 23, 34, 45, 56, 67, 78, 89, 90 },
						{ 12, 23, 34, 45, 56, 67, 78, 89 } },
				{ { 12, 23, 34, 45, 56, 67, 78 }, { 12, 23, 34, 45, 56, 67 }, { 12, 23, 34, 45, 56 } },
				{ { 12, 23, 34, 45 }, { 12, 23, 34 }, { 12, 23 }, { 12 } } };
		for (int i = 0; i < kilo1.length; i++) {
			for (int j = 0; j < kilo1[i].length; j++) {
				for (int k = 0; k < kilo1[i][j].length; k++) {
					System.out.print(kilo1[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		String lima[][][] = new String[3][2][1];

		lima[0][0][0] = "Book";
		lima[0][1][0] = "Best";

		lima[1][0][0] = "Baba";
		lima[1][1][0] = "Dadu";

		lima[2][0][0] = "Farm";
		lima[2][1][0] = "Fire";

		for (int i = 0; i < lima.length; i++) {
			for (int j = 0; j < lima[i].length; j++) {
				for (int k = 0; k < lima[i][j].length; k++) {
					System.out.print(lima[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int limo[][][] = { { { 12, 23, 34 }, { 12, 23 } }, { { 12 }, { 12 }, { 12 } }, { { 12, 23 }, { 12, 23, 34 } } };

		for (int i = 0; i < limo.length; i++) {
			for (int j = 0; j < limo[i].length; j++) {
				for (int k = 0; k < limo[i][j].length; k++) {
					System.out.print(limo[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		String mango[][][] = new String[3][3][3];

		mango[0][0][0] = "Book";
		mango[0][0][1] = "Read";
		mango[0][0][2] = "Heat";

		mango[0][1][0] = "Beat";
		mango[0][1][1] = "Weld";
		mango[0][1][2] = "Bart";

		mango[0][2][0] = "Hart";
		mango[0][2][1] = "Hurt";
		mango[0][2][2] = "Fear";

		mango[1][0][0] = "Look";
		mango[1][0][1] = "Here";
		mango[1][0][2] = "Hear";

		mango[1][1][0] = "Bear";
		mango[1][1][1] = "Beer";
		mango[1][1][2] = "Near";

		mango[1][2][0] = "East";
		mango[1][2][1] = "West";
		mango[1][2][2] = "Side";

		mango[2][0][0] = "Fire";
		mango[2][0][1] = "Hair";
		mango[2][0][2] = "Tire";

		mango[2][1][0] = "Wait";
		mango[2][1][1] = "Once";
		mango[2][1][2] = "Acer";

		mango[2][2][0] = "Dell";
		mango[2][2][1] = "Heap";
		mango[2][2][2] = "Gear";

		for (int i = 0; i < mango.length; i++) {
			for (int j = 0; j < mango[i].length; j++) {
				for (int k = 0; k < mango[i][j].length; k++) {
					System.out.print(mango[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		int man[][][] = { { { 1 }, { 12 }, { 12, 23 } },
				{ { 12, 23, 34 }, { 12, 23, 34, 45 }, { 12, 23, 34, 45, 56 }, { 12, 23, 34, 45, 56, 67 } },
				{ { 12, 23, 34, 45, 56, 67, 78 }, { 12, 23, 34, 45, 56, 67, 78, 89 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90 }, { 12, 23, 34, 45, 56, 67, 78, 89, 90, 12 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23 } },
				{ { 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23, 34 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23, 34, 45 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23, 34, 45, 56 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23, 34, 45, 56, 67 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23, 34, 45, 56, 67, 78 },
						{ 12, 23, 34, 45, 56, 67, 78, 89, 90, 12, 23, 34, 45, 56, 67, 78, 89 } } };
		for (int i = 0; i < man.length; i++) {
			for (int j = 0; j < man[i].length; j++) {
				for (int k = 0; k < man[i][j].length; k++) {
					System.out.print(man[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

	}
}
