package OOPSConceptsDay09AbstractClass;

public class Student extends Person {

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printInfo() {
		System.out.println("Student: " + super.getName());
	}

}
