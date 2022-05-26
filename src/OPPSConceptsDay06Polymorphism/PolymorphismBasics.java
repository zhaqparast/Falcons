package OPPSConceptsDay06Polymorphism;

public class PolymorphismBasics {

	public void printMyMessage(Object message) {
		System.out.println(message);
	}

	public static void main(String[] args) {

		PolymorphismBasics obj = new PolymorphismBasics();

		Student student = new Student("Jack");

		System.out.println(student);

		obj.printMyMessage(student);

		Shape cir = new Circle();
		Shape sqa = new Square();
		Shape tri = new Triangle();
		cir.drawAShape();
		sqa.drawAShape();
		tri.drawAShape();
	}

}
