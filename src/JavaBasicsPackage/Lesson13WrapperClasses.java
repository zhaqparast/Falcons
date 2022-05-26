package JavaBasicsPackage;

public class Lesson13WrapperClasses {

	public static void main(String[] args) {

		// Primitive Data Type --------------------> Reference Data Type
		// byte -----------------------------------> Byte
		// short ----------------------------------> Short
		// int ------------------------------------> Integer
		// long -----------------------------------> Long
		// float ----------------------------------> Float
		// double ---------------------------------> Double
		// char -----------------------------------> Character
		// boolean --------------------------------> Boolean

		String numberOne = "18.23";
		// in order to convert our String to a double data type, in other words, if we
		// want to assign the value of a String date tyupe to a double, we have to
		// follow these steps

		double alpha = Double.valueOf(numberOne);
		System.out.println(alpha + 2.77);
		System.err.println(Double.valueOf(numberOne) + 2.77);

		String numberTwo = "17";
		short bravo = Short.valueOf(numberTwo);
		System.out.println(bravo);

		String numberThree = "8745783";
		int charlie = Integer.valueOf(numberThree);
		System.err.println(charlie + 17);
		
		

	}

}
