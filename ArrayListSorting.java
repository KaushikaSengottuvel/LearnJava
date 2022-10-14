import java.util.*;

class ArrayListSorting
{
	public static void main(String[] args) {
		
		List<String> strlist = new ArrayList<String>();
		List<Integer> intlist = new ArrayList<Integer>();

		strlist.add("Apple");
		strlist.add("Mango");
		strlist.add("Kiwi");
		strlist.add("Avacado");
		strlist.add("Banana");
		strlist.add("Pear");

		intlist.add(456);
		intlist.add(123);
		intlist.add(12);
		intlist.add(345);
		intlist.add(567);
		intlist.add(56);
		intlist.add(1);

		Collections.sort(strlist);

		Collections.sort(intlist);

		System.out.println(strlist);
		System.out.println(intlist);
	}
}