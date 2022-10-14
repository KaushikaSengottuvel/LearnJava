import java.util.*;

class simpleArrayListWithLoop
{
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(23);
		list.add(45);
		list.add(435);

		for (int x : list ) {
			System.out.println(x);
		}
		

	}
}