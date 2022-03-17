package basic_java_problems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RoundOffNumber {

	public static void main(String[] args) {
		double num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextDouble();
		sc.nextLine();
		System.out.format("Using Format %.3f", num);

		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("\nUsing DecimalFormat :" + decimalFormat.format(num));

		sc.close();
	}

}
