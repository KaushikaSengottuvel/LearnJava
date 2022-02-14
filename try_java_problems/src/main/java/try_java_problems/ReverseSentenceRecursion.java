package try_java_problems;

import java.util.Scanner;

public class ReverseSentenceRecursion {

	public static void main(String[] args) {
		String s;
		ReverseSentenceRecursion obj = new ReverseSentenceRecursion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence :");
		s = sc.nextLine();
		System.out.println("Reversing sentence normally :");
		obj.normalReverse(s);
		System.out.println("Reversing sentence using reverse function :");
		obj.reverseFunctionReverse(s);
		// System.out.println("Reversing sentence using Recursion :" +
		// obj.reverseRecursion(s));

	}

	private void reverseFunctionReverse(String s) {
		StringBuffer sb = new StringBuffer();
		sb.append(s).reverse();
		System.out.println(sb);

	}

	private String reverseRecursion(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	private void normalReverse(String s) {
		int i, len = s.length();
		// System.out.println(len);
		for (i = len - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}

}
