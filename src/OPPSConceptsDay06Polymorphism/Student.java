package OPPSConceptsDay06Polymorphism;

public class Student extends Person {

	private String name;

	public Student() {
		this.name = "";
	}

	public Student(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}
