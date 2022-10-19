import java.util.*;

class VectorMethods
{
	public static void main(String[] args) {
		Vector<Integer> vec1 = new Vector<Integer>();

		Vector<String> vec2 = new Vector<String>();

		vec1.add(12);
		vec1.add(13);
		vec1.add(1122);
		vec1.add(1);
		vec1.addElement(2);
		vec1.addElement(132);
		vec1.addElement(4);
		

		//add and addElement(used only in vector) are same.
		System.out.println("VECTOR 1 : "+vec1);
		System.out.println("1st Element : "+vec1.firstElement());
		System.out.println("Last Element : "+vec1.lastElement());
		System.out.println("Size : "+vec1.size());
		System.out.println("Capacity : "+vec1.capacity());


		vec1.addElement(3);
		vec1.addElement(7);
		vec1.addElement(33);
		vec1.addElement(37);
		vec1.addElement(34);
		vec1.addElement(47);
		System.out.println("Size : "+vec1.size());
		System.out.println("Capacity : "+vec1.capacity());


		vec2.add("Pineapple");
		vec2.add("Apple");
		vec2.addElement("Pear");
		vec2.addElement("Birne");
		vec2.addElement("Berries");

		System.out.println("VECTOR 2 : "+vec2);
		System.out.println("1st Element : "+vec2.firstElement());
		System.out.println("Last Element : "+vec2.lastElement());
		System.out.println("Size : "+vec2.size());
		System.out.println("Capacity : "+vec2.capacity());

		System.out.println("Get : "+vec2.get(2));
		//fetch value from index 2

		if(vec2.contains("Pea2r") && vec1.contains(132))
			System.out.println("Yeah, Proceed!!");
		else System.out.println("Sorry, Thankyou!");

		vec2.remove("Apple");	
		System.out.println(vec2);

		vec2.removeElementAt(3);	
		System.out.println(vec2);


		vec2.clear();
		System.out.println("Vector 2 after clearing : "+vec2);

		vec1.remove(3);
		//Compiler understood 3 as index position
		System.out.println(vec1);

		vec1.removeElementAt(5);	
		System.out.println(vec1);

		vec1.remove((Integer)3);
		//now understood as element	
		System.out.println(vec1);

		//Vector<Integer> vec3 = vec1.clone();

		System.out.println("Cloning Vector 1 : "+vec1.clone());


		System.out.println("Hashcode of vector 1 : "+vec1.hashCode());




	}
}