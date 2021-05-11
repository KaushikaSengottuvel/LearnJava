package com.assignment_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PracticeArrayList {
	
	//Pass scanner object
	
	// return type as List
	
	public List<String> fetchInputFromUser(Scanner scan)
	{
		List<String> animals = new ArrayList<String>();
		System.out.println("Enter the no of animals to be added :");
		int count=scan.nextInt();
		System.out.println("Enter the list of animals :");
		for(int i=0;i<count;i++)
		{
			String name=scan.next();
			animals.add(name);
		}

		return animals;
	}
	
	//pass arraylist and scanner object
	
	public List<String> arrayListOperations(Scanner scan, List<String> animals)
	{
		System.out.println("Enter an Index : ");
		int element = scan.nextInt();
		
		// get index and retrieve value
		String value = animals.get(element);
		System.out.println("Value at position "+element+" is : "+value);
		animals.remove(3);
		System.out.println("After removing value at Index 3 : "+animals);
		System.out.println("Enter the animal name to check :");
		String checkName= scan.next();
		System.out.println(animals.contains(checkName));
		System.out.println("Before emptying the list : "+animals);
		//clear the list
		animals.clear();
		return animals;
	}
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		PracticeArrayList obj=new PracticeArrayList();
		animals=obj.fetchInputFromUser(scan);
		System.out.println("Animals List : "+animals);
		animals=obj.arrayListOperations(scan,animals);
		System.out.println("After emptying the list : "+animals);
		
		scan.close();
	}

}
