import java.util.*;

enum season
{
	SUMMER , WINTER , SPRING , AUTUMN
}


class EnumerationSet1
{
	public static void main(String[] args) {

	Set<season> set1 = EnumSet.of(season.WINTER, season.AUTUMN);

	System.out.println(set1);
		 
	}
}