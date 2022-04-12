package java_collections;

import java.util.ArrayList;
import java.util.List;

public class Add2Lists {

	public static void main(String[] args) {
		List list1 = new ArrayList<>();// this List can hold all datatypes
		List<Integer> list2 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list2.add(22);
		list2.add(222);
		list2.add(252);
		System.out.println(list1);
		// Using addAll method, you can add collections
		list1.addAll(list2);
		System.out.println(list1);

	}

}
