package DataStructures;

import java.util.HashMap;

public class HashMapPractice04 {

	public static void main(String[] args) {

		HashMap<String, String> states = new HashMap<String, String>();

		states.put("AL", "Alabama");
		states.put("AK", "Alaska");
		states.put("AZ", "Arizona");
		states.put("AR", "Arkansas");

		HashMap<String, Long> names = new HashMap<String, Long>();
		names.put("Kabul", 87436926986348L);
		names.put("Islambarbad", 3474092786876L);
		names.put("Dehli", 87346529876487L);
		names.put("Herat", 8727658934765L);
		names.put("Gardez", 92834698346598L);
		names.put("Jalalabad", 85826349876237L);

		System.out.println(names.containsKey("Kabul"));
		System.out.println(names.containsValue(9283469834659L));
		System.out.println(names.remove("Kabul", 87436926986348L));
		System.out.println(names);
		System.out.println(names.replace("Islambarbad", 3474092786L, 8263487263487679L));
		System.out.println(names.size());
		System.out.println(names.entrySet());
		System.out.println(names.get("Islambarbad"));
		System.out.println(names.replace("Islambarbad", 8452896598734L));
		System.out.println(names);
		System.err.println(names.values());

		HashMap<Integer, String> alpha = new HashMap<Integer, String>();
		alpha.put(873658, "Zameer");
		alpha.put(8767386, "Faqeer");
		alpha.put(687365, "Turkey");
		alpha.put(476984, "Ghost");
		alpha.put(979874, "Uzbekistan");
		System.out.println(alpha.size());

		HashMap<Double, String> bravo = new HashMap<Double, String>();
		bravo.put(867.98768, "Ahmad");
		bravo.put(86876.8787, "Gharzai");
		bravo.put(8786.9879, "Imran Tahir");
		bravo.put(868768.0, "Ghazi");
		bravo.put(87658736.876, "Shahbaz");
		System.out.println(bravo);
		System.out.println(bravo.putIfAbsent(6826482.0, "Shahbaz"));

		HashMap<String, String> email = new HashMap<String, String>();
		email.put("6etTheFuck0ut0FFThere", "getthefuckoutofthere@mail.com");
		email.put("lkahgiueygvkjdfviusreyg", "adshfoiuq3ytfvahfsvyuarg");
		email.put("kh0KaarDeKawa", "oasBaTsaKawoo@yahoo.com");
		email.put("khdkjdhkjdfhg", "kajhflkhflkjsdhgjk");
		email.put("n0t2Much", "what$Up@yahoo.com");
		System.err.println(email);
		System.out.println();

		HashMap<Character, String> alphabet = new HashMap<Character, String>();
		alphabet.put('A', "Alpha");
		alphabet.put('B', "Bravo");
		alphabet.put('C', "Charlie");
		alphabet.put('D', "Delta");
		alphabet.put('E', "Echo");
		alphabet.put('F', "Foxtrot");
		alphabet.put('G', "Golf");
		alphabet.put('H', "Hotel");
		alphabet.put('I', "India");
		alphabet.put('J', "Jack");
		System.out.println(alphabet);

	}

}
