import java.util.*;

class ArrayDequeMethods
{
	public static void main(String[] args) {

		ArrayDeque<String> dq = new ArrayDeque<String>();

		
		dq.add("Apple");
		dq.add("Elephant");
		dq.add("Dog");
		dq.add("Cat");
		dq.add("Fish");
		dq.add("Xmas");
		dq.offer("Zeppelin");
		dq.offerFirst("Munch");
		dq.add("Daimler");

		System.out.println("Queue : "+dq);

		dq.pollFirst();

		System.out.println("PollFirst : "+dq);

		dq.pollLast();

		System.out.println("PollLast : "+dq);

		
		
	}
}