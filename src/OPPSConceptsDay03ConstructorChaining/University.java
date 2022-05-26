package OPPSConceptsDay03ConstructorChaining;

public class University {

	private String name;
	private int students;
	private int professors;
	private int established;

	public University() {
		this.name = "";
		this.students = 0;
		this.professors = 0;
		this.established = 0;
	}

	public University(String name) {
		this();
		this.name = name;
	}

	public University(String name, int students) {
		this(name);
		this.students = students;
	}

	public University(String name, int students, int professors) {
		this(name, students);
		this.professors = professors;
	}

	public University(String name, int students, int professors, int established) {
		this(name, students, professors);
		this.established = established;
	}

}
