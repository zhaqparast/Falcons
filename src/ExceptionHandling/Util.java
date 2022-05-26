package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Util {

	public static void readSomFileAndPrintIt(String addressToTheFile) throws FileNotFoundException {
		//System.out.println("Some file will read and print it.");
		throw new FileNotFoundException();
	}

}
