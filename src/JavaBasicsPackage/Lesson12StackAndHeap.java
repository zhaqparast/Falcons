package JavaBasicsPackage;

public class Lesson12StackAndHeap {

	public static void main(String[] args) {

		String x1 = "test";
		String x2 = "test";

		System.out.println(x1 == x2);

		String y1 = new String("test");
		String y2 = new String("test");

		System.out.println(y1 == y2);
		System.out.println(y1.equals(y2));
		System.out.println();
	}

}
