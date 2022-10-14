import java.util.*;

class simpleArrayListWithIterator
{
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("four");
		list.add("five");
		list.add("six");

		Iterator it = list.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}
}