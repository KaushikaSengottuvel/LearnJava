import java.util.*;

class MapCompareByValueAndKey
{
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		// or HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101,"Hai");
		map.put(12,"Hello");
		map.put(167,"How");
		map.put(14,"Are");
		map.put(16,"You");

		System.out.println("Comparing By Value : ");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		System.out.println("Comparing By Key : ");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}
}