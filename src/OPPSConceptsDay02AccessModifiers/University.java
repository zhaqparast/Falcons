package OPPSConceptsDay02AccessModifiers;

public class University {

	private String name;
	private int numberOfFaculties;
	private String facultyName;
	private int students;

	public University() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfFaculties() {
		return numberOfFaculties;
	}

	public void setNumberOfFaculties(int numberOfFaculties) {
		this.numberOfFaculties = numberOfFaculties;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public int getStudents() {
		return students;
	}

	public void setStudents(int students) {
		this.students = students;
	}

}
