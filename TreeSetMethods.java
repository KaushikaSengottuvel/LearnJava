import java.util.*;

class TreeSetMethods
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

		System.out.println("Reverse the Set : "+tset.descendingSet()); 
		System.out.println("Headset(From start till where) : "+tset.headSet(23,true));  
		System.out.println("Sub set(From where to where) : "+tset.subSet(23,false, 345,true));
		System.out.println("Tail set(where to start from) : "+tset.tailSet(23,true));

		System.out.println("Descending Order : ");

		Iterator it = tset.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}