package learn_comparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FootballTeam {

	public static void main(String[] args) {

		List<Player> playerlist = new ArrayList<Player>();

		Player player1 = Player.builder().withName("Kaushi").withAge(26).witRanking(2).build();
		Player player2 = Player.builder().withName("Ronaldo").withAge(21).witRanking(4).build();
		Player player3 = Player.builder().withName("Karthick").withAge(32).witRanking(3).build();

		Player player4 = Player.builder().withName("Imaiyal").withAge(1).witRanking(1).build();

		playerlist.add(player1);
		playerlist.add(player2);
		playerlist.add(player3);
		playerlist.add(player4);

		System.out.println("Before Sorting :");
		System.out.println(playerlist);

		Comparator<Player> byName = (a, b) -> a.getName().compareTo(b.getName());

		Collections.sort(playerlist, byName);
		System.out.println("Sorted by Name : \n" + playerlist);

		Comparator<Player> byAge = (a, b) -> b.getAge() - a.getAge();

		Collections.sort(playerlist, byAge);
		System.out.println("Sorted by Age : \n" + playerlist);

		Comparator<Player> byRanking = (a, b) -> a.getRanking() - b.getRanking();

		Collections.sort(playerlist, byRanking);
		System.out.println("Sorted by Ranking : \n" + playerlist);

	}
}
