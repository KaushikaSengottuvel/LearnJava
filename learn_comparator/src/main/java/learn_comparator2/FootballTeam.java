package learn_comparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FootballTeam {

	public static void main(String[] args) {

		Player player1 = new Player("Kaushi", 26, 2);
		Player player2 = new Player("Ronaldo", 21, 4);
		Player player3 = new Player("Karthick", 32, 3);
		Player player4 = new Player("Imaiyal", 1, 1);
		List<Player> playerlist = new ArrayList<Player>();
		playerlist.add(player1);
		playerlist.add(player2);
		playerlist.add(player3);
		playerlist.add(player4);

		System.out.println("Before Sorting :");
		System.out.println(playerlist);

		Comparator<Player> byName = (a, b) -> a.getName().compareTo(b.getName());
		
		Collections.sort(playerlist,byName);
		System.out.println("Sorted by Name : \n" + playerlist);

		Comparator<Player> byAge = (a, b) -> b.getAge() - a.getAge();

		Collections.sort(playerlist,byAge);
		System.out.println("Sorted by Age : \n" + playerlist);

		Comparator<Player> byRanking = (a, b) -> a.getRanking() - b.getRanking();

		Collections.sort(playerlist,byRanking);
		System.out.println("Sorted by Ranking : \n" + playerlist);

	}
}
