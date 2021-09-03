package com.bridgelabz.datastuctureprograms;

import java.util.Arrays;

import com.bridgelabz.datastructures.MyNode;
import com.bridgelabz.datastructures.MyStack;

public class PrimeAnagramStack {

	public static void main(String[] args) {
		
		primeAnagram();

	}

	private static void primeAnagram() {
		
		MyStack myStack = new MyStack();
		MyNode<String> myNode;
		int array[][] = new int [10][100];
		int prime[] = new int [1000];
		int temp = 1;
		
		for(int i=0; i<10; i++){
			for(int j=0; j<100; j++){
				array [i][j] = temp;
				temp++;
			}
		}
		
		temp=0;
		for(int i=0; i<10; i++){
			for(int j=0; j<100; j++){
				//System.out.print(array[i][j]+" ");
				if(checkingPrime(array[i][j])) {
					prime[temp++] = array[i][j];
				}
				else {
					prime[temp++]=1;
				}
			}
		}
		
		for(int i=0; i<1000; i++){
			for(int j=0; j<1000; j++){
				if(prime[i]!=1 && prime[j]!=1 && i!=j){
					String string1 = Integer.toString(prime[i]);
					String string2 = Integer.toString(prime[j]);
					if(checkAnagram(string1,string2)) {
						myNode = new MyNode<String>(string1+", "+string2);
						myStack.push(myNode);
					}
				}
			}
		}
		
		myStack.popTillEmpty();
		
	}

	private static boolean checkAnagram(String string1, String string2) {
		if(string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);
				
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean checkingPrime(int num) {

		int count=0;
		for (int i = 2; i <=num/2; i++){
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count==0){
			return true;
		}
		else{
			return false;
		}
	}
}
