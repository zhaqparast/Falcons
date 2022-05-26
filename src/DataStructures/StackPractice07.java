package DataStructures;

import java.util.Stack;

public class StackPractice07 {

	public static void main(String[] args) {

		Stack<String> alpha = new Stack<String>();
		alpha.add("KLJHDFKJSFHD");
		alpha.add("sfhslkfhdj");
		alpha.add("KSAKHFK#^%#%#^#");
		alpha.add("jhkgkjg&^%*&%&");
		alpha.add("JHGKJ5876");
		alpha.add("sdfkjhk689698687");
		alpha.add("JGJH?><?<");
		alpha.add("gkjhgk?><?");
		alpha.add("86986986986");
		alpha.add("/,/>??<?><");
		System.out.println(alpha);
		System.out.println(alpha.peek());
		System.out.println(alpha.pop());
		System.out.println(alpha);
		System.out.println(alpha.peek());
		System.out.println(alpha.pop());
		System.out.println(alpha);
		System.out.println(alpha.peek());
		System.err.println(alpha.pop());
		System.out.println(alpha);
		System.out.println(alpha.peek());
		System.err.println(alpha.pop());
		System.out.println(alpha);
		System.out.println(alpha.peek());
		System.err.println(alpha.pop());
	}

}
