package com.bridgelabz.datastuctureprograms;

import com.bridgelabz.datastructures.INode;
import com.bridgelabz.datastructures.MyNode;
import com.bridgelabz.datastructures.MyQueue;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		palindromeChecker();

	}

	private static void palindromeChecker() {
		
		MyQueue myQueue = new MyQueue();
		MyNode<Character> myNode;
		String word="madam";
		char wordarr[] = word.toCharArray();
		String resultantString = "";
		for (int i = 0; i < wordarr.length; i++) {
			myNode = new MyNode<>(wordarr[i]);
			myQueue.enqueue(myNode);
		}

		for (int i = 0; i < wordarr.length; i++) {
			INode tempNode = myQueue.removeRear();
			resultantString += tempNode.getKey();
		}
		if (word.equals(resultantString)) {
			System.out.println("String is Pallindrome");
		} else {
			System.out.println("String is NOT Pallindrome");
		}
		
	}

}
