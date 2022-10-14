import java.util.*;

class ArrayListGetandSet
{
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Mango");
		list.add("Pear");
		list.add("Avacado");
		list.add("Kiwi");

		System.out.println(list.get(3));

		

		System.out.println("Printing the list using Iterator : ");
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("Printing the list using ForEach Loop : ");
		for (String fruit : list) {

			System.out.println(fruit);
		}

		list.set(2,"Banana");

		System.out.println("Printing the list normally : ");
		System.out.println(list);
		
	}
}