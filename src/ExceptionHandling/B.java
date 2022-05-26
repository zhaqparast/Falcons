package ExceptionHandling;

import java.io.FileNotFoundException;

public class B {
	public static void main(String[] args) {
		try {
			Util.readSomFileAndPrintIt("Some other wrong addrss");
		} catch (FileNotFoundException e) {
			System.out.println("This is when I customize my solution for this method in a different class, class B here");
		}
	}

}
