import java.util.*;

class TreeMapMethods
{
	public static void main(String[] args) {
		NavigableMap<Integer,String> map1 = new TreeMap<Integer,String>();
		SortedMap<Integer,String> map2 = new TreeMap<Integer,String>();
		//Check for diagram in Java notes

		map1.put(10,"Hello");
		map1.put(4,"Apple");
		map1.put(6,"Birne");
		map1.put(2,"Dragon Fruit");
		map1.put(19,"Cucumber");

		map2.putAll(map1);

		System.out.println("Map 1 : "+map1);
		System.out.println("Map 2 : "+map2);

		System.out.println("HeadMap : "+map2.headMap(6));
		// In headmap, if we dint mention, true or false, its false by default as like in subset.
		// i.e.(from Starting value, to 6)
		System.out.println("TailMap : "+map2.tailMap(6));
		// In tailmap, if we dint mention, true or false, its true by default.
		// i.e.(from 6, to end)


		System.out.println("SubMap 1 : "+map1.subMap(4, true, 10, false));
		
		System.out.println("SubMap 2 : "+map2.subMap(2, 10)); 
	}
}