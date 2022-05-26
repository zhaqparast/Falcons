package JavaBasicsPackage;

public class Lesson10ForEachLoop {

	public static void main(String[] args) {

		// A foreach loop is also called an enhanced for loop.

		String[] names = { "Ahmad", "Mahmood", "Jabar", "Shelgaray", "Kabir" };

		for (String num : names) {
			System.out.println(num + " ");
		}
		System.out.println();

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + ", ");
		}
		System.out.println();
		System.out.println();

		String[] firstName = new String[5];
		String[] lastName = new String[5];
		int[] age = new int[5];

		firstName[0] = "Jack";
		lastName[0] = "Nicholson";
		age[0] = 34;

		firstName[1] = "Denzil";
		lastName[1] = "Washington";
		age[1] = 56;

		firstName[2] = "Kabir";
		lastName[2] = "Haqmal";
		age[2] = 40;

		firstName[3] = "Keanu";
		lastName[3] = "Reeves";
		age[3] = 45;

		firstName[4] = "Ray";
		lastName[4] = "Mesterio";
		age[4] = 51;

		for (int i = 0; i < firstName.length; i++) {

			System.out.println("First Name:  "  + firstName[i] + "\tLast Name: " + lastName[i] + "\tAge:" + age[i]);
		}

	}

}
