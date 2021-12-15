package try_java_problems;

import java.util.Scanner;

public class check_Pos_negve {

	public static void main(String[] args) {
		int numm;
		Scanner sc = new Scanner(System.in);
		numm = sc.nextInt();
		if (numm < 0)
			System.out.println("Negative number");
		else
			System.out.println("Positive number");

	}

}
