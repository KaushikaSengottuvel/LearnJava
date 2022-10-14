import java.util.*;

class TreeSetWithDescIterator
{
	public static void main(String[] args) {
		
		TreeSet<Integer> tset = new TreeSet<Integer>();

		tset.add(123);
		tset.add(12);
		tset.add(23);
		tset.add(11);
		tset.add(345);
		tset.add(567);
		tset.add(1);

		System.out.println(tset.pollFirst()); //removes the lowest value
		System.out.println(tset.pollLast());  // removes the highest value

		System.out.println("Descending Order : ");

		Iterator it = tset.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}