package StringManipulation;

public class ReplaceAllMethod15 {

	public static void main(String[] args) {

		String alpha = "kvnewi8tyygjkfdvklhsdrAjfskjhfiu5wgzkLKJFhighq3w8457087kv42yt4tdfnvoi0it3t*&(&%7487362^%#@$^$#6757";
		System.err.println(alpha.replaceAll("[a-zA-Z]", "?"));
		System.out.println(alpha.replaceAll("[0-9]", "="));
		System.err.println(alpha.replaceAll("[^a-zA-Z0-9]", "*"));

		String bravo = "DFSHLKUDYTGSKJDFVIDUFHGIRGKJVUIRSTHGVFJNR98732568658347T28374658234*&%^*$&#&^4";
		System.out.println(bravo.replaceAll("[A-Z]", "<"));
		System.out.println(bravo.replaceAll("[^A-Z]", "@"));
		System.out.println(bravo.replaceAll("[A-Z]", "#"));
		System.out.println(bravo.replaceAll("[^0-9]", "%"));

		String charlie = "ADFVHIURESHV87324659876SHDFSHdsgsidfvmbsdafjh34837%$@$#%$*&)*&^__)";
		System.out.println(charlie.replaceAll("[a-z]", "/"));
		System.out.println(charlie.replaceAll("[A-Z]", "+"));
		System.out.println(charlie.replaceAll("[0-9]", "()"));
		System.out.println(charlie.replaceAll("[a-zA-Z0-9]", "-"));
		System.out.println(charlie.replaceAll("[^a-zA-Z0-9]", "()"));

		String delta = "kfdvhSI8YVW988TSVKJXCHV98DYGXV876986jcjdgc*8WF<mjcae*)(*fMNJKHVI";
		System.err.println(delta.replaceAll("[a-z]", "@"));
		System.out.println(delta.replaceAll("[^a-z]", "@"));
		System.out.println(delta.replaceAll("[0-9]", "+"));
		System.out.println(delta.replaceAll("[A-Z0-9a-z]", "%"));
		System.out.println(delta.replaceAll("[^a-zA-Z0-9]", "/"));

		String echo = "938ytrvfds87wy4gt hvdfsvb87ygHOYHFEBFUIHGW8F7EYBERLTHO438YR^%$#%$#&^^*(^%*^)";
		System.out.println(echo.replaceAll("[a-zA-Z]", "<>"));
		System.out.println(echo.replaceAll("[0-9]", "@"));
		System.out.println(echo.replaceAll("[a-zA-Z0-9]", "{"));
		System.out.println(echo.replaceAll("[^0-9]", ","));

		String foxtrot = "YGYTG(*&y&ygtt(&fvgfccgvkjf*^r*T7TRCGDFX436W9--893432653ABJHnbvnvc?<";

		System.out.println(foxtrot.replaceAll("[6-9]", "@"));
		System.err.println(foxtrot.replaceAll("[^0-6]", "&"));
		System.out.println(foxtrot.replaceAll("[0-5]", "+"));

		String golf = "nvkhg9p34y8av9o3w48ytIUY98W4YTFKJRSOW298YTRoi4wauty";
		System.out.println(golf.replaceAll("[a-z]", "*"));
		System.out.println(golf.replaceAll("[0-9]", "%"));
		System.out.println(golf.replaceAll("[A-Z]", "&"));
		System.out.println(golf.replaceAll("[^0-9]", "+"));

		String hotel = "w3498t87evo8&^UBTOW$&Y0rfduszvh0wythsfvfsuodyt085w3ygJHGY*&^&*%&^%";
		System.out.println(hotel.replaceAll("[a-zA-Z0-9]", "?"));
		System.out.println(hotel.replaceAll("[^a-z]", "<"));
		System.out.println(hotel.replaceAll("[0-9]", ">"));
		System.out.println(hotel.replaceAll("[^0-8]", "_"));

		String inida = "4t356y*&^(W$titvfhg8z7fdvrU&*)97g4w5hkjadshaKDHFIUFYwee";
		System.out.println(inida.replaceAll("[0-9A-Z]", "-"));
		System.out.println(inida.replaceAll("[^a-zA-Z]", "!"));
		System.out.println(inida.replaceAll("[^A-Z0-9]", "#"));

	}

}
