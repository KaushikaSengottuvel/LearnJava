import java.util.*;

class LinkedlistRemoveElements
{
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();

		LinkedList <String> list2 = new LinkedList<String>();

		list.add("Apple");
		list.add("Elephant");
		list.add("Dog");
		list.add("Cat");
		list.add("Ball");
		list.add("Fish");

		Collections.sort(list);

		Iterator it = list.iterator();
		System.out.println("Sorted linked List : ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		list2.addAll(list);
		System.out.println("List1 added all to list2 : "+list2);

		list2.remove(2);
		System.out.println("Element removed from Place 2 in list2 : "+list2);

		list2.remove("Apple");
		System.out.println("Apple removed from list2 : "+list2);

		list2.add("Grapes");
		list2.add("Banana");
		list2.add("Mango");
		list2.add("Grapes");
		list2.add("Mango");
		list2.add("Strawberry");
		list2.add("Himberry");
		list2.add("Mango");
		list2.add("Mango");
		list2.add("Cranberry");

		list2.removeAll(list);
		System.out.println("list1 removed from list2 : "+list2);

		list2.removeFirst();
		System.out.println("Remove First : "+list2);

		list2.removeLast();
		System.out.println("Remove Last : "+list2);

		list2.removeFirstOccurrence("Mango");
		System.out.println("Remove First Occurrence : "+list2);

		list2.removeLastOccurrence("Mango");
		System.out.println("Remove Last Occurrence : "+list2);


	}
}