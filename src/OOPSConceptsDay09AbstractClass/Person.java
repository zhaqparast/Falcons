package OOPSConceptsDay09AbstractClass;

public abstract class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public abstract void printInfo();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
