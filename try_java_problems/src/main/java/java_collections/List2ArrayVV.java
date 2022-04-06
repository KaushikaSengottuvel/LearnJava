package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2ArrayVV {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println("List :" + list);
		String array[] = list.toArray(new String[0]);
		for (String a : array)
			System.out.println(a);

		List<String> newList = Arrays.asList(array);

		System.out.println(newList);

	}

}
