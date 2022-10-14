import java.util.*;

class HashSetCollection
{
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();


		set.add("One");
		set.add("A");
		set.add("Two");
		set.add("B");
		set.add("Three");
		set.add("C");
		set.add("One");
		set.add("A");

		//Do not allow duplicate elements
		//dont maintain order, stored elements using hashcode

		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}
}