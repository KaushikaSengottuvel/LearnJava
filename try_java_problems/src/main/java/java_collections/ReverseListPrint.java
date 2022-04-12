package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseListPrint {

	public static void main(String[] args) {
		List list1 = new ArrayList<>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add("five");
		System.out.println("Original List :");
		for (Object s : list1)
			System.out.println(s);
		System.out.println("Displaying from index 3 :");
		// Using ListIterator(int Index)
		Iterator index = list1.listIterator(3);

		while (index.hasNext())
			System.out.println(index.next());

		System.out.println("Displaying in Reverse Order :");

		Collections.reverse(list1);
		for (Object e : list1)
			System.out.println(e);

	}

}
