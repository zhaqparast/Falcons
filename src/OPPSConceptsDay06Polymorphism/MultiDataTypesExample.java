package OPPSConceptsDay06Polymorphism;

public class MultiDataTypesExample {

	public static void main(String[] args) {

		Object[] data = new Object[10];

		data[0] = "test";
		data[1] = 7;
		data[2] = 'a';
		data[3] = "Hahaha";
		data[4] = 696.69;
		data[5] = 57;
		data[6] = 'h';
		data[7] = 978;
		data[8] = "KHHIbkjh";
		data[9] = 'r';

		for (Object s : data) {
			System.out.println(s);
		}
	}

}
