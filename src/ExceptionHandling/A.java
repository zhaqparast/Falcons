package ExceptionHandling;

import java.io.FileNotFoundException;

public class A {
	public static void main(String[] args) {
		try {
			Util.readSomFileAndPrintIt("Some wrong address");
		} catch (FileNotFoundException e) {
			System.out.println("This what I should do when the exception happens in Class A");
		}
	}

}
