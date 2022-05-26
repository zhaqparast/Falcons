package OPPSConceptsDay01Constructor;

public class Student {

	String fn;
	String ln;
	int age;

	// below is a sample of a constructor
	// a constructor is mainly used to initialize all of the variables
	//

	public Student() {
		fn = "";
		ln = "";
		age = 0;

	}

	public Student(String firstName, String lastName, int newAge) {
		
		fn = firstName;
		ln = lastName;
		age = newAge;
		

	}
}
