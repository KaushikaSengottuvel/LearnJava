import java.util.*;

class FindMaxAndMinValue
{
	public static void main(String[] args) {

		List<Integer> list= new ArrayList<Integer>();

		list.add(123);
		list.add(1);
		list.add(233);
		list.add(34);
		list.add(10);
		list.add(344);
		list.add(0);

		System.out.println("List : "+list);

		System.out.println("Maximum Number : "+Collections.max(list));

		System.out.println("Minimum Number : "+Collections.min(list));
		
	}
}