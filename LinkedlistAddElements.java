import java.util.*;

class LinkedlistAddElements
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

		list2.add(2,"Jelly");
		System.out.println("Element added to Place 2 in list2 : "+list2);

		list2.addFirst("Igloo");
		System.out.println("Element added to first place in list2 : "+list2);

		list2.add("Dolphin");
		System.out.println("Element added to last place in list2 : "+list2);


	}
}