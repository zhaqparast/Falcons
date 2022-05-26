package OOPSConceptsDay09AbstractClass;

public class Teacher extends Person {

	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printInfo() {
		System.out.println("Teacher: " + super.getName());
	}

}
