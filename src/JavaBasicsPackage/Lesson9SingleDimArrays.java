package JavaBasicsPackage;

public class Lesson9SingleDimArrays {

	public static void main(String[] args) {

		int[] a = new int[5];
		a[0] = 23;
		a[1] = 34;
		a[2] = 45;
		a[3] = 56;
		a[4] = 67;

		// the array above and the array below are both the same
		// it is just a matter of how we write them

		int[] b = { 23, 34, 45, 56, 67 };

		// and this is how we print them out

		System.out.println(a.length);
		System.out.println(b.length);

		System.out.println();
		System.out.println(a[0]);
		System.out.println(b[0]);

		System.out.println();

		int[] numbers = { 23, 45, 56, 878, 9809, 3, 23, 23, 126, 989, 75, 8768, 7, 85, 4765, 747, 6546, 87, 686, 86, 86,
				898, 434, 98897, 86878, 998, 432, 878, 223, 823, 82, 9734, 654, 987, 8699, 978, 87, 876, 67, 543, 987,
				432, 876, 543, 776, 9879, 9897, 979879, 868, 5434, 47488, 876, 8768, 1 };

		System.out.println("The size of the numbers array is: " + numbers.length);

		int indexNo = 0;
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("The " + indexNo++ + " index contains " + numbers[index]);
		}

		System.out.println();

		int[] alpha = new int[6];

		alpha[0] = 10;
		alpha[1] = 11;
		alpha[2] = 12;
		alpha[3] = 13;
		alpha[4] = 14;
		alpha[5] = 15;

		for (int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i]);
		}
		System.out.println();

		int[] bravo = { 16, 17, 18, 19, 20 };
		for (int index = 0; index < bravo.length; index++) {
			System.out.println(bravo[index]);
		}
		System.out.println();

		int[] charlie = new int[5];
		charlie[0] = 98;
		charlie[1] = 87;
		charlie[2] = 76;
		charlie[3] = 65;
		charlie[4] = 54;

		for (int i = 0; i < charlie.length; i++) {
			System.out.println(charlie[i]);
		}

		int[] delta = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for (int i = 0; i < delta.length; i++) {
			System.out.println(delta[i]);
		}

		int[] fox = new int[7];
		fox[0] = 8768;
		fox[1] = 887678;
		fox[2] = 4546;
		fox[3] = 6464;
		fox[4] = 7857;
		fox[5] = 986;
		fox[6] = 98797;
		for (int index = 0; index < fox.length; index++) {
			System.out.println("Index " + index + " contains " + fox[index]);
		}

		int[] echo = { 5765, 66876, 9879, 55 / 5, 543, 12 * 67 };
		for (int i = 0; i < echo.length; i++) {
			System.out.println("The value of index " + i + " is " + echo[i]);
		}

		int[] golf = new int[12];
		golf[0] = 7656;
		golf[1] = 8768;
		golf[2] = 65 / 5 + 10;
		golf[3] = 675 - 56;
		golf[4] = 686 % 67;
		golf[5] = 2545 + 23;
		golf[6] = 784 / 7;
		golf[7] = 646;
		golf[8] = 1234 - 4321;
		golf[9] = 56787 * 67;
		golf[10] = 4543 - 543;
		golf[11] = 70 % 3;

		for (int i = 0; i < golf.length; i++) {
			System.out.println("The value of index " + i + " is " + golf[i]);

		}

		// create a Toyota dealership using a String array that would contain 6 indexs

		String[] inventory = new String[6];
		inventory[0] = "Supra: 10";
		inventory[1] = "Highlander: 100";
		inventory[2] = "Corolla: 150";
		inventory[3] = "Prius: 200";
		inventory[4] = "Camry: 100";
		inventory[5] = "Rav4: 75";

		System.out.println("Welcome to Toyota. Our existing inventory contains the following fleet: ");

		for (int index = 0; index < inventory.length; index++) {
			System.out.println(inventory[index]);
		}

		String checkInvent = "How many models do we have of ";
		for (int i = 0; i < inventory.length; i++) {
			System.out.println(checkInvent + inventory[i]);
		}

		int[] hotel = { 8776 / 3, 868, 979 % 8, 876876 / 3, 868 * 7 + 7, 7476 - 7533 };
		for (int index = 0; index < hotel.length; index++) {
			System.out.println("The value of index " + index + " is " + hotel[index]);
		}
		System.out.println();

		String[] india = new String[4];
		india[0] = "Mumbai";
		india[1] = "Chennai";
		india[2] = "Goa";
		india[3] = "Dehli";

		for (int indiaIndex = 0; indiaIndex < india.length; indiaIndex++) {
			System.out.println("The value of index " + indiaIndex + " is " + india[indiaIndex]);
		}

		int[] jack = { 687 % 7, 8799 - 234, 6998 * 13, 8768 + 15 * 21, 909776 - 87697 };
		for (int index = 0; index < jack.length; index++) {
			System.out.println("The value of index " + index + " is " + jack[index]);
		}

		String[] kilo = new String[5];
		kilo[0] = "2 kgs of cheese";
		kilo[1] = "6 kgs of flour";
		kilo[2] = "3 kgs of";
		kilo[3] = "1 kg of suger";
		kilo[4] = "1/2 kg of cooking oil";

		for (int index = 0; index < kilo.length; index++) {
			System.out.println("How much of " + index + " do we have of? " + " We Have " + kilo[index]);
		}

		System.out.println();

		int[] lima = { 878 / 2 * 51, 98698 % 6, 117257 - 97980, 798711 * 576, 'a', 'y' };
		for (int i = 0; i < lima.length; i++) {
			System.out.println("The value of index no " + i + " is " + lima[i]);
		}
		System.out.println();

		String[] mike = new String[7];
		mike[0] = "His";
		mike[1] = " name";
		mike[2] = " is";
		mike[3] = " José";
		mike[4] = " Luis";
		mike[5] = " Rodríguez";
		mike[6] = " Zapatero";

		for (int index = 0; index < mike.length; index++) {
			System.out.print(mike[index]);
		}

		System.out.println();
		System.out.println();

		int[] november = { 98237 % 23, 8979 / 3, 6868 / 22 + 3, 876 + 5 * 234, 979 - 234 };
		for (int index = 0; index < november.length; index++) {
			System.out.println("The value of index " + index + " is " + november[index]);
		}

		System.out.println();

		String[] oscar = new String[5];
		oscar[0] = "What";
		oscar[1] = " is";
		oscar[2] = " your";
		oscar[3] = " name";
		oscar[4] = "?";

		for (int index = 0; index < oscar.length; index++) {
			System.out.print(oscar[index]);
		}
		System.out.println();

		int[] parking = new int[6];
		parking[0] = 876 / 3;
		parking[1] = 987 % 5;
		parking[2] = 5677 * 34;
		parking[3] = 676 - 234;
		parking[4] = 534 + 22;
		parking[5] = 87 * 3 % 4;

		for (int index = 0; index < parking.length; index++) {
			System.out.println("The value of index " + index + " is " + parking[index]);
		}
		System.out.println();

		String[] queen = { "Queen ", "Elizabeth ll ", "is ", "the ", "current ", "monarch ", "of ", "the ", "Great ",
				"Britain." };
		for (int i = 0; i < queen.length; i++) {
			System.out.print(queen[i]);
		}
		System.out.println();
		System.out.println();

		int[] romeo = new int[4];
		romeo[0] = 3453;
		romeo[1] = 456;
		romeo[2] = 8789;
		romeo[3] = 8787;

		for (int index = 0; index < romeo.length; index++) {
			System.out.println("The value of index " + index + " is " + romeo[index]);
		}
		System.out.println();

		String[] samuel = { "Samuel ", "L. ", "Jackson ", "is ", "an ", "American ", "actor." };
		for (int index = 0; index < samuel.length; index++) {
			System.out.print(samuel[index]);
		}
		System.out.println("\n");

		int[] tango = new int[6];
		tango[0] = 876 % 7;
		tango[1] = 465 / 5;
		tango[2] = 656 - 123;
		tango[3] = 56 + 876;
		tango[4] = 243 * 43;
		tango[5] = 657 * 18 % 3;
		for (int index = 0; index < tango.length; index++) {
			System.out.println("The value of index " + index + " is " + tango[index]);
		}
		System.out.println();

		String[] unique = { "I ", "have ", "a ", "unique ", "classic ", "car." };
		for (int i = 0; i < unique.length; i++) {

			System.out.print(unique[i]);
		}
		System.out.println();
		System.out.println();

		int[] vice = new int[5];
		vice[0] = 867;
		vice[1] = 54354 / 12;
		vice[2] = 8768 % 5;
		vice[3] = 343 * 43;
		vice[4] = 7776 - 234;
