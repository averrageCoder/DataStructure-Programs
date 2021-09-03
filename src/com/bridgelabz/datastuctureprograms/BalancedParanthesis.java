package com.bridgelabz.datastuctureprograms;

import com.bridgelabz.datastructures.*;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
		String equation = "((5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/((4+3)*(5+5)))";
		checkBalancedParanthesis(equation);
		
	}

	private static void checkBalancedParanthesis(String equation) {
		
		MyStack myStack = new MyStack();
		boolean flag = true;
		MyNode<Character> myNode;
		
		for(char element : equation.toCharArray()) {
			if(element=='(') {
				myNode = new MyNode<Character>(element);
				myStack.push(myNode);
			}
			else if(element==')') {
				if(myStack.pop()==null) {
					flag=false;
					break;
				}
			}
		}
		
		if(flag && myStack.pop()==null)
			System.out.println("BALANCED PARANTHESIS!!!");
		else
			System.out.println("NOT BALANCED PARANTHESIS!!!");
		
	}

}
