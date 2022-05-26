package StringManipulation;

public class DotEqualsMethod06 {

	public static void main(String[] args) {

		String alpha1 = "akvhsfiduy9v8y34biuovya";
		String alpha2 = "aksh98u349fkjahs98y43KHLK";
		System.err.println(alpha1.equals(alpha2));

		String bravo1 = "Aanhk melanki tujhi how how are you.";
		String bravo2 = "AANHK MELANKI tujhi how how ARE YOU.";
		System.out.println(bravo1.equals(bravo2));
		System.out.println(bravo1.equalsIgnoreCase(bravo2));

		String charlie1 = "aakslhf87934yvakjsh87fdy";
		String charlie2 = "ahlkj*&(^NVJHGF$$&^";
		System.err.println(charlie1.equals(charlie2));

		String delta1 = "How is everybody doing?";
		String delta2 = "hOW IS EVERYBODY DOING?";
		System.out.println(delta1.equals(delta2));
		System.out.println(delta1.equalsIgnoreCase(delta2));

		String edit1 = "alkhf7y89734yasbh\"kshd";
		String edit2 = "KJH*AY*&YEAjhaurhiuht";
		System.err.println(edit1.equals(edit2));

		String fix1 = "I don`t know how to fix this car";
		String fix2 = "I DON`t KNOW HOW to fix this car";
		System.out.println(fix1.equals(fix2));
		System.out.println(fix1.equalsIgnoreCase(fix2));
		System.out.println(fix1.contentEquals(fix2));

		String goat1 = "Big Goat";
		String goat2 = "bIG gOAT";
		String goat3 = "Big Goat";
		System.err.println(goat1.equals(goat2));
		System.out.println(goat1.equalsIgnoreCase(goat2));
		System.out.println(goat1.contentEquals(goat3));

		String hot1 = "The tea is hot";
		String hot2 = "The tea is cold";
		System.out.println(hot1.equals(hot2));
		System.out.println(hot1.equalsIgnoreCase(hot2));

		String idle1 = "American Idle";
		String idle2 = "Mexican Idele";
		String idle3 = "AMERICAN idle";
		System.err.println(idle1.equals(idle2));
		System.out.println(idle1.equalsIgnoreCase(idle2));
		System.out.println(idle1.contentEquals(idle3));
		System.err.println(idle1.contentEquals(idle3));
		System.out.println(idle1.equalsIgnoreCase(idle3));

		String jack1 = "Jack is a name";
		String jack2 = "The word jack also stands for a device thal=t lifts a car from the ground";
		System.out.println(jack1.equals(jack2));
		System.out.println(jack1.equalsIgnoreCase(jack2));

		String kilo1 = "vlkadhvsdyyvsejrgbv hgyu";
		String kilo2 = "akjhvfoiuegyhvbdfhv";
		System.err.println(kilo1.equals(kilo2));
		System.out.println(kilo1.equalsIgnoreCase(kilo2));

		String lima1 = "Mia Khalifa";
		String lima2 = "MIA KHALIFA";
		System.out.println(lima1.equals(lima2));
		System.out.println(lima1.equals(lima1));
		System.out.println(lima1.equalsIgnoreCase(lima2));

		String moran1 = "lkgrhwegykjvdhgweiugh";
		String moran2 = "avlkvhkshfdpwrehjvhsdv";
		System.out.println(moran1.equals(moran1));
		System.out.println(moran1.equals(moran2));
		System.out.println(moran1.equalsIgnoreCase(moran2));

		String nothing1 = "Mia Khalifa is not an adult movie star any more.";
		String nothing2 = "Mia KhalIFA IS NOT AN ADULT MOVIE STAR ANY more.";
		System.out.println(nothing1.equals(nothing2));
		System.out.println(nothing1.equalsIgnoreCase(nothing2));

		String open1 = "LKJDHfiurdfyg9wehtrkfjavh84";
		String open2 = "sldifyg45ghrnvkdfjh8Y*Y";
		System.err.println(open1.equals(open2));
		System.out.println(open1.equalsIgnoreCase(open2));
		System.out.println(open1.contentEquals(open1));

		String pen1 = "My pen is blue.";
		String pen2 = "mY PEN iS BluE.";
		System.out.println(pen1.equals(pen2));
		System.out.println(pen1.contentEquals(pen1));
		System.out.println(pen1.contentEquals(pen2));
		System.out.println(pen1.equalsIgnoreCase(pen2));

		String quit1 = "BUT&(*TJBHBYT";
		String quit2 = "oigy3420bgvufy84";
		System.out.println(quit1.equals(quit2));
		System.out.println(quit1.equalsIgnoreCase(quit2));

		String rob1 = "Rob the mob";
		String rob2 = "rOB tHE MOB";
		System.err.println(rob1.equals(rob2));
		System.out.println(rob1.equalsIgnoreCase(rob2));

		String stone1 = "The is a difference between stones and rocks.";
		String stone2 = "dfkjsdfhg9w4y5kjdfvheiurwgyeashfvb845gksjdiu.";
		System.err.println(stone1.equals(stone2));
		System.out.println(stone1.equalsIgnoreCase(stone2));

		String tomb1 = "Tombstone is the name of a western movie.";
		String tomb2 = "tOMBSTONE IS THE naME of A WESTERN movIE.";
		System.err.println(tomb1.equals(tomb2));
		System.out.println(tomb2.equalsIgnoreCase(tomb2));

		String ultra1 = "vfdlksvh24387tyvdbfiowu5yt8203y";
		String ultra2 = "naeirygf4038gvbouyt8&T*YBHJGFYR^&T";
		System.out.println(ultra1.equals(ultra2));
		System.out.println(ultra1.equalsIgnoreCase(ultra2));

		String vice1 = "SKvejh3iuygvfv";
		String vice2 = "SKvejh3iuYGvfv";
		System.err.println(vice1.equals(vice2));
		System.out.println(vice1.equalsIgnoreCase(vice2));

		String wagon1 = "Wagon is also called a carriage";
		String wagon2 = "Wagon IS ALSO CALLED A Carriage";
		System.out.println(wagon1.equals(wagon2));
		System.out.println(wagon1.equalsIgnoreCase(wagon2));

		String xbs1 = "XBS stands for BEAURU of jvjnwlehgiehrvfkjshriuhg";
		String xbs2 = "kahfvkq3iygvfsdhgw45ygfjdshguw45yg8dkhviuwyr5g8r";
		System.out.println(xbs1.equals(xbs2));
		System.out.println(xbs1.equalsIgnoreCase(xbs2));

		String yesman1 = "A yes man is a man who never objects.";
		String yesman2 = "A Yes man is a man who never objects.";
		System.out.println(yesman1.equals(yesman2));
		System.out.println(yesman1.equalsIgnoreCase(yesman2));

		String zubi1 = "Spozhmai";
		String zubi2 = "sPoZhmaI";
		System.out.println(zubi1.equals(zubi2));
		System.out.println(zubi1.equalsIgnoreCase(zubi2));

	}

}
