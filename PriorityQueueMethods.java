import java.util.*;

class PriorityQueueMethods
{
	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("One");
		pq.add("A");
		pq.add("Two");
		pq.add("B");
		pq.add("Three");
		pq.add("C");
		pq.add("One");
		pq.add("A");

		System.out.println("Queue : "+pq);

		System.out.println("Top Element : "+pq.element());
		System.out.println("Top Element : "+pq.peek());

		System.out.println("Removes Top Element : "+pq.remove());
		System.out.println("Removes Top Element : "+pq.poll());

		System.out.println("After removing 2 Elements : ");

		for (String p : pq) {
			System.out.println(p);
		}

		
	}
}