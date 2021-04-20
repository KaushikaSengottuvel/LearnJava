package com.assignment_2;

public class CheckWeird {

	public static void main(String[] args) {

		int x = 134;
		int y= x%2 ;
		if (y != 0)
			System.out.println("Weird");
		else if(x>=10 && x<=20)
			System.out.println("Not Weird");
		else if(x>=30 && x<=100)
			System.out.println("Weird");
		else if(x>=100)
			System.out.println("Not Weird");
	}

}
