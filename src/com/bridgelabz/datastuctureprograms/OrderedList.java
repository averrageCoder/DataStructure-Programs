package com.bridgelabz.datastuctureprograms;

import java.util.Scanner;

import com.bridgelabz.datastructures.MyNode;
import com.bridgelabz.datastructures.SortedLinkedList;

public class OrderedList {

	public static void main(String[] args) {
		
		searchFromLinkedList();

	}

	private static void searchFromLinkedList() {
		
		SortedLinkedList mySortedLinkedList = new SortedLinkedList();
		Scanner scan = new Scanner(System.in);
		Integer[] inputArray = {10,-1,2,-5,65,35};
		MyNode<Integer> myNode;
		for(Integer element : inputArray) {
			myNode = new MyNode<Integer>(element);
			mySortedLinkedList.add(myNode);
		}
		System.out.println("Initial Linked List: ");
		mySortedLinkedList.printMyNodes();
		int choice;
		while(true) {
			
			System.out.println("\n1. Search \n2. Exit \nEnter you choice: ");
			choice = scan.nextInt();
			if(choice==1 ) {
				System.out.println("Enter the word to search: ");
				Integer key = scan.nextInt();
				
				MyNode<Integer> result =(MyNode<Integer>) mySortedLinkedList.search(key);
				if(result==null) {
					System.out.println("Word not found! Adding...");
					myNode = new MyNode<Integer>(key);
					mySortedLinkedList.add(myNode);
				}
				else {
					System.out.println("Word found! Removing...");
					mySortedLinkedList.remove(key);
				}
					
			}
			else {
				System.out.println("\nFinal linked list: ");
				mySortedLinkedList.printMyNodes();
				break;
			}
		}
		
	}

}
