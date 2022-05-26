package OPPSConceptsDay07StaticKeyword;

public class Student {

	private String firstName;
	private String lastName;
	private static int count = 0;

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		count++;
	}

	public String getFirstName(String firstName) {
		return firstName;
	}

	public void setFirstName() {
		this.firstName = firstName;
	}

	public String getLastName(String lastName) {
		return lastName;
	}

	public void setLastName() {
		this.lastName = lastName;
	}

	public int size() {
		return count;
	}

}
