import java.util.*;

class ArrayListAddandRemoveElements
{
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		list1.add("Apple");
		list1.add("Mango");
		list1.add("Kiwi");
		list1.add("Avacado");
		list1.add("Banana");
		list1.add("Pear");

		list2.addAll(list1);

		System.out.println(list1);
		System.out.println(list2);

		list2.remove(0);
		list1.remove(2);

		System.out.println(list1);
		System.out.println(list2);

		list2.remove("Pear");
		list1.remove("Pear");

		System.out.println(list1);
		System.out.println(list2);

		list2.removeAll(list1);

		System.out.println("After removing from list2: ");

		System.out.println(list1);
		System.out.println(list2);

		list1.removeIf(str -> str.contains("Avacado"));
		list1.removeIf(str -> str.contains("Bana"));
		list1.removeIf(str -> str.contains("Mongo"));
		list2.clear();

		System.out.println("RemoveIf in list1 : ");

		System.out.println(list1);
		System.out.println("list2 after clearing :");

		System.out.println(list2);







	}
}