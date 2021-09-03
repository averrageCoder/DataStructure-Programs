package com.bridgelabz.datastuctureprograms;

import java.util.Scanner;

import com.bridgelabz.datastructures.MyNode;
import com.bridgelabz.hashmap.MyLinkedHashMap;

public class SlotSearch {

	public static void main(String[] args) {
		
		searchSlot();

	}

	private static void searchSlot() {
		
		MyLinkedHashMap<Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		Scanner scan = new Scanner(System.in);
		Integer[] inputArray = {10,22,45,76,78};
		
		for(Integer element: inputArray) {
			myLinkedHashMap.add(element);
		}
		
		System.out.println(myLinkedHashMap);
		int choice;
		while(true) {
			
			System.out.println("\n1. Search \n2. Exit \nEnter you choice: ");
			choice = scan.nextInt();
			if(choice==1 ) {
				System.out.println("Enter the word to search: ");
				Integer key = scan.nextInt();
				
				Integer result = (Integer) myLinkedHashMap.get(key);
				if(result==null) {
					System.out.println("Word not found! Adding...");
					myLinkedHashMap.add(key);
				}
				else {
					System.out.println("Word found! Removing...");
					myLinkedHashMap.remove(key);
				}
					
			}
			else {
				System.out.println("\nFinal linked list: "+myLinkedHashMap);
				break;
			}
		}
		
	}

}
