package try_java_problems;

import java.util.Scanner;

public class check_alphaber_not {

	public static void main(String[] args) {
		char ch;
		int n;
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		n = ch;
		if (n > 64 && n < 92 || 96 < n && n < 124)
			System.out.println("Alphabet");
		else
			System.out.println("nope!");

	}

}
