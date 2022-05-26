package DataStructures;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueuePractic03 {

	public static void main(String[] args) {

		Stack<Integer> S1 = new Stack<Integer>();

		// This will add elements to Stack
		S1.add(13);
		S1.add(17);
		S1.add(78);
		// This will show us all of the elements in the Stack
		System.out.println(S1);
		// This will show us the element on the top of the Stack.
		System.out.println(S1.peek());
		System.out.println(S1);
		// This will remove the element on very top of the Stack
		System.out.println(S1.pop());
		System.out.println(S1);
		// This will show us which element is left on top of the Stack
		System.out.println(S1.peek());
		System.out.println(S1);

		Queue<String> queue = new PriorityQueue<String>();

		// This will add a new element into the Queue
		queue.add("Najeeb Nangyal");
		queue.add("Majeed Qarar");
		queue.add("Esmat Qani");

		// This will print the entire Queue
		System.out.println(queue);

		// This will show us which element is at the from of the Queue
		System.out.println(queue.peek());

		// This will pop/get rid of the first element in front of the Queue
		System.out.println(queue.poll());
		System.out.println(queue);

		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println();

		Queue<String> alpha = new PriorityQueue<String>();
		alpha.add("Kabul");
		alpha.add("Nangarhar");
		alpha.add("Herat");
		alpha.add("Kandahar");
		alpha.add("Mazar-e-Sharif");
		alpha.add("Bamyan");
		alpha.add("Paktia");
		alpha.add("Kabul");
		System.out.println(alpha);
		System.out.println(alpha.peek());
		System.out.println(alpha.poll());
		System.out.println(alpha);
		System.out.println(alpha.remove());
		System.out.println(alpha);

		System.out.println(alpha.size());
		System.out.println(alpha);

		Queue<Integer> bravo = new PriorityQueue<Integer>();
		bravo.add(87876);
		bravo.add(286868768);
		bravo.add(8699123);
		bravo.add(5713675);
		bravo.add(8121883);
		bravo.add(236487);

		System.out.println(bravo);
		System.out.println(bravo.size());
		System.out.println(bravo.peek());
		System.out.println(bravo.poll());
		System.out.println(bravo);
		System.out.println();

		Queue<Character> charlie = new PriorityQueue<Character>();
		charlie.add('A');
		charlie.add('2');
		charlie.add('C');
		charlie.add('4');
		charlie.add('E');
		charlie.add('6');
		charlie.add('G');

		System.out.println(charlie);
		System.out.println(charlie.peek());
		System.out.println(charlie.poll());
		System.out.println(charlie);
		System.out.println(charlie.peek());

		Queue<Character> delta = new PriorityQueue<Character>();
		delta.add('!');
		delta.add('/');
		delta.add('1');
		delta.add('a');
		delta.add('@');
		delta.add('?');
		delta.add('2');
		delta.add('b');
		System.out.println(delta.peek());
		System.out.println(delta.poll());
		System.out.println(delta);
		System.out.println(delta.peek());
		System.out.println(delta.poll());
		System.out.println(delta);
		System.out.println(delta.peek());
		System.out.println(delta.poll());
		System.out.println(delta);
		System.out.println(delta.peek());

		Queue<Character> echo = new PriorityQueue<Character>();
		echo.add('A');
		echo.add('a');
		echo.add('1');
		echo.add('!');
		echo.add('?');
		System.out.println(echo.peek());
		System.out.println(echo.poll());
		System.out.println(echo);
		System.out.println(echo.peek());
		System.out.println(echo.poll());
		System.out.println(echo);
		System.out.println(echo.peek());
		System.out.println(echo.poll());
		System.out.println(echo);
		System.out.println(echo.peek());
		System.out.println();

		Queue<String> fox = new PriorityQueue<String>();
		fox.add("ADKJHKJFH");
		fox.add("*^*&^*^*");
		fox.add("sdhglklhfd");
		fox.add("?><?><?><?<?><");
		fox.add("897687635365");

		System.out.println(fox);
		System.out.println(fox.peek());
		System.out.println(fox.poll());
		System.out.println(fox);
		System.out.println(fox.peek());
		System.out.println(fox.poll());
		System.out.println(fox);
		System.out.println(fox.peek());
		System.out.println(fox.poll());
		System.out.println(fox);
		System.out.println(fox.peek());
		System.out.println(fox.poll());
		System.out.println(fox);

		Queue<String> golf = new PriorityQueue<String>();
		golf.add("JHGJK*&*&^");
		golf.add("hhhkhk6465464");
		golf.add("GJHGJGJH?<?>");
		golf.add("86148236419");
		golf.add("#@!^#$^&%(^)(*_");
		golf.add("gafkjgfafhjag");
		golf.add("UFEOUGFCDCBUDHC");
		golf.add("?><?<?<><?<?<{}{}");
		System.out.println(golf);
		System.out.println(golf.peek());
		System.out.println(golf.poll());
		System.out.println(golf);
		System.out.println(golf.peek());
		System.out.println(golf);
		System.out.println(golf.poll());
		System.out.println(golf.peek());
		System.out.println(golf.poll());

	}

}
