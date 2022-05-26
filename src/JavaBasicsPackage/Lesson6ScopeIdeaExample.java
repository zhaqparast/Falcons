package JavaBasicsPackage;

public class Lesson6ScopeIdeaExample {

	public static void main(String[] args) {

		int num = 10;
		
		if (true) {

			int num2 = 15;
			System.out.println(num2);
			System.out.println(num);
			

		}

		System.out.println(num);

	}

}
