import java.util.*;

class MapRemoveElements
{
	public static void main(String[] args) {
		
		Map<Integer,String> hmap = new HashMap<Integer,String>();

		hmap.put(101,"Hai");
		hmap.put(12,"Hello");
		hmap.put(167,"How");
		hmap.put(14,"Are");
		hmap.put(16,"You");

		System.out.println("Before removing : "+hmap);

		hmap.remove(12);

		System.out.println("Before removing : "+hmap);

	}
}