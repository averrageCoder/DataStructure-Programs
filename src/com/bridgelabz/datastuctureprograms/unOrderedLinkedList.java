package com.bridgelabz.datastuctureprograms;

import java.util.Scanner;

import com.bridgelabz.datastructures.MyLinkedList;
import com.bridgelabz.datastructures.MyNode;

public class unOrderedLinkedList {

	public static void main(String[] args) {
		
		searchFromLinkedList();
		
	}

	private static void searchFromLinkedList() {
		
		MyLinkedList myLinkedList = new MyLinkedList();
		Scanner scan = new Scanner(System.in);
		String[] inputArray = {"Emma","Dave","Cindy","Bom","Andy","Bob"};
		MyNode<String> myNode;
		for(String element : inputArray) {
			myNode = new MyNode<String>(element);
			myLinkedList.add(myNode);
		}
		System.out.println("Initial Linked List: ");
		myLinkedList.printMyNodes();
		int choice;
		while(true) {
			
			System.out.println("\n1. Search \n2. Exit \nEnter you choice: ");
			choice = scan.nextInt();
			if(choice==1 ) {
				System.out.println("Enter the word to search: ");
				String key = scan.next();
				
				MyNode<String> result =(MyNode<String>) myLinkedList.search(key);
				if(result==null) {
					System.out.println("Word not found! Adding...");
					myNode = new MyNode<String>(key);
					myLinkedList.add(myNode);
				}
				else {
					System.out.println("Word found! Removing...");
					myLinkedList.remove(key);
				}
					
			}
			else {
				System.out.println("\nFinal linked list: ");
				myLinkedList.printMyNodes();
				break;
			}
		}
		
	}

}