//		vice[5] = 868;
		for (int index = 0; index < vice.length; index++) {
			System.out.println(vice[index]);
		}

		String[] whiskey = { "My ", "favorite ", "brand ", "of ", "whiskey ", "is ", "Chivas ", "Regal." };
		for (int index = 0; index < whiskey.length; index++) {
			System.out.print(whiskey[index]);
		}
		System.out.println("\n");

		int[] xray = new int[4];
		xray[0] = 87;
		xray[1] = 34;
		xray[2] = 78778;
		xray[3] = 687;
		for (int index = 0; index < xray.length; index++) {
			System.out.println(xray[index]);
		}
		System.out.println();

		String[] yankee = { "Yankee ", "is ", "a ", "baseball ", "team ", "out ", "of ", "New York ", "city,", " NY." };
		for (int index = 0; index < yankee.length; index++) {
			System.out.print(yankee[index]);
		}
		System.out.println();
		System.out.println();

		int[] zulu = new int[5];
		zulu[0] = 7567;
		zulu[1] = '%';
		zulu[2] = 5879;
		zulu[3] = '<';
		zulu[4] = 4536;

		for (int i = 0; i < zulu.length; i++) {
			System.out.println("The value of index " + i + " is " + zulu[i]);
		}

		int[] abdul = { 967, 99, 98789, 787, 768 };
		for (int index = 0; index < abdul.length; index++) {
			System.out.println(abdul[index]);
		}
		System.out.println();

		int[] bedel = new int[5];
		bedel[0] = 5756;
		bedel[1] = 7868;
		bedel[2] = 4243;
		bedel[3] = 9798;
		bedel[4] = 8673;

		for (int i = 0; i < bedel.length; i++) {
			System.out.println(bedel[i]);
		}

	}

}
