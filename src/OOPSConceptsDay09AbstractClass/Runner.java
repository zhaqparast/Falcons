package OOPSConceptsDay09AbstractClass;

public class Runner {

	public static void main(String[] args) {

		Student student = new Student(null);
		student.setName("Jimmy \"The Tulip\" Tudeski");

		Teacher teacher = new Teacher(null);
		teacher.setName("James Brown");

		student.printInfo();
		teacher.printInfo();
		
		Person person1 = new Student(null);
		Person person2 = new Teacher(null);
	}

}
