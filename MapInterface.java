import java.util.*;

class MapInterface
{
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		// or HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(11,"Hai");
		map.put(12,"Hello");
		map.put(13,"How");
		map.put(14,"are");
		map.put(16,"You");

		// or for (HashMap.Entry mm : map.entrySet()) {
		for (Map.Entry mm : map.entrySet()) {
			System.out.println("Key : "+mm.getKey()+" Value : "+mm.getValue());
		}
	}
}