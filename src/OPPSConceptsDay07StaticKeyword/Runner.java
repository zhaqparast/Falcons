package OPPSConceptsDay07StaticKeyword;

public class Runner {

	public static void main(String[] args) {

		Student st1 = new Student("Jack", "Sparrow");
		System.out.println(st1.size());

		Student st2 = new Student("David", "Warner");
		System.out.println(st2.size());

		Ball obj1 = new Ball();
		Ball obj2 = new Ball();

		obj1.color = "Blue";
		obj1.size = 8;

		obj2.color = "Red";
		obj2.size = 10;

		System.out.println("This is the color of the first object: " + obj1.color);
		System.out.println("This is the size of the first object: " + obj1.size);

		System.out.println(Ball.color);
		System.out.println(Ball.size);

	}

}
