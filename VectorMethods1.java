import java.util.*;

class VectorMethods1
{
	public static void main(String[] args) {
		Vector<Integer> vec1 = new Vector<Integer>();

		Vector<String> vec2 = new Vector<String>(9);

		vec1.add(12);
		vec1.add(13);
		vec1.addElement(2);
		vec1.add(1122);
		vec1.add(1);
		vec1.addElement(2);
		vec1.addElement(132);
		vec1.addElement(4);
		vec1.addElement(2);
		

		vec2.add("Pineapple");
		vec2.add("Apple");
		vec2.addElement("Pear");
		vec2.addElement("Birne");
		vec2.addElement("Berries");
		vec2.addElement("Dragon Fruit");

		//List<String> list = new ArrayList<String>();
		//CopyInto : 
		String[] x = new String[10];
		vec2.copyInto(x);

		for (String s : x) {
			System.out.println(s);
		}


		// EnsureCapacity : 

		System.out.println("Capacity before: "+vec1.capacity());

		vec1.ensureCapacity(30);
		System.out.println("Capacity after: "+vec1.capacity());

		// Equals : 

		if(vec1.equals(vec2))
			System.out.println("Vec1 and vec2 are equal");
		else 
			System.out.println("Oops! Vec1 and vec2 are not equal");

		// ForEach :

		System.out.println("For Each : ");
		vec2.forEach(System.out::println);

		// ElementAt : 

		System.out.println("ElementAt : "+vec1.elementAt(4));

		// InsertElementAt : 

		vec1.insertElementAt(1000,5);
		System.out.println("InsertElementAt : "+vec1);

		// Get : 

		System.out.println("Get : "+vec2.get(4));

		// IndexOf : 

		System.out.println("IndexOf : "+vec1.indexOf(2));

		// LastIndexOf : 

		System.out.println("LastIndexOf : "+vec1.lastIndexOf(2));

		// RemoveAllElements : 

		vec1.removeAllElements();
		System.out.println("RemoveAllElements : "+vec1);
		System.out.println("Size of vec1 : "+vec1.size());
		System.out.println("isEmpty : "+vec1.isEmpty());

	}
}