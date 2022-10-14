import java.util.*;

class Linkedhashmap
{
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hmap = new LinkedHashMap<Integer,String>();
		
		hmap.put(101,"Hai");
		hmap.put(12,"Hello");
		hmap.put(167,"How");
		hmap.put(14,"Are");
		hmap.put(16,"You");

		for (Map.Entry hm :hmap.entrySet() ) {
			System.out.println("Key : "+hm.getKey()+" Value : "+hm.getValue());
		}

		System.out.println("Get Entire Keys : "+hmap.keySet());


		System.out.println("Get Entire Values : "+hmap.values());

		System.out.println("Get Entire key-value pair : "+hmap.entrySet());

	}
}