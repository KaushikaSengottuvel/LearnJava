import java.util.*;

enum numbers
{
	ONE , TWO , THREE , FOUR , FIVE , SIX , SEVEN , EIGHT , NINE , TEN 
}

class EnumerationSet
{
	public static void main(String[] args) {

		Set<numbers> numset1 = EnumSet.of(numbers.FIVE, numbers.EIGHT, numbers.TEN);
		Set<numbers> numset2 = EnumSet.allOf(numbers.class);
		Set<numbers> numset3 = EnumSet.noneOf(numbers.class);

		Iterator it = numset1.iterator();

		while(it.hasNext())
		System.out.println(it.next());	

		System.out.println("Numset2 All : "+numset2);
		System.out.println("Numset3 None : "+numset3);
		 
	}
}